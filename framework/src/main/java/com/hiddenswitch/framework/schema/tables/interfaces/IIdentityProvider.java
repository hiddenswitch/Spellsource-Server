/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIdentityProvider extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.identity_provider.internal_id</code>.
     */
    public IIdentityProvider setInternalId(String value);

    /**
     * Getter for <code>public.identity_provider.internal_id</code>.
     */
    public String getInternalId();

    /**
     * Setter for <code>public.identity_provider.enabled</code>.
     */
    public IIdentityProvider setEnabled(Boolean value);

    /**
     * Getter for <code>public.identity_provider.enabled</code>.
     */
    public Boolean getEnabled();

    /**
     * Setter for <code>public.identity_provider.provider_alias</code>.
     */
    public IIdentityProvider setProviderAlias(String value);

    /**
     * Getter for <code>public.identity_provider.provider_alias</code>.
     */
    public String getProviderAlias();

    /**
     * Setter for <code>public.identity_provider.provider_id</code>.
     */
    public IIdentityProvider setProviderId(String value);

    /**
     * Getter for <code>public.identity_provider.provider_id</code>.
     */
    public String getProviderId();

    /**
     * Setter for <code>public.identity_provider.store_token</code>.
     */
    public IIdentityProvider setStoreToken(Boolean value);

    /**
     * Getter for <code>public.identity_provider.store_token</code>.
     */
    public Boolean getStoreToken();

    /**
     * Setter for <code>public.identity_provider.authenticate_by_default</code>.
     */
    public IIdentityProvider setAuthenticateByDefault(Boolean value);

    /**
     * Getter for <code>public.identity_provider.authenticate_by_default</code>.
     */
    public Boolean getAuthenticateByDefault();

    /**
     * Setter for <code>public.identity_provider.realm_id</code>.
     */
    public IIdentityProvider setRealmId(String value);

    /**
     * Getter for <code>public.identity_provider.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>public.identity_provider.add_token_role</code>.
     */
    public IIdentityProvider setAddTokenRole(Boolean value);

    /**
     * Getter for <code>public.identity_provider.add_token_role</code>.
     */
    public Boolean getAddTokenRole();

    /**
     * Setter for <code>public.identity_provider.trust_email</code>.
     */
    public IIdentityProvider setTrustEmail(Boolean value);

    /**
     * Getter for <code>public.identity_provider.trust_email</code>.
     */
    public Boolean getTrustEmail();

    /**
     * Setter for <code>public.identity_provider.first_broker_login_flow_id</code>.
     */
    public IIdentityProvider setFirstBrokerLoginFlowId(String value);

    /**
     * Getter for <code>public.identity_provider.first_broker_login_flow_id</code>.
     */
    public String getFirstBrokerLoginFlowId();

    /**
     * Setter for <code>public.identity_provider.post_broker_login_flow_id</code>.
     */
    public IIdentityProvider setPostBrokerLoginFlowId(String value);

    /**
     * Getter for <code>public.identity_provider.post_broker_login_flow_id</code>.
     */
    public String getPostBrokerLoginFlowId();

    /**
     * Setter for <code>public.identity_provider.provider_display_name</code>.
     */
    public IIdentityProvider setProviderDisplayName(String value);

    /**
     * Getter for <code>public.identity_provider.provider_display_name</code>.
     */
    public String getProviderDisplayName();

    /**
     * Setter for <code>public.identity_provider.link_only</code>.
     */
    public IIdentityProvider setLinkOnly(Boolean value);

    /**
     * Getter for <code>public.identity_provider.link_only</code>.
     */
    public Boolean getLinkOnly();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IIdentityProvider
     */
    public void from(IIdentityProvider from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IIdentityProvider
     */
    public <E extends IIdentityProvider> E into(E into);

    @Override
    public default IIdentityProvider fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setInternalId(json.getString("internal_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("internal_id","java.lang.String",e);
        }
        try {
            setEnabled(json.getBoolean("enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("enabled","java.lang.Boolean",e);
        }
        try {
            setProviderAlias(json.getString("provider_alias"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("provider_alias","java.lang.String",e);
        }
        try {
            setProviderId(json.getString("provider_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("provider_id","java.lang.String",e);
        }
        try {
            setStoreToken(json.getBoolean("store_token"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("store_token","java.lang.Boolean",e);
        }
        try {
            setAuthenticateByDefault(json.getBoolean("authenticate_by_default"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("authenticate_by_default","java.lang.Boolean",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setAddTokenRole(json.getBoolean("add_token_role"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("add_token_role","java.lang.Boolean",e);
        }
        try {
            setTrustEmail(json.getBoolean("trust_email"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("trust_email","java.lang.Boolean",e);
        }
        try {
            setFirstBrokerLoginFlowId(json.getString("first_broker_login_flow_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("first_broker_login_flow_id","java.lang.String",e);
        }
        try {
            setPostBrokerLoginFlowId(json.getString("post_broker_login_flow_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("post_broker_login_flow_id","java.lang.String",e);
        }
        try {
            setProviderDisplayName(json.getString("provider_display_name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("provider_display_name","java.lang.String",e);
        }
        try {
            setLinkOnly(json.getBoolean("link_only"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("link_only","java.lang.Boolean",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("internal_id",getInternalId());
        json.put("enabled",getEnabled());
        json.put("provider_alias",getProviderAlias());
        json.put("provider_id",getProviderId());
        json.put("store_token",getStoreToken());
        json.put("authenticate_by_default",getAuthenticateByDefault());
        json.put("realm_id",getRealmId());
        json.put("add_token_role",getAddTokenRole());
        json.put("trust_email",getTrustEmail());
        json.put("first_broker_login_flow_id",getFirstBrokerLoginFlowId());
        json.put("post_broker_login_flow_id",getPostBrokerLoginFlowId());
        json.put("provider_display_name",getProviderDisplayName());
        json.put("link_only",getLinkOnly());
        return json;
    }

}
