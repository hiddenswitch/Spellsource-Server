/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.Client;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IClient;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientRecord extends UpdatableRecordImpl<ClientRecord> implements VertxPojo, IClient {

    private static final long serialVersionUID = -315708742;

    /**
     * Setter for <code>keycloak.client.id</code>.
     */
    @Override
    public ClientRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.client.enabled</code>.
     */
    @Override
    public ClientRecord setEnabled(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.enabled</code>.
     */
    @Override
    public Boolean getEnabled() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>keycloak.client.full_scope_allowed</code>.
     */
    @Override
    public ClientRecord setFullScopeAllowed(Boolean value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.full_scope_allowed</code>.
     */
    @Override
    public Boolean getFullScopeAllowed() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>keycloak.client.client_id</code>.
     */
    @Override
    public ClientRecord setClientId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.client_id</code>.
     */
    @Override
    public String getClientId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>keycloak.client.not_before</code>.
     */
    @Override
    public ClientRecord setNotBefore(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.not_before</code>.
     */
    @Override
    public Integer getNotBefore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>keycloak.client.public_client</code>.
     */
    @Override
    public ClientRecord setPublicClient(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.public_client</code>.
     */
    @Override
    public Boolean getPublicClient() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>keycloak.client.secret</code>.
     */
    @Override
    public ClientRecord setSecret(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.secret</code>.
     */
    @Override
    public String getSecret() {
        return (String) get(6);
    }

    /**
     * Setter for <code>keycloak.client.base_url</code>.
     */
    @Override
    public ClientRecord setBaseUrl(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.base_url</code>.
     */
    @Override
    public String getBaseUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>keycloak.client.bearer_only</code>.
     */
    @Override
    public ClientRecord setBearerOnly(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.bearer_only</code>.
     */
    @Override
    public Boolean getBearerOnly() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>keycloak.client.management_url</code>.
     */
    @Override
    public ClientRecord setManagementUrl(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.management_url</code>.
     */
    @Override
    public String getManagementUrl() {
        return (String) get(9);
    }

    /**
     * Setter for <code>keycloak.client.surrogate_auth_required</code>.
     */
    @Override
    public ClientRecord setSurrogateAuthRequired(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.surrogate_auth_required</code>.
     */
    @Override
    public Boolean getSurrogateAuthRequired() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>keycloak.client.realm_id</code>.
     */
    @Override
    public ClientRecord setRealmId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>keycloak.client.protocol</code>.
     */
    @Override
    public ClientRecord setProtocol(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.protocol</code>.
     */
    @Override
    public String getProtocol() {
        return (String) get(12);
    }

    /**
     * Setter for <code>keycloak.client.node_rereg_timeout</code>.
     */
    @Override
    public ClientRecord setNodeReregTimeout(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.node_rereg_timeout</code>.
     */
    @Override
    public Integer getNodeReregTimeout() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>keycloak.client.frontchannel_logout</code>.
     */
    @Override
    public ClientRecord setFrontchannelLogout(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.frontchannel_logout</code>.
     */
    @Override
    public Boolean getFrontchannelLogout() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>keycloak.client.consent_required</code>.
     */
    @Override
    public ClientRecord setConsentRequired(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.consent_required</code>.
     */
    @Override
    public Boolean getConsentRequired() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>keycloak.client.name</code>.
     */
    @Override
    public ClientRecord setName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>keycloak.client.service_accounts_enabled</code>.
     */
    @Override
    public ClientRecord setServiceAccountsEnabled(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.service_accounts_enabled</code>.
     */
    @Override
    public Boolean getServiceAccountsEnabled() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>keycloak.client.client_authenticator_type</code>.
     */
    @Override
    public ClientRecord setClientAuthenticatorType(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.client_authenticator_type</code>.
     */
    @Override
    public String getClientAuthenticatorType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>keycloak.client.root_url</code>.
     */
    @Override
    public ClientRecord setRootUrl(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.root_url</code>.
     */
    @Override
    public String getRootUrl() {
        return (String) get(19);
    }

    /**
     * Setter for <code>keycloak.client.description</code>.
     */
    @Override
    public ClientRecord setDescription(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(20);
    }

    /**
     * Setter for <code>keycloak.client.registration_token</code>.
     */
    @Override
    public ClientRecord setRegistrationToken(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.registration_token</code>.
     */
    @Override
    public String getRegistrationToken() {
        return (String) get(21);
    }

    /**
     * Setter for <code>keycloak.client.standard_flow_enabled</code>.
     */
    @Override
    public ClientRecord setStandardFlowEnabled(Boolean value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.standard_flow_enabled</code>.
     */
    @Override
    public Boolean getStandardFlowEnabled() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>keycloak.client.implicit_flow_enabled</code>.
     */
    @Override
    public ClientRecord setImplicitFlowEnabled(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.implicit_flow_enabled</code>.
     */
    @Override
    public Boolean getImplicitFlowEnabled() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>keycloak.client.direct_access_grants_enabled</code>.
     */
    @Override
    public ClientRecord setDirectAccessGrantsEnabled(Boolean value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.direct_access_grants_enabled</code>.
     */
    @Override
    public Boolean getDirectAccessGrantsEnabled() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>keycloak.client.client_template_id</code>.
     */
    @Override
    public ClientRecord setClientTemplateId(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.client_template_id</code>.
     */
    @Override
    public String getClientTemplateId() {
        return (String) get(25);
    }

    /**
     * Setter for <code>keycloak.client.use_template_config</code>.
     */
    @Override
    public ClientRecord setUseTemplateConfig(Boolean value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.use_template_config</code>.
     */
    @Override
    public Boolean getUseTemplateConfig() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>keycloak.client.use_template_scope</code>.
     */
    @Override
    public ClientRecord setUseTemplateScope(Boolean value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.use_template_scope</code>.
     */
    @Override
    public Boolean getUseTemplateScope() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>keycloak.client.use_template_mappers</code>.
     */
    @Override
    public ClientRecord setUseTemplateMappers(Boolean value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client.use_template_mappers</code>.
     */
    @Override
    public Boolean getUseTemplateMappers() {
        return (Boolean) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClient from) {
        setId(from.getId());
        setEnabled(from.getEnabled());
        setFullScopeAllowed(from.getFullScopeAllowed());
        setClientId(from.getClientId());
        setNotBefore(from.getNotBefore());
        setPublicClient(from.getPublicClient());
        setSecret(from.getSecret());
        setBaseUrl(from.getBaseUrl());
        setBearerOnly(from.getBearerOnly());
        setManagementUrl(from.getManagementUrl());
        setSurrogateAuthRequired(from.getSurrogateAuthRequired());
        setRealmId(from.getRealmId());
        setProtocol(from.getProtocol());
        setNodeReregTimeout(from.getNodeReregTimeout());
        setFrontchannelLogout(from.getFrontchannelLogout());
        setConsentRequired(from.getConsentRequired());
        setName(from.getName());
        setServiceAccountsEnabled(from.getServiceAccountsEnabled());
        setClientAuthenticatorType(from.getClientAuthenticatorType());
        setRootUrl(from.getRootUrl());
        setDescription(from.getDescription());
        setRegistrationToken(from.getRegistrationToken());
        setStandardFlowEnabled(from.getStandardFlowEnabled());
        setImplicitFlowEnabled(from.getImplicitFlowEnabled());
        setDirectAccessGrantsEnabled(from.getDirectAccessGrantsEnabled());
        setClientTemplateId(from.getClientTemplateId());
        setUseTemplateConfig(from.getUseTemplateConfig());
        setUseTemplateScope(from.getUseTemplateScope());
        setUseTemplateMappers(from.getUseTemplateMappers());
    }

    @Override
    public <E extends IClient> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClientRecord
     */
    public ClientRecord() {
        super(Client.CLIENT);
    }

    /**
     * Create a detached, initialised ClientRecord
     */
    public ClientRecord(String id, Boolean enabled, Boolean fullScopeAllowed, String clientId, Integer notBefore, Boolean publicClient, String secret, String baseUrl, Boolean bearerOnly, String managementUrl, Boolean surrogateAuthRequired, String realmId, String protocol, Integer nodeReregTimeout, Boolean frontchannelLogout, Boolean consentRequired, String name, Boolean serviceAccountsEnabled, String clientAuthenticatorType, String rootUrl, String description, String registrationToken, Boolean standardFlowEnabled, Boolean implicitFlowEnabled, Boolean directAccessGrantsEnabled, String clientTemplateId, Boolean useTemplateConfig, Boolean useTemplateScope, Boolean useTemplateMappers) {
        super(Client.CLIENT);

        set(0, id);
        set(1, enabled);
        set(2, fullScopeAllowed);
        set(3, clientId);
        set(4, notBefore);
        set(5, publicClient);
        set(6, secret);
        set(7, baseUrl);
        set(8, bearerOnly);
        set(9, managementUrl);
        set(10, surrogateAuthRequired);
        set(11, realmId);
        set(12, protocol);
        set(13, nodeReregTimeout);
        set(14, frontchannelLogout);
        set(15, consentRequired);
        set(16, name);
        set(17, serviceAccountsEnabled);
        set(18, clientAuthenticatorType);
        set(19, rootUrl);
        set(20, description);
        set(21, registrationToken);
        set(22, standardFlowEnabled);
        set(23, implicitFlowEnabled);
        set(24, directAccessGrantsEnabled);
        set(25, clientTemplateId);
        set(26, useTemplateConfig);
        set(27, useTemplateScope);
        set(28, useTemplateMappers);
    }

    public ClientRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
