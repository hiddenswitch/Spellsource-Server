/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.ComponentConfig;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IComponentConfig;

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
public class ComponentConfigRecord extends UpdatableRecordImpl<ComponentConfigRecord> implements VertxPojo, Record4<String, String, String, String>, IComponentConfig {

    private static final long serialVersionUID = 1994046025;

    /**
     * Setter for <code>keycloak.component_config.id</code>.
     */
    @Override
    public ComponentConfigRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component_config.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.component_config.component_id</code>.
     */
    @Override
    public ComponentConfigRecord setComponentId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component_config.component_id</code>.
     */
    @Override
    public String getComponentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.component_config.name</code>.
     */
    @Override
    public ComponentConfigRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component_config.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.component_config.value</code>.
     */
    @Override
    public ComponentConfigRecord setValue(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.component_config.value</code>.
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
        return ComponentConfig.COMPONENT_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return ComponentConfig.COMPONENT_CONFIG.COMPONENT_ID;
    }

    @Override
    public Field<String> field3() {
        return ComponentConfig.COMPONENT_CONFIG.NAME;
    }

    @Override
    public Field<String> field4() {
        return ComponentConfig.COMPONENT_CONFIG.VALUE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getComponentId();
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
        return getComponentId();
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
    public ComponentConfigRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public ComponentConfigRecord value2(String value) {
        setComponentId(value);
        return this;
    }

    @Override
    public ComponentConfigRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ComponentConfigRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public ComponentConfigRecord values(String value1, String value2, String value3, String value4) {
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
    public void from(IComponentConfig from) {
        setId(from.getId());
        setComponentId(from.getComponentId());
        setName(from.getName());
        setValue(from.getValue());
    }

    @Override
    public <E extends IComponentConfig> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ComponentConfigRecord
     */
    public ComponentConfigRecord() {
        super(ComponentConfig.COMPONENT_CONFIG);
    }

    /**
     * Create a detached, initialised ComponentConfigRecord
     */
    public ComponentConfigRecord(String id, String componentId, String name, String value) {
        super(ComponentConfig.COMPONENT_CONFIG);

        set(0, id);
        set(1, componentId);
        set(2, name);
        set(3, value);
    }

    public ComponentConfigRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
