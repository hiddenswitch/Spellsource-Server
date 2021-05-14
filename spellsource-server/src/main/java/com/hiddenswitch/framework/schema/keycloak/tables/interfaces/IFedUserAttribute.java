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
public interface IFedUserAttribute extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.fed_user_attribute.id</code>.
     */
    public IFedUserAttribute setId(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.fed_user_attribute.name</code>.
     */
    public IFedUserAttribute setName(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.fed_user_attribute.user_id</code>.
     */
    public IFedUserAttribute setUserId(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>keycloak.fed_user_attribute.realm_id</code>.
     */
    public IFedUserAttribute setRealmId(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>keycloak.fed_user_attribute.storage_provider_id</code>.
     */
    public IFedUserAttribute setStorageProviderId(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.storage_provider_id</code>.
     */
    public String getStorageProviderId();

    /**
     * Setter for <code>keycloak.fed_user_attribute.value</code>.
     */
    public IFedUserAttribute setValue(String value);

    /**
     * Getter for <code>keycloak.fed_user_attribute.value</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFedUserAttribute
     */
    public void from(IFedUserAttribute from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFedUserAttribute
     */
    public <E extends IFedUserAttribute> E into(E into);

    @Override
    public default IFedUserAttribute fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setStorageProviderId(json.getString("storage_provider_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("storage_provider_id","java.lang.String",e);
        }
        try {
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("user_id",getUserId());
        json.put("realm_id",getRealmId());
        json.put("storage_provider_id",getStorageProviderId());
        json.put("value",getValue());
        return json;
    }

}