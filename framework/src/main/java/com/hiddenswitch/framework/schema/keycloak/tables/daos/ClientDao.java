/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.Client;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ClientRecord;

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
public class ClientDao extends AbstractReactiveVertxDAO<ClientRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ClientRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ClientDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(Client.CLIENT, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client.class, new ReactiveClassicQueryExecutor<ClientRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getClientMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client object) {
        return object.getId();
    }

    /**
     * Find records that have <code>enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByEnabled(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.ENABLED.in(values));
    }

    /**
     * Find records that have <code>enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>full_scope_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByFullScopeAllowed(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.FULL_SCOPE_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>full_scope_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByFullScopeAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.FULL_SCOPE_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByClientId(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.CLIENT_ID.in(values));
    }

    /**
     * Find records that have <code>client_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByClientId(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.CLIENT_ID.in(values),limit);
    }

    /**
     * Find records that have <code>not_before IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByNotBefore(Collection<Integer> values) {
        return findManyByCondition(Client.CLIENT.NOT_BEFORE.in(values));
    }

    /**
     * Find records that have <code>not_before IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByNotBefore(Collection<Integer> values, int limit) {
        return findManyByCondition(Client.CLIENT.NOT_BEFORE.in(values),limit);
    }

    /**
     * Find records that have <code>public_client IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByPublicClient(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.PUBLIC_CLIENT.in(values));
    }

    /**
     * Find records that have <code>public_client IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByPublicClient(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.PUBLIC_CLIENT.in(values),limit);
    }

    /**
     * Find records that have <code>secret IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyBySecret(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.SECRET.in(values));
    }

    /**
     * Find records that have <code>secret IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyBySecret(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.SECRET.in(values),limit);
    }

    /**
     * Find records that have <code>base_url IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByBaseUrl(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.BASE_URL.in(values));
    }

    /**
     * Find records that have <code>base_url IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByBaseUrl(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.BASE_URL.in(values),limit);
    }

    /**
     * Find records that have <code>bearer_only IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByBearerOnly(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.BEARER_ONLY.in(values));
    }

    /**
     * Find records that have <code>bearer_only IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByBearerOnly(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.BEARER_ONLY.in(values),limit);
    }

    /**
     * Find records that have <code>management_url IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByManagementUrl(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.MANAGEMENT_URL.in(values));
    }

    /**
     * Find records that have <code>management_url IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByManagementUrl(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.MANAGEMENT_URL.in(values),limit);
    }

    /**
     * Find records that have <code>surrogate_auth_required IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyBySurrogateAuthRequired(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.SURROGATE_AUTH_REQUIRED.in(values));
    }

    /**
     * Find records that have <code>surrogate_auth_required IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyBySurrogateAuthRequired(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.SURROGATE_AUTH_REQUIRED.in(values),limit);
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRealmId(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.REALM_ID.in(values));
    }

    /**
     * Find records that have <code>realm_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRealmId(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.REALM_ID.in(values),limit);
    }

    /**
     * Find records that have <code>protocol IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByProtocol(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.PROTOCOL.in(values));
    }

    /**
     * Find records that have <code>protocol IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByProtocol(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.PROTOCOL.in(values),limit);
    }

    /**
     * Find records that have <code>node_rereg_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByNodeReregTimeout(Collection<Integer> values) {
        return findManyByCondition(Client.CLIENT.NODE_REREG_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>node_rereg_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByNodeReregTimeout(Collection<Integer> values, int limit) {
        return findManyByCondition(Client.CLIENT.NODE_REREG_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>frontchannel_logout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByFrontchannelLogout(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.FRONTCHANNEL_LOGOUT.in(values));
    }

    /**
     * Find records that have <code>frontchannel_logout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByFrontchannelLogout(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.FRONTCHANNEL_LOGOUT.in(values),limit);
    }

    /**
     * Find records that have <code>consent_required IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByConsentRequired(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.CONSENT_REQUIRED.in(values));
    }

    /**
     * Find records that have <code>consent_required IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByConsentRequired(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.CONSENT_REQUIRED.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByName(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>service_accounts_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByServiceAccountsEnabled(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.SERVICE_ACCOUNTS_ENABLED.in(values));
    }

    /**
     * Find records that have <code>service_accounts_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByServiceAccountsEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.SERVICE_ACCOUNTS_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>client_authenticator_type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByClientAuthenticatorType(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.CLIENT_AUTHENTICATOR_TYPE.in(values));
    }

    /**
     * Find records that have <code>client_authenticator_type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByClientAuthenticatorType(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.CLIENT_AUTHENTICATOR_TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>root_url IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRootUrl(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.ROOT_URL.in(values));
    }

    /**
     * Find records that have <code>root_url IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRootUrl(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.ROOT_URL.in(values),limit);
    }

    /**
     * Find records that have <code>description IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>description IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByDescription(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.DESCRIPTION.in(values),limit);
    }

    /**
     * Find records that have <code>registration_token IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRegistrationToken(Collection<String> values) {
        return findManyByCondition(Client.CLIENT.REGISTRATION_TOKEN.in(values));
    }

    /**
     * Find records that have <code>registration_token IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByRegistrationToken(Collection<String> values, int limit) {
        return findManyByCondition(Client.CLIENT.REGISTRATION_TOKEN.in(values),limit);
    }

    /**
     * Find records that have <code>standard_flow_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByStandardFlowEnabled(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.STANDARD_FLOW_ENABLED.in(values));
    }

    /**
     * Find records that have <code>standard_flow_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByStandardFlowEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.STANDARD_FLOW_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>implicit_flow_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByImplicitFlowEnabled(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.IMPLICIT_FLOW_ENABLED.in(values));
    }

    /**
     * Find records that have <code>implicit_flow_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByImplicitFlowEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.IMPLICIT_FLOW_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>direct_access_grants_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByDirectAccessGrantsEnabled(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.DIRECT_ACCESS_GRANTS_ENABLED.in(values));
    }

    /**
     * Find records that have <code>direct_access_grants_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByDirectAccessGrantsEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.DIRECT_ACCESS_GRANTS_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>always_display_in_console IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByAlwaysDisplayInConsole(Collection<Boolean> values) {
        return findManyByCondition(Client.CLIENT.ALWAYS_DISPLAY_IN_CONSOLE.in(values));
    }

    /**
     * Find records that have <code>always_display_in_console IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client>> findManyByAlwaysDisplayInConsole(Collection<Boolean> values, int limit) {
        return findManyByCondition(Client.CLIENT.ALWAYS_DISPLAY_IN_CONSOLE.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ClientRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ClientRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Client,String>) super.queryExecutor();
    }
}
