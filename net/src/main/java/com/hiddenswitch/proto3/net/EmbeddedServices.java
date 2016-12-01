package com.hiddenswitch.proto3.net;

import co.paralleluniverse.fibers.Suspendable;
import com.hiddenswitch.proto3.net.common.MatchmakingRequest;
import com.hiddenswitch.proto3.net.common.MatchmakingResponse;
import com.hiddenswitch.proto3.net.util.Serialization;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.sync.SyncVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.LoggerHandler;

import static io.vertx.ext.sync.Sync.awaitResult;

/**
 * Created by bberman on 11/27/16.
 */
public class EmbeddedServices extends SyncVerticle {
	@Override
	@Suspendable
	public void start() {
		Logger logger = LoggerFactory.getLogger(EmbeddedServices.class);
		HttpServer server = vertx.createHttpServer();
		Router router = Router.router(vertx);

		try {
			logger.info("Deploying embedded services...");
			GameSessions gameSessions = new GameSessions();

			Void t = awaitResult(done -> context.executeBlocking(blocking -> {
				logger.info("Starting embedded configuration...");
				gameSessions.withEmbeddedConfiguration();
				logger.info("Embedded configuration complete.");
				blocking.complete();
			}, done));

			logger.info("Deploying gameGessions...");

			String socketServerDeploymentId = awaitResult(done -> {
				vertx.deployVerticle(gameSessions, done);
			});

			logger.info("Deployed gameSessions with verticle ID " + socketServerDeploymentId);

			Games games = new Games()
					.withGameSessions(gameSessions)
					.withEmbeddedConfiguration();

			String gamesDeploymentId = awaitResult(done -> {
				vertx.deployVerticle(games, done);
			});

			logger.info("Deployed games with verticle ID " + gamesDeploymentId);
			logger.info("Configuring router...");
			final String MATCHMAKE_PATH = "/v0/anonymous/matchmake";

			router.route(MATCHMAKE_PATH)
					.method(HttpMethod.DELETE)
					.blockingHandler(routingContext -> {
						String userId = routingContext.request().getHeader("X-Auth-UserId");
						games.cancel(userId);
						routingContext.response().setStatusCode(200);
						routingContext.response().end();
					});

			router.route(MATCHMAKE_PATH)
					.method(HttpMethod.POST)
					.consumes("application/json")
					.produces("application/json")
					.handler(BodyHandler.create());

			router.route(MATCHMAKE_PATH)
					.method(HttpMethod.POST)
					.blockingHandler(routingContext -> {
						MatchmakingRequest request = Serialization.deserialize(routingContext.getBodyAsString(), MatchmakingRequest.class);
						String userId = routingContext.request().getHeader("X-Auth-UserId");
						MatchmakingResponse matchmakingResponse = games.matchmakeAndJoin(request, userId);
						int statusCode = 200;
						if (matchmakingResponse.getRetry() != null) {
							statusCode = 202;
						}
						routingContext.response().setStatusCode(statusCode);
						routingContext.response().end(Serialization.serialize(matchmakingResponse));
					});

			router.route(MATCHMAKE_PATH).failureHandler(LoggerHandler.create());

			logger.info("Router configured.");
			final int httpPort = 8080;
			HttpServer listening = awaitResult(done -> server.requestHandler(router::accept).listen(httpPort, done));
			logger.info("Listening on port " + Integer.toString(httpPort));
		} catch (Exception e) {
		}
	}
}
