/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserGroupMembershipRecord;

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
public class UserGroupMembership extends TableImpl<UserGroupMembershipRecord> {

    private static final long serialVersionUID = -152601889;

    /**
     * The reference instance of <code>keycloak.user_group_membership</code>
     */
    public static final UserGroupMembership USER_GROUP_MEMBERSHIP = new UserGroupMembership();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGroupMembershipRecord> getRecordType() {
        return UserGroupMembershipRecord.class;
    }

    /**
     * The column <code>keycloak.user_group_membership.group_id</code>.
     */
    public final TableField<UserGroupMembershipRecord, String> GROUP_ID = createField(DSL.name("group_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.user_group_membership.user_id</code>.
     */
    public final TableField<UserGroupMembershipRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>keycloak.user_group_membership</code> table reference
     */
    public UserGroupMembership() {
        this(DSL.name("user_group_membership"), null);
    }

    /**
     * Create an aliased <code>keycloak.user_group_membership</code> table reference
     */
    public UserGroupMembership(String alias) {
        this(DSL.name(alias), USER_GROUP_MEMBERSHIP);
    }

    /**
     * Create an aliased <code>keycloak.user_group_membership</code> table reference
     */
    public UserGroupMembership(Name alias) {
        this(alias, USER_GROUP_MEMBERSHIP);
    }

    private UserGroupMembership(Name alias, Table<UserGroupMembershipRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGroupMembership(Name alias, Table<UserGroupMembershipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserGroupMembership(Table<O> child, ForeignKey<O, UserGroupMembershipRecord> key) {
        super(child, key, USER_GROUP_MEMBERSHIP);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_USER_GROUP_MAPPING);
    }

    @Override
    public UniqueKey<UserGroupMembershipRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_USER_GROUP;
    }

    @Override
    public List<UniqueKey<UserGroupMembershipRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGroupMembershipRecord>>asList(Keys.CONSTRAINT_USER_GROUP);
    }

    @Override
    public List<ForeignKey<UserGroupMembershipRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserGroupMembershipRecord, ?>>asList(Keys.USER_GROUP_MEMBERSHIP__FK_USER_GROUP_USER);
    }

    public UserEntity userEntity() {
        return new UserEntity(this, Keys.USER_GROUP_MEMBERSHIP__FK_USER_GROUP_USER);
    }

    @Override
    public UserGroupMembership as(String alias) {
        return new UserGroupMembership(DSL.name(alias), this);
    }

    @Override
    public UserGroupMembership as(Name alias) {
        return new UserGroupMembership(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupMembership rename(String name) {
        return new UserGroupMembership(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupMembership rename(Name name) {
        return new UserGroupMembership(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}