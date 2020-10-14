/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.Component;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IComponent;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ComponentRecord extends UpdatableRecordImpl<ComponentRecord> implements VertxPojo, Record7<String, String, String, String, String, String, String>, IComponent {

    private static final long serialVersionUID = -233992797;

    /**
     * Setter for <code>keycloak.component.id</code>.
     */
    @Override
    public ComponentRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.component.name</code>.
     */
    @Override
    public ComponentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.component.parent_id</code>.
     */
    @Override
    public ComponentRecord setParentId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.parent_id</code>.
     */
    @Override
    public String getParentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.component.provider_id</code>.
     */
    @Override
    public ComponentRecord setProviderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.provider_id</code>.
     */
    @Override
    public String getProviderId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>keycloak.component.provider_type</code>.
     */
    @Override
    public ComponentRecord setProviderType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.provider_type</code>.
     */
    @Override
    public String getProviderType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>keycloak.component.realm_id</code>.
     */
    @Override
    public ComponentRecord setRealmId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>keycloak.component.sub_type</code>.
     */
    @Override
    public ComponentRecord setSubType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component.sub_type</code>.
     */
    @Override
    public String getSubType() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Component.COMPONENT.ID;
    }

    @Override
    public Field<String> field2() {
        return Component.COMPONENT.NAME;
    }

    @Override
    public Field<String> field3() {
        return Component.COMPONENT.PARENT_ID;
    }

    @Override
    public Field<String> field4() {
        return Component.COMPONENT.PROVIDER_ID;
    }

    @Override
    public Field<String> field5() {
        return Component.COMPONENT.PROVIDER_TYPE;
    }

    @Override
    public Field<String> field6() {
        return Component.COMPONENT.REALM_ID;
    }

    @Override
    public Field<String> field7() {
        return Component.COMPONENT.SUB_TYPE;
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
        return getParentId();
    }

    @Override
    public String component4() {
        return getProviderId();
    }

    @Override
    public String component5() {
        return getProviderType();
    }

    @Override
    public String component6() {
        return getRealmId();
    }

    @Override
    public String component7() {
        return getSubType();
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
        return getParentId();
    }

    @Override
    public String value4() {
        return getProviderId();
    }

    @Override
    public String value5() {
        return getProviderType();
    }

    @Override
    public String value6() {
        return getRealmId();
    }

    @Override
    public String value7() {
        return getSubType();
    }

    @Override
    public ComponentRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public ComponentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ComponentRecord value3(String value) {
        setParentId(value);
        return this;
    }

    @Override
    public ComponentRecord value4(String value) {
        setProviderId(value);
        return this;
    }

    @Override
    public ComponentRecord value5(String value) {
        setProviderType(value);
        return this;
    }

    @Override
    public ComponentRecord value6(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public ComponentRecord value7(String value) {
        setSubType(value);
        return this;
    }

    @Override
    public ComponentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IComponent from) {
        setId(from.getId());
        setName(from.getName());
        setParentId(from.getParentId());
        setProviderId(from.getProviderId());
        setProviderType(from.getProviderType());
        setRealmId(from.getRealmId());
        setSubType(from.getSubType());
    }

    @Override
    public <E extends IComponent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComponentRecord
     */
    public ComponentRecord() {
        super(Component.COMPONENT);
    }

    /**
     * Create a detached, initialised ComponentRecord
     */
    public ComponentRecord(String id, String name, String parentId, String providerId, String providerType, String realmId, String subType) {
        super(Component.COMPONENT);

        set(0, id);
        set(1, name);
        set(2, parentId);
        set(3, providerId);
        set(4, providerType);
        set(5, realmId);
        set(6, subType);
    }

    public ComponentRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
