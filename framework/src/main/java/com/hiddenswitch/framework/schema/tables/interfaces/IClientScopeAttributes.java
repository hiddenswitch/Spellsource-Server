/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IClientScopeAttributes extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.client_scope_attributes.scope_id</code>.
     */
    public IClientScopeAttributes setScopeId(String value);

    /**
     * Getter for <code>public.client_scope_attributes.scope_id</code>.
     */
    public String getScopeId();

    /**
     * Setter for <code>public.client_scope_attributes.value</code>.
     */
    public IClientScopeAttributes setValue(String value);

    /**
     * Getter for <code>public.client_scope_attributes.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>public.client_scope_attributes.name</code>.
     */
    public IClientScopeAttributes setName(String value);

    /**
     * Getter for <code>public.client_scope_attributes.name</code>.
     */
    public String getName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IClientScopeAttributes
     */
    public void from(IClientScopeAttributes from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IClientScopeAttributes
     */
    public <E extends IClientScopeAttributes> E into(E into);

    @Override
    public default IClientScopeAttributes fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setScopeId(json.getString("scope_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("scope_id","java.lang.String",e);
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
        json.put("scope_id",getScopeId());
        json.put("value",getValue());
        json.put("name",getName());
        return json;
    }

}
