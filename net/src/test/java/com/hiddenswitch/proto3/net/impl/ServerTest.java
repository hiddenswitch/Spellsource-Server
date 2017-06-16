package com.hiddenswitch.proto3.net.impl;

import ch.qos.logback.classic.Level;
import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.Strand;
import com.hiddenswitch.minionate.Minionate;
import com.hiddenswitch.proto3.net.Games;
import com.hiddenswitch.proto3.net.Inventory;
import com.hiddenswitch.proto3.net.Logic;
import com.hiddenswitch.proto3.net.client.ApiClient;
import com.hiddenswitch.proto3.net.client.ApiException;
import com.hiddenswitch.proto3.net.client.api.DefaultApi;
import com.hiddenswitch.proto3.net.client.models.*;
import com.hiddenswitch.proto3.net.models.CreateGameSessionRequest;
import com.hiddenswitch.proto3.net.models.CurrentMatchRequest;
import com.hiddenswitch.proto3.net.models.DeckCreateRequest;
import com.hiddenswitch.proto3.net.models.DeckCreateResponse;
import com.hiddenswitch.proto3.net.util.RPC;
import com.hiddenswitch.proto3.net.client.models.CreateAccountRequest;
import com.hiddenswitch.proto3.net.client.models.CreateAccountResponse;
import com.hiddenswitch.proto3.net.impl.util.MessageRecord;
import com.hiddenswitch.proto3.net.models.*;
import com.hiddenswitch.proto3.net.util.Serialization;
import com.hiddenswitch.proto3.net.util.UnityClient;
import com.hiddenswitch.proto3.net.util.VertxBufferInputStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.SendContext;
import io.vertx.ext.sync.Sync;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import net.demilich.metastone.game.Attribute;
import net.demilich.metastone.game.behaviour.PlayRandomBehaviour;
import net.demilich.metastone.game.entities.heroes.HeroClass;
import net.demilich.metastone.game.events.GameEventType;
import net.demilich.metastone.game.targeting.EntityReference;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.hiddenswitch.proto3.net.util.QuickJson.json;

/**
 * Created by bberman on 2/18/17.
 */
public class ServerTest extends ServiceTest<ServerImpl> {
	private String deploymentId;
	private static DefaultApi defaultApi = new DefaultApi();

	static {
		defaultApi.getApiClient().setBasePath("http://localhost:8080/v1"); //TODO: read from configuration
	}

	@Test(timeout = 120000L)
	public void testShutdownAndRestartServer(TestContext context) throws InterruptedException, SuspendExecution {
		setLoggingLevel(Level.ERROR);
		wrap(context);
		final Async async = context.async();

		getContext().assertNotNull(service.server);
		getContext().assertNotNull(service.logic.deploymentID());
		getContext().assertNotNull(service.games.deploymentID());

		vertx.executeBlocking(done -> {
			UnityClient client = new UnityClient(getContext());
			client.createUserAccount("testaccount23");
			client.matchmakeAndPlayAgainstAI(null);
			client.waitUntilDone();
			getContext().assertTrue(client.isGameOver());
			done.complete(true);
		}, true, then -> {
			vertx.undeploy(deploymentId, then2 -> {
				service = null;
				deployServices(vertx, then3 -> {
					service = then3.result();
					getContext().assertNotNull(service.logic.deploymentID());
					getContext().assertNotNull(service.accounts.deploymentID());
					vertx.executeBlocking(done2 -> {
						UnityClient client2 = new UnityClient(getContext());
						client2.loginWithUserAccount("testaccount23");
						client2.matchmakeAndPlayAgainstAI(null);
						client2.waitUntilDone();
						getContext().assertTrue(client2.isGameOver());
						done2.complete(true);
					}, true, then4 -> {
						getContext().assertTrue(then4.succeeded());
						async.complete();
						unwrap();
					});
				});
			});
		});

	}

