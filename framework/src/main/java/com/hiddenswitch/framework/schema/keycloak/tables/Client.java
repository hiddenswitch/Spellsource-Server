/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ClientRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class Client extends TableImpl<ClientRecord> {

    private static final long serialVersionUID = -660660894;

    /**
     * The reference instance of <code>keycloak.client</code>
     */
    public static final Client CLIENT = new Client();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientRecord> getRecordType() {
        return ClientRecord.class;
    }

    /**
     * The column <code>keycloak.client.id</code>.
     */
    public final TableField<ClientRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.client.enabled</code>.
     */
    public final TableField<ClientRecord, Boolean> ENABLED = createField(DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.full_scope_allowed</code>.
     */
    public final TableField<ClientRecord, Boolean> FULL_SCOPE_ALLOWED = createField(DSL.name("full_scope_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.client_id</code>.
     */
    public final TableField<ClientRecord, String> CLIENT_ID = createField(DSL.name("client_id"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.not_before</code>.
     */
    public final TableField<ClientRecord, Integer> NOT_BEFORE = createField(DSL.name("not_before"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.client.public_client</code>.
     */
    public final TableField<ClientRecord, Boolean> PUBLIC_CLIENT = createField(DSL.name("public_client"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.secret</code>.
     */
    public final TableField<ClientRecord, String> SECRET = createField(DSL.name("secret"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.base_url</code>.
     */
    public final TableField<ClientRecord, String> BASE_URL = createField(DSL.name("base_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.bearer_only</code>.
     */
    public final TableField<ClientRecord, Boolean> BEARER_ONLY = createField(DSL.name("bearer_only"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.management_url</code>.
     */
    public final TableField<ClientRecord, String> MANAGEMENT_URL = createField(DSL.name("management_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.surrogate_auth_required</code>.
     */
    public final TableField<ClientRecord, Boolean> SURROGATE_AUTH_REQUIRED = createField(DSL.name("surrogate_auth_required"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.realm_id</code>.
     */
    public final TableField<ClientRecord, String> REALM_ID = createField(DSL.name("realm_id"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.client.protocol</code>.
     */
    public final TableField<ClientRecord, String> PROTOCOL = createField(DSL.name("protocol"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.node_rereg_timeout</code>.
     */
    public final TableField<ClientRecord, Integer> NODE_REREG_TIMEOUT = createField(DSL.name("node_rereg_timeout"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.client.frontchannel_logout</code>.
     */
    public final TableField<ClientRecord, Boolean> FRONTCHANNEL_LOGOUT = createField(DSL.name("frontchannel_logout"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.consent_required</code>.
     */
    public final TableField<ClientRecord, Boolean> CONSENT_REQUIRED = createField(DSL.name("consent_required"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.name</code>.
     */
    public final TableField<ClientRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.service_accounts_enabled</code>.
     */
    public final TableField<ClientRecord, Boolean> SERVICE_ACCOUNTS_ENABLED = createField(DSL.name("service_accounts_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.client_authenticator_type</code>.
     */
    public final TableField<ClientRecord, String> CLIENT_AUTHENTICATOR_TYPE = createField(DSL.name("client_authenticator_type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.root_url</code>.
     */
    public final TableField<ClientRecord, String> ROOT_URL = createField(DSL.name("root_url"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.description</code>.
     */
    public final TableField<ClientRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.registration_token</code>.
     */
    public final TableField<ClientRecord, String> REGISTRATION_TOKEN = createField(DSL.name("registration_token"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.client.standard_flow_enabled</code>.
     */
    public final TableField<ClientRecord, Boolean> STANDARD_FLOW_ENABLED = createField(DSL.name("standard_flow_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.implicit_flow_enabled</code>.
     */
    public final TableField<ClientRecord, Boolean> IMPLICIT_FLOW_ENABLED = createField(DSL.name("implicit_flow_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.direct_access_grants_enabled</code>.
     */
    public final TableField<ClientRecord, Boolean> DIRECT_ACCESS_GRANTS_ENABLED = createField(DSL.name("direct_access_grants_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.client.always_display_in_console</code>.
     */
    public final TableField<ClientRecord, Boolean> ALWAYS_DISPLAY_IN_CONSOLE = createField(DSL.name("always_display_in_console"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>keycloak.client</code> table reference
     */
    public Client() {
        this(DSL.name("client"), null);
    }

    /**
     * Create an aliased <code>keycloak.client</code> table reference
     */
    public Client(String alias) {
        this(DSL.name(alias), CLIENT);
    }

    /**
     * Create an aliased <code>keycloak.client</code> table reference
     */
    public Client(Name alias) {
        this(alias, CLIENT);
    }

    private Client(Name alias, Table<ClientRecord> aliased) {
        this(alias, aliased, null);
    }

    private Client(Name alias, Table<ClientRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Client(Table<O> child, ForeignKey<O, ClientRecord> key) {
        super(child, key, CLIENT);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_CLIENT_ID);
    }

    @Override
    public UniqueKey<ClientRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    @Override
    public List<UniqueKey<ClientRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientRecord>>asList(Keys.CONSTRAINT_7, Keys.UK_B71CJLBENV945RB6GCON438AT);
    }

    @Override
    public List<ForeignKey<ClientRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClientRecord, ?>>asList(Keys.CLIENT__FK_P56CTINXXB9GSK57FO49F9TAC);
    }

    public Realm realm() {
        return new Realm(this, Keys.CLIENT__FK_P56CTINXXB9GSK57FO49F9TAC);
    }

    @Override
    public Client as(String alias) {
        return new Client(DSL.name(alias), this);
    }

    @Override
    public Client as(Name alias) {
        return new Client(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Client rename(String name) {
        return new Client(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Client rename(Name name) {
        return new Client(name, null);
    }
}
