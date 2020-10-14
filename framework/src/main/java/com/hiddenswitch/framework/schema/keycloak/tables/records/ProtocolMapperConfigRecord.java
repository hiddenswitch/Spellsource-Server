/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.ProtocolMapperConfig;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IProtocolMapperConfig;

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
public class ProtocolMapperConfigRecord extends UpdatableRecordImpl<ProtocolMapperConfigRecord> implements VertxPojo, Record3<String, String, String>, IProtocolMapperConfig {

    private static final long serialVersionUID = -160800948;

    /**
     * Setter for <code>keycloak.protocol_mapper_config.protocol_mapper_id</code>.
     */
    @Override
    public ProtocolMapperConfigRecord setProtocolMapperId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.protocol_mapper_config.protocol_mapper_id</code>.
     */
    @Override
    public String getProtocolMapperId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.protocol_mapper_config.value</code>.
     */
    @Override
    public ProtocolMapperConfigRecord setValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.protocol_mapper_config.value</code>.
     */
    @Override
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.protocol_mapper_config.name</code>.
     */
    @Override
    public ProtocolMapperConfigRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.protocol_mapper_config.name</code>.
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
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ProtocolMapperConfig.PROTOCOL_MAPPER_CONFIG.PROTOCOL_MAPPER_ID;
    }

    @Override
    public Field<String> field2() {
        return ProtocolMapperConfig.PROTOCOL_MAPPER_CONFIG.VALUE;
    }

    @Override
    public Field<String> field3() {
        return ProtocolMapperConfig.PROTOCOL_MAPPER_CONFIG.NAME;
    }

    @Override
    public String component1() {
        return getProtocolMapperId();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String value1() {
        return getProtocolMapperId();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public ProtocolMapperConfigRecord value1(String value) {
        setProtocolMapperId(value);
        return this;
    }

    @Override
    public ProtocolMapperConfigRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public ProtocolMapperConfigRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ProtocolMapperConfigRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IProtocolMapperConfig from) {
        setProtocolMapperId(from.getProtocolMapperId());
        setValue(from.getValue());
        setName(from.getName());
    }

    @Override
    public <E extends IProtocolMapperConfig> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProtocolMapperConfigRecord
     */
    public ProtocolMapperConfigRecord() {
        super(ProtocolMapperConfig.PROTOCOL_MAPPER_CONFIG);
    }

    /**
     * Create a detached, initialised ProtocolMapperConfigRecord
     */
    public ProtocolMapperConfigRecord(String protocolMapperId, String value, String name) {
        super(ProtocolMapperConfig.PROTOCOL_MAPPER_CONFIG);

        set(0, protocolMapperId);
        set(1, value);
        set(2, name);
    }

    public ProtocolMapperConfigRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
