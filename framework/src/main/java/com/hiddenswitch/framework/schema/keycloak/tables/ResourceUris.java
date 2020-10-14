/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ResourceUrisRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ResourceUris extends TableImpl<ResourceUrisRecord> {

    private static final long serialVersionUID = -1892322207;

    /**
     * The reference instance of <code>keycloak.resource_uris</code>
     */
    public static final ResourceUris RESOURCE_URIS = new ResourceUris();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourceUrisRecord> getRecordType() {
        return ResourceUrisRecord.class;
    }

    /**
     * The column <code>keycloak.resource_uris.resource_id</code>.
     */
    public final TableField<ResourceUrisRecord, String> RESOURCE_ID = createField(DSL.name("resource_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.resource_uris.value</code>.
     */
    public final TableField<ResourceUrisRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>keycloak.resource_uris</code> table reference
     */
    public ResourceUris() {
        this(DSL.name("resource_uris"), null);
    }

    /**
     * Create an aliased <code>keycloak.resource_uris</code> table reference
     */
    public ResourceUris(String alias) {
        this(DSL.name(alias), RESOURCE_URIS);
    }

    /**
     * Create an aliased <code>keycloak.resource_uris</code> table reference
     */
    public ResourceUris(Name alias) {
        this(alias, RESOURCE_URIS);
    }

    private ResourceUris(Name alias, Table<ResourceUrisRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResourceUris(Name alias, Table<ResourceUrisRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ResourceUris(Table<O> child, ForeignKey<O, ResourceUrisRecord> key) {
        super(child, key, RESOURCE_URIS);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public UniqueKey<ResourceUrisRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_RESOUR_URIS_PK;
    }

    @Override
    public List<UniqueKey<ResourceUrisRecord>> getKeys() {
        return Arrays.<UniqueKey<ResourceUrisRecord>>asList(Keys.CONSTRAINT_RESOUR_URIS_PK);
    }

    @Override
    public List<ForeignKey<ResourceUrisRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResourceUrisRecord, ?>>asList(Keys.RESOURCE_URIS__FK_RESOURCE_SERVER_URIS);
    }

    public ResourceServerResource resourceServerResource() {
        return new ResourceServerResource(this, Keys.RESOURCE_URIS__FK_RESOURCE_SERVER_URIS);
    }

    @Override
    public ResourceUris as(String alias) {
        return new ResourceUris(DSL.name(alias), this);
    }

    @Override
    public ResourceUris as(Name alias) {
        return new ResourceUris(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceUris rename(String name) {
        return new ResourceUris(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceUris rename(Name name) {
        return new ResourceUris(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
