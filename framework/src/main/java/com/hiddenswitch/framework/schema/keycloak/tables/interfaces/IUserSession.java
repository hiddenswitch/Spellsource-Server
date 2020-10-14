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
public interface IUserSession extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.user_session.id</code>.
     */
    public IUserSession setId(String value);

    /**
     * Getter for <code>keycloak.user_session.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.user_session.auth_method</code>.
     */
    public IUserSession setAuthMethod(String value);

    /**
     * Getter for <code>keycloak.user_session.auth_method</code>.
     */
    public String getAuthMethod();

    /**
     * Setter for <code>keycloak.user_session.ip_address</code>.
     */
    public IUserSession setIpAddress(String value);

    /**
     * Getter for <code>keycloak.user_session.ip_address</code>.
     */
    public String getIpAddress();

    /**
     * Setter for <code>keycloak.user_session.last_session_refresh</code>.
     */
    public IUserSession setLastSessionRefresh(Integer value);

    /**
     * Getter for <code>keycloak.user_session.last_session_refresh</code>.
     */
    public Integer getLastSessionRefresh();

    /**
     * Setter for <code>keycloak.user_session.login_username</code>.
     */
    public IUserSession setLoginUsername(String value);

    /**
     * Getter for <code>keycloak.user_session.login_username</code>.
     */
    public String getLoginUsername();

    /**
     * Setter for <code>keycloak.user_session.realm_id</code>.
     */
    public IUserSession setRealmId(String value);

    /**
     * Getter for <code>keycloak.user_session.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>keycloak.user_session.remember_me</code>.
     */
    public IUserSession setRememberMe(Boolean value);

    /**
     * Getter for <code>keycloak.user_session.remember_me</code>.
     */
    public Boolean getRememberMe();

    /**
     * Setter for <code>keycloak.user_session.started</code>.
     */
    public IUserSession setStarted(Integer value);

    /**
     * Getter for <code>keycloak.user_session.started</code>.
     */
    public Integer getStarted();

    /**
     * Setter for <code>keycloak.user_session.user_id</code>.
     */
    public IUserSession setUserId(String value);

    /**
     * Getter for <code>keycloak.user_session.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>keycloak.user_session.user_session_state</code>.
     */
    public IUserSession setUserSessionState(Integer value);

    /**
     * Getter for <code>keycloak.user_session.user_session_state</code>.
     */
    public Integer getUserSessionState();

    /**
     * Setter for <code>keycloak.user_session.broker_session_id</code>.
     */
    public IUserSession setBrokerSessionId(String value);

    /**
     * Getter for <code>keycloak.user_session.broker_session_id</code>.
     */
    public String getBrokerSessionId();

    /**
     * Setter for <code>keycloak.user_session.broker_user_id</code>.
     */
    public IUserSession setBrokerUserId(String value);

    /**
     * Getter for <code>keycloak.user_session.broker_user_id</code>.
     */
    public String getBrokerUserId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUserSession
     */
    public void from(IUserSession from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUserSession
     */
    public <E extends IUserSession> E into(E into);

    @Override
    public default IUserSession fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setAuthMethod(json.getString("auth_method"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("auth_method","java.lang.String",e);
        }
        try {
            setIpAddress(json.getString("ip_address"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("ip_address","java.lang.String",e);
        }
        try {
            setLastSessionRefresh(json.getInteger("last_session_refresh"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("last_session_refresh","java.lang.Integer",e);
        }
        try {
            setLoginUsername(json.getString("login_username"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("login_username","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setRememberMe(json.getBoolean("remember_me"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("remember_me","java.lang.Boolean",e);
        }
        try {
            setStarted(json.getInteger("started"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("started","java.lang.Integer",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setUserSessionState(json.getInteger("user_session_state"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_session_state","java.lang.Integer",e);
        }
        try {
            setBrokerSessionId(json.getString("broker_session_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("broker_session_id","java.lang.String",e);
        }
        try {
            setBrokerUserId(json.getString("broker_user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("broker_user_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("auth_method",getAuthMethod());
        json.put("ip_address",getIpAddress());
        json.put("last_session_refresh",getLastSessionRefresh());
        json.put("login_username",getLoginUsername());
        json.put("realm_id",getRealmId());
        json.put("remember_me",getRememberMe());
        json.put("started",getStarted());
        json.put("user_id",getUserId());
        json.put("user_session_state",getUserSessionState());
        json.put("broker_session_id",getBrokerSessionId());
        json.put("broker_user_id",getBrokerUserId());
        return json;
    }

}
