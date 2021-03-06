/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.FedUserCredentialRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class FedUserCredential extends TableImpl<FedUserCredentialRecord> {

    private static final long serialVersionUID = -1758673113;

    /**
     * The reference instance of <code>keycloak.fed_user_credential</code>
     */
    public static final FedUserCredential FED_USER_CREDENTIAL = new FedUserCredential();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FedUserCredentialRecord> getRecordType() {
        return FedUserCredentialRecord.class;
    }

    /**
     * The column <code>keycloak.fed_user_credential.id</code>.
     */
    public final TableField<FedUserCredentialRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.salt</code>.
     */
    public final TableField<FedUserCredentialRecord, byte[]> SALT = createField(DSL.name("salt"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>keycloak.fed_user_credential.type</code>.
     */
    public final TableField<FedUserCredentialRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.created_date</code>.
     */
    public final TableField<FedUserCredentialRecord, Long> CREATED_DATE = createField(DSL.name("created_date"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>keycloak.fed_user_credential.user_id</code>.
     */
    public final TableField<FedUserCredentialRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.realm_id</code>.
     */
    public final TableField<FedUserCredentialRecord, String> REALM_ID = createField(DSL.name("realm_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.storage_provider_id</code>.
     */
    public final TableField<FedUserCredentialRecord, String> STORAGE_PROVIDER_ID = createField(DSL.name("storage_provider_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.user_label</code>.
     */
    public final TableField<FedUserCredentialRecord, String> USER_LABEL = createField(DSL.name("user_label"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.fed_user_credential.secret_data</code>.
     */
    public final TableField<FedUserCredentialRecord, String> SECRET_DATA = createField(DSL.name("secret_data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>keycloak.fed_user_credential.credential_data</code>.
     */
    public final TableField<FedUserCredentialRecord, String> CREDENTIAL_DATA = createField(DSL.name("credential_data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>keycloak.fed_user_credential.priority</code>.
     */
    public final TableField<FedUserCredentialRecord, Integer> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>keycloak.fed_user_credential</code> table reference
     */
    public FedUserCredential() {
        this(DSL.name("fed_user_credential"), null);
    }

    /**
     * Create an aliased <code>keycloak.fed_user_credential</code> table reference
     */
    public FedUserCredential(String alias) {
        this(DSL.name(alias), FED_USER_CREDENTIAL);
    }

    /**
     * Create an aliased <code>keycloak.fed_user_credential</code> table reference
     */
    public FedUserCredential(Name alias) {
        this(alias, FED_USER_CREDENTIAL);
    }

    private FedUserCredential(Name alias, Table<FedUserCredentialRecord> aliased) {
        this(alias, aliased, null);
    }

    private FedUserCredential(Name alias, Table<FedUserCredentialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> FedUserCredential(Table<O> child, ForeignKey<O, FedUserCredentialRecord> key) {
        super(child, key, FED_USER_CREDENTIAL);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_FU_CREDENTIAL, Indexes.IDX_FU_CREDENTIAL_RU);
    }

    @Override
    public UniqueKey<FedUserCredentialRecord> getPrimaryKey() {
        return Keys.CONSTR_FED_USER_CRED_PK;
    }

    @Override
    public List<UniqueKey<FedUserCredentialRecord>> getKeys() {
        return Arrays.<UniqueKey<FedUserCredentialRecord>>asList(Keys.CONSTR_FED_USER_CRED_PK);
    }

    @Override
    public FedUserCredential as(String alias) {
        return new FedUserCredential(DSL.name(alias), this);
    }

    @Override
    public FedUserCredential as(Name alias) {
        return new FedUserCredential(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FedUserCredential rename(String name) {
        return new FedUserCredential(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FedUserCredential rename(Name name) {
        return new FedUserCredential(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, byte[], String, Long, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
