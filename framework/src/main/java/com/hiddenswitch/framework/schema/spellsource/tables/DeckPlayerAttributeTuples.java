/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables;


import com.hiddenswitch.framework.schema.spellsource.Keys;
import com.hiddenswitch.framework.schema.spellsource.Spellsource;
import com.hiddenswitch.framework.schema.spellsource.tables.records.DeckPlayerAttributeTuplesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class DeckPlayerAttributeTuples extends TableImpl<DeckPlayerAttributeTuplesRecord> {

    private static final long serialVersionUID = 302956985;

    /**
     * The reference instance of <code>spellsource.deck_player_attribute_tuples</code>
     */
    public static final DeckPlayerAttributeTuples DECK_PLAYER_ATTRIBUTE_TUPLES = new DeckPlayerAttributeTuples();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeckPlayerAttributeTuplesRecord> getRecordType() {
        return DeckPlayerAttributeTuplesRecord.class;
    }

    /**
     * The column <code>spellsource.deck_player_attribute_tuples.id</code>.
     */
    public final TableField<DeckPlayerAttributeTuplesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>spellsource.deck_player_attribute_tuples.deck_id</code>.
     */
    public final TableField<DeckPlayerAttributeTuplesRecord, String> DECK_ID = createField(DSL.name("deck_id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>spellsource.deck_player_attribute_tuples.attribute</code>.
     */
    public final TableField<DeckPlayerAttributeTuplesRecord, Integer> ATTRIBUTE = createField(DSL.name("attribute"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>spellsource.deck_player_attribute_tuples.string_value</code>.
     */
    public final TableField<DeckPlayerAttributeTuplesRecord, String> STRING_VALUE = createField(DSL.name("string_value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>spellsource.deck_player_attribute_tuples</code> table reference
     */
    public DeckPlayerAttributeTuples() {
        this(DSL.name("deck_player_attribute_tuples"), null);
    }

    /**
     * Create an aliased <code>spellsource.deck_player_attribute_tuples</code> table reference
     */
    public DeckPlayerAttributeTuples(String alias) {
        this(DSL.name(alias), DECK_PLAYER_ATTRIBUTE_TUPLES);
    }

    /**
     * Create an aliased <code>spellsource.deck_player_attribute_tuples</code> table reference
     */
    public DeckPlayerAttributeTuples(Name alias) {
        this(alias, DECK_PLAYER_ATTRIBUTE_TUPLES);
    }

    private DeckPlayerAttributeTuples(Name alias, Table<DeckPlayerAttributeTuplesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeckPlayerAttributeTuples(Name alias, Table<DeckPlayerAttributeTuplesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DeckPlayerAttributeTuples(Table<O> child, ForeignKey<O, DeckPlayerAttributeTuplesRecord> key) {
        super(child, key, DECK_PLAYER_ATTRIBUTE_TUPLES);
    }

    @Override
    public Schema getSchema() {
        return Spellsource.SPELLSOURCE;
    }

    @Override
    public Identity<DeckPlayerAttributeTuplesRecord, Long> getIdentity() {
        return Keys.IDENTITY_DECK_PLAYER_ATTRIBUTE_TUPLES;
    }

    @Override
    public UniqueKey<DeckPlayerAttributeTuplesRecord> getPrimaryKey() {
        return Keys.DECK_PLAYER_ATTRIBUTE_TUPLES_PKEY;
    }

    @Override
    public List<UniqueKey<DeckPlayerAttributeTuplesRecord>> getKeys() {
        return Arrays.<UniqueKey<DeckPlayerAttributeTuplesRecord>>asList(Keys.DECK_PLAYER_ATTRIBUTE_TUPLES_PKEY);
    }

    @Override
    public List<ForeignKey<DeckPlayerAttributeTuplesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DeckPlayerAttributeTuplesRecord, ?>>asList(Keys.DECK_PLAYER_ATTRIBUTE_TUPLES__DECK_PLAYER_ATTRIBUTE_TUPLES_DECK_ID_FKEY);
    }

    public Decks decks() {
        return new Decks(this, Keys.DECK_PLAYER_ATTRIBUTE_TUPLES__DECK_PLAYER_ATTRIBUTE_TUPLES_DECK_ID_FKEY);
    }

    @Override
    public DeckPlayerAttributeTuples as(String alias) {
        return new DeckPlayerAttributeTuples(DSL.name(alias), this);
    }

    @Override
    public DeckPlayerAttributeTuples as(Name alias) {
        return new DeckPlayerAttributeTuples(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeckPlayerAttributeTuples rename(String name) {
        return new DeckPlayerAttributeTuples(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeckPlayerAttributeTuples rename(Name name) {
        return new DeckPlayerAttributeTuples(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
