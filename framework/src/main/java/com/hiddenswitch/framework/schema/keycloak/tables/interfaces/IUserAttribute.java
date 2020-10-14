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
public interface IUserAttribute extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.user_attribute.name</code>.
     */
    public IUserAttribute setName(String value);

    /**
     * Getter for <code>keycloak.user_attribute.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.user_attribute.value</code>.
     */
    public IUserAttribute setValue(String value);

    /**
     * Getter for <code>keycloak.user_attribute.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>keycloak.user_attribute.user_id</code>.
     */
    public IUserAttribute setUserId(String value);

    /**
     * Getter for <code>keycloak.user_attribute.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>keycloak.user_attribute.id</code>.
     */
    public IUserAttribute setId(String value);

    /**
     * Getter for <code>keycloak.user_attribute.id</code>.
     */
    public String getId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUserAttribute
     */
    public void from(IUserAttribute from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUserAttribute
     */
    public <E extends IUserAttribute> E into(E into);

    @Override
    public default IUserAttribute fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("name",getName());
        json.put("value",getValue());
        json.put("user_id",getUserId());
        json.put("id",getId());
        return json;
    }

}
