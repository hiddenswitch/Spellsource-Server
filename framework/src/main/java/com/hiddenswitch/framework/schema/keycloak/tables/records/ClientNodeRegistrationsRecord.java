/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.ClientNodeRegistrations;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IClientNodeRegistrations;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientNodeRegistrationsRecord extends UpdatableRecordImpl<ClientNodeRegistrationsRecord> implements VertxPojo, Record3<String, Integer, String>, IClientNodeRegistrations {

    private static final long serialVersionUID = 389418393;

    /**
     * Setter for <code>keycloak.client_node_registrations.client_id</code>.
     */
    @Override
    public ClientNodeRegistrationsRecord setClientId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client_node_registrations.client_id</code>.
     */
    @Override
    public String getClientId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.client_node_registrations.value</code>.
     */
    @Override
    public ClientNodeRegistrationsRecord setValue(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client_node_registrations.value</code>.
     */
    @Override
    public Integer getValue() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>keycloak.client_node_registrations.name</code>.
     */
    @Override
    public ClientNodeRegistrationsRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client_node_registrations.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ClientNodeRegistrations.CLIENT_NODE_REGISTRATIONS.CLIENT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ClientNodeRegistrations.CLIENT_NODE_REGISTRATIONS.VALUE;
    }

    @Override
    public Field<String> field3() {
        return ClientNodeRegistrations.CLIENT_NODE_REGISTRATIONS.NAME;
    }

    @Override
    public String component1() {
        return getClientId();
    }

    @Override
    public Integer component2() {
        return getValue();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String value1() {
        return getClientId();
    }

    @Override
    public Integer value2() {
        return getValue();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public ClientNodeRegistrationsRecord value1(String value) {
        setClientId(value);
        return this;
    }

    @Override
    public ClientNodeRegistrationsRecord value2(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public ClientNodeRegistrationsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ClientNodeRegistrationsRecord values(String value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClientNodeRegistrations from) {
        setClientId(from.getClientId());
        setValue(from.getValue());
        setName(from.getName());
    }

    @Override
    public <E extends IClientNodeRegistrations> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClientNodeRegistrationsRecord
     */
    public ClientNodeRegistrationsRecord() {
        super(ClientNodeRegistrations.CLIENT_NODE_REGISTRATIONS);
    }

    /**
     * Create a detached, initialised ClientNodeRegistrationsRecord
     */
    public ClientNodeRegistrationsRecord(String clientId, Integer value, String name) {
        super(ClientNodeRegistrations.CLIENT_NODE_REGISTRATIONS);

        set(0, clientId);
        set(1, value);
        set(2, name);
    }

    public ClientNodeRegistrationsRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}