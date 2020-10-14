/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.KeycloakRoleRecord;

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
public class KeycloakRole extends TableImpl<KeycloakRoleRecord> {

    private static final long serialVersionUID = 1095760586;

    /**
     * The reference instance of <code>keycloak.keycloak_role</code>
     */
    public static final KeycloakRole KEYCLOAK_ROLE = new KeycloakRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeycloakRoleRecord> getRecordType() {
        return KeycloakRoleRecord.class;
    }

    /**
     * The column <code>keycloak.keycloak_role.id</code>.
     */
    public final TableField<KeycloakRoleRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.keycloak_role.client_realm_constraint</code>.
     */
    public final TableField<KeycloakRoleRecord, String> CLIENT_REALM_CONSTRAINT = createField(DSL.name("client_realm_constraint"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.keycloak_role.client_role</code>.
     */
    public final TableField<KeycloakRoleRecord, Boolean> CLIENT_ROLE = createField(DSL.name("client_role"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.keycloak_role.description</code>.
     */
    public final TableField<KeycloakRoleRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.keycloak_role.name</code>.
     */
    public final TableField<KeycloakRoleRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.keycloak_role.realm_id</code>.
     */
    public final TableField<KeycloakRoleRecord, String> REALM_ID = createField(DSL.name("realm_id"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.keycloak_role.client</code>.
     */
    public final TableField<KeycloakRoleRecord, String> CLIENT = createField(DSL.name("client"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.keycloak_role.realm</code>.
     */
    public final TableField<KeycloakRoleRecord, String> REALM = createField(DSL.name("realm"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * Create a <code>keycloak.keycloak_role</code> table reference
     */
    public KeycloakRole() {
        this(DSL.name("keycloak_role"), null);
    }

    /**
     * Create an aliased <code>keycloak.keycloak_role</code> table reference
     */
    public KeycloakRole(String alias) {
        this(DSL.name(alias), KEYCLOAK_ROLE);
    }

    /**
     * Create an aliased <code>keycloak.keycloak_role</code> table reference
     */
    public KeycloakRole(Name alias) {
        this(alias, KEYCLOAK_ROLE);
    }

    private KeycloakRole(Name alias, Table<KeycloakRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeycloakRole(Name alias, Table<KeycloakRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> KeycloakRole(Table<O> child, ForeignKey<O, KeycloakRoleRecord> key) {
        super(child, key, KEYCLOAK_ROLE);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_KEYCLOAK_ROLE_CLIENT, Indexes.IDX_KEYCLOAK_ROLE_REALM);
    }

    @Override
    public UniqueKey<KeycloakRoleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    @Override
    public List<UniqueKey<KeycloakRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<KeycloakRoleRecord>>asList(Keys.CONSTRAINT_A, Keys.UK_J3RWUVD56ONTGSUHOGM184WW2_2);
    }

    @Override
    public List<ForeignKey<KeycloakRoleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<KeycloakRoleRecord, ?>>asList(Keys.KEYCLOAK_ROLE__FK_6VYQFE4CN4WLQ8R6KT5VDSJ5C);
    }

    public Realm realm() {
        return new Realm(this, Keys.KEYCLOAK_ROLE__FK_6VYQFE4CN4WLQ8R6KT5VDSJ5C);
    }

    @Override
    public KeycloakRole as(String alias) {
        return new KeycloakRole(DSL.name(alias), this);
    }

    @Override
    public KeycloakRole as(Name alias) {
        return new KeycloakRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeycloakRole rename(String name) {
        return new KeycloakRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeycloakRole rename(Name name) {
        return new KeycloakRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, Boolean, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
