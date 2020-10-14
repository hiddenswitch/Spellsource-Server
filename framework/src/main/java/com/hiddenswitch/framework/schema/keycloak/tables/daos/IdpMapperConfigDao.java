/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.IdpMapperConfig;
import com.hiddenswitch.framework.schema.keycloak.tables.records.IdpMapperConfigRecord;

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
public class IdpMapperConfigDao extends AbstractReactiveVertxDAO<IdpMapperConfigRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<IdpMapperConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public IdpMapperConfigDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(IdpMapperConfig.IDP_MAPPER_CONFIG, com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig.class, new ReactiveClassicQueryExecutor<IdpMapperConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getIdpMapperConfigMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig object) {
        return compositeKeyRecord(object.getIdpMapperId(), object.getName());
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>> findManyByValue(Collection<String> values) {
        return findManyByCondition(IdpMapperConfig.IDP_MAPPER_CONFIG.VALUE.in(values));
    }

    /**
     * Find records that have <code>value IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>> findManyByValue(Collection<String> values, int limit) {
        return findManyByCondition(IdpMapperConfig.IDP_MAPPER_CONFIG.VALUE.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>> findManyByName(Collection<String> values) {
        return findManyByCondition(IdpMapperConfig.IDP_MAPPER_CONFIG.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(IdpMapperConfig.IDP_MAPPER_CONFIG.NAME.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<IdpMapperConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<IdpMapperConfigRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.IdpMapperConfig,Record2<String, String>>) super.queryExecutor();
    }
}
