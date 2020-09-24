/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.ClientAttributesRecord;

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
public class ClientAttributes extends TableImpl<ClientAttributesRecord> {

    private static final long serialVersionUID = -918123064;

    /**
     * The reference instance of <code>public.client_attributes</code>
     */
    public static final ClientAttributes CLIENT_ATTRIBUTES = new ClientAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientAttributesRecord> getRecordType() {
        return ClientAttributesRecord.class;
    }

    /**
     * The column <code>public.client_attributes.client_id</code>.
     */
    public final TableField<ClientAttributesRecord, String> CLIENT_ID = createField(DSL.name("client_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.client_attributes.value</code>.
     */
    public final TableField<ClientAttributesRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>public.client_attributes.name</code>.
     */
    public final TableField<ClientAttributesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.client_attributes</code> table reference
     */
    public ClientAttributes() {
        this(DSL.name("client_attributes"), null);
    }

    /**
     * Create an aliased <code>public.client_attributes</code> table reference
     */
    public ClientAttributes(String alias) {
        this(DSL.name(alias), CLIENT_ATTRIBUTES);
    }

    /**
     * Create an aliased <code>public.client_attributes</code> table reference
     */
    public ClientAttributes(Name alias) {
        this(alias, CLIENT_ATTRIBUTES);
    }

    private ClientAttributes(Name alias, Table<ClientAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClientAttributes(Name alias, Table<ClientAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ClientAttributes(Table<O> child, ForeignKey<O, ClientAttributesRecord> key) {
        super(child, key, CLIENT_ATTRIBUTES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<ClientAttributesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3C;
    }

    @Override
    public List<UniqueKey<ClientAttributesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientAttributesRecord>>asList(Keys.CONSTRAINT_3C);
    }

    @Override
    public List<ForeignKey<ClientAttributesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClientAttributesRecord, ?>>asList(Keys.CLIENT_ATTRIBUTES__FK3C47C64BEACCA966);
    }

    public Client client() {
        return new Client(this, Keys.CLIENT_ATTRIBUTES__FK3C47C64BEACCA966);
    }

    @Override
    public ClientAttributes as(String alias) {
        return new ClientAttributes(DSL.name(alias), this);
    }

    @Override
    public ClientAttributes as(Name alias) {
        return new ClientAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientAttributes rename(String name) {
        return new ClientAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientAttributes rename(Name name) {
        return new ClientAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
