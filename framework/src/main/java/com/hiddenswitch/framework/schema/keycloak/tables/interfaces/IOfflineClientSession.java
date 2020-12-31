/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IOfflineClientSession extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.offline_client_session.user_session_id</code>.
     */
    public IOfflineClientSession setUserSessionId(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.user_session_id</code>.
     */
    public String getUserSessionId();

    /**
     * Setter for <code>keycloak.offline_client_session.client_id</code>.
     */
    public IOfflineClientSession setClientId(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.client_id</code>.
     */
    public String getClientId();

    /**
     * Setter for <code>keycloak.offline_client_session.offline_flag</code>.
     */
    public IOfflineClientSession setOfflineFlag(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.offline_flag</code>.
     */
    public String getOfflineFlag();

    /**
     * Setter for <code>keycloak.offline_client_session.timestamp</code>.
     */
    public IOfflineClientSession setTimestamp(Integer value);

    /**
     * Getter for <code>keycloak.offline_client_session.timestamp</code>.
     */
    public Integer getTimestamp();

    /**
     * Setter for <code>keycloak.offline_client_session.data</code>.
     */
    public IOfflineClientSession setData(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.data</code>.
     */
    public String getData();

    /**
     * Setter for <code>keycloak.offline_client_session.client_storage_provider</code>.
     */
    public IOfflineClientSession setClientStorageProvider(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.client_storage_provider</code>.
     */
    public String getClientStorageProvider();

    /**
     * Setter for <code>keycloak.offline_client_session.external_client_id</code>.
     */
    public IOfflineClientSession setExternalClientId(String value);

    /**
     * Getter for <code>keycloak.offline_client_session.external_client_id</code>.
     */
    public String getExternalClientId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IOfflineClientSession
     */
    public void from(IOfflineClientSession from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IOfflineClientSession
     */
    public <E extends IOfflineClientSession> E into(E into);

    @Override
    public default IOfflineClientSession fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setUserSessionId(json.getString("user_session_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_session_id","java.lang.String",e);
        }
        try {
            setClientId(json.getString("client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_id","java.lang.String",e);
        }
        try {
            setOfflineFlag(json.getString("offline_flag"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("offline_flag","java.lang.String",e);
        }
        try {
            setTimestamp(json.getInteger("timestamp"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("timestamp","java.lang.Integer",e);
        }
        try {
            setData(json.getString("data"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("data","java.lang.String",e);
        }
        try {
            setClientStorageProvider(json.getString("client_storage_provider"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_storage_provider","java.lang.String",e);
        }
        try {
            setExternalClientId(json.getString("external_client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("external_client_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("user_session_id",getUserSessionId());
        json.put("client_id",getClientId());
        json.put("offline_flag",getOfflineFlag());
        json.put("timestamp",getTimestamp());
        json.put("data",getData());
        json.put("client_storage_provider",getClientStorageProvider());
        json.put("external_client_id",getExternalClientId());
        return json;
    }

}