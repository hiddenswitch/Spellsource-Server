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
public interface IRealmDefaultRoles extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.realm_default_roles.realm_id</code>.
     */
    public IRealmDefaultRoles setRealmId(String value);

    /**
     * Getter for <code>keycloak.realm_default_roles.realm_id</code>.
     */
    public String getRealmId();

    /**
     * Setter for <code>keycloak.realm_default_roles.role_id</code>.
     */
    public IRealmDefaultRoles setRoleId(String value);

    /**
     * Getter for <code>keycloak.realm_default_roles.role_id</code>.
     */
    public String getRoleId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRealmDefaultRoles
     */
    public void from(IRealmDefaultRoles from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRealmDefaultRoles
     */
    public <E extends IRealmDefaultRoles> E into(E into);

    @Override
    public default IRealmDefaultRoles fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setRealmId(json.getString("realm_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("realm_id","java.lang.String",e);
        }
        try {
            setRoleId(json.getString("role_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("role_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("realm_id",getRealmId());
        json.put("role_id",getRoleId());
        return json;
    }

}
