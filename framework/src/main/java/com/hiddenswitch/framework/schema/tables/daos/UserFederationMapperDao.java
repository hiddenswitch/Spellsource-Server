/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.UserFederationMapper;
import com.hiddenswitch.framework.schema.tables.records.UserFederationMapperRecord;

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
public class UserFederationMapperDao extends AbstractReactiveVertxDAO<UserFederationMapperRecord, com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper, String, Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>>, Future<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UserFederationMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public UserFederationMapperDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(UserFederationMapper.USER_FEDERATION_MAPPER, com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper.class, new ReactiveClassicQueryExecutor<UserFederationMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper,String>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getUserFederationMapperMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper object) {
        return object.getId();
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByName(Collection<String> values) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>federation_provider_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByFederationProviderId(Collection<String> values) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.FEDERATION_PROVIDER_ID.in(values));
    }

    /**
     * Find records that have <code>federation_provider_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByFederationProviderId(Collection<String> values, int limit) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.FEDERATION_PROVIDER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>federation_mapper_type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByFederationMapperType(Collection<String> values) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.FEDERATION_MAPPER_TYPE.in(values));
    }

    /**
     * Find records that have <code>federation_mapper_type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByFederationMapperType(Collection<String> values, int limit) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.FEDERATION_MAPPER_TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(UserFederationMapper.USER_FEDERATION_MAPPER.REALM_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<UserFederationMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<UserFederationMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.UserFederationMapper,String>) super.queryExecutor();
    }
}
