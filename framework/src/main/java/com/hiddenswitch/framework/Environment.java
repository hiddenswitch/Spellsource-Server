package com.hiddenswitch.framework;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.Suspendable;
import co.paralleluniverse.strands.SuspendableCallable;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.PoolOptions;
import org.flywaydb.core.Flyway;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

import static io.vertx.ext.sync.Sync.awaitResult;

public class Environment {

	private static AtomicReference<Configuration> configuration = new AtomicReference<>();
	private static AtomicReference<PgPool> defaultPool = new AtomicReference<>();
	private static LoadingCache<Vertx, PgPool> pools = CacheBuilder.newBuilder()
			.weakKeys()
			.maximumSize(100)
			.build(new CacheLoader<>() {
				@Override
				public PgPool load(Vertx vertx) {
					var connectionOptions = connectOptions();
					var poolOptions = new PoolOptions()
							.setMaxSize(Runtime.getRuntime().availableProcessors() * 2);

					return PgPool.pool(vertx, connectionOptions, poolOptions);
				}
			});

	public static PgConnectOptions connectOptions() {
		var options = new PgConnectOptions();
		var properties = System.getProperties();
		if (properties.containsKey("pg.port")) {
			options.setPort(Integer.parseInt((String) properties.get("pg.port")));
		}
		if (properties.containsKey("pg.host")) {
			options.setHost((String) properties.get("pg.host"));
		}
		if (properties.containsKey("pg.database")) {
			options.setDatabase((String) properties.get("pg.database"));
		}
		if (properties.containsKey("pg.user")) {
			options.setUser((String) properties.get("pg.user"));
		}
		if (properties.containsKey("pg.password")) {
			options.setPassword((String) properties.get("pg.password"));
		}
		return options;
	}

	public static PgPool pool() {
		if (Vertx.currentContext() == null) {
			return defaultPool.updateAndGet(existing -> {
				if (existing != null) {
					return existing;
				}

				// Loads connection options from environment
				var connectionOptions = connectOptions();
				var poolOptions = new PoolOptions()
						.setMaxSize(Runtime.getRuntime().availableProcessors() * 2);

				return PgPool.pool(connectionOptions, poolOptions);
			});
		} else {
			try {
				return pools.get(Vertx.currentContext().owner());
			} catch (ExecutionException executionException) {
				throw new RuntimeException(executionException);
			}
		}
	}

	public static Configuration jooq() {
		return configuration.updateAndGet(existing -> {
			if (existing != null) {
				return existing;
			}
			var defaultConfiguration = new DefaultConfiguration();
			defaultConfiguration.setSQLDialect(SQLDialect.POSTGRES);
			return defaultConfiguration;
		});
	}

	@Suspendable
	public static Future<Integer> migrate(String url, String username, String password) {
		return executeBlocking(() -> {
			var flyway = Flyway.configure()
					.schemas("hiddenswitch")
					.locations("classpath:db/migration")
					.dataSource(url, username, password)
					.load();
			return flyway.migrate();
		});
	}

	@Suspendable
	public static <T> Future<T> executeBlocking(SuspendableCallable<T> blockingCallable) {
		var context = Vertx.currentContext();
		var result = Promise.<T>promise();
		var fiber = Fiber.currentFiber();
		if (context != null) {
			context.executeBlocking(promise -> {
				try {
					var res = blockingCallable.run();
					promise.complete(res);
				} catch (Exception e) {
					promise.fail(e);
				}
			}, false, result);
			if (fiber != null) {
				try {
					T out = awaitResult(h -> result.future().onComplete(h));
					return Future.succeededFuture(out);
				} catch (Throwable t) {
					return Future.failedFuture(t);
				}
			}
		} else {
			try {
				result.complete(blockingCallable.run());
			} catch (Throwable t) {
				result.fail(t);
			}
		}
		return result.future();
	}
}
