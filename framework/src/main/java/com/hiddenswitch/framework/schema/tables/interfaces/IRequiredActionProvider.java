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
public interface IRequiredActionProvider extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.required_action_provider.id</code>.
     */
    public IRequiredActionProvider setId(String value);

    /**
     * Getter for <code>public.required_action_provider.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>public.required_action_provider.alias</code>.
     */
    public IRequiredActionProvider setAlias(String value);

    /**
     * Getter for <code>public.required_action_provider.alias</code>.
     */
    public String getAlias();

    /**
     * Setter for <code>public.required_action_provider.name</code>.
     */
    public IRequiredActionProvider setName(String value);

    /**
     * Getter for <code>public.required_action_provider.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>public.required_action_provider.realm_id</code>.
     */
    public IRequiredActionProvider setRealmId(String value);

    /**
     * Getter for <code>public.required_action_provider.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>public.required_action_provider.enabled</code>.
     */
    public IRequiredActionProvider setEnabled(Boolean value);

    /**
     * Getter for <code>public.required_action_provider.enabled</code>.
     */
    public Boolean getEnabled();

    /**
     * Setter for <code>public.required_action_provider.default_action</code>.
     */
    public IRequiredActionProvider setDefaultAction(Boolean value);

    /**
     * Getter for <code>public.required_action_provider.default_action</code>.
     */
    public Boolean getDefaultAction();

    /**
     * Setter for <code>public.required_action_provider.provider_id</code>.
     */
    public IRequiredActionProvider setProviderId(String value);

    /**
     * Getter for <code>public.required_action_provider.provider_id</code>.
     */
    public String getProviderId();

    /**
     * Setter for <code>public.required_action_provider.priority</code>.
     */
    public IRequiredActionProvider setPriority(Integer value);

    /**
     * Getter for <code>public.required_action_provider.priority</code>.
     */
    public Integer getPriority();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRequiredActionProvider
     */
    public void from(IRequiredActionProvider from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRequiredActionProvider
     */
    public <E extends IRequiredActionProvider> E into(E into);

    @Override
    public default IRequiredActionProvider fromJson(io.vertx.core.json.JsonObject json) {
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
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setEnabled(json.getBoolean("enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("enabled","java.lang.Boolean",e);
        }
        try {
            setDefaultAction(json.getBoolean("default_action"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("default_action","java.lang.Boolean",e);
        }
        try {
            setProviderId(json.getString("provider_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("provider_id","java.lang.String",e);
        }
        try {
            setPriority(json.getInteger("priority"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("priority","java.lang.Integer",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("alias",getAlias());
        json.put("name",getName());
        json.put("realm_id",getRealmId());
        json.put("enabled",getEnabled());
        json.put("default_action",getDefaultAction());
        json.put("provider_id",getProviderId());
        json.put("priority",getPriority());
        return json;
    }

}
