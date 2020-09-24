/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables;


import com.hiddenswitch.framework.schema.Keys;
import com.hiddenswitch.framework.schema.Public;
import com.hiddenswitch.framework.schema.tables.records.IdentityProviderConfigRecord;

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
public class IdentityProviderConfig extends TableImpl<IdentityProviderConfigRecord> {

    private static final long serialVersionUID = 1342048711;

    /**
     * The reference instance of <code>public.identity_provider_config</code>
     */
    public static final IdentityProviderConfig IDENTITY_PROVIDER_CONFIG = new IdentityProviderConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IdentityProviderConfigRecord> getRecordType() {
        return IdentityProviderConfigRecord.class;
    }

    /**
     * The column <code>public.identity_provider_config.identity_provider_id</code>.
     */
    public final TableField<IdentityProviderConfigRecord, String> IDENTITY_PROVIDER_ID = createField(DSL.name("identity_provider_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.identity_provider_config.value</code>.
     */
    public final TableField<IdentityProviderConfigRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.identity_provider_config.name</code>.
     */
    public final TableField<IdentityProviderConfigRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.identity_provider_config</code> table reference
     */
    public IdentityProviderConfig() {
        this(DSL.name("identity_provider_config"), null);
    }

    /**
     * Create an aliased <code>public.identity_provider_config</code> table reference
     */
    public IdentityProviderConfig(String alias) {
        this(DSL.name(alias), IDENTITY_PROVIDER_CONFIG);
    }

    /**
     * Create an aliased <code>public.identity_provider_config</code> table reference
     */
    public IdentityProviderConfig(Name alias) {
        this(alias, IDENTITY_PROVIDER_CONFIG);
    }

    private IdentityProviderConfig(Name alias, Table<IdentityProviderConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private IdentityProviderConfig(Name alias, Table<IdentityProviderConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> IdentityProviderConfig(Table<O> child, ForeignKey<O, IdentityProviderConfigRecord> key) {
        super(child, key, IDENTITY_PROVIDER_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<IdentityProviderConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D;
    }

    @Override
    public List<UniqueKey<IdentityProviderConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<IdentityProviderConfigRecord>>asList(Keys.CONSTRAINT_D);
    }

    @Override
    public List<ForeignKey<IdentityProviderConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IdentityProviderConfigRecord, ?>>asList(Keys.IDENTITY_PROVIDER_CONFIG__FKDC4897CF864C4E43);
    }

    public IdentityProvider identityProvider() {
        return new IdentityProvider(this, Keys.IDENTITY_PROVIDER_CONFIG__FKDC4897CF864C4E43);
    }

    @Override
    public IdentityProviderConfig as(String alias) {
        return new IdentityProviderConfig(DSL.name(alias), this);
    }

    @Override
    public IdentityProviderConfig as(Name alias) {
        return new IdentityProviderConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IdentityProviderConfig rename(String name) {
        return new IdentityProviderConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IdentityProviderConfig rename(Name name) {
        return new IdentityProviderConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
