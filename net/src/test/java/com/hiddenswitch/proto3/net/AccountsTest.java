package com.hiddenswitch.proto3.net;

import com.hiddenswitch.proto3.net.models.*;
import org.testng.annotations.Test;

import java.sql.Date;
import java.time.Instant;
import java.util.function.Function;

import static org.testng.Assert.*;

public class AccountsTest extends ServiceTestBase<Accounts> {
	@Test
	public void testCreateAccount() throws Exception {
		CreateAccountResponse response = service.createAccount("benjamin.s.berman@gmail.com", "destructoid", "doctorpangloss");
		assertNotNull(response.loginToken);
		assertFalse(response.invalidEmailAddress);
		assertFalse(response.invalidName);
		assertFalse(response.invalidPassword);
		assertNotNull(response.loginToken.token);
		assertTrue(response.loginToken.expiresAt.after(Date.from(Instant.now())));
	}

	@Test
	public void testLogin() throws Exception {
		CreateAccountResponse response = service.createAccount("test@test.com", "password", "username");
		LoginResponse loginResponse = service.login("username", "password");
		assertNotNull(loginResponse.token);
		assertNotNull(loginResponse.token.token);
		assertFalse(loginResponse.badPassword);
		assertFalse(loginResponse.badUsername);

		LoginRequest badUsername = new LoginRequest();
		badUsername.userId = "blah";
		badUsername.password = "*****dddd";
		LoginResponse badUsernameResponse = service.login(badUsername);
		assertTrue(badUsernameResponse.badUsername);
		assertNull(badUsernameResponse.token);

		LoginRequest badPassword = new LoginRequest();
		badPassword.userId = "username";
		badPassword.password = "*****dddd";
		LoginResponse basPasswordResponse = service.login(badPassword);
		assertTrue(basPasswordResponse.badPassword);
		assertNull(basPasswordResponse.token);
	}

	@Test
	public void testIsAuthorizedWithToken() throws Exception {
		CreateAccountResponse response = service.createAccount("test@test.com", "password", "username");
		assertTrue(service.isAuthorizedWithToken(response.userId, response.loginToken.token));
		assertFalse(service.isAuthorizedWithToken(response.userId, null));
		assertFalse(service.isAuthorizedWithToken(response.userId, ""));
		assertFalse(service.isAuthorizedWithToken(response.userId, "a"));
		assertFalse(service.isAuthorizedWithToken("A", null));
		assertFalse(service.isAuthorizedWithToken("A", ""));
		assertFalse(service.isAuthorizedWithToken("A", "b"));
	}

	@Test
	public void testGet() throws Exception {
		CreateAccountResponse response = service.createAccount("test@test.com", "password", "username");
		User user = service.get(response.userId);
		assertNotNull(user);
		assertEquals(user.getEmailAddress(), "test@test.com");
		assertEquals(user.getName(), "username");
		User user1 = service.get("a");
		assertNull(user1);
		assertThrows(() -> service.get(null));
	}

	public static void assertThrows(ThrowingRunnable runnable) {
		assertThrows(Throwable.class, runnable);
	}

	/**
	 * Asserts that {@code runnable} throws an exception of type {@code throwableClass} when
	 * executed. If it does not throw an exception, an {@link AssertionError} is thrown. If it
	 * throws the wrong type of exception, an {@code AssertionError} is thrown describing the
	 * mismatch; the exception that was actually thrown can be obtained by calling {@link
	 * AssertionError#getCause}.
	 *
	 * @param throwableClass the expected type of the exception
	 * @param runnable       A function that is expected to throw an exception when invoked
	 * @since 6.9.5
	 */
	@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
	public static <T extends Throwable> void assertThrows(Class<T> throwableClass, ThrowingRunnable runnable) {
		expectThrows(throwableClass, runnable);
	}

	public static <T extends Throwable> T expectThrows(Class<T> throwableClass, ThrowingRunnable runnable) {
		try {
			runnable.run();
		} catch (Throwable t) {
			if (throwableClass.isInstance(t)) {
				return throwableClass.cast(t);
			} else {
				String mismatchMessage = String.format("Expected %s to be thrown, but %s was thrown",
						throwableClass.getSimpleName(), t.getClass().getSimpleName());

				throw new AssertionError(mismatchMessage, t);
			}
		}
		String message = String.format("Expected %s to be thrown, but nothing was thrown",
				throwableClass.getSimpleName());
		throw new AssertionError(message);
	}

	public interface ThrowingRunnable {
		void run() throws Throwable;
	}

	@Test
	public void testGetUserId() throws Exception {
		CreateAccountResponse response = service.createAccount("test@test.com", "password", "username");
		assertEquals(service.getUserId(), "username");
		service.login("A", "");
		assertNull(service.getUserId());
		service.login("username", "password");
		assertEquals(service.getUserId(), "username");
	}

	@Test
	public void testGetProfileForId() throws Exception {
		service.createAccount("test@test.com", "password", "username");
		assertEquals(service.getProfileForId("username").name, "username");
		assertNull(service.getProfileForId("a"));
		assertThrows(() -> {
			service.getProfileForId(null);
		});
	}

	@Override
	public Accounts setupAndReturnServiceInstance() {
		return new Accounts();
	}
}