/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.ResourceServerPolicy;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ResourceServerPolicyRecord;

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
public class ResourceServerPolicyDao extends AbstractReactiveVertxDAO<ResourceServerPolicyRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ResourceServerPolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ResourceServerPolicyDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ResourceServerPolicy.RESOURCE_SERVER_POLICY, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy.class, new ReactiveClassicQueryExecutor<ResourceServerPolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getResourceServerPolicyMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy object) {
        return object.getId();
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByName(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>description IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>description IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByDescription(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.DESCRIPTION.in(values),limit);
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByType(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.TYPE.in(values));
    }

    /**
     * Find records that have <code>type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>decision_strategy IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByDecisionStrategy(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.DECISION_STRATEGY.in(values));
    }

    /**
     * Find records that have <code>decision_strategy IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByDecisionStrategy(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.DECISION_STRATEGY.in(values),limit);
    }

    /**
     * Find records that have <code>logic IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByLogic(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.LOGIC.in(values));
    }

    /**
     * Find records that have <code>logic IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByLogic(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.LOGIC.in(values),limit);
    }

    /**
     * Find records that have <code>resource_server_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByResourceServerId(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.RESOURCE_SERVER_ID.in(values));
    }

    /**
     * Find records that have <code>resource_server_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByResourceServerId(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.RESOURCE_SERVER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>owner IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByOwner(Collection<String> values) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.OWNER.in(values));
    }

    /**
     * Find records that have <code>owner IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy>> findManyByOwner(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerPolicy.RESOURCE_SERVER_POLICY.OWNER.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ResourceServerPolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ResourceServerPolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourceServerPolicy,String>) super.queryExecutor();
    }
}
