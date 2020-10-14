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
public interface IGroupAttribute extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.group_attribute.id</code>.
     */
    public IGroupAttribute setId(String value);

    /**
     * Getter for <code>keycloak.group_attribute.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.group_attribute.name</code>.
     */
    public IGroupAttribute setName(String value);

    /**
     * Getter for <code>keycloak.group_attribute.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.group_attribute.value</code>.
     */
    public IGroupAttribute setValue(String value);

    /**
     * Getter for <code>keycloak.group_attribute.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>keycloak.group_attribute.group_id</code>.
     */
    public IGroupAttribute setGroupId(String value);

    /**
     * Getter for <code>keycloak.group_attribute.group_id</code>.
     */
    public String getGroupId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGroupAttribute
     */
    public void from(IGroupAttribute from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGroupAttribute
     */
    public <E extends IGroupAttribute> E into(E into);

    @Override
    public default IGroupAttribute fromJson(io.vertx.core.json.JsonObject json) {
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
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        try {
            setGroupId(json.getString("group_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("group_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("value",getValue());
        json.put("group_id",getGroupId());
        return json;
    }

}
