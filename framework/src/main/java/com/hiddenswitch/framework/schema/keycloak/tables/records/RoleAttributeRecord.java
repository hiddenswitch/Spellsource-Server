/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.RoleAttribute;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRoleAttribute;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleAttributeRecord extends UpdatableRecordImpl<RoleAttributeRecord> implements VertxPojo, Record4<String, String, String, String>, IRoleAttribute {

    private static final long serialVersionUID = -1853397298;

    /**
     * Setter for <code>keycloak.role_attribute.id</code>.
     */
    @Override
    public RoleAttributeRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.role_attribute.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.role_attribute.role_id</code>.
     */
    @Override
    public RoleAttributeRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.role_attribute.role_id</code>.
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.role_attribute.name</code>.
     */
    @Override
    public RoleAttributeRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.role_attribute.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.role_attribute.value</code>.
     */
    @Override
    public RoleAttributeRecord setValue(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.role_attribute.value</code>.
     */
    @Override
    public String getValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoleAttribute.ROLE_ATTRIBUTE.ID;
    }

    @Override
    public Field<String> field2() {
        return RoleAttribute.ROLE_ATTRIBUTE.ROLE_ID;
    }

    @Override
    public Field<String> field3() {
        return RoleAttribute.ROLE_ATTRIBUTE.NAME;
    }

    @Override
    public Field<String> field4() {
        return RoleAttribute.ROLE_ATTRIBUTE.VALUE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRoleId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getValue();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRoleId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getValue();
    }

    @Override
    public RoleAttributeRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public RoleAttributeRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public RoleAttributeRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoleAttributeRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public RoleAttributeRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRoleAttribute from) {
        setId(from.getId());
        setRoleId(from.getRoleId());
        setName(from.getName());
        setValue(from.getValue());
    }

    @Override
    public <E extends IRoleAttribute> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleAttributeRecord
     */
    public RoleAttributeRecord() {
        super(RoleAttribute.ROLE_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised RoleAttributeRecord
     */
    public RoleAttributeRecord(String id, String roleId, String name, String value) {
        super(RoleAttribute.ROLE_ATTRIBUTE);

        set(0, id);
        set(1, roleId);
        set(2, name);
        set(3, value);
    }

    public RoleAttributeRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
