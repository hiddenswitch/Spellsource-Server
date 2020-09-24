/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Indexes;
import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.ClientScopeAttributesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class ClientScopeAttributes extends TableImpl<ClientScopeAttributesRecord> {

    private static final long serialVersionUID = -1864012330;

    /**
     * The reference instance of <code>public.client_scope_attributes</code>
     */
    public static final ClientScopeAttributes CLIENT_SCOPE_ATTRIBUTES = new ClientScopeAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientScopeAttributesRecord> getRecordType() {
        return ClientScopeAttributesRecord.class;
    }

    /**
     * The column <code>public.client_scope_attributes.scope_id</code>.
     */
    public final TableField<ClientScopeAttributesRecord, String> SCOPE_ID = createField(DSL.name("scope_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.client_scope_attributes.value</code>.
     */
    public final TableField<ClientScopeAttributesRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>public.client_scope_attributes.name</code>.
     */
    public final TableField<ClientScopeAttributesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.client_scope_attributes</code> table reference
     */
    public ClientScopeAttributes() {
        this(DSL.name("client_scope_attributes"), null);
    }

    /**
     * Create an aliased <code>public.client_scope_attributes</code> table reference
     */
    public ClientScopeAttributes(String alias) {
        this(DSL.name(alias), CLIENT_SCOPE_ATTRIBUTES);
    }

    /**
     * Create an aliased <code>public.client_scope_attributes</code> table reference
     */
    public ClientScopeAttributes(Name alias) {
        this(alias, CLIENT_SCOPE_ATTRIBUTES);
    }

    private ClientScopeAttributes(Name alias, Table<ClientScopeAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClientScopeAttributes(Name alias, Table<ClientScopeAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ClientScopeAttributes(Table<O> child, ForeignKey<O, ClientScopeAttributesRecord> key) {
        super(child, key, CLIENT_SCOPE_ATTRIBUTES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_CLSCOPE_ATTRS);
    }

    @Override
    public UniqueKey<ClientScopeAttributesRecord> getPrimaryKey() {
        return Keys.PK_CL_TMPL_ATTR;
    }

    @Override
    public List<UniqueKey<ClientScopeAttributesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientScopeAttributesRecord>>asList(Keys.PK_CL_TMPL_ATTR);
    }

    @Override
    public List<ForeignKey<ClientScopeAttributesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClientScopeAttributesRecord, ?>>asList(Keys.CLIENT_SCOPE_ATTRIBUTES__FK_CL_SCOPE_ATTR_SCOPE);
    }

    public ClientScope clientScope() {
        return new ClientScope(this, Keys.CLIENT_SCOPE_ATTRIBUTES__FK_CL_SCOPE_ATTR_SCOPE);
    }

    @Override
    public ClientScopeAttributes as(String alias) {
        return new ClientScopeAttributes(DSL.name(alias), this);
    }

    @Override
    public ClientScopeAttributes as(Name alias) {
        return new ClientScopeAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientScopeAttributes rename(String name) {
        return new ClientScopeAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientScopeAttributes rename(Name name) {
        return new ClientScopeAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
