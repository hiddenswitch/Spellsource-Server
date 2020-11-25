/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables;


import com.hiddenswitch.framework.schema.spellsource.Keys;
import com.hiddenswitch.framework.schema.spellsource.Spellsource;
import com.hiddenswitch.framework.schema.spellsource.tables.records.MatchmakingQueuesRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MatchmakingQueues extends TableImpl<MatchmakingQueuesRecord> {

    private static final long serialVersionUID = -1005482346;

    /**
     * The reference instance of <code>spellsource.matchmaking_queues</code>
     */
    public static final MatchmakingQueues MATCHMAKING_QUEUES = new MatchmakingQueues();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MatchmakingQueuesRecord> getRecordType() {
        return MatchmakingQueuesRecord.class;
    }

    /**
     * The column <code>spellsource.matchmaking_queues.id</code>.
     */
    public final TableField<MatchmakingQueuesRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.name</code>.
     */
    public final TableField<MatchmakingQueuesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.bot_opponent</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Boolean> BOT_OPPONENT = createField(DSL.name("bot_opponent"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.private_lobby</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Boolean> PRIVATE_LOBBY = createField(DSL.name("private_lobby"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.starts_automatically</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Boolean> STARTS_AUTOMATICALLY = createField(DSL.name("starts_automatically"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.still_connected_timeout</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Long> STILL_CONNECTED_TIMEOUT = createField(DSL.name("still_connected_timeout"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("2000", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.empty_lobby_timeout</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Long> EMPTY_LOBBY_TIMEOUT = createField(DSL.name("empty_lobby_timeout"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.awaiting_lobby_timeout</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Long> AWAITING_LOBBY_TIMEOUT = createField(DSL.name("awaiting_lobby_timeout"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.once</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Boolean> ONCE = createField(DSL.name("once"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.automatically_close</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Boolean> AUTOMATICALLY_CLOSE = createField(DSL.name("automatically_close"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.lobby_size</code>.
     */
    public final TableField<MatchmakingQueuesRecord, Integer> LOBBY_SIZE = createField(DSL.name("lobby_size"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("2", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>spellsource.matchmaking_queues.queue_created_at</code>.
     */
    public final TableField<MatchmakingQueuesRecord, OffsetDateTime> QUEUE_CREATED_AT = createField(DSL.name("queue_created_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * Create a <code>spellsource.matchmaking_queues</code> table reference
     */
    public MatchmakingQueues() {
        this(DSL.name("matchmaking_queues"), null);
    }

    /**
     * Create an aliased <code>spellsource.matchmaking_queues</code> table reference
     */
    public MatchmakingQueues(String alias) {
        this(DSL.name(alias), MATCHMAKING_QUEUES);
    }

    /**
     * Create an aliased <code>spellsource.matchmaking_queues</code> table reference
     */
    public MatchmakingQueues(Name alias) {
        this(alias, MATCHMAKING_QUEUES);
    }

    private MatchmakingQueues(Name alias, Table<MatchmakingQueuesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MatchmakingQueues(Name alias, Table<MatchmakingQueuesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> MatchmakingQueues(Table<O> child, ForeignKey<O, MatchmakingQueuesRecord> key) {
        super(child, key, MATCHMAKING_QUEUES);
    }

    @Override
    public Schema getSchema() {
        return Spellsource.SPELLSOURCE;
    }

    @Override
    public UniqueKey<MatchmakingQueuesRecord> getPrimaryKey() {
        return Keys.MATCHMAKING_QUEUES_PKEY;
    }

    @Override
    public List<UniqueKey<MatchmakingQueuesRecord>> getKeys() {
        return Arrays.<UniqueKey<MatchmakingQueuesRecord>>asList(Keys.MATCHMAKING_QUEUES_PKEY);
    }

    @Override
    public List<Check<MatchmakingQueuesRecord>> getChecks() {
        return Arrays.<Check<MatchmakingQueuesRecord>>asList(
              Internal.createCheck(this, DSL.name("matchmaking_queues_lobby_size_check"), "(((lobby_size <= 2) AND (lobby_size >= 0)))", true)
        );
    }

    @Override
    public MatchmakingQueues as(String alias) {
        return new MatchmakingQueues(DSL.name(alias), this);
    }

    @Override
    public MatchmakingQueues as(Name alias) {
        return new MatchmakingQueues(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MatchmakingQueues rename(String name) {
        return new MatchmakingQueues(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MatchmakingQueues rename(Name name) {
        return new MatchmakingQueues(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, Boolean, Boolean, Boolean, Long, Long, Long, Boolean, Boolean, Integer, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
