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
public interface IClientScopeClient extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.client_scope_client.client_id</code>.
     */
    public IClientScopeClient setClientId(String value);

    /**
     * Getter for <code>keycloak.client_scope_client.client_id</code>.
     */
    public String getClientId();

    /**
     * Setter for <code>keycloak.client_scope_client.scope_id</code>.
     */
    public IClientScopeClient setScopeId(String value);

    /**
     * Getter for <code>keycloak.client_scope_client.scope_id</code>.
     */
    public String getScopeId();

    /**
     * Setter for <code>keycloak.client_scope_client.default_scope</code>.
     */
    public IClientScopeClient setDefaultScope(Boolean value);

    /**
     * Getter for <code>keycloak.client_scope_client.default_scope</code>.
     */
    public Boolean getDefaultScope();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IClientScopeClient
     */
    public void from(IClientScopeClient from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IClientScopeClient
     */
    public <E extends IClientScopeClient> E into(E into);

    @Override
    public default IClientScopeClient fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setClientId(json.getString("client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_id","java.lang.String",e);
        }
        try {
            setScopeId(json.getString("scope_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("scope_id","java.lang.String",e);
        }
        try {
            setDefaultScope(json.getBoolean("default_scope"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("default_scope","java.lang.Boolean",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("client_id",getClientId());
        json.put("scope_id",getScopeId());
        json.put("default_scope",getDefaultScope());
        return json;
    }

}
