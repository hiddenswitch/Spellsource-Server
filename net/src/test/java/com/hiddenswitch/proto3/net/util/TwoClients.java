package com.hiddenswitch.proto3.net.util;

import com.hiddenswitch.proto3.net.GameSessions;
import com.hiddenswitch.proto3.net.GameSessionsTest;
import com.hiddenswitch.proto3.net.client.RemoteGameContext;
import com.hiddenswitch.proto3.net.common.ClientConnectionConfiguration;
import com.hiddenswitch.proto3.net.common.ServerGameContext;
import com.hiddenswitch.proto3.net.models.CreateGameSessionRequest;
import com.hiddenswitch.proto3.net.models.CreateGameSessionResponse;
import com.hiddenswitch.proto3.server.PregamePlayerConfiguration;
import net.demilich.metastone.game.cards.CardCatalogue;
import net.demilich.metastone.game.cards.CardParseException;
import net.demilich.metastone.game.decks.DeckCatalogue;
import org.testng.Assert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

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
        this.service = service;
        CardCatalogue.loadCardsFromPackage();

        CreateGameSessionRequest request = new CreateGameSessionRequest();
        AIPlayer player1 = new AIPlayer();
        AIPlayer player2 = new AIPlayer();
        PregamePlayerConfiguration pregame1 = new PregamePlayerConfiguration(player1.getConfiguredDeck(), "Player 1");
        pregame1.setPlayer(player1);
        PregamePlayerConfiguration pregame2 = new PregamePlayerConfiguration(player2.getConfiguredDeck(), "Player 2");
        pregame2.setPlayer(player2);

        request.setPregame1(pregame1);
        request.setPregame2(pregame2);

        CreateGameSessionResponse response = service.createGameSession(request);
        this.gameId = response.getGameId();
        // Manually override the player in the configurations
        playerContext1 = createRemoteGameContext(response.getConfigurationForPlayer1());
        playerContext2 = createRemoteGameContext(response.getConfigurationForPlayer2());
        playerContext1.ignoreEventOverride = true;
        playerContext2.ignoreEventOverride = true;
        thread1 = new Thread(playerContext1::play);
        thread2 = new Thread(playerContext2::play);
        return this;
    }

    private RemoteGameContext createRemoteGameContext(ClientConnectionConfiguration configuration) {
        try {
            DeckCatalogue.loadDecksFromPackage();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        RemoteGameContext context = new RemoteGameContext(configuration);

        return context;
    }

    public void play() {
        thread1.start();
        thread2.start();
    }

    public boolean isInterrupted() {
        return getThread1().isInterrupted() || getThread2().isInterrupted();
    }

    public boolean gameDecided() {
        return getPlayerContext1().gameDecided() && getPlayerContext2().gameDecided();
    }

    public void assertGameOver() {
        List<Throwable> exceptions = getServerGameContext().getExceptions();
        if (exceptions.size() > 0) {
            for (Throwable t : exceptions) {
                Assert.fail(t.getMessage(), t.getCause());
            }
        }
        Assert.assertTrue(gameDecided());
        Assert.assertTrue(playerContext1.getWinningPlayerId() == playerContext2.getWinningPlayerId());
    }

    public void dispose() {
        thread1.interrupt();
        thread2.interrupt();
        playerContext1.dispose();
        playerContext2.dispose();
    }
}
