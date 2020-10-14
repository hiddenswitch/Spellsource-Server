/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserRequiredActionRecord;

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
public class UserRequiredAction extends TableImpl<UserRequiredActionRecord> {

    private static final long serialVersionUID = -436069553;

    /**
     * The reference instance of <code>keycloak.user_required_action</code>
     */
    public static final UserRequiredAction USER_REQUIRED_ACTION = new UserRequiredAction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRequiredActionRecord> getRecordType() {
        return UserRequiredActionRecord.class;
    }

    /**
     * The column <code>keycloak.user_required_action.user_id</code>.
     */
    public final TableField<UserRequiredActionRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.user_required_action.required_action</code>.
     */
    public final TableField<UserRequiredActionRecord, String> REQUIRED_ACTION = createField(DSL.name("required_action"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("' '::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>keycloak.user_required_action</code> table reference
     */
    public UserRequiredAction() {
        this(DSL.name("user_required_action"), null);
    }

    /**
     * Create an aliased <code>keycloak.user_required_action</code> table reference
     */
    public UserRequiredAction(String alias) {
        this(DSL.name(alias), USER_REQUIRED_ACTION);
    }

    /**
     * Create an aliased <code>keycloak.user_required_action</code> table reference
     */
    public UserRequiredAction(Name alias) {
        this(alias, USER_REQUIRED_ACTION);
    }

    private UserRequiredAction(Name alias, Table<UserRequiredActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRequiredAction(Name alias, Table<UserRequiredActionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserRequiredAction(Table<O> child, ForeignKey<O, UserRequiredActionRecord> key) {
        super(child, key, USER_REQUIRED_ACTION);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_USER_REQACTIONS);
    }

    @Override
    public UniqueKey<UserRequiredActionRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_REQUIRED_ACTION;
    }

    @Override
    public List<UniqueKey<UserRequiredActionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRequiredActionRecord>>asList(Keys.CONSTRAINT_REQUIRED_ACTION);
    }

    @Override
    public List<ForeignKey<UserRequiredActionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRequiredActionRecord, ?>>asList(Keys.USER_REQUIRED_ACTION__FK_6QJ3W1JW9CVAFHE19BWSIUVMD);
    }

    public UserEntity userEntity() {
        return new UserEntity(this, Keys.USER_REQUIRED_ACTION__FK_6QJ3W1JW9CVAFHE19BWSIUVMD);
    }

    @Override
    public UserRequiredAction as(String alias) {
        return new UserRequiredAction(DSL.name(alias), this);
    }

    @Override
    public UserRequiredAction as(Name alias) {
        return new UserRequiredAction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRequiredAction rename(String name) {
        return new UserRequiredAction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRequiredAction rename(Name name) {
        return new UserRequiredAction(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
