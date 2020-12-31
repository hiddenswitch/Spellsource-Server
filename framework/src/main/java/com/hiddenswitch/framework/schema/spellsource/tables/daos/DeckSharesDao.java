/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.tables.DeckShares;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DeckSharesRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * indicates a deck shared to a player
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeckSharesDao extends AbstractReactiveVertxDAO<DeckSharesRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares, Long, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DeckSharesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public DeckSharesDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(DeckShares.DECK_SHARES, com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares.class, new ReactiveClassicQueryExecutor<DeckSharesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares,Long>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getDeckSharesMapper()));
    }

    @Override
    protected Long getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares object) {
        return object.getId();
    }

    /**
     * Find records that have <code>deck_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByDeckId(Collection<String> values) {
        return findManyByCondition(DeckShares.DECK_SHARES.DECK_ID.in(values));
    }

    /**
     * Find records that have <code>deck_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByDeckId(Collection<String> values, int limit) {
        return findManyByCondition(DeckShares.DECK_SHARES.DECK_ID.in(values),limit);
    }

    /**
     * Find records that have <code>share_recipient_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByShareRecipientId(Collection<String> values) {
        return findManyByCondition(DeckShares.DECK_SHARES.SHARE_RECIPIENT_ID.in(values));
    }

    /**
     * Find records that have <code>share_recipient_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByShareRecipientId(Collection<String> values, int limit) {
        return findManyByCondition(DeckShares.DECK_SHARES.SHARE_RECIPIENT_ID.in(values),limit);
    }

    /**
     * Find records that have <code>trashed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByTrashed(Collection<Boolean> values) {
        return findManyByCondition(DeckShares.DECK_SHARES.TRASHED.in(values));
    }

    /**
     * Find records that have <code>trashed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares>> findManyByTrashed(Collection<Boolean> values, int limit) {
        return findManyByCondition(DeckShares.DECK_SHARES.TRASHED.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<DeckSharesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares,Long> queryExecutor(){
        return (ReactiveClassicQueryExecutor<DeckSharesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckShares,Long>) super.queryExecutor();
    }
}