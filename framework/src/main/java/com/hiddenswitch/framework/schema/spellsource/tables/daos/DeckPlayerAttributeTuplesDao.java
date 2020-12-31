/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.tables.DeckPlayerAttributeTuples;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DeckPlayerAttributeTuplesRecord;

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
public class DeckPlayerAttributeTuplesDao extends AbstractReactiveVertxDAO<DeckPlayerAttributeTuplesRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples, Long, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DeckPlayerAttributeTuplesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public DeckPlayerAttributeTuplesDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES, com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples.class, new ReactiveClassicQueryExecutor<DeckPlayerAttributeTuplesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples,Long>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getDeckPlayerAttributeTuplesMapper()));
    }

    @Override
    protected Long getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples object) {
        return object.getId();
    }

    /**
     * Find records that have <code>deck_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByDeckId(Collection<String> values) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.DECK_ID.in(values));
    }

    /**
     * Find records that have <code>deck_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByDeckId(Collection<String> values, int limit) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.DECK_ID.in(values),limit);
    }

    /**
     * Find records that have <code>attribute IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByAttribute(Collection<Integer> values) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.ATTRIBUTE.in(values));
    }

    /**
     * Find records that have <code>attribute IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByAttribute(Collection<Integer> values, int limit) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.ATTRIBUTE.in(values),limit);
    }

    /**
     * Find records that have <code>string_value IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByStringValue(Collection<String> values) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.STRING_VALUE.in(values));
    }

    /**
     * Find records that have <code>string_value IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples>> findManyByStringValue(Collection<String> values, int limit) {
        return findManyByCondition(DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES.STRING_VALUE.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<DeckPlayerAttributeTuplesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples,Long> queryExecutor(){
        return (ReactiveClassicQueryExecutor<DeckPlayerAttributeTuplesRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.DeckPlayerAttributeTuples,Long>) super.queryExecutor();
    }
}