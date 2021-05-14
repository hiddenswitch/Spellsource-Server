/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.ClientDefaultRoles;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IClientDefaultRoles;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientDefaultRolesRecord extends UpdatableRecordImpl<ClientDefaultRolesRecord> implements VertxPojo, Record2<String, String>, IClientDefaultRoles {

    private static final long serialVersionUID = 1635887260;

    /**
     * Setter for <code>keycloak.client_default_roles.client_id</code>.
     */
    @Override
    public ClientDefaultRolesRecord setClientId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client_default_roles.client_id</code>.
     */
    @Override
    public String getClientId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.client_default_roles.role_id</code>.
     */
    @Override
    public ClientDefaultRolesRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.client_default_roles.role_id</code>.
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ClientDefaultRoles.CLIENT_DEFAULT_ROLES.CLIENT_ID;
    }

    @Override
    public Field<String> field2() {
        return ClientDefaultRoles.CLIENT_DEFAULT_ROLES.ROLE_ID;
    }

    @Override
    public String component1() {
        return getClientId();
    }

    @Override
    public String component2() {
        return getRoleId();
    }

    @Override
    public String value1() {
        return getClientId();
    }

    @Override
    public String value2() {
        return getRoleId();
    }

    @Override
    public ClientDefaultRolesRecord value1(String value) {
        setClientId(value);
        return this;
    }

    @Override
    public ClientDefaultRolesRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public ClientDefaultRolesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClientDefaultRoles from) {
        setClientId(from.getClientId());
        setRoleId(from.getRoleId());
    }

    @Override
    public <E extends IClientDefaultRoles> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClientDefaultRolesRecord
     */
    public ClientDefaultRolesRecord() {
        super(ClientDefaultRoles.CLIENT_DEFAULT_ROLES);
    }

    /**
     * Create a detached, initialised ClientDefaultRolesRecord
     */
    public ClientDefaultRolesRecord(String clientId, String roleId) {
        super(ClientDefaultRoles.CLIENT_DEFAULT_ROLES);

        set(0, clientId);
        set(1, roleId);
    }

    public ClientDefaultRolesRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}