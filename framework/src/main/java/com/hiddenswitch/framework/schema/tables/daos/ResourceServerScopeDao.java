/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.ResourceServerScope;
import com.hiddenswitch.framework.schema.tables.records.ResourceServerScopeRecord;

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
public class ResourceServerScopeDao extends AbstractReactiveVertxDAO<ResourceServerScopeRecord, com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope, String, Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>>, Future<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ResourceServerScopeRecord,com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ResourceServerScopeDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ResourceServerScope.RESOURCE_SERVER_SCOPE, com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope.class, new ReactiveClassicQueryExecutor<ResourceServerScopeRecord,com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope,String>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getResourceServerScopeMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope object) {
        return object.getId();
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByName(Collection<String> values) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>icon_uri IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByIconUri(Collection<String> values) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.ICON_URI.in(values));
    }

    /**
     * Find records that have <code>icon_uri IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByIconUri(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.ICON_URI.in(values),limit);
    }

    /**
     * Find records that have <code>resource_server_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByResourceServerId(Collection<String> values) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.RESOURCE_SERVER_ID.in(values));
    }

    /**
     * Find records that have <code>resource_server_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByResourceServerId(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.RESOURCE_SERVER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>display_name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByDisplayName(Collection<String> values) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.DISPLAY_NAME.in(values));
    }

    /**
     * Find records that have <code>display_name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope>> findManyByDisplayName(Collection<String> values, int limit) {
        return findManyByCondition(ResourceServerScope.RESOURCE_SERVER_SCOPE.DISPLAY_NAME.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ResourceServerScopeRecord,com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ResourceServerScopeRecord,com.hiddenswitch.framework.schema.tables.pojos.ResourceServerScope,String>) super.queryExecutor();
    }
}
