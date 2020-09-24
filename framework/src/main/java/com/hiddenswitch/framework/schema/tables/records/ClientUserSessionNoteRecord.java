/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.ClientUserSessionNote;
import com.hiddenswitch.framework.schema.tables.interfaces.IClientUserSessionNote;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientUserSessionNoteRecord extends UpdatableRecordImpl<ClientUserSessionNoteRecord> implements VertxPojo, Record3<String, String, String>, IClientUserSessionNote {

    private static final long serialVersionUID = 576035336;

    /**
     * Setter for <code>public.client_user_session_note.name</code>.
     */
    @Override
    public ClientUserSessionNoteRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.client_user_session_note.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.client_user_session_note.value</code>.
     */
    @Override
    public ClientUserSessionNoteRecord setValue(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.client_user_session_note.value</code>.
     */
    @Override
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.client_user_session_note.client_session</code>.
     */
    @Override
    public ClientUserSessionNoteRecord setClientSession(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.client_user_session_note.client_session</code>.
     */
    @Override
    public String getClientSession() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ClientUserSessionNote.CLIENT_USER_SESSION_NOTE.NAME;
    }

    @Override
    public Field<String> field2() {
        return ClientUserSessionNote.CLIENT_USER_SESSION_NOTE.VALUE;
    }

    @Override
    public Field<String> field3() {
        return ClientUserSessionNote.CLIENT_USER_SESSION_NOTE.CLIENT_SESSION;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getValue();
    }

    @Override
    public String component3() {
        return getClientSession();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getValue();
    }

    @Override
    public String value3() {
        return getClientSession();
    }

    @Override
    public ClientUserSessionNoteRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public ClientUserSessionNoteRecord value2(String value) {
        setValue(value);
        return this;
    }

    @Override
    public ClientUserSessionNoteRecord value3(String value) {
        setClientSession(value);
        return this;
    }

    @Override
    public ClientUserSessionNoteRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClientUserSessionNote from) {
        setName(from.getName());
        setValue(from.getValue());
        setClientSession(from.getClientSession());
    }

    @Override
    public <E extends IClientUserSessionNote> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClientUserSessionNoteRecord
     */
    public ClientUserSessionNoteRecord() {
        super(ClientUserSessionNote.CLIENT_USER_SESSION_NOTE);
    }

    /**
     * Create a detached, initialised ClientUserSessionNoteRecord
     */
    public ClientUserSessionNoteRecord(String name, String value, String clientSession) {
        super(ClientUserSessionNote.CLIENT_USER_SESSION_NOTE);

        set(0, name);
        set(1, value);
        set(2, clientSession);
    }

    public ClientUserSessionNoteRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
