/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Indexes;
import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.RealmEventsListenersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmEventsListeners extends TableImpl<RealmEventsListenersRecord> {

    private static final long serialVersionUID = -1558073318;

    /**
     * The reference instance of <code>public.realm_events_listeners</code>
     */
    public static final RealmEventsListeners REALM_EVENTS_LISTENERS = new RealmEventsListeners();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RealmEventsListenersRecord> getRecordType() {
        return RealmEventsListenersRecord.class;
    }

    /**
     * The column <code>public.realm_events_listeners.realm_id</code>.
     */
    public final TableField<RealmEventsListenersRecord, String> REALM_ID = createField(DSL.name("realm_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.realm_events_listeners.value</code>.
     */
    public final TableField<RealmEventsListenersRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.realm_events_listeners</code> table reference
     */
    public RealmEventsListeners() {
        this(DSL.name("realm_events_listeners"), null);
    }

    /**
     * Create an aliased <code>public.realm_events_listeners</code> table reference
     */
    public RealmEventsListeners(String alias) {
        this(DSL.name(alias), REALM_EVENTS_LISTENERS);
    }

    /**
     * Create an aliased <code>public.realm_events_listeners</code> table reference
     */
    public RealmEventsListeners(Name alias) {
        this(alias, REALM_EVENTS_LISTENERS);
    }

    private RealmEventsListeners(Name alias, Table<RealmEventsListenersRecord> aliased) {
        this(alias, aliased, null);
    }

    private RealmEventsListeners(Name alias, Table<RealmEventsListenersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RealmEventsListeners(Table<O> child, ForeignKey<O, RealmEventsListenersRecord> key) {
        super(child, key, REALM_EVENTS_LISTENERS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_REALM_EVT_LIST_REALM);
    }

    @Override
    public UniqueKey<RealmEventsListenersRecord> getPrimaryKey() {
        return Keys.CONSTR_REALM_EVENTS_LISTENERS;
    }

    @Override
    public List<UniqueKey<RealmEventsListenersRecord>> getKeys() {
        return Arrays.<UniqueKey<RealmEventsListenersRecord>>asList(Keys.CONSTR_REALM_EVENTS_LISTENERS);
    }

    @Override
    public List<ForeignKey<RealmEventsListenersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RealmEventsListenersRecord, ?>>asList(Keys.REALM_EVENTS_LISTENERS__FK_H846O4H0W8EPX5NXEV9F5Y69J);
    }

    public Realm realm() {
        return new Realm(this, Keys.REALM_EVENTS_LISTENERS__FK_H846O4H0W8EPX5NXEV9F5Y69J);
    }

    @Override
    public RealmEventsListeners as(String alias) {
        return new RealmEventsListeners(DSL.name(alias), this);
    }

    @Override
    public RealmEventsListeners as(Name alias) {
        return new RealmEventsListeners(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RealmEventsListeners rename(String name) {
        return new RealmEventsListeners(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RealmEventsListeners rename(Name name) {
        return new RealmEventsListeners(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
