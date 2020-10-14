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
public interface IComponentConfig extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.component_config.id</code>.
     */
    public IComponentConfig setId(String value);

    /**
     * Getter for <code>keycloak.component_config.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.component_config.component_id</code>.
     */
    public IComponentConfig setComponentId(String value);

    /**
     * Getter for <code>keycloak.component_config.component_id</code>.
     */
    public String getComponentId();

    /**
     * Setter for <code>keycloak.component_config.name</code>.
     */
    public IComponentConfig setName(String value);

    /**
     * Getter for <code>keycloak.component_config.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.component_config.value</code>.
     */
    public IComponentConfig setValue(String value);

    /**
     * Getter for <code>keycloak.component_config.value</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IComponentConfig
     */
    public void from(IComponentConfig from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IComponentConfig
     */
    public <E extends IComponentConfig> E into(E into);

    @Override
    public default IComponentConfig fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setComponentId(json.getString("component_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("component_id","java.lang.String",e);
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
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("component_id",getComponentId());
        json.put("name",getName());
        json.put("value",getValue());
        return json;
    }

}
