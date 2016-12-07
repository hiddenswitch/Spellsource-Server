package com.hiddenswitch.proto3.net.util;

import com.hiddenswitch.proto3.net.GameSessions;
import com.hiddenswitch.proto3.net.client.RemoteGameContext;
import com.hiddenswitch.proto3.net.common.ClientConnectionConfiguration;
import com.hiddenswitch.proto3.net.common.ClientToServerMessage;
import com.hiddenswitch.proto3.net.common.MatchmakingResponse;
import com.hiddenswitch.proto3.net.common.ServerGameContext;
import com.hiddenswitch.proto3.net.models.CreateGameSessionRequest;
import com.hiddenswitch.proto3.net.models.CreateGameSessionResponse;
import com.hiddenswitch.proto3.server.PregamePlayerConfiguration;
import net.demilich.metastone.game.cards.CardCatalogue;
import net.demilich.metastone.game.cards.CardParseException;
import net.demilich.metastone.game.decks.Deck;
import net.demilich.metastone.game.decks.DeckCatalogue;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;

import static net.demilich.metastone.game.GameContext.PLAYER_1;
import static net.demilich.metastone.game.GameContext.PLAYER_2;

/**
 * Created by bberman on 11/18/16.
 */
public class TwoClients {
	private RemoteGameContext playerContext1;
	private RemoteGameContext playerContext2;
	private Thread thread1;
	private Thread thread2;
	private String gameId;
	private GameSessions service;
	private Logger logger = LoggerFactory.getLogger(TwoClients.class);
	private PregamePlayerConfiguration pregame1;
	private PregamePlayerConfiguration pregame2;
	private ClientConnectionConfiguration configurationForPlayer1;
	private ClientConnectionConfiguration configurationForPlayer2;

	public ServerGameContext getServerGameContext() {
		return service.getGameContext(gameId);
	}

	public RemoteGameContext getPlayerContext1() {
		return playerContext1;
	}

	public RemoteGameContext getPlayerContext2() {
		return playerContext2;
	}

	public Thread getThread1() {
		return thread1;
	}

	public Thread getThread2() {
		return thread2;
	}

	public TwoClients invoke(GameSessions service) throws IOException, URISyntaxException, CardParseException {
		return invoke(service, 40 * 1000L);
	}

	public TwoClients invoke(GameSessions service, long noActivityTimeout) throws IOException, URISyntaxException, CardParseException {
		this.service = service;
		CardCatalogue.loadCardsFromPackage();

		CreateGameSessionRequest request = new CreateGameSessionRequest();
		AIPlayer player1 = new AIPlayer();
		AIPlayer player2 = new AIPlayer();
		pregame1 = new PregamePlayerConfiguration(player1.getConfiguredDeck(), "Player 1").withPlayer(player1);
		pregame2 = new PregamePlayerConfiguration(player2.getConfiguredDeck(), "Player 2").withPlayer(player2);

		request.setPregame1(pregame1);
		request.setPregame2(pregame2);
		request.setGameId(RandomStringUtils.randomAlphanumeric(8));
		request.setNoActivityTimeout(noActivityTimeout);

		CreateGameSessionResponse response = service.createGameSession(request);
		this.gameId = response.getGameId();
		// Manually override the player in the configurations
		configurationForPlayer1 = response.getConfigurationForPlayer1();
		configurationForPlayer2 = response.getConfigurationForPlayer2();
		connect(PLAYER_1);
		connect(PLAYER_2);
		return this;
	}

	public TwoClients invoke(MatchmakingResponse response1, Deck deck1, MatchmakingResponse response2, Deck deck2, String gameId, GameSessions service) {
		this.service = service;
		this.gameId = gameId;
		// Manually override the player in the configurations
		AIPlayer player1 = new AIPlayer(deck1);
		AIPlayer player2 = new AIPlayer(deck2);
		ClientToServerMessage firstMessage1 = response1.getConnection().getFirstMessage();
		ClientToServerMessage firstMessage2 = response2.getConnection().getFirstMessage();
		player1.setId(firstMessage1.getPlayer1().getId());
		player2.setId(firstMessage2.getPlayer1().getId());
		firstMessage1.setPlayer1(player1);
		firstMessage2.setPlayer1(player2);
		configurationForPlayer1 = response1.getConnection();
		configurationForPlayer2 = response2.getConnection();
		connect(PLAYER_1);
		connect(PLAYER_2);
		return this;
	}

	public void connect(int playerId) {
		if (playerId == PLAYER_1) {
			playerContext1 = createRemoteGameContext(configurationForPlayer1);
			thread1 = new Thread(playerContext1::play);
		} else {
			playerContext2 = createRemoteGameContext(configurationForPlayer2);
			thread2 = new Thread(playerContext2::play);
		}
	}

	public void disconnect(int playerId) {
		if (playerId == PLAYER_1) {
			thread1.interrupt();
			playerContext1.dispose();
		} else {
			thread2.interrupt();
			playerContext2.dispose();
		}
	}

	private RemoteGameContext createRemoteGameContext(ClientConnectionConfiguration configuration) {
		try {
			DeckCatalogue.loadDecksFromPackage();
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

		return new RemoteGameContext(configuration).withIgnoreEventOverride(true);
	}

	public void play() {
		play(PLAYER_1);
		play(PLAYER_2);
	}

	public void play(int playerId) {
		if (playerId == PLAYER_1) {
			thread1.start();
		} else {
			thread2.start();
		}
	}

	public boolean isInterrupted() {
		return getThread1().isInterrupted() || getThread2().isInterrupted();
	}

	public boolean gameDecided() {
		return getPlayerContext1().gameDecided() && getPlayerContext2().gameDecided();
	}

	public void assertGameOver() {
		if (!gameDecided()
				|| isTimedOut()) {
			// Print some diagnostic information
			log("A match was not decided in this test by the deadline. Game information:");
		} else {
			logger.info("TwoClients match complete.");
		}
		ServiceTestBase.getContext().assertTrue(gameDecided());
		ServiceTestBase.getContext().assertFalse(isTimedOut());
		ServiceTestBase.getContext().assertTrue(playerContext1.getWinningPlayerId() == playerContext2.getWinningPlayerId());
		this.dispose();
	}

	public void log(String message) {
		logger.error(message);
		final ServerGameContext serverGameContext = getServerGameContext();
		if (serverGameContext == null) {
			logger.error("The server game context is null, so an error cannot be logged. Client errors:");
			logger.error(getPlayerContext1().toLongString());
		} else {
			logger.error(serverGameContext.toLongString());
			logger.error("Panic Dump:");
			serverGameContext.getLogic().panicDump();
		}
	}

	public void dispose() {
		disconnect(PLAYER_1);
		disconnect(PLAYER_2);
	}

	public boolean isTimedOut() {
		return !gameDecided() && playerContext1.isTimedOut() && playerContext2.isTimedOut();
	}

	public boolean isTimedOut(long time) {
		return !gameDecided() && playerContext1.isTimedOut(time) && playerContext2.isTimedOut(time);
	}

	public String getGameId() {
		return gameId;
	}
}
