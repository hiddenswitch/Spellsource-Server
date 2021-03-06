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
public interface IAuthenticatorConfig extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.authenticator_config.id</code>.
     */
    public IAuthenticatorConfig setId(String value);

    /**
     * Getter for <code>keycloak.authenticator_config.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.authenticator_config.alias</code>.
     */
    public IAuthenticatorConfig setAlias(String value);

    /**
     * Getter for <code>keycloak.authenticator_config.alias</code>.
     */
    public String getAlias();

    /**
     * Setter for <code>keycloak.authenticator_config.realm_id</code>.
     */
    public IAuthenticatorConfig setRealmId(String value);

    /**
     * Getter for <code>keycloak.authenticator_config.realm_id</code>.
     */
    public String getRealmId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAuthenticatorConfig
     */
    public void from(IAuthenticatorConfig from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAuthenticatorConfig
     */
    public <E extends IAuthenticatorConfig> E into(E into);

    @Override
    public default IAuthenticatorConfig fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setAlias(json.getString("alias"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("alias","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("alias",getAlias());
        json.put("realm_id",getRealmId());
        return json;
    }

}
