package com.hiddenswitch.proto3;

import com.hiddenswitch.minionate.Minionate;
import com.hiddenswitch.proto3.net.Migrations;
import com.hiddenswitch.proto3.net.impl.MigrationsImpl;
import com.hiddenswitch.proto3.net.models.MigrateToRequest;
import com.hiddenswitch.proto3.net.models.MigrationRequest;
import com.hiddenswitch.proto3.net.models.MigrationResponse;
import com.hiddenswitch.proto3.net.util.Mongo;
import com.hiddenswitch.proto3.net.util.RPC;
import com.hiddenswitch.proto3.net.util.RpcClient;
import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.hiddenswitch.proto3.net.util.QuickJson.json;

@RunWith(VertxUnitRunner.class)
public class MigrationTest {

	@Test
	public void testDeployAndMigrate(final TestContext context) {
		// Deploy migrator
		final Vertx vertx = Vertx.vertx();

		MigrationsImpl migrations = new MigrationsImpl();

		vertx.deployVerticle(migrations, context.asyncAssertSuccess(then -> {
			RpcClient<Migrations> migrator = RPC.connect(Migrations.class, vertx.eventBus());

			CompositeFuture waterfall = CompositeFuture.join(
					migrator.promise(service ->
							service.add(new MigrationRequest()
									.withVersion(2)
									.withUp((thisVertx) -> {
										Mongo.mongo().insert("testcollection", json("_id", "test2"));
									}))),
					migrator.promise(service ->
							service.add(new MigrationRequest()
									.withVersion(1)
									.withUp((thisVertx) -> {
										Mongo.mongo().createCollection("testcollection");
										Mongo.mongo().insert("testcollection", json("_id", "test"));
									}))),
					migrator.promise(service -> service.migrateTo(new MigrateToRequest().withLatest(true)))
			);

			waterfall.setHandler(context.asyncAssertSuccess(then2 -> {
				Mongo.mongo().client().count("testcollection", json(), context.asyncAssertSuccess(then3 -> {
					context.assertEquals(then3, 2L);
				}));
			}));
		}));

	}
}
