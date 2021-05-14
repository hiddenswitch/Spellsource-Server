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
public interface IClientUserSessionNote extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.client_user_session_note.name</code>.
     */
    public IClientUserSessionNote setName(String value);

    /**
     * Getter for <code>keycloak.client_user_session_note.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.client_user_session_note.value</code>.
     */
    public IClientUserSessionNote setValue(String value);

    /**
     * Getter for <code>keycloak.client_user_session_note.value</code>.
     */
    public String getValue();

    /**
     * Setter for <code>keycloak.client_user_session_note.client_session</code>.
     */
    public IClientUserSessionNote setClientSession(String value);

    /**
     * Getter for <code>keycloak.client_user_session_note.client_session</code>.
     */
    public String getClientSession();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IClientUserSessionNote
     */
    public void from(IClientUserSessionNote from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IClientUserSessionNote
     */
    public <E extends IClientUserSessionNote> E into(E into);

    @Override
    public default IClientUserSessionNote fromJson(io.vertx.core.json.JsonObject json) {
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
            setClientSession(json.getString("client_session"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_session","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("name",getName());
        json.put("value",getValue());
        json.put("client_session",getClientSession());
        return json;
    }

}