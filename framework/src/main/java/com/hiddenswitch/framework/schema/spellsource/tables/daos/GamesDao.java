/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.enums.GameStateEnum;
import com.hiddenswitch.framework.schema.spellsource.tables.Games;
import com.hiddenswitch.framework.schema.spellsource.tables.records.GamesRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.time.OffsetDateTime;
import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.JSONB;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GamesDao extends AbstractReactiveVertxDAO<GamesRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games, Long, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<GamesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public GamesDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(Games.GAMES, com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games.class, new ReactiveClassicQueryExecutor<GamesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games,Long>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getGamesMapper()));
    }

    @Override
    protected Long getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games object) {
        return object.getId();
    }

    /**
     * Find records that have <code>status IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByStatus(Collection<GameStateEnum> values) {
        return findManyByCondition(Games.GAMES.STATUS.in(values));
    }

    /**
     * Find records that have <code>status IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByStatus(Collection<GameStateEnum> values, int limit) {
        return findManyByCondition(Games.GAMES.STATUS.in(values),limit);
    }

    /**
     * Find records that have <code>git_hash IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByGitHash(Collection<String> values) {
        return findManyByCondition(Games.GAMES.GIT_HASH.in(values));
    }

    /**
     * Find records that have <code>git_hash IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByGitHash(Collection<String> values, int limit) {
        return findManyByCondition(Games.GAMES.GIT_HASH.in(values),limit);
    }

    /**
     * Find records that have <code>trace IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByTrace(Collection<JSONB> values) {
        return findManyByCondition(Games.GAMES.TRACE.in(values));
    }

    /**
     * Find records that have <code>trace IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByTrace(Collection<JSONB> values, int limit) {
        return findManyByCondition(Games.GAMES.TRACE.in(values),limit);
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByCreatedAt(Collection<OffsetDateTime> values) {
        return findManyByCondition(Games.GAMES.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games>> findManyByCreatedAt(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(Games.GAMES.CREATED_AT.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<GamesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games,Long> queryExecutor(){
        return (ReactiveClassicQueryExecutor<GamesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Games,Long>) super.queryExecutor();
    }
}
