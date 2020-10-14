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
public interface IRequiredActionConfig extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.required_action_config.required_action_id</code>.
     */
    public IRequiredActionConfig setRequiredActionId(String value);

    /**
     * Getter for <code>keycloak.required_action_config.required_action_id</code>.
     */
    public String getRequiredActionId();

    /**
     * Setter for <code>keycloak.required_action_config.value</code>.
     */
    public IRequiredActionConfig setValue(String value);

    /**
     * Getter for <code>keycloak.required_action_config.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>keycloak.required_action_config.name</code>.
     */
    public IRequiredActionConfig setName(String value);

    /**
     * Getter for <code>keycloak.required_action_config.name</code>.
     */
    public String getName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRequiredActionConfig
     */
    public void from(IRequiredActionConfig from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRequiredActionConfig
     */
    public <E extends IRequiredActionConfig> E into(E into);

    @Override
    public default IRequiredActionConfig fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setRequiredActionId(json.getString("required_action_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("required_action_id","java.lang.String",e);
        }
        try {
            setValue(json.getString("value"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("value","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("required_action_id",getRequiredActionId());
        json.put("value",getValue());
        json.put("name",getName());
        return json;
    }

}
