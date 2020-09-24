/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.ClientAuthFlowBindingsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class ClientAuthFlowBindings extends TableImpl<ClientAuthFlowBindingsRecord> {

    private static final long serialVersionUID = -173984525;

    /**
     * The reference instance of <code>public.client_auth_flow_bindings</code>
     */
    public static final ClientAuthFlowBindings CLIENT_AUTH_FLOW_BINDINGS = new ClientAuthFlowBindings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientAuthFlowBindingsRecord> getRecordType() {
        return ClientAuthFlowBindingsRecord.class;
    }

    /**
     * The column <code>public.client_auth_flow_bindings.client_id</code>.
     */
    public final TableField<ClientAuthFlowBindingsRecord, String> CLIENT_ID = createField(DSL.name("client_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.client_auth_flow_bindings.flow_id</code>.
     */
    public final TableField<ClientAuthFlowBindingsRecord, String> FLOW_ID = createField(DSL.name("flow_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>public.client_auth_flow_bindings.binding_name</code>.
     */
    public final TableField<ClientAuthFlowBindingsRecord, String> BINDING_NAME = createField(DSL.name("binding_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.client_auth_flow_bindings</code> table reference
     */
    public ClientAuthFlowBindings() {
        this(DSL.name("client_auth_flow_bindings"), null);
    }

    /**
     * Create an aliased <code>public.client_auth_flow_bindings</code> table reference
     */
    public ClientAuthFlowBindings(String alias) {
        this(DSL.name(alias), CLIENT_AUTH_FLOW_BINDINGS);
    }

    /**
     * Create an aliased <code>public.client_auth_flow_bindings</code> table reference
     */
    public ClientAuthFlowBindings(Name alias) {
        this(alias, CLIENT_AUTH_FLOW_BINDINGS);
    }

    private ClientAuthFlowBindings(Name alias, Table<ClientAuthFlowBindingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClientAuthFlowBindings(Name alias, Table<ClientAuthFlowBindingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ClientAuthFlowBindings(Table<O> child, ForeignKey<O, ClientAuthFlowBindingsRecord> key) {
        super(child, key, CLIENT_AUTH_FLOW_BINDINGS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<ClientAuthFlowBindingsRecord> getPrimaryKey() {
        return Keys.C_CLI_FLOW_BIND;
    }

    @Override
    public List<UniqueKey<ClientAuthFlowBindingsRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientAuthFlowBindingsRecord>>asList(Keys.C_CLI_FLOW_BIND);
    }

    @Override
    public ClientAuthFlowBindings as(String alias) {
        return new ClientAuthFlowBindings(DSL.name(alias), this);
    }

    @Override
    public ClientAuthFlowBindings as(Name alias) {
        return new ClientAuthFlowBindings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientAuthFlowBindings rename(String name) {
        return new ClientAuthFlowBindings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientAuthFlowBindings rename(Name name) {
        return new ClientAuthFlowBindings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
