/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.UserConsent;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserConsentRecord;

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
public class UserConsentDao extends AbstractReactiveVertxDAO<UserConsentRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UserConsentRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public UserConsentDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(UserConsent.USER_CONSENT, com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent.class, new ReactiveClassicQueryExecutor<UserConsentRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getUserConsentMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent object) {
        return object.getId();
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByClientId(Collection<String> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.CLIENT_ID.in(values));
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByClientId(Collection<String> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.CLIENT_ID.in(values),limit);
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.USER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>created_date IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByCreatedDate(Collection<Long> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.CREATED_DATE.in(values));
    }

    /**
     * Find records that have <code>created_date IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByCreatedDate(Collection<Long> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.CREATED_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>last_updated_date IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByLastUpdatedDate(Collection<Long> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.LAST_UPDATED_DATE.in(values));
    }

    /**
     * Find records that have <code>last_updated_date IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByLastUpdatedDate(Collection<Long> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.LAST_UPDATED_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>client_storage_provider IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByClientStorageProvider(Collection<String> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.CLIENT_STORAGE_PROVIDER.in(values));
    }

    /**
     * Find records that have <code>client_storage_provider IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByClientStorageProvider(Collection<String> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.CLIENT_STORAGE_PROVIDER.in(values),limit);
    }

    /**
     * Find records that have <code>external_client_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByExternalClientId(Collection<String> values) {
        return findManyByCondition(UserConsent.USER_CONSENT.EXTERNAL_CLIENT_ID.in(values));
    }

    /**
     * Find records that have <code>external_client_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent>> findManyByExternalClientId(Collection<String> values, int limit) {
        return findManyByCondition(UserConsent.USER_CONSENT.EXTERNAL_CLIENT_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<UserConsentRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<UserConsentRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.UserConsent,String>) super.queryExecutor();
    }
}
