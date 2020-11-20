package com.hiddenswitch.framework;

import com.avast.grpc.jwt.server.JwtServerInterceptor;
import com.avast.grpc.jwt.server.JwtTokenParser;
import com.google.common.collect.ImmutableMap;
import com.hiddenswitch.framework.impl.WeakVertxMap;
import com.hiddenswitch.framework.rpc.*;
import com.hiddenswitch.framework.schema.keycloak.tables.daos.UserEntityDao;
import com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserEntity;
import io.grpc.*;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.engines.vertx.VertxClientHttpEngine;
import org.keycloak.TokenVerifier;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.common.VerificationException;
import org.keycloak.common.enums.SslRequired;
import org.keycloak.crypto.Algorithm;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.idm.*;

import javax.ws.rs.NotFoundException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Accounts {
	protected static final String KEYCLOAK_LOGIN_PATH = "/realms/hiddenswitch/protocol/openid-connect/token";
	private static final String RSA = "RSA";
	private static final WeakVertxMap<Keycloak> keycloakReference = new WeakVertxMap<>(Accounts::keycloakConstructor);
	private static final WeakVertxMap<PublicKeyJwtServerInterceptor> interceptor = new WeakVertxMap<>(Accounts::authorizationInterceptorConstructor);

	private static PublicKeyJwtServerInterceptor authorizationInterceptorConstructor(Vertx vertx) {
		var publicKey = new AtomicReference<PublicKey>();
		return new PublicKeyJwtServerInterceptor(publicKey, jwtToken -> {
			Objects.requireNonNull(publicKey.get(), "public key is null");
			var verified = TokenVerifier.create(jwtToken, AccessToken.class);
			verified.publicKey(publicKey.get());
			try {
				verified.verify();
				return CompletableFuture.completedFuture(verified.getToken());
			} catch (VerificationException e) {
				return CompletableFuture.failedFuture(e);
			}
		});
	}

	private static class PublicKeyJwtServerInterceptor extends JwtServerInterceptor<AccessToken> {
		private AtomicReference<PublicKey> publicKey;

		public PublicKeyJwtServerInterceptor(AtomicReference<PublicKey> publicKey, JwtTokenParser<AccessToken> tokenParser) {
			super(tokenParser);
			this.publicKey = publicKey;
		}

		public AtomicReference<PublicKey> getPublicKey() {
			return publicKey;
		}
	}

	public static Future<ServerInterceptor> authorizationInterceptor() {
		// retrieve public key
		return get().compose(realm -> Environment.executeBlocking(() -> {
			var keys = realm.keys().getKeyMetadata().getKeys();
			var keyBase64 = keys.stream().filter(key -> key.getPublicKey() != null
					&& key.getType().equals(RSA)).findFirst().orElseThrow().getPublicKey();
			var keyBytes = Base64.getDecoder().decode(keyBase64);
			var encodedKeySpec = new X509EncodedKeySpec(keyBytes);
			try {
				var factory = KeyFactory.getInstance(RSA);
				return factory.generatePublic(encodedKeySpec);
			} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
				throw new RuntimeException(e);
			}
		})).compose(publicKey -> {
			var thisInterceptor = interceptor.get();
			thisInterceptor.getPublicKey().set(publicKey);
			return Future.succeededFuture(thisInterceptor);
		});
	}

	public static Future<UserEntity> user() {
		// are we in a grpc context?
		var interceptor = Accounts.interceptor.get();
		if (interceptor != null) {
			var accessTokenContextKey = interceptor.AccessTokenContextKey;
			if (accessTokenContextKey != null) {
				var accessToken = accessTokenContextKey.get();
				if (accessToken == null) {
					return Future.succeededFuture();
				} else {
					return (new UserEntityDao(Environment.jooqAkaDaoConfiguration(), Environment.sqlPoolAkaDaoDelegate())).findOneById(accessToken.getSubject());
				}
			}
		}

		// For now we do not support getting the context any other way
		return Future.failedFuture("no context");
	}

	public static String userId() {
		var interceptor = Accounts.interceptor.get();
		if (interceptor != null) {
			var accessTokenContextKey = interceptor.AccessTokenContextKey;
			if (accessTokenContextKey != null) {
				var accessToken = accessTokenContextKey.get();
				if (accessToken == null) {
					return null;
				} else {
					return accessToken.getSubject();
				}
			}
		}
		return null;
	}

	public static Future<BindableService> unauthenticatedService() {
		var context = Vertx.currentContext();
		Objects.requireNonNull(context, "context");

		var webClient = WebClient.create(context.owner());

		return Future.succeededFuture(new VertxUnauthenticatedGrpc.UnauthenticatedVertxImplBase() {

			private LoginOrCreateReply handleAccessTokenUserEntityTuple(Object[] tuple) {
				var accessTokenResponse = (org.keycloak.representations.AccessTokenResponse) tuple[0];
				var userEntity = (UserEntity) tuple[1];
				return LoginOrCreateReply.newBuilder()
						.setUserEntity(com.hiddenswitch.framework.rpc.UserEntity.newBuilder().setId(userEntity.getId()).setEmail(userEntity.getEmail()).setUsername(userEntity.getUsername()).build())
						.setAccessTokenResponse(AccessTokenResponse.newBuilder().setToken(accessTokenResponse.getToken()).build()).build();
			}

			@Override
			public Future<LoginOrCreateReply> createAccount(CreateAccountRequest request) {
				return createUser(request.getEmail(), request.getUsername(), request.getPassword())
						.compose(userEntity -> {
							// Login here
							var client = new Client(context.owner(), webClient);
							return client.login(request.getEmail(), request.getPassword()).map(accessTokenResponse -> new Object[]{accessTokenResponse, userEntity});
						})
						.map(this::handleAccessTokenUserEntityTuple);
			}

			@Override
			public Future<LoginOrCreateReply> login(LoginRequest request) {
				var client = new Client(context.owner(), webClient);
				return client.login(request.getUsernameOrEmail(), request.getPassword())
						.compose(accessTokenResponse -> {
							var token = TokenVerifier.create(accessTokenResponse.getToken(), AccessToken.class);
							try {
								var userId = token.getToken().getSubject();
								var userEntityRes = (new UserEntityDao(Environment.jooqAkaDaoConfiguration(), Environment.sqlPoolAkaDaoDelegate()))
										.findOneById(userId);
								return userEntityRes.map(userEntity -> new Object[]{accessTokenResponse, userEntity});
							} catch (VerificationException e) {
								return Future.failedFuture(e);
							}
						})
						.map(this::handleAccessTokenUserEntityTuple);
			}
		});
	}

	public static Future<ServerServiceDefinition> authenticatedService() {
		// Does not require vertx blocking service because it makes no blocking calls
		return Future.succeededFuture(new VertxAccountsGrpc.AccountsVertxImplBase() {

			@Override
			public Future<GetAccountsReply> getAccounts(GetAccountsRequest request) {
				return user()
						.compose(thisUser -> {
							if (thisUser == null) {
								return Future.failedFuture("must log in");
							}

							// TODO: Join with friends
							return (new UserEntityDao(Environment.jooqAkaDaoConfiguration(), Environment.sqlPoolAkaDaoDelegate()))
									.findManyByIds(request.getIdsList())
									.map(users ->
											GetAccountsReply.newBuilder()
													.addAllUserEntities(users.stream().map(ue -> {
														var build = com.hiddenswitch.framework.rpc.UserEntity.newBuilder()
																.setUsername(ue.getUsername())
																.setId(ue.getId());

														if (ue.getId().equals(thisUser.getId())) {
															build.setEmail(ue.getEmail());
														}
														return build.build();
													}).collect(Collectors.toList())).build());
						});
			}
		})
				.compose(Accounts::requiresAuthorization);
	}

	public static Future<ServerServiceDefinition> requiresAuthorization(BindableService service) {
		return Accounts.authorizationInterceptor()
				.compose(interceptor -> Future.succeededFuture(ServerInterceptors.intercept(service, interceptor)));

	}

	public static Future<RealmResource> get() {
		return Environment.executeBlocking(() -> {
			var realmId = Environment.cachedConfigurationOrGet().getKeycloak().getRealmId();
			return keycloakReference.get().realm(realmId);
		});
	}

	public static Future<UserEntity> createUser(String email, String username, String password) {
		return get()
				.compose(realm -> {
					var user = new UserRepresentation();
					user.setEmail(email);
					user.setUsername(username);
					user.setEnabled(true);
					var credential = new CredentialRepresentation();
					user.setCredentials(Collections.singletonList(credential));
					credential.setType(CredentialRepresentation.PASSWORD);
					credential.setValue(password);
					credential.setTemporary(false);

					// TODO: Not sure yet how to get the ID of the user you just created
					return Environment.executeBlocking(() -> {
						var response = realm.users().create(user);
						if (response.getStatus() >= 400) {
							throw new RuntimeException("was Accounts.createRealmIfAbsent called?");
						}
						return response;
					}).map(response -> {
						var parts = response.getLocation().getPath().split("/");
						var id = parts[parts.length - 1];
						user.setId(id);
						return user;
					});
				})
				.compose(userRepresentation -> {
					var users = new UserEntityDao(Environment.jooqAkaDaoConfiguration(), Environment.sqlPoolAkaDaoDelegate());
					return users.findOneById(userRepresentation.getId());
				})
				.compose(userEntity -> {
					if (userEntity == null) {
						return Future.failedFuture(new ArrayIndexOutOfBoundsException("invalid user creation result"));
					}
					return Future.succeededFuture(userEntity);
				});
	}

	private static Keycloak keycloakConstructor(Vertx vertx) {
		var client = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();
		/* TODO: Use a regular blocking client for now, until this is updated for 4.0
		if (vertx != null) {
			var engine = new VertxClientHttpEngine(vertx);
			client.httpEngine(engine);
		}*/
		var config = Environment.cachedConfigurationOrGet();
		return KeycloakBuilder.builder()
				.serverUrl(config.getKeycloak().getAuthUrl())
				.realm("master")
				.username(config.getKeycloak().getAdminUsername())
				.password(config.getKeycloak().getAdminPassword())
				.clientId("admin-cli")
				.grantType("password")
				.resteasyClient(client.build())
				.build();
	}

	public static Future<RealmResource> createRealmIfAbsent() {
		return Environment.executeBlocking(() -> {
			var configuration = Environment.cachedConfigurationOrGet();
			var keycloak = keycloakReference.get();
			var existing = Optional.<RealmRepresentation>empty();
			var realmId = configuration.getKeycloak().getRealmId();
			try {
				existing = keycloak.realms().findAll().stream().filter(realm -> realm.getRealm().equals(realmId)).findFirst();
			} catch (NotFoundException ignored) {
			}

			if (existing.isPresent()) {
				return keycloak.realm(realmId);
			}

			// Create a default
			var realmRepresentation = new RealmRepresentation();
			realmRepresentation.setRealm(realmId);
			realmRepresentation.setDisplayName(configuration.getKeycloak().getRealmDisplayName());
			realmRepresentation.setSslRequired(SslRequired.EXTERNAL.toString());
			realmRepresentation.setEnabled(true);

			keycloak.realms().create(realmRepresentation);

			var realm = keycloak.realms().realm(realmId);
			var flows = realm.flows().getFlows()
					.stream().collect(toMap(AuthenticationFlowRepresentation::getAlias, AuthenticationFlowRepresentation::getId));
			var client = new ClientRepresentation();
			client.setClientId(configuration.getKeycloak().getClientId());
			client.setDirectAccessGrantsEnabled(true);

			// Should now be confidential
			client.setClientAuthenticatorType("client-secret");
			client.setServiceAccountsEnabled(false);
			client.setStandardFlowEnabled(true);
			client.setSecret(configuration.getKeycloak().getClientSecret());
			client.setRedirectUris(Collections.singletonList("/oauth2callback"));
			client.setAuthenticationFlowBindingOverrides(ImmutableMap.of(
					"direct_grant", flows.get("direct grant"),
					"browser", flows.get("browser")
			));

			client.setWebOrigins(Collections.singletonList("+"));
			realm.clients().create(client);
			return realm;
		});
	}

	public synchronized static String keycloakAuthUrl() {
		return Environment.cachedConfigurationOrGet().getKeycloak().getAuthUrl();
	}
}
