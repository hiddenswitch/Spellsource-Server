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
public interface IKeycloakGroup extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.keycloak_group.id</code>.
     */
    public IKeycloakGroup setId(String value);

    /**
     * Getter for <code>keycloak.keycloak_group.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.keycloak_group.name</code>.
     */
    public IKeycloakGroup setName(String value);

    /**
     * Getter for <code>keycloak.keycloak_group.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.keycloak_group.parent_group</code>.
     */
    public IKeycloakGroup setParentGroup(String value);

    /**
     * Getter for <code>keycloak.keycloak_group.parent_group</code>.
     */
    public String getParentGroup();

    /**
     * Setter for <code>keycloak.keycloak_group.realm_id</code>.
     */
    public IKeycloakGroup setRealmId(String value);

    /**
     * Getter for <code>keycloak.keycloak_group.realm_id</code>.
     */
    public String getRealmId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IKeycloakGroup
     */
    public void from(IKeycloakGroup from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IKeycloakGroup
     */
    public <E extends IKeycloakGroup> E into(E into);

    @Override
    public default IKeycloakGroup fromJson(io.vertx.core.json.JsonObject json) {
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
            setParentGroup(json.getString("parent_group"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("parent_group","java.lang.String",e);
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
        json.put("name",getName());
        json.put("parent_group",getParentGroup());
        json.put("realm_id",getRealmId());
        return json;
    }

}
