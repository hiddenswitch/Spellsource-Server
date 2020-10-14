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
public interface IProtocolMapper extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.protocol_mapper.id</code>.
     */
    public IProtocolMapper setId(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.protocol_mapper.name</code>.
     */
    public IProtocolMapper setName(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.protocol_mapper.protocol</code>.
     */
    public IProtocolMapper setProtocol(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.protocol</code>.
     */
    public String getProtocol();

    /**
     * Setter for <code>keycloak.protocol_mapper.protocol_mapper_name</code>.
     */
    public IProtocolMapper setProtocolMapperName(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.protocol_mapper_name</code>.
     */
    public String getProtocolMapperName();

    /**
     * Setter for <code>keycloak.protocol_mapper.client_id</code>.
     */
    public IProtocolMapper setClientId(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.client_id</code>.
     */
    public String getClientId();

    /**
     * Setter for <code>keycloak.protocol_mapper.client_scope_id</code>.
     */
    public IProtocolMapper setClientScopeId(String value);

    /**
     * Getter for <code>keycloak.protocol_mapper.client_scope_id</code>.
     */
    public String getClientScopeId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IProtocolMapper
     */
    public void from(IProtocolMapper from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IProtocolMapper
     */
    public <E extends IProtocolMapper> E into(E into);

    @Override
    public default IProtocolMapper fromJson(io.vertx.core.json.JsonObject json) {
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
            setProtocol(json.getString("protocol"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("protocol","java.lang.String",e);
        }
        try {
            setProtocolMapperName(json.getString("protocol_mapper_name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("protocol_mapper_name","java.lang.String",e);
        }
        try {
            setClientId(json.getString("client_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_id","java.lang.String",e);
        }
        try {
            setClientScopeId(json.getString("client_scope_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_scope_id","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("name",getName());
        json.put("protocol",getProtocol());
        json.put("protocol_mapper_name",getProtocolMapperName());
        json.put("client_id",getClientId());
        json.put("client_scope_id",getClientScopeId());
        return json;
    }

}
