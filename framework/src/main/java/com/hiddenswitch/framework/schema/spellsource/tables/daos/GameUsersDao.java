/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.tables.GameUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.records.GameUsersRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameUsersDao extends AbstractReactiveVertxDAO<GameUsersRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers, Long, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<GameUsersRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public GameUsersDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(GameUsers.GAME_USERS, com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers.class, new ReactiveClassicQueryExecutor<GameUsersRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers,Long>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getGameUsersMapper()));
    }

    @Override
    protected Long getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers object) {
        return object.getId();
    }

    /**
     * Find records that have <code>player_index IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByPlayerIndex(Collection<Short> values) {
        return findManyByCondition(GameUsers.GAME_USERS.PLAYER_INDEX.in(values));
    }

    /**
     * Find records that have <code>player_index IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByPlayerIndex(Collection<Short> values, int limit) {
        return findManyByCondition(GameUsers.GAME_USERS.PLAYER_INDEX.in(values),limit);
    }

    /**
     * Find records that have <code>game_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByGameId(Collection<Long> values) {
        return findManyByCondition(GameUsers.GAME_USERS.GAME_ID.in(values));
    }

    /**
     * Find records that have <code>game_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByGameId(Collection<Long> values, int limit) {
        return findManyByCondition(GameUsers.GAME_USERS.GAME_ID.in(values),limit);
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(GameUsers.GAME_USERS.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(GameUsers.GAME_USERS.USER_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<GameUsersRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers,Long> queryExecutor(){
        return (ReactiveClassicQueryExecutor<GameUsersRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.GameUsers,Long>) super.queryExecutor();
    }
}
