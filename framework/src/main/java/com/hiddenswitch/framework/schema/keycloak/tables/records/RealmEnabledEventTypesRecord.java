/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.RealmEnabledEventTypes;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRealmEnabledEventTypes;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmEnabledEventTypesRecord extends UpdatableRecordImpl<RealmEnabledEventTypesRecord> implements VertxPojo, Record2<String, String>, IRealmEnabledEventTypes {

    private static final long serialVersionUID = -277168165;

    /**
     * Setter for <code>keycloak.realm_enabled_event_types.realm_id</code>.
     */
    @Override
    public RealmEnabledEventTypesRecord setRealmId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm_enabled_event_types.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.realm_enabled_event_types.value</code>.
     */
    @Override
    public RealmEnabledEventTypesRecord setValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm_enabled_event_types.value</code>.
     */
    @Override
    public String getValue() {
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
        return RealmEnabledEventTypes.REALM_ENABLED_EVENT_TYPES.REALM_ID;
    }

    @Override
    public Field<String> field2() {
        return RealmEnabledEventTypes.REALM_ENABLED_EVENT_TYPES.VALUE;
    }

    @Override
    public String component1() {
        return getRealmId();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String value1() {
        return getRealmId();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public RealmEnabledEventTypesRecord value1(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public RealmEnabledEventTypesRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public RealmEnabledEventTypesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRealmEnabledEventTypes from) {
        setRealmId(from.getRealmId());
        setValue(from.getValue());
    }

    @Override
    public <E extends IRealmEnabledEventTypes> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RealmEnabledEventTypesRecord
     */
    public RealmEnabledEventTypesRecord() {
        super(RealmEnabledEventTypes.REALM_ENABLED_EVENT_TYPES);
    }

    /**
     * Create a detached, initialised RealmEnabledEventTypesRecord
     */
    public RealmEnabledEventTypesRecord(String realmId, String value) {
        super(RealmEnabledEventTypes.REALM_ENABLED_EVENT_TYPES);

        set(0, realmId);
        set(1, value);
    }

    public RealmEnabledEventTypesRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
