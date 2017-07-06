package com.hiddenswitch.proto3.net.impl;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import com.hiddenswitch.proto3.net.*;
import com.hiddenswitch.proto3.net.impl.util.UserRecord;
import com.hiddenswitch.proto3.net.models.*;
import com.hiddenswitch.proto3.net.util.RPC;
import com.hiddenswitch.proto3.net.util.Registration;
import com.hiddenswitch.proto3.net.util.RpcClient;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.FindOptions;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.actions.GameAction;
import net.demilich.metastone.game.behaviour.Behaviour;
import net.demilich.metastone.game.behaviour.PlayRandomBehaviour;
import net.demilich.metastone.game.behaviour.threat.FeatureVector;
import net.demilich.metastone.game.behaviour.threat.GameStateValueBehaviour;
import net.demilich.metastone.game.entities.heroes.HeroClass;
import net.demilich.metastone.game.logic.GameLogic;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import static com.hiddenswitch.proto3.net.util.QuickJson.json;
import static io.vertx.ext.sync.Sync.awaitResult;

/**
 * Created by bberman on 12/7/16.
 */
public class BotsImpl extends AbstractService<BotsImpl> implements Bots {
	private RpcClient<Accounts> accounts;
	private RpcClient<Logic> logic;
	private RpcClient<Matchmaking> matchmaking;
	private List<UserRecord> bots = new ArrayList<>();
	private Queue<UserRecord> unusedBots = new ConcurrentLinkedQueue<>();
	private Map<String, UserRecord> botToGame = new HashMap<>();
	private Class<? extends Behaviour> botBehaviour = GameStateValueBehaviour.class;
	private Registration registration;

	@Override
	@Suspendable
	public void start() throws SuspendExecution {
		super.start();
		accounts = RPC.connect(Accounts.class, vertx.eventBus());
		logic = RPC.connect(Logic.class, vertx.eventBus());
		matchmaking = RPC.connect(Matchmaking.class, vertx.eventBus());
		registration = RPC.register(this, Bots.class, vertx.eventBus());
	}

	@Override
	@Suspendable
	public MulliganResponse mulligan(MulliganRequest request) {
		// Reject cards that cost more than 3
		MulliganResponse response = new MulliganResponse();
		response.discardedCards = request.cards.stream().filter(c -> c.getBaseManaCost() > 3).collect(Collectors.toList());
		return response;
	}

	@Override
	@Suspendable
	public RequestActionResponse requestAction(RequestActionRequest request) {
		RequestActionResponse response = new RequestActionResponse();

		// Use execute blocking to improve throughput
		response.gameAction = awaitResult(callback -> vertx.executeBlocking(done -> {
			final Behaviour behaviour;
			if (botBehaviour.equals(GameStateValueBehaviour.class)) {
				behaviour = new GameStateValueBehaviour(FeatureVector.getFittest(), "Botty McBotface");
			} else {
				behaviour = new PlayRandomBehaviour();
			}

			final GameContext context = new GameContext();
			context.setLogic(new GameLogic());
			context.setDeckFormat(request.format);
			context.setGameState(request.gameState);
			context.setActivePlayerId(request.playerId);
			context.getLogic().setLoggingEnabled(false);

			done.handle(Future.succeededFuture(
					behaviour.requestAction(context, context.getPlayer(request.playerId), request.validActions)));
		}, false, callback));


		return response;
	}

	@Override
	public BotsStartGameResponse startGame(BotsStartGameRequest request) throws SuspendExecution, InterruptedException {
		// The player has been waiting too long. Match to an AI.
		// Retrieve a bot and use it to play against the opponent
		BotsStartGameResponse response = new BotsStartGameResponse();
		UserRecord bot = pollBot();
		String gameId = RandomStringUtils.randomAlphanumeric(10).toLowerCase();
		String botDeckId = bot.getDecks().get(RandomUtils.nextInt(0, bot.getDecks().size()));

		botToGame.put(gameId, bot);

		MatchCreateResponse matchCreateResponse = matchmaking.sync().createMatch(new MatchCreateRequest(gameId, request.getUserId(), bot.getId(), true, request.getDeckId(), botDeckId));
		response.setPlayerConnection(matchCreateResponse.getCreateGameSessionResponse().getConfigurationForPlayer1());
		response.setGameId(matchCreateResponse.getCreateGameSessionResponse().getGameId());
		response.setBotUserId(bot.getId());
		response.setBotDeckId(botDeckId);
		return response;
	}

	@Override
	public NotifyGameOverResponse notifyGameOver(NotifyGameOverRequest request) {
		// Return the bot servicing this game to the pool.
		UserRecord bot = botToGame.remove(request.getGameId());
		unusedBots.add(bot);
		return new NotifyGameOverResponse();
	}

	private UserRecord pollBot() throws SuspendExecution, InterruptedException {
		if (bots.size() == 0) {
			// Retrieve existing bot accounts
			List<JsonObject> botIdRecords = Accounts.find(getMongo(), json("bot", true), new FindOptions().setFields(json("_id", 1)));

			List<String> botIds = botIdRecords.stream().map(o -> o.getString("_id")).collect(Collectors.toList());

			for (String id : botIds) {
				bots.add(accounts.sync().get(id));
			}
		}

		if (unusedBots.size() == 0) {
			List<String> newBotIds = new ArrayList<>();
			// At least 2 bots
			final int maxBots = Math.max(bots.size() + 1, 2);
			for (int i = bots.size(); i < maxBots; i++) {
				CreateAccountResponse response = accounts.sync().createAccount(new CreateAccountRequest()
						.withName("Botcharles")
						.withEmailAddress("botid" + Integer.toString(i) + "@hiddenswitch.com")
						.withPassword("securebotpassword")
						.withBot(true));

				logic.sync().initializeUser(new InitializeUserRequest().withUserId(response.getUserId()));
				newBotIds.add(response.getUserId());
			}

			for (String id : newBotIds) {
				final UserRecord record = accounts.sync().get(id);
				bots.add(record);
				unusedBots.add(record);
			}
		}

		return unusedBots.poll();
	}

	public Class<? extends Behaviour> getBotBehaviour() {
		return botBehaviour;
	}

	public void setBotBehaviour(Class<? extends Behaviour> botBehaviour) {
		this.botBehaviour = botBehaviour;
	}

	@Override
	@Suspendable
	public void stop() throws Exception {
		super.stop();
		RPC.unregister(registration);
	}
}
