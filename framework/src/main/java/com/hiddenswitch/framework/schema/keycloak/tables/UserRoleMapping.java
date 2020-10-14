/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserRoleMappingRecord;

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
public class UserRoleMapping extends TableImpl<UserRoleMappingRecord> {

    private static final long serialVersionUID = -181627960;

    /**
     * The reference instance of <code>keycloak.user_role_mapping</code>
     */
    public static final UserRoleMapping USER_ROLE_MAPPING = new UserRoleMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleMappingRecord> getRecordType() {
        return UserRoleMappingRecord.class;
    }

    /**
     * The column <code>keycloak.user_role_mapping.role_id</code>.
     */
    public final TableField<UserRoleMappingRecord, String> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.user_role_mapping.user_id</code>.
     */
    public final TableField<UserRoleMappingRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>keycloak.user_role_mapping</code> table reference
     */
    public UserRoleMapping() {
        this(DSL.name("user_role_mapping"), null);
    }

    /**
     * Create an aliased <code>keycloak.user_role_mapping</code> table reference
     */
    public UserRoleMapping(String alias) {
        this(DSL.name(alias), USER_ROLE_MAPPING);
    }

    /**
     * Create an aliased <code>keycloak.user_role_mapping</code> table reference
     */
    public UserRoleMapping(Name alias) {
        this(alias, USER_ROLE_MAPPING);
    }

    private UserRoleMapping(Name alias, Table<UserRoleMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoleMapping(Name alias, Table<UserRoleMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserRoleMapping(Table<O> child, ForeignKey<O, UserRoleMappingRecord> key) {
        super(child, key, USER_ROLE_MAPPING);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_USER_ROLE_MAPPING);
    }

    @Override
    public UniqueKey<UserRoleMappingRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C;
    }

    @Override
    public List<UniqueKey<UserRoleMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleMappingRecord>>asList(Keys.CONSTRAINT_C);
    }

    @Override
    public List<ForeignKey<UserRoleMappingRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRoleMappingRecord, ?>>asList(Keys.USER_ROLE_MAPPING__FK_C4FQV34P1MBYLLOXANG7B1Q3L);
    }

    public UserEntity userEntity() {
        return new UserEntity(this, Keys.USER_ROLE_MAPPING__FK_C4FQV34P1MBYLLOXANG7B1Q3L);
    }

    @Override
    public UserRoleMapping as(String alias) {
        return new UserRoleMapping(DSL.name(alias), this);
    }

    @Override
    public UserRoleMapping as(Name alias) {
        return new UserRoleMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleMapping rename(String name) {
        return new UserRoleMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleMapping rename(Name name) {
        return new UserRoleMapping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
