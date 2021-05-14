/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.ClientSessionAuthStatus;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ClientSessionAuthStatusRecord;

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
public class ClientSessionAuthStatusDao extends AbstractReactiveVertxDAO<ClientSessionAuthStatusRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ClientSessionAuthStatusRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ClientSessionAuthStatusDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ClientSessionAuthStatus.CLIENT_SESSION_AUTH_STATUS, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus.class, new ReactiveClassicQueryExecutor<ClientSessionAuthStatusRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getClientSessionAuthStatusMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus object) {
        return compositeKeyRecord(object.getClientSession(), object.getAuthenticator());
    }

    /**
     * Find records that have <code>authenticator IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>> findManyByAuthenticator(Collection<String> values) {
        return findManyByCondition(ClientSessionAuthStatus.CLIENT_SESSION_AUTH_STATUS.AUTHENTICATOR.in(values));
    }

    /**
     * Find records that have <code>authenticator IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>> findManyByAuthenticator(Collection<String> values, int limit) {
        return findManyByCondition(ClientSessionAuthStatus.CLIENT_SESSION_AUTH_STATUS.AUTHENTICATOR.in(values),limit);
    }

    /**
     * Find records that have <code>status IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>> findManyByStatus(Collection<Integer> values) {
        return findManyByCondition(ClientSessionAuthStatus.CLIENT_SESSION_AUTH_STATUS.STATUS.in(values));
    }

    /**
     * Find records that have <code>status IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus>> findManyByStatus(Collection<Integer> values, int limit) {
        return findManyByCondition(ClientSessionAuthStatus.CLIENT_SESSION_AUTH_STATUS.STATUS.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ClientSessionAuthStatusRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ClientSessionAuthStatusRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ClientSessionAuthStatus,Record2<String, String>>) super.queryExecutor();
    }
}