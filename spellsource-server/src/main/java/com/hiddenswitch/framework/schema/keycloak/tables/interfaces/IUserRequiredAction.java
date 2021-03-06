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
public interface IUserRequiredAction extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.user_required_action.user_id</code>.
     */
    public IUserRequiredAction setUserId(String value);

    /**
     * Getter for <code>keycloak.user_required_action.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>keycloak.user_required_action.required_action</code>.
     */
    public IUserRequiredAction setRequiredAction(String value);

    /**
     * Getter for <code>keycloak.user_required_action.required_action</code>.
     */
    public String getRequiredAction();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUserRequiredAction
     */
    public void from(IUserRequiredAction from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUserRequiredAction
     */
    public <E extends IUserRequiredAction> E into(E into);

    @Override
    public default IUserRequiredAction fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setUserId(json.getString("user_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_id","java.lang.String",e);
        }
        try {
            setRequiredAction(json.getString("required_action"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("required_action","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("user_id",getUserId());
        json.put("required_action",getRequiredAction());
        return json;
    }

}
