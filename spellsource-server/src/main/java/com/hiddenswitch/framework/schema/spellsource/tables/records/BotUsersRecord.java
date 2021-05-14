/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.records;


import com.hiddenswitch.framework.schema.spellsource.tables.BotUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IBotUsers;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BotUsersRecord extends UpdatableRecordImpl<BotUsersRecord> implements VertxPojo, Record1<String>, IBotUsers {

    private static final long serialVersionUID = 128487852;

    /**
     * Setter for <code>spellsource.bot_users.id</code>.
     */
    @Override
    public BotUsersRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>spellsource.bot_users.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BotUsers.BOT_USERS.ID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public BotUsersRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public BotUsersRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBotUsers from) {
        setId(from.getId());
    }

    @Override
    public <E extends IBotUsers> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BotUsersRecord
     */
    public BotUsersRecord() {
        super(BotUsers.BOT_USERS);
    }

    /**
     * Create a detached, initialised BotUsersRecord
     */
    public BotUsersRecord(String id) {
        super(BotUsers.BOT_USERS);

        set(0, id);
    }

    public BotUsersRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}