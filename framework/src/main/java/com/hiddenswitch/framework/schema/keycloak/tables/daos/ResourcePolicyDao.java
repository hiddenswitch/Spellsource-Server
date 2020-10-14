/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.ResourcePolicy;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ResourcePolicyRecord;

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
public class ResourcePolicyDao extends AbstractReactiveVertxDAO<ResourcePolicyRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ResourcePolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ResourcePolicyDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ResourcePolicy.RESOURCE_POLICY, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy.class, new ReactiveClassicQueryExecutor<ResourcePolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getResourcePolicyMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy object) {
        return compositeKeyRecord(object.getResourceId(), object.getPolicyId());
    }

    /**
     * Find records that have <code>policy_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy>> findManyByPolicyId(Collection<String> values) {
        return findManyByCondition(ResourcePolicy.RESOURCE_POLICY.POLICY_ID.in(values));
    }

    /**
     * Find records that have <code>policy_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy>> findManyByPolicyId(Collection<String> values, int limit) {
        return findManyByCondition(ResourcePolicy.RESOURCE_POLICY.POLICY_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ResourcePolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ResourcePolicyRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ResourcePolicy,Record2<String, String>>) super.queryExecutor();
    }
}
