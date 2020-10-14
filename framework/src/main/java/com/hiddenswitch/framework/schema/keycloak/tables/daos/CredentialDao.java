/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.Credential;
import com.hiddenswitch.framework.schema.keycloak.tables.records.CredentialRecord;

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
public class CredentialDao extends AbstractReactiveVertxDAO<CredentialRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<CredentialRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public CredentialDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(Credential.CREDENTIAL, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential.class, new ReactiveClassicQueryExecutor<CredentialRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getCredentialMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential object) {
        return object.getId();
    }

    /**
     * Find records that have <code>salt IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyBySalt(Collection<byte[]> values) {
        return findManyByCondition(Credential.CREDENTIAL.SALT.in(values));
    }

    /**
     * Find records that have <code>salt IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyBySalt(Collection<byte[]> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.SALT.in(values),limit);
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByType(Collection<String> values) {
        return findManyByCondition(Credential.CREDENTIAL.TYPE.in(values));
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(Credential.CREDENTIAL.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.USER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>created_date IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByCreatedDate(Collection<Long> values) {
        return findManyByCondition(Credential.CREDENTIAL.CREATED_DATE.in(values));
    }

    /**
     * Find records that have <code>created_date IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByCreatedDate(Collection<Long> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.CREATED_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>user_label IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByUserLabel(Collection<String> values) {
        return findManyByCondition(Credential.CREDENTIAL.USER_LABEL.in(values));
    }

    /**
     * Find records that have <code>user_label IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByUserLabel(Collection<String> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.USER_LABEL.in(values),limit);
    }

    /**
     * Find records that have <code>secret_data IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyBySecretData(Collection<String> values) {
        return findManyByCondition(Credential.CREDENTIAL.SECRET_DATA.in(values));
    }

    /**
     * Find records that have <code>secret_data IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyBySecretData(Collection<String> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.SECRET_DATA.in(values),limit);
    }

    /**
     * Find records that have <code>credential_data IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByCredentialData(Collection<String> values) {
        return findManyByCondition(Credential.CREDENTIAL.CREDENTIAL_DATA.in(values));
    }

    /**
     * Find records that have <code>credential_data IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByCredentialData(Collection<String> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.CREDENTIAL_DATA.in(values),limit);
    }

    /**
     * Find records that have <code>priority IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByPriority(Collection<Integer> values) {
        return findManyByCondition(Credential.CREDENTIAL.PRIORITY.in(values));
    }

    /**
     * Find records that have <code>priority IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential>> findManyByPriority(Collection<Integer> values, int limit) {
        return findManyByCondition(Credential.CREDENTIAL.PRIORITY.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<CredentialRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<CredentialRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Credential,String>) super.queryExecutor();
    }
}
