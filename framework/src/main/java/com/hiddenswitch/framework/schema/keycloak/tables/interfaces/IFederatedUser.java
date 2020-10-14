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
public interface IFederatedUser extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.federated_user.id</code>.
     */
    public IFederatedUser setId(String value);

    /**
     * Getter for <code>keycloak.federated_user.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.federated_user.storage_provider_id</code>.
     */
    public IFederatedUser setStorageProviderId(String value);

    /**
     * Getter for <code>keycloak.federated_user.storage_provider_id</code>.
     */
    public String getStorageProviderId();

    /**
     * Setter for <code>keycloak.federated_user.realm_id</code>.
     */
    public IFederatedUser setRealmId(String value);

    /**
     * Getter for <code>keycloak.federated_user.realm_id</code>.
     */
    public String getRealmId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFederatedUser
     */
    public void from(IFederatedUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFederatedUser
     */
    public <E extends IFederatedUser> E into(E into);

    @Override
    public default IFederatedUser fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
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
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("storage_provider_id",getStorageProviderId());
        json.put("realm_id",getRealmId());
        return json;
    }

}
