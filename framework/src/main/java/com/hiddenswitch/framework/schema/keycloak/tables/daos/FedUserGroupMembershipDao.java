/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.FedUserGroupMembership;
import com.hiddenswitch.framework.schema.keycloak.tables.records.FedUserGroupMembershipRecord;

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
public class FedUserGroupMembershipDao extends AbstractReactiveVertxDAO<FedUserGroupMembershipRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FedUserGroupMembershipRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public FedUserGroupMembershipDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP, com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership.class, new ReactiveClassicQueryExecutor<FedUserGroupMembershipRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getFedUserGroupMembershipMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership object) {
        return compositeKeyRecord(object.getGroupId(), object.getUserId());
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.USER_ID.in(values));
    }

    /**
     * Find records that have <code>user_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.USER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.REALM_ID.in(values),limit);
    }

    /**
     * Find records that have <code>storage_provider_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByStorageProviderId(Collection<String> values) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.STORAGE_PROVIDER_ID.in(values));
    }

    /**
     * Find records that have <code>storage_provider_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership>> findManyByStorageProviderId(Collection<String> values, int limit) {
        return findManyByCondition(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.STORAGE_PROVIDER_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<FedUserGroupMembershipRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<FedUserGroupMembershipRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.FedUserGroupMembership,Record2<String, String>>) super.queryExecutor();
    }
}
