/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.FederatedUser;
import com.hiddenswitch.framework.schema.keycloak.tables.records.FederatedUserRecord;

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
public class FederatedUserDao extends AbstractReactiveVertxDAO<FederatedUserRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FederatedUserRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public FederatedUserDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(FederatedUser.FEDERATED_USER, com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser.class, new ReactiveClassicQueryExecutor<FederatedUserRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getFederatedUserMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser object) {
        return object.getId();
    }

    /**
     * Find records that have <code>storage_provider_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>> findManyByStorageProviderId(Collection<String> values) {
        return findManyByCondition(FederatedUser.FEDERATED_USER.STORAGE_PROVIDER_ID.in(values));
    }

    /**
     * Find records that have <code>storage_provider_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>> findManyByStorageProviderId(Collection<String> values, int limit) {
        return findManyByCondition(FederatedUser.FEDERATED_USER.STORAGE_PROVIDER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(FederatedUser.FEDERATED_USER.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(FederatedUser.FEDERATED_USER.REALM_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<FederatedUserRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<FederatedUserRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FederatedUser,String>) super.queryExecutor();
    }
}
