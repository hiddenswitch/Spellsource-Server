/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables;


import com.hiddenswitch.framework.schema.keycloak.tables.UserEntity;
import com.hiddenswitch.framework.schema.spellsource.Keys;
import com.hiddenswitch.framework.schema.spellsource.Spellsource;
import com.hiddenswitch.framework.schema.spellsource.tables.records.UserEntityAddonsRecord;

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
public class UserEntityAddons extends TableImpl<UserEntityAddonsRecord> {

    private static final long serialVersionUID = -128300276;

    /**
     * The reference instance of <code>spellsource.user_entity_addons</code>
     */
    public static final UserEntityAddons USER_ENTITY_ADDONS = new UserEntityAddons();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserEntityAddonsRecord> getRecordType() {
        return UserEntityAddonsRecord.class;
    }

    /**
     * The column <code>spellsource.user_entity_addons.id</code>.
     */
    public final TableField<UserEntityAddonsRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>spellsource.user_entity_addons.privacy_token</code>.
     */
    public final TableField<UserEntityAddonsRecord, String> PRIVACY_TOKEN = createField(DSL.name("privacy_token"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("floor(((1000)::double precision + (random() * (8999)::double precision)))", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>spellsource.user_entity_addons</code> table reference
     */
    public UserEntityAddons() {
        this(DSL.name("user_entity_addons"), null);
    }

    /**
     * Create an aliased <code>spellsource.user_entity_addons</code> table reference
     */
    public UserEntityAddons(String alias) {
        this(DSL.name(alias), USER_ENTITY_ADDONS);
    }

    /**
     * Create an aliased <code>spellsource.user_entity_addons</code> table reference
     */
    public UserEntityAddons(Name alias) {
        this(alias, USER_ENTITY_ADDONS);
    }

    private UserEntityAddons(Name alias, Table<UserEntityAddonsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserEntityAddons(Name alias, Table<UserEntityAddonsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserEntityAddons(Table<O> child, ForeignKey<O, UserEntityAddonsRecord> key) {
        super(child, key, USER_ENTITY_ADDONS);
    }

    @Override
    public Schema getSchema() {
        return Spellsource.SPELLSOURCE;
    }

    @Override
    public UniqueKey<UserEntityAddonsRecord> getPrimaryKey() {
        return Keys.USER_ENTITY_ADDONS_PKEY;
    }

    @Override
    public List<UniqueKey<UserEntityAddonsRecord>> getKeys() {
        return Arrays.<UniqueKey<UserEntityAddonsRecord>>asList(Keys.USER_ENTITY_ADDONS_PKEY);
    }

    @Override
    public List<ForeignKey<UserEntityAddonsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserEntityAddonsRecord, ?>>asList(Keys.USER_ENTITY_ADDONS__USER_ENTITY_ADDONS_ID_FKEY);
    }

    public UserEntity userEntity() {
        return new UserEntity(this, Keys.USER_ENTITY_ADDONS__USER_ENTITY_ADDONS_ID_FKEY);
    }

    @Override
    public UserEntityAddons as(String alias) {
        return new UserEntityAddons(DSL.name(alias), this);
    }

    @Override
    public UserEntityAddons as(Name alias) {
        return new UserEntityAddons(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserEntityAddons rename(String name) {
        return new UserEntityAddons(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserEntityAddons rename(Name name) {
        return new UserEntityAddons(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
