/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.UserSession;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserSessionRecord;

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
public class UserSessionDao extends AbstractReactiveVertxDAO<UserSessionRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UserSessionRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public UserSessionDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(UserSession.USER_SESSION, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession.class, new ReactiveClassicQueryExecutor<UserSessionRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getUserSessionMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession object) {
        return object.getId();
    }

    /**
     * Find records that have <code>auth_method IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByAuthMethod(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.AUTH_METHOD.in(values));
    }

    /**
     * Find records that have <code>auth_method IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByAuthMethod(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.AUTH_METHOD.in(values),limit);
    }

    /**
     * Find records that have <code>ip_address IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByIpAddress(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.IP_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>ip_address IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByIpAddress(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.IP_ADDRESS.in(values),limit);
    }

    /**
     * Find records that have <code>last_session_refresh IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByLastSessionRefresh(Collection<Integer> values) {
        return findManyByCondition(UserSession.USER_SESSION.LAST_SESSION_REFRESH.in(values));
    }

    /**
     * Find records that have <code>last_session_refresh IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByLastSessionRefresh(Collection<Integer> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.LAST_SESSION_REFRESH.in(values),limit);
    }

    /**
     * Find records that have <code>login_username IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByLoginUsername(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.LOGIN_USERNAME.in(values));
    }

    /**
     * Find records that have <code>login_username IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByLoginUsername(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.LOGIN_USERNAME.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.REALM_ID.in(values),limit);
    }

    /**
     * Find records that have <code>remember_me IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByRememberMe(Collection<Boolean> values) {
        return findManyByCondition(UserSession.USER_SESSION.REMEMBER_ME.in(values));
    }

    /**
     * Find records that have <code>remember_me IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByRememberMe(Collection<Boolean> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.REMEMBER_ME.in(values),limit);
    }

    /**
     * Find records that have <code>started IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByStarted(Collection<Integer> values) {
        return findManyByCondition(UserSession.USER_SESSION.STARTED.in(values));
    }

    /**
     * Find records that have <code>started IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByStarted(Collection<Integer> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.STARTED.in(values),limit);
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.USER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>user_session_state IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByUserSessionState(Collection<Integer> values) {
        return findManyByCondition(UserSession.USER_SESSION.USER_SESSION_STATE.in(values));
    }

    /**
     * Find records that have <code>user_session_state IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByUserSessionState(Collection<Integer> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.USER_SESSION_STATE.in(values),limit);
    }

    /**
     * Find records that have <code>broker_session_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByBrokerSessionId(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.BROKER_SESSION_ID.in(values));
    }

    /**
     * Find records that have <code>broker_session_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByBrokerSessionId(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.BROKER_SESSION_ID.in(values),limit);
    }

    /**
     * Find records that have <code>broker_user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByBrokerUserId(Collection<String> values) {
        return findManyByCondition(UserSession.USER_SESSION.BROKER_USER_ID.in(values));
    }

    /**
     * Find records that have <code>broker_user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession>> findManyByBrokerUserId(Collection<String> values, int limit) {
        return findManyByCondition(UserSession.USER_SESSION.BROKER_USER_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<UserSessionRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<UserSessionRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserSession,String>) super.queryExecutor();
    }
}
