/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.GroupAttribute;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IGroupAttribute;

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
public class GroupAttributeRecord extends UpdatableRecordImpl<GroupAttributeRecord> implements VertxPojo, Record4<String, String, String, String>, IGroupAttribute {

    private static final long serialVersionUID = -1581592205;

    /**
     * Setter for <code>keycloak.group_attribute.id</code>.
     */
    @Override
    public GroupAttributeRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.group_attribute.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.group_attribute.name</code>.
     */
    @Override
    public GroupAttributeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.group_attribute.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.group_attribute.value</code>.
     */
    @Override
    public GroupAttributeRecord setValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.group_attribute.value</code>.
     */
    @Override
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.group_attribute.group_id</code>.
     */
    @Override
    public GroupAttributeRecord setGroupId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.group_attribute.group_id</code>.
     */
    @Override
    public String getGroupId() {
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
        return GroupAttribute.GROUP_ATTRIBUTE.ID;
    }

    @Override
    public Field<String> field2() {
        return GroupAttribute.GROUP_ATTRIBUTE.NAME;
    }

    @Override
    public Field<String> field3() {
        return GroupAttribute.GROUP_ATTRIBUTE.VALUE;
    }

    @Override
    public Field<String> field4() {
        return GroupAttribute.GROUP_ATTRIBUTE.GROUP_ID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public String component4() {
        return getGroupId();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public String value4() {
        return getGroupId();
    }

    @Override
    public GroupAttributeRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public GroupAttributeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GroupAttributeRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public GroupAttributeRecord value4(String value) {
        setGroupId(value);
        return this;
    }

    @Override
    public GroupAttributeRecord values(String value1, String value2, String value3, String value4) {
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
    public void from(IGroupAttribute from) {
        setId(from.getId());
        setName(from.getName());
        setValue(from.getValue());
        setGroupId(from.getGroupId());
    }

    @Override
    public <E extends IGroupAttribute> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupAttributeRecord
     */
    public GroupAttributeRecord() {
        super(GroupAttribute.GROUP_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised GroupAttributeRecord
     */
    public GroupAttributeRecord(String id, String name, String value, String groupId) {
        super(GroupAttribute.GROUP_ATTRIBUTE);

        set(0, id);
        set(1, name);
        set(2, value);
        set(3, groupId);
    }

    public GroupAttributeRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
