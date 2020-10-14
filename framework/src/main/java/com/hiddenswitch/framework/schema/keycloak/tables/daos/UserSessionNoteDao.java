/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.UserSessionNote;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserSessionNoteRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSessionNoteDao extends AbstractReactiveVertxDAO<UserSessionNoteRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UserSessionNoteRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public UserSessionNoteDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(UserSessionNote.USER_SESSION_NOTE, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote.class, new ReactiveClassicQueryExecutor<UserSessionNoteRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getUserSessionNoteMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote object) {
        return compositeKeyRecord(object.getUserSession(), object.getName());
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>> findManyByName(Collection<String> values) {
        return findManyByCondition(UserSessionNote.USER_SESSION_NOTE.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(UserSessionNote.USER_SESSION_NOTE.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>> findManyByValue(Collection<String> values) {
        return findManyByCondition(UserSessionNote.USER_SESSION_NOTE.VALUE.in(values));
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote>> findManyByValue(Collection<String> values, int limit) {
        return findManyByCondition(UserSessionNote.USER_SESSION_NOTE.VALUE.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<UserSessionNoteRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<UserSessionNoteRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSessionNote,Record2<String, String>>) super.queryExecutor();
    }
}
