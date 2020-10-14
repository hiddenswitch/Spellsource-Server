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
public interface IResourceServerPolicy extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.resource_server_policy.id</code>.
     */
    public IResourceServerPolicy setId(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.resource_server_policy.name</code>.
     */
    public IResourceServerPolicy setName(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.resource_server_policy.description</code>.
     */
    public IResourceServerPolicy setDescription(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.description</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>keycloak.resource_server_policy.type</code>.
     */
    public IResourceServerPolicy setType(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.type</code>.
     */
    public String getType();

    /**
     * Setter for <code>keycloak.resource_server_policy.decision_strategy</code>.
     */
    public IResourceServerPolicy setDecisionStrategy(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.decision_strategy</code>.
     */
    public String getDecisionStrategy();

    /**
     * Setter for <code>keycloak.resource_server_policy.logic</code>.
     */
    public IResourceServerPolicy setLogic(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.logic</code>.
     */
    public String getLogic();

    /**
     * Setter for <code>keycloak.resource_server_policy.resource_server_id</code>.
     */
    public IResourceServerPolicy setResourceServerId(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.resource_server_id</code>.
     */
    public String getResourceServerId();

    /**
     * Setter for <code>keycloak.resource_server_policy.owner</code>.
     */
    public IResourceServerPolicy setOwner(String value);

    /**
     * Getter for <code>keycloak.resource_server_policy.owner</code>.
     */
    public String getOwner();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IResourceServerPolicy
     */
    public void from(IResourceServerPolicy from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IResourceServerPolicy
     */
    public <E extends IResourceServerPolicy> E into(E into);

    @Override
    public default IResourceServerPolicy fromJson(io.vertx.core.json.JsonObject json) {
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
            setDescription(json.getString("description"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("description","java.lang.String",e);
        }
        try {
            setType(json.getString("type"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("type","java.lang.String",e);
        }
        try {
            setDecisionStrategy(json.getString("decision_strategy"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("decision_strategy","java.lang.String",e);
        }
        try {
            setLogic(json.getString("logic"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("logic","java.lang.String",e);
        }
        try {
            setResourceServerId(json.getString("resource_server_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("resource_server_id","java.lang.String",e);
        }
        try {
            setOwner(json.getString("owner"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("owner","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("description",getDescription());
        json.put("type",getType());
        json.put("decision_strategy",getDecisionStrategy());
        json.put("logic",getLogic());
        json.put("resource_server_id",getResourceServerId());
        json.put("owner",getOwner());
        return json;
    }

}