	@Test(timeout = 60000L)
	public void testAccountFlow(TestContext context) throws InterruptedException {
		wrap(context);
		Set<String> decks = new HashSet<>(Arrays.asList(Logic.STARTING_DECKS));
		final Async async = context.async();
		final AtomicInteger count = new AtomicInteger(20);
		// Interleave these calls
		for (int i = 0; i < 100; i++) {
			final int j = i;
			Thread t = new Thread(() -> {
				try {
					Thread.sleep(RandomUtils.nextInt(10, 100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ApiClient client = new ApiClient().setBasePath("http://localhost:8080/v1");
				client.getHttpClient().setConnectTimeout(2, TimeUnit.MINUTES);
				client.getHttpClient().setWriteTimeout(2, TimeUnit.MINUTES);
				client.getHttpClient().setReadTimeout(2, TimeUnit.MINUTES);
				DefaultApi api = new DefaultApi(client);
				String random = RandomStringUtils.randomAlphanumeric(36) + Integer.toString(j);
				try {
					CreateAccountResponse response1 = api.createAccount(new CreateAccountRequest()
							.name("username" + random)
							.email("email" + random + "@email.com")
							.password("password"));

					api.getApiClient().setApiKey(response1.getLoginToken());
					final String userId = response1.getAccount().getId();
					getContext().assertNotNull(userId);
					GetAccountsResponse response2 = api.getAccount(userId);
					getContext().assertTrue(response2.getAccounts().size() > 0);

					for (Account account : new Account[]{response1.getAccount(), response2.getAccounts().get(0)}) {
						getContext().assertNotNull(account.getId());
						getContext().assertNotNull(account.getEmail());
						getContext().assertNotNull(account.getName());
						getContext().assertNotNull(account.getPersonalCollection());
						getContext().assertNotNull(account.getDecks());
						getContext().assertTrue(account.getDecks().size() == Logic.STARTING_DECKS.length);
						getContext().assertTrue(account.getDecks().stream().map(InventoryCollection::getName).collect(Collectors.toSet()).containsAll(decks));
						getContext().assertTrue(account.getPersonalCollection().getInventory().size() > 0);
					}
				} catch (ApiException e) {
					getContext().fail("API error: " + e.getMessage());
					return;
				}
				count.decrementAndGet();
			});
			t.start();
		}

		float timeout = 50f;
		while (count.get() > 0 && timeout > 0) {
			Thread.sleep(100);
			timeout -= 0.1f;
		}
		async.complete();
		unwrap();
	}

	@Test(timeout = 60000L)
	public void testUnityClient(TestContext context) throws InterruptedException, SuspendExecution {
		setLoggingLevel(Level.ERROR);
		wrap(context);
		final String property = System.getProperty("minionate.unityTests");
		final int tests = Integer.parseInt(property != null ? property : "1");
		final Async async = context.async();

		for (int i = 0; i < tests; i++) {
			UnityClient client = new UnityClient(getContext());
			client.createUserAccount(null);
			client.matchmakeAndPlayAgainstAI(null);
			float time = 0f;
			while (!(time > 120f || client.isGameOver())) {
				Strand.sleep(1000);
				time += 1f;
			}
			getContext().assertTrue(client.isGameOver());
		}
		async.complete();
		unwrap();
	}

	@Test(timeout = 60000L)
	public void testDisconnectingUnityClient(TestContext context) throws InterruptedException, SuspendExecution {
		wrap(context);
		setLoggingLevel(Level.ERROR);
		getContext().assertEquals(Games.getDefaultNoActivityTimeout(), 8000L);
		final Async async = context.async();

		UnityClient client = new UnityClient(getContext(), 5);
		Thread clientThread = new Thread(() -> {
			client.createUserAccount(null);
			client.matchmakeAndPlayAgainstAI(null);
		});
		clientThread.start();

		// wait 16 seconds
		Strand.sleep(16000);
		// Assert that session was closed
		getContext().assertEquals(service.matchmaking.getCurrentMatch(new CurrentMatchRequest(client.getAccount().getId())).getGameId(), null);
		async.complete();
		unwrap();
	}

	@Test(timeout = 60000L)
	@SuppressWarnings("unchecked")
	public void testDistinctDecks(TestContext context) throws InterruptedException, SuspendExecution {
		setLoggingLevel(Level.ERROR);
		wrap(context);

		Handler<SendContext> interceptor = interceptGameCreate(request -> {
			getContext().assertNotEquals(request.getPregame1().getDeck().getName(), request.getPregame2().getDeck().getName(), "The decks are distinct between the two users.");
		});

		UnityClient client1 = new UnityClient(getContext());
		Thread clientThread1 = new Thread(() -> {
			client1.createUserAccount("user1");
			final String startDeckId1 = client1.getAccount().getDecks().stream().filter(p -> p.getName().equals(Logic.STARTING_DECKS[0])).findFirst().get().getId();
			try {
				client1.matchmakeAndPlay(startDeckId1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		UnityClient client2 = new UnityClient(getContext());
		Thread clientThread2 = new Thread(() -> {
			client2.createUserAccount("user2");
			String startDeckId2 = client2.getAccount().getDecks().stream().filter(p -> p.getName().equals(Logic.STARTING_DECKS[1])).findFirst().get().getId();
			try {
				client2.matchmakeAndPlay(startDeckId2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		clientThread1.start();
		clientThread2.start();
		float time = 0f;
		while ((!client1.isGameOver() || !client2.isGameOver()) && time < 60f) {
			Strand.sleep(1000);
			time += 1f;
		}
		getContext().assertTrue(client1.isGameOver(), "The client ended the game");
		getContext().assertTrue(client2.isGameOver(), "The client ended the game");
		vertx.eventBus().removeInterceptor(interceptor);
		unwrap();
	}

	private Handler<SendContext> interceptGameCreate(Consumer<CreateGameSessionRequest> assertInHere) {
		final Handler<SendContext> interceptor = h -> {
			if (h.message().address().equals(RPC.getAddress(Games.class, games -> games.createGameSession(null)))) {
				Message<Buffer> message = h.message();
				VertxBufferInputStream inputStream = new VertxBufferInputStream(message.body());

				CreateGameSessionRequest request = null;
				try {
					request = Serialization.deserialize(inputStream);
				} catch (IOException | ClassNotFoundException e) {
					getContext().fail(e.getMessage());
				}

				if (request != null) {
					assertInHere.accept(request);
				} else {
					getContext().fail("Request was null.");
				}

			}
			h.next();
		};
		vertx.eventBus().addInterceptor(interceptor);
		return interceptor;
	}

	@Test
	public void testMinionatePersistenceApi(TestContext context) {
		setLoggingLevel(Level.ERROR);
		wrap(context);
		ConcurrentLinkedQueue<Long> queue = new ConcurrentLinkedQueue<Long>();

		// Use all random yogg as a test attribute
		vertx.runOnContext(ignored -> {
			Minionate.minionate().persistAttribute("yogg-only-1", GameEventType.TURN_END, Attribute.ALL_RANDOM_YOGG_ONLY_FINAL_DESTINATION, persistenceContext -> {
				// Save the turn number to this yogg attribute
				long updated = persistenceContext.update(EntityReference.ALL_MINIONS, persistenceContext.event().getGameContext().getTurn());
				queue.add(updated);
			});
		});


		// Start a game and assert that there are entities with all random yogg
		vertx.executeBlocking(done -> {
			UnityClient client = new UnityClient(context);
			client.createUserAccount();
			client.matchmakeAndPlayAgainstAI();
			client.waitUntilDone();
			getContext().assertTrue(client.isGameOver());
			done.complete();
		}, context.asyncAssertSuccess(also -> {
			context.assertTrue(queue.stream().anyMatch(l -> l > 0L), "Any number of the entities updated was greater than zero.");
			service.inventory.getMongo().count(Inventory.INVENTORY,
					json("facts." + Attribute.ALL_RANDOM_YOGG_ONLY_FINAL_DESTINATION.toKeyCase(), json("$exists", true)),
					context.asyncAssertSuccess(count -> {
						context.assertTrue(count > 0L, "There is at least one inventory item that has the attribute that we configured to listen for.");
					}));
		}));
	}

	@Test
	public void testWeaponActionReceived(TestContext context) {
		setLoggingLevel(Level.ERROR);
		wrap(context);
		Async async = context.async();
		vertx.runOnContext(ignored -> {
			AtomicBoolean didGetPlayWeaponAction = new AtomicBoolean(false);
			UnityClient client = new UnityClient(context) {
				@Override
				protected void assertValidActions(ServerToClientMessage message) {
					super.assertValidActions(message);

					if (message.getMessageType() == MessageType.ON_REQUEST_ACTION
							&& message.getActions().getWeapons() != null
							&& message.getActions().getWeapons().size() > 0) {
						didGetPlayWeaponAction.set(true);
					}
				}
			};
			final String[] deckId = new String[1];
			vertx.executeBlocking(done -> {
				client.createUserAccount(null);
				Fiber<Void> fiber = new Fiber<Void>(Sync.getContextScheduler(), () -> {
					DeckCreateResponse res = service.decks.createDeck(new DeckCreateRequest()
							.withUserId(client.getAccount().getId())
							.withHeroClass(HeroClass.ROGUE)
							.withName("Test Weapon Deck")
							.withCardIds(Collections.nCopies(30, "weapon_clandestine_laser")));
					deckId[0] = res.getDeckId();
				}).start();
				while (deckId[0] == null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				done.handle(Future.succeededFuture());
			}, true, context.asyncAssertSuccess(then -> {
				vertx.executeBlocking(done2 -> {
					client.matchmakeAndPlayAgainstAI(deckId[0]);
					client.waitUntilDone();
					getContext().assertTrue(client.isGameOver());
					getContext().assertTrue(didGetPlayWeaponAction.get());
					done2.handle(Future.succeededFuture());
				}, true, context.asyncAssertSuccess(finallyy -> {
					async.complete();
				}));
			}));
		});
	}

	@Override
	public void deployServices(Vertx vertx, Handler<AsyncResult<ServerImpl>> done) {
		System.setProperty("games.defaultNoActivityTimeout", "8000");
		ServerImpl instance = new ServerImpl();
		instance.bots.setBotBehaviour(PlayRandomBehaviour.class);
		vertx.deployVerticle(instance, then -> {
			deploymentId = then.result();
			done.handle(Future.succeededFuture(instance));
		});
	}

	private static int currentTomer = 0;

	public CreateAccountResponse createRandomAccount(TestContext testContext, DefaultApi defaultApi) {
		String username = "tomer" + currentTomer;
		String email = "tomer" + (currentTomer++) + "@gmail.com";

		CreateAccountResponse createAccountResponse = null;
		try {
			createAccountResponse = defaultApi.createAccount(
					new CreateAccountRequest().email(email).name(username).password("1357913579"));
		} catch (ApiException e) {
			testContext.fail("failed creating random account " + username + " with error: " + e.getMessage());
		}
		testContext.assertNotNull(createAccountResponse, "first account is null");
		return createAccountResponse;
	}

	@Test
	public void testFriendsApi(TestContext testContext) {
		// create first account
		CreateAccountResponse createAccount1Response = createRandomAccount(testContext, defaultApi);

		// authenticate with first account
		String token = createAccount1Response.getLoginToken();
		testContext.assertNotNull(token, "auth token is null");
		defaultApi.getApiClient().setApiKey(token);

		// test putting friend that does not exist
		FriendPutResponse friendPutResponseDoesNotExist = null;
		try {
			friendPutResponseDoesNotExist = defaultApi.friendPut(new FriendPutRequest().friendId("idontexist"));
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(), "Friend doesn't exist. Should return 404");
		}
		testContext.assertNull(friendPutResponseDoesNotExist);

		// create second account
		CreateAccountResponse createAccount2Response = createRandomAccount(testContext, defaultApi);

		// add second account as friend
		FriendPutResponse friendPutResponse = null;
		try {
			friendPutResponse = defaultApi.friendPut(
					new FriendPutRequest().friendId(createAccount2Response.getAccount().getId()));
		} catch (ApiException e) {
			testContext.assertEquals(200, e.getCode(), "Adding new friend. Should return 200");
		}
		testContext.assertEquals(
				friendPutResponse.getFriend().getFriendid(), createAccount2Response.getAccount().getId());

		// test putting friend that already exists
		try {
			defaultApi.friendPut(new FriendPutRequest().friendId(createAccount2Response.getAccount().getId()));
		} catch (ApiException e) {
			testContext.assertEquals(409, e.getCode(), "Adding existing friend. Should return 409");
		}

		// test putting friend that already exists - second direction
		defaultApi.getApiClient().setApiKey(createAccount2Response.getLoginToken()); //reauth as friend
		try {
			defaultApi.friendPut(new FriendPutRequest().friendId(createAccount1Response.getAccount().getId()));
		} catch (ApiException e) {
			testContext.assertEquals(409, e.getCode(),
					"Adding existing friend (second direction). Should return 409");
		}

		// unfriend a user that doesn't exist
		try {
			defaultApi.friendDelete("idontexist");
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(),
					"Friend account doesn't exist. Should return 404");
		}

		// unfriend the first user
		UnfriendResponse unfriendResponse = null;
		try {
			unfriendResponse = defaultApi.friendDelete(createAccount1Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertEquals(200, e.getCode(),
					"Unfriending an existing friend. expecting 200");
		}
		testContext.assertNotNull(unfriendResponse.getDeletedFriend(),
				"unfriend response should include the friend details");
		testContext.assertEquals(unfriendResponse.getDeletedFriend().getFriendid(),
				createAccount1Response.getAccount().getId());

		// try to unfriend the first user again
		try {
			defaultApi.friendDelete(createAccount1Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(), "Not friends. should return 404");
		}

		// try to unfriend from the other direction
		defaultApi.getApiClient().setApiKey(createAccount1Response.getLoginToken());
		try {
			defaultApi.friendDelete(createAccount2Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(),
					"Not friends (2nd direction). should return 404");
		}
	}


	@Test
	public void testConversation(TestContext testContext) {

		String MSG1 = "TEST1";
		String MSG2 = "TEST2";

		//bootstrap three accounts
		DefaultApi defaultApi = new DefaultApi();
		defaultApi.getApiClient().setBasePath("http://localhost:8080/v1"); //TODO: read from configuration
		CreateAccountResponse createAccount1Response = createRandomAccount(testContext, defaultApi);
		defaultApi.getApiClient().setApiKey(createAccount1Response.getLoginToken());
		CreateAccountResponse createAccount2Response = createRandomAccount(testContext, defaultApi);
		CreateAccountResponse createAccount3Response = createRandomAccount(testContext, defaultApi);

		//simple message
		SendMessageRequest msg1Request = new SendMessageRequest().text(MSG1);
		SendMessageRequest msg2Request = new SendMessageRequest().text(MSG2);

		//send a message to a friend that doesn't exist
		try {
			defaultApi.sendFriendMessage("notafriend", msg1Request);
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(), "User shouldn't exist. expecting 404");
		}

		//send a message to a user that's not a friend
		try {
			defaultApi.sendFriendMessage(createAccount2Response.getAccount().getId(), msg1Request);
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(), "Send friend a message. User not a friend expecting 404");
		}

		//get conversation with a friend that doesn't exist
		try {
			defaultApi.getFriendConversation(createAccount2Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertEquals(404, e.getCode(), "Get User conversation. not a friend expecting 404");
		}

		//add friend
		try {
			defaultApi.friendPut(new FriendPutRequest().friendId(createAccount2Response.getAccount().getId()));
		} catch (ApiException e) {
			testContext.assertTrue(false, "Adding new friend. Got : " + e.getMessage());

		}

		//send message 1
		SendMessageResponse sendMsg1Response = null;
		try {
			sendMsg1Response = defaultApi.sendFriendMessage(createAccount2Response.getAccount().getId(), msg1Request);
		} catch (ApiException e) {
			testContext.assertTrue(false, "Sending message (1) to a friend. Got : " + e.getMessage());
		}
		testContext.assertNotNull(sendMsg1Response);
		testContext.assertEquals(createAccount1Response.getAccount().getId(), sendMsg1Response.getMessage().getAuthorId());
		testContext.assertEquals(createAccount1Response.getAccount().getName(), sendMsg1Response.getMessage().getAuthorDisplayName());
		testContext.assertEquals(MSG1, sendMsg1Response.getMessage().getText());

		GetConversationResponse getConversationResponse1 = null;
		try {
			getConversationResponse1 = defaultApi.getFriendConversation(createAccount2Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertTrue(false, "Get valid conversation didn't work: " + e.getMessage());
		}

		testContext.assertEquals(1, getConversationResponse1.getConversation().getMessages().size(),
				"Conversation should have exactly one message");

		testContext.assertEquals(
				sendMsg1Response.getMessage(),
				getConversationResponse1.getConversation().getMessages().get(0),
				"Posted message and conversation message should match");

		//switch directions
		defaultApi.getApiClient().setApiKey(createAccount2Response.getLoginToken());

		//send message 2
		SendMessageResponse sendMsg2Response = null;
		try {
			sendMsg2Response = defaultApi.sendFriendMessage(createAccount1Response.getAccount().getId(), msg2Request);
		} catch (ApiException e) {
			testContext.assertTrue(false, "Sending message (2) to a friend. Got : " + e.getMessage());
		}

		testContext.assertNotNull(sendMsg2Response);
		testContext.assertEquals(createAccount2Response.getAccount().getId(), sendMsg2Response.getMessage().getAuthorId());
		testContext.assertEquals(createAccount2Response.getAccount().getName(), sendMsg2Response.getMessage().getAuthorDisplayName());
		testContext.assertEquals(MSG2, sendMsg2Response.getMessage().getText());

		GetConversationResponse getConversationResponse2 = null;
		try {
			getConversationResponse2 = defaultApi.getFriendConversation(createAccount1Response.getAccount().getId());
		} catch (ApiException e) {
			testContext.assertTrue(false, "Get valid conversation didn't work: " + e.getMessage());
		}

		testContext.assertEquals(2, getConversationResponse2.getConversation().getMessages().size(),
				"Conversation should have 2 messages");

		testContext.assertEquals(
				sendMsg1Response.getMessage(),
				getConversationResponse1.getConversation().getMessages().get(0),
				"Posted message and conversation message (1) should match");

		testContext.assertEquals(
				sendMsg2Response.getMessage(),
				getConversationResponse2.getConversation().getMessages().get(1),
				"Posted message and conversation message (2) should match");

	}
}
