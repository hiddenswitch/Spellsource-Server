/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.ComponentConfig;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ComponentConfigRecord;

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
public class ComponentConfigDao extends AbstractReactiveVertxDAO<ComponentConfigRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ComponentConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ComponentConfigDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ComponentConfig.COMPONENT_CONFIG, com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig.class, new ReactiveClassicQueryExecutor<ComponentConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getComponentConfigMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig object) {
        return object.getId();
    }

    /**
     * Find records that have <code>component_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByComponentId(Collection<String> values) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.COMPONENT_ID.in(values));
    }

    /**
     * Find records that have <code>component_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByComponentId(Collection<String> values, int limit) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.COMPONENT_ID.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByName(Collection<String> values) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByValue(Collection<String> values) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.VALUE.in(values));
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig>> findManyByValue(Collection<String> values, int limit) {
        return findManyByCondition(ComponentConfig.COMPONENT_CONFIG.VALUE.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ComponentConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ComponentConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.ComponentConfig,String>) super.queryExecutor();
    }
}
