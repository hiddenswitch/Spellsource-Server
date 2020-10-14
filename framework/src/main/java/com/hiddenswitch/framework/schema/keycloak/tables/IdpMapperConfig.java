/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.IdpMapperConfigRecord;

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
public class IdpMapperConfig extends TableImpl<IdpMapperConfigRecord> {

    private static final long serialVersionUID = 2014539901;

    /**
     * The reference instance of <code>keycloak.idp_mapper_config</code>
     */
    public static final IdpMapperConfig IDP_MAPPER_CONFIG = new IdpMapperConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IdpMapperConfigRecord> getRecordType() {
        return IdpMapperConfigRecord.class;
    }

    /**
     * The column <code>keycloak.idp_mapper_config.idp_mapper_id</code>.
     */
    public final TableField<IdpMapperConfigRecord, String> IDP_MAPPER_ID = createField(DSL.name("idp_mapper_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.idp_mapper_config.value</code>.
     */
    public final TableField<IdpMapperConfigRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>keycloak.idp_mapper_config.name</code>.
     */
    public final TableField<IdpMapperConfigRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>keycloak.idp_mapper_config</code> table reference
     */
    public IdpMapperConfig() {
        this(DSL.name("idp_mapper_config"), null);
    }

    /**
     * Create an aliased <code>keycloak.idp_mapper_config</code> table reference
     */
    public IdpMapperConfig(String alias) {
        this(DSL.name(alias), IDP_MAPPER_CONFIG);
    }

    /**
     * Create an aliased <code>keycloak.idp_mapper_config</code> table reference
     */
    public IdpMapperConfig(Name alias) {
        this(alias, IDP_MAPPER_CONFIG);
    }

    private IdpMapperConfig(Name alias, Table<IdpMapperConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private IdpMapperConfig(Name alias, Table<IdpMapperConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> IdpMapperConfig(Table<O> child, ForeignKey<O, IdpMapperConfigRecord> key) {
        super(child, key, IDP_MAPPER_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public UniqueKey<IdpMapperConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_IDPMCONFIG;
    }

    @Override
    public List<UniqueKey<IdpMapperConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<IdpMapperConfigRecord>>asList(Keys.CONSTRAINT_IDPMCONFIG);
    }

    @Override
    public List<ForeignKey<IdpMapperConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IdpMapperConfigRecord, ?>>asList(Keys.IDP_MAPPER_CONFIG__FK_IDPMCONFIG);
    }

    public IdentityProviderMapper identityProviderMapper() {
        return new IdentityProviderMapper(this, Keys.IDP_MAPPER_CONFIG__FK_IDPMCONFIG);
    }

    @Override
    public IdpMapperConfig as(String alias) {
        return new IdpMapperConfig(DSL.name(alias), this);
    }

    @Override
    public IdpMapperConfig as(Name alias) {
        return new IdpMapperConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IdpMapperConfig rename(String name) {
        return new IdpMapperConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IdpMapperConfig rename(Name name) {
        return new IdpMapperConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
