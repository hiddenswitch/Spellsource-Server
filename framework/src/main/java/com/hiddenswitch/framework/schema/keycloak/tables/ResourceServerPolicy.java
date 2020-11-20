/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ResourceServerPolicyRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class ResourceServerPolicy extends TableImpl<ResourceServerPolicyRecord> {

    private static final long serialVersionUID = -1938591653;

    /**
     * The reference instance of <code>keycloak.resource_server_policy</code>
     */
    public static final ResourceServerPolicy RESOURCE_SERVER_POLICY = new ResourceServerPolicy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourceServerPolicyRecord> getRecordType() {
        return ResourceServerPolicyRecord.class;
    }

    /**
     * The column <code>keycloak.resource_server_policy.id</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.name</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.description</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.type</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.decision_strategy</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> DECISION_STRATEGY = createField(DSL.name("decision_strategy"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.logic</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> LOGIC = createField(DSL.name("logic"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.resource_server_id</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> RESOURCE_SERVER_ID = createField(DSL.name("resource_server_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.resource_server_policy.owner</code>.
     */
    public final TableField<ResourceServerPolicyRecord, String> OWNER = createField(DSL.name("owner"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * Create a <code>keycloak.resource_server_policy</code> table reference
     */
    public ResourceServerPolicy() {
        this(DSL.name("resource_server_policy"), null);
    }

    /**
     * Create an aliased <code>keycloak.resource_server_policy</code> table reference
     */
    public ResourceServerPolicy(String alias) {
        this(DSL.name(alias), RESOURCE_SERVER_POLICY);
    }

    /**
     * Create an aliased <code>keycloak.resource_server_policy</code> table reference
     */
    public ResourceServerPolicy(Name alias) {
        this(alias, RESOURCE_SERVER_POLICY);
    }

    private ResourceServerPolicy(Name alias, Table<ResourceServerPolicyRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResourceServerPolicy(Name alias, Table<ResourceServerPolicyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ResourceServerPolicy(Table<O> child, ForeignKey<O, ResourceServerPolicyRecord> key) {
        super(child, key, RESOURCE_SERVER_POLICY);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_RES_SERV_POL_RES_SERV);
    }

    @Override
    public UniqueKey<ResourceServerPolicyRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_FARSRP;
    }

    @Override
    public List<UniqueKey<ResourceServerPolicyRecord>> getKeys() {
        return Arrays.<UniqueKey<ResourceServerPolicyRecord>>asList(Keys.CONSTRAINT_FARSRP, Keys.UK_FRSRPT700S9V50BU18WS5HA6);
    }

    @Override
    public List<ForeignKey<ResourceServerPolicyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResourceServerPolicyRecord, ?>>asList(Keys.RESOURCE_SERVER_POLICY__FK_FRSRPO213XCX4WNKOG82SSRFY);
    }

    public ResourceServer resourceServer() {
        return new ResourceServer(this, Keys.RESOURCE_SERVER_POLICY__FK_FRSRPO213XCX4WNKOG82SSRFY);
    }

    @Override
    public ResourceServerPolicy as(String alias) {
        return new ResourceServerPolicy(DSL.name(alias), this);
    }

    @Override
    public ResourceServerPolicy as(Name alias) {
        return new ResourceServerPolicy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceServerPolicy rename(String name) {
        return new ResourceServerPolicy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceServerPolicy rename(Name name) {
        return new ResourceServerPolicy(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
