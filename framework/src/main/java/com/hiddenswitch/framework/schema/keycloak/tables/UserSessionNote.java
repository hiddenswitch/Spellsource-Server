/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.UserSessionNoteRecord;

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
public class UserSessionNote extends TableImpl<UserSessionNoteRecord> {

    private static final long serialVersionUID = -516583519;

    /**
     * The reference instance of <code>keycloak.user_session_note</code>
     */
    public static final UserSessionNote USER_SESSION_NOTE = new UserSessionNote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSessionNoteRecord> getRecordType() {
        return UserSessionNoteRecord.class;
    }

    /**
     * The column <code>keycloak.user_session_note.user_session</code>.
     */
    public final TableField<UserSessionNoteRecord, String> USER_SESSION = createField(DSL.name("user_session"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.user_session_note.name</code>.
     */
    public final TableField<UserSessionNoteRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.user_session_note.value</code>.
     */
    public final TableField<UserSessionNoteRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * Create a <code>keycloak.user_session_note</code> table reference
     */
    public UserSessionNote() {
        this(DSL.name("user_session_note"), null);
    }

    /**
     * Create an aliased <code>keycloak.user_session_note</code> table reference
     */
    public UserSessionNote(String alias) {
        this(DSL.name(alias), USER_SESSION_NOTE);
    }

    /**
     * Create an aliased <code>keycloak.user_session_note</code> table reference
     */
    public UserSessionNote(Name alias) {
        this(alias, USER_SESSION_NOTE);
    }

    private UserSessionNote(Name alias, Table<UserSessionNoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSessionNote(Name alias, Table<UserSessionNoteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserSessionNote(Table<O> child, ForeignKey<O, UserSessionNoteRecord> key) {
        super(child, key, USER_SESSION_NOTE);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public UniqueKey<UserSessionNoteRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_USN_PK;
    }

    @Override
    public List<UniqueKey<UserSessionNoteRecord>> getKeys() {
        return Arrays.<UniqueKey<UserSessionNoteRecord>>asList(Keys.CONSTRAINT_USN_PK);
    }

    @Override
    public List<ForeignKey<UserSessionNoteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserSessionNoteRecord, ?>>asList(Keys.USER_SESSION_NOTE__FK5EDFB00FF51D3472);
    }

    public UserSession userSession() {
        return new UserSession(this, Keys.USER_SESSION_NOTE__FK5EDFB00FF51D3472);
    }

    @Override
    public UserSessionNote as(String alias) {
        return new UserSessionNote(DSL.name(alias), this);
    }

    @Override
    public UserSessionNote as(Name alias) {
        return new UserSessionNote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSessionNote rename(String name) {
        return new UserSessionNote(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSessionNote rename(Name name) {
        return new UserSessionNote(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
