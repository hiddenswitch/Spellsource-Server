/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.daos;


import com.hiddenswitch.framework.schema.spellsource.tables.Decks;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DecksRecord;

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
public class DecksDao extends AbstractReactiveVertxDAO<DecksRecord, com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks, String, Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>>, Future<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DecksRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public DecksDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(Decks.DECKS, com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks.class, new ReactiveClassicQueryExecutor<DecksRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks,String>(configuration,delegate,com.hiddenswitch.framework.schema.spellsource.tables.mappers.RowMappers.getDecksMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks object) {
        return object.getId();
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(Decks.DECKS.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(Decks.DECKS.CREATED_BY.in(values),limit);
    }

    /**
     * Find records that have <code>last_edited_by IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByLastEditedBy(Collection<String> values) {
        return findManyByCondition(Decks.DECKS.LAST_EDITED_BY.in(values));
    }

    /**
     * Find records that have <code>last_edited_by IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByLastEditedBy(Collection<String> values, int limit) {
        return findManyByCondition(Decks.DECKS.LAST_EDITED_BY.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByName(Collection<String> values) {
        return findManyByCondition(Decks.DECKS.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(Decks.DECKS.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>hero_class IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByHeroClass(Collection<String> values) {
        return findManyByCondition(Decks.DECKS.HERO_CLASS.in(values));
    }

    /**
     * Find records that have <code>hero_class IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByHeroClass(Collection<String> values, int limit) {
        return findManyByCondition(Decks.DECKS.HERO_CLASS.in(values),limit);
    }

    /**
     * Find records that have <code>trashed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByTrashed(Collection<Boolean> values) {
        return findManyByCondition(Decks.DECKS.TRASHED.in(values));
    }

    /**
     * Find records that have <code>trashed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByTrashed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Decks.DECKS.TRASHED.in(values),limit);
    }

    /**
     * Find records that have <code>format IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByFormat(Collection<String> values) {
        return findManyByCondition(Decks.DECKS.FORMAT.in(values));
    }

    /**
     * Find records that have <code>format IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks>> findManyByFormat(Collection<String> values, int limit) {
        return findManyByCondition(Decks.DECKS.FORMAT.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<DecksRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<DecksRecord,com.hiddenswitch.framework.schema.spellsource.tables.pojos.Decks,String>) super.queryExecutor();
    }
}
