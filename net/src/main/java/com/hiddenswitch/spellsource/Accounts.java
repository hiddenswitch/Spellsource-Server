package com.hiddenswitch.spellsource;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import com.hiddenswitch.spellsource.impl.UserId;
import com.hiddenswitch.spellsource.impl.util.*;
import com.hiddenswitch.spellsource.models.*;
import com.hiddenswitch.spellsource.util.QuickJson;
import com.lambdaworks.crypto.SCryptUtil;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.*;
import io.vertx.ext.web.RoutingContext;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;

import static com.hiddenswitch.spellsource.util.Mongo.mongo;
import static com.hiddenswitch.spellsource.util.QuickJson.json;
import static com.hiddenswitch.spellsource.util.QuickJson.toJson;
import static io.vertx.ext.sync.Sync.awaitResult;


/**
 * The Accounts service. Provides a way for end users to create accounts, get account data, and authenticate users.
 */
public interface Accounts {
	/**
	 * The USERS constant specifies the name of the collection in Mongo that contains the user data.
	 */
	String USERS = "accounts.users";
	Pattern USERNAME_PATTERN = Pattern.compile("[A-Za-z0-9_]+");

	/**
	 * Updates an account. Useful for joining data into the account object, like deck or statistics information.
	 *
	 * @param client        A database client
	 * @param userId        The user's ID
	 * @param updateCommand A JSON object that corresponds to a Mongo update command.
	 * @return The mongo client update result
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static MongoClientUpdateResult update(MongoClient client, String userId, JsonObject updateCommand) throws SuspendExecution, InterruptedException {
		return awaitResult(h -> client.updateCollection(Accounts.USERS, json("_id", userId), updateCommand, h));
	}

	/**
	 * Updates an account. Useful for joining data into the account object, like deck or statistics information.
	 *
	 * @param userId        The user's ID
	 * @param updateCommand A JSON object that corresponds to a Mongo update command.
	 * @return The mongo client update result
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static MongoClientUpdateResult update(String userId, JsonObject updateCommand) throws SuspendExecution, InterruptedException {
		return mongo().updateCollection(Accounts.USERS, json("_id", userId), updateCommand);
	}

	/**
	 * Update multiple accounts. Useful for joining data into the account object, like deck or statistics information.
	 *
	 * @param query         A JSON object corresponding to a query on the user's collection.
	 * @param updateCommand A JSON object that corresponds to a Mongo update command.
	 * @return The mongo client update result
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static MongoClientUpdateResult update(JsonObject query, JsonObject updateCommand) throws SuspendExecution {
		return mongo().updateCollectionWithOptions(Accounts.USERS, query, updateCommand, new UpdateOptions().setMulti(true));
	}

	/**
	 * Finds a user account with the given options.
	 *
	 * @param client  A database client
	 * @param query   The user's ID
	 * @param options Mongo FindOptions
	 * @return Documents with the specified fields.
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static List<JsonObject> find(MongoClient client, JsonObject query, FindOptions options) throws SuspendExecution, InterruptedException {
		return awaitResult(h -> client.findWithOptions(Accounts.USERS, query, options, h));
	}

	/**
	 * Finds a user account with the given user ID.
	 *
	 * @param userId The ID of the user to find.
	 * @return The {@link UserRecord}, or {@code null} if no user record exists.
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static UserRecord findOne(String userId) throws SuspendExecution, InterruptedException {
		return mongo().findOne(Accounts.USERS, json("_id", userId), UserRecord.class);
	}

	static UserRecord findOne(UserId userId) throws SuspendExecution, InterruptedException {
		return findOne(userId.toString());
	}

	/**
	 * Finds user accounts with the given options.
	 *
	 * @param client A database client
	 * @param query  The user's ID
	 * @return User records with all the fields. Careful with these documents, since they contain password hashes.
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	static List<UserRecord> find(MongoClient client, JsonObject query) throws SuspendExecution, InterruptedException {
		List<JsonObject> records = awaitResult(h -> client.find(Accounts.USERS, query, h));
		return QuickJson.fromJson(records, UserRecord.class);
	}

	/**
	 * Applies a SHA256 hash to the specified text and returns a base64 string (digest) matching this format.
	 *
	 * @param text The text to hash.
	 * @return The "digest", or base64-encoded SHA256 hash.
	 */
	static String hash(String text) {
		byte[] data = text.getBytes(StandardCharsets.UTF_8);
		MessageDigest digester = null;
		try {
			digester = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		digester.update(data);
		return Base64.getEncoder().encodeToString(digester.digest());
	}

	/**
	 * Retrieves the userId from a routing context after it has been handled by an {@link
	 * com.hiddenswitch.spellsource.impl.SpellsourceAuthHandler}.
	 *
	 * @param context The routing context from which to retrieve the user ID
	 * @return The User ID
	 */
	static String userId(RoutingContext context) {
		return context.user().principal().getString("_id");
	}

	@NotNull
	static CreateAccountResponse createAccountInner(CreateAccountRequest request) throws SuspendExecution, InterruptedException {
		CreateAccountResponse response = new CreateAccountResponse();

		if (!isValidName(request.getName())) {
			response.setInvalidName(true);
			return response;
		}

		if (!isValidEmailAddress(request.getEmailAddress())
				|| emailExists(request.getEmailAddress())) {
			response.setInvalidEmailAddress(true);
			return response;
		}

		final String password = request.getPassword();
		if (!isValidPassword(password)) {
			response.setInvalidPassword(true);
			return response;
		}

		final String userId = RandomStringUtils.randomAlphanumeric(36).toLowerCase();
		UserRecord record = new UserRecord(userId);
		EmailRecord email = new EmailRecord();
		email.setAddress(request.getEmailAddress());
		record.setEmails(Collections.singletonList(email));
		record.setDecks(new ArrayList<>());
		record.setFriends(new ArrayList<>());
		record.setUsername(request.getName());
		record.setBot(request.isBot());
		record.setCreatedAt(Date.from(Instant.now()));

		final String scrypt = securedPassword(password);
		LoginToken forUser = LoginToken.createSecure(userId);

		HashedLoginTokenRecord loginToken = new HashedLoginTokenRecord(forUser);
		record.setServices(new ServicesRecord());
		ResumeRecord resume = new ResumeRecord();
		resume.setLoginTokens(Collections.singletonList(loginToken));
		record.getServices().setResume(resume);
		PasswordRecord passwordRecord = new PasswordRecord();
		passwordRecord.setScrypt(scrypt);
		record.getServices().setPassword(passwordRecord);

		mongo().insert(USERS, toJson(record));

		response.setUserId(userId);
		response.setLoginToken(forUser);

		return response;
	}

	static String securedPassword(String password) {
		return SCryptUtil.scrypt(password, 16384, 8, 1);
	}

	static boolean isValidPassword(String password) {
		return password != null && password.length() >= 1;
	}

	static boolean emailExists(String emailAddress) throws SuspendExecution, InterruptedException {
		Long count = mongo().count(USERS, json(UserRecord.EMAILS_ADDRESS, emailAddress));
		return count != 0;
	}

	static boolean isValidEmailAddress(String emailAddress) {
		return EmailValidator.getInstance().isValid(emailAddress);
	}

	static boolean isValidName(String name) {
		return getUsernamePattern().matcher(name).matches()
				&& !isVulgar(name);
	}

	static boolean isVulgar(String name) {
		return false;
	}

	static Pattern getUsernamePattern() {
		return USERNAME_PATTERN;
	}

	/**
	 * Creates an account.
	 *
	 * @param request A username, password and e-mail needed to create the account.
	 * @return The result of creating the account. If the field contains bad username, bad e-mail or bad password flags
	 * set to true, the account creation failed with the specified handled reason. On subsequent requests from a client
	 * that's using the HTTP API, the Login Token should be put into the X-Auth-Token header for subsequent requests. The
	 * token and user ID should be saved.
	 * @throws SuspendExecution
	 * @throws InterruptedException
	 */
	@Suspendable
	CreateAccountResponse createAccount(CreateAccountRequest request) throws SuspendExecution, InterruptedException;

	/**
	 * Login with the provided email and password to receive a login token. Pass the login token in the X-Auth-Token
	 * header for subsequent requests in the HTTP API. Save the user ID.
	 *
	 * @param request An email and password combination.
	 * @return The result of logging in, or information about why the login failed if it was for a handled reason (bad
	 * email or password).
	 */
	@Suspendable
	LoginResponse login(LoginRequest request);

	/**
	 * Gets a user record for the given token.
	 *
	 * @param token The token that was returned by a login or create account request.
	 * @return The user record. or {@code null} if no user record for the specified token was found.
	 */
	@Suspendable
	UserRecord getWithToken(String token);

	/**
	 * Gets a user record for the given user ID.
	 *
	 * @param userId The user's ID as returned by a login or create account request.
	 * @return The user record, or {@code null} if no user record with the specified ID was found.
	 */
	@Suspendable
	UserRecord get(String userId);

	/**
	 * Changes the user's password.
	 *
	 * @param request The
	 * @return
	 */
	@Suspendable
	ChangePasswordResponse changePassword(ChangePasswordRequest request) throws SuspendExecution, InterruptedException;
}
