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
public interface IUsernameLoginFailure extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.username_login_failure.realm_id</code>.
     */
    public IUsernameLoginFailure setRealmId(String value);

    /**
     * Getter for <code>keycloak.username_login_failure.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>keycloak.username_login_failure.username</code>.
     */
    public IUsernameLoginFailure setUsername(String value);

    /**
     * Getter for <code>keycloak.username_login_failure.username</code>.
     */
    public String getUsername();

    /**
     * Setter for <code>keycloak.username_login_failure.failed_login_not_before</code>.
     */
    public IUsernameLoginFailure setFailedLoginNotBefore(Integer value);

    /**
     * Getter for <code>keycloak.username_login_failure.failed_login_not_before</code>.
     */
    public Integer getFailedLoginNotBefore();

    /**
     * Setter for <code>keycloak.username_login_failure.last_failure</code>.
     */
    public IUsernameLoginFailure setLastFailure(Long value);

    /**
     * Getter for <code>keycloak.username_login_failure.last_failure</code>.
     */
    public Long getLastFailure();

    /**
     * Setter for <code>keycloak.username_login_failure.last_ip_failure</code>.
     */
    public IUsernameLoginFailure setLastIpFailure(String value);

    /**
     * Getter for <code>keycloak.username_login_failure.last_ip_failure</code>.
     */
    public String getLastIpFailure();

    /**
     * Setter for <code>keycloak.username_login_failure.num_failures</code>.
     */
    public IUsernameLoginFailure setNumFailures(Integer value);

    /**
     * Getter for <code>keycloak.username_login_failure.num_failures</code>.
     */
    public Integer getNumFailures();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUsernameLoginFailure
     */
    public void from(IUsernameLoginFailure from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUsernameLoginFailure
     */
    public <E extends IUsernameLoginFailure> E into(E into);

    @Override
    public default IUsernameLoginFailure fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setUsername(json.getString("username"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("username","java.lang.String",e);
        }
        try {
            setFailedLoginNotBefore(json.getInteger("failed_login_not_before"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("failed_login_not_before","java.lang.Integer",e);
        }
        try {
            setLastFailure(json.getLong("last_failure"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("last_failure","java.lang.Long",e);
        }
        try {
            setLastIpFailure(json.getString("last_ip_failure"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("last_ip_failure","java.lang.String",e);
        }
        try {
            setNumFailures(json.getInteger("num_failures"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("num_failures","java.lang.Integer",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("realm_id",getRealmId());
        json.put("username",getUsername());
        json.put("failed_login_not_before",getFailedLoginNotBefore());
        json.put("last_failure",getLastFailure());
        json.put("last_ip_failure",getLastIpFailure());
        json.put("num_failures",getNumFailures());
        return json;
    }

}
