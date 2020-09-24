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
public interface IBrokerLink extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.broker_link.identity_provider</code>.
     */
    public IBrokerLink setIdentityProvider(String value);

    /**
     * Getter for <code>public.broker_link.identity_provider</code>.
     */
    public String getIdentityProvider();

    /**
     * Setter for <code>public.broker_link.storage_provider_id</code>.
     */
    public IBrokerLink setStorageProviderId(String value);

    /**
     * Getter for <code>public.broker_link.storage_provider_id</code>.
     */
    public String getStorageProviderId();

    /**
     * Setter for <code>public.broker_link.realm_id</code>.
     */
    public IBrokerLink setRealmId(String value);

    /**
     * Getter for <code>public.broker_link.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>public.broker_link.broker_user_id</code>.
     */
    public IBrokerLink setBrokerUserId(String value);

    /**
     * Getter for <code>public.broker_link.broker_user_id</code>.
     */
    public String getBrokerUserId();

    /**
     * Setter for <code>public.broker_link.broker_username</code>.
     */
    public IBrokerLink setBrokerUsername(String value);

    /**
     * Getter for <code>public.broker_link.broker_username</code>.
     */
    public String getBrokerUsername();

    /**
     * Setter for <code>public.broker_link.token</code>.
     */
    public IBrokerLink setToken(String value);

    /**
     * Getter for <code>public.broker_link.token</code>.
     */
    public String getToken();

    /**
     * Setter for <code>public.broker_link.user_id</code>.
     */
    public IBrokerLink setUserId(String value);

    /**
     * Getter for <code>public.broker_link.user_id</code>.
     */
    public String getUserId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IBrokerLink
     */
    public void from(IBrokerLink from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IBrokerLink
     */
    public <E extends IBrokerLink> E into(E into);

    @Override
    public default IBrokerLink fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setIdentityProvider(json.getString("identity_provider"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("identity_provider","java.lang.String",e);
        }
        try {
            setStorageProviderId(json.getString("storage_provider_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("storage_provider_id","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setBrokerUserId(json.getString("broker_user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("broker_user_id","java.lang.String",e);
        }
        try {
            setBrokerUsername(json.getString("broker_username"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("broker_username","java.lang.String",e);
        }
        try {
            setToken(json.getString("token"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("token","java.lang.String",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("identity_provider",getIdentityProvider());
        json.put("storage_provider_id",getStorageProviderId());
        json.put("realm_id",getRealmId());
        json.put("broker_user_id",getBrokerUserId());
        json.put("broker_username",getBrokerUsername());
        json.put("token",getToken());
        json.put("user_id",getUserId());
        return json;
    }

}
