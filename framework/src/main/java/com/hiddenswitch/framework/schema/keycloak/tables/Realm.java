/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.RealmRecord;

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
public class Realm extends TableImpl<RealmRecord> {

    private static final long serialVersionUID = -1422998292;

    /**
     * The reference instance of <code>keycloak.realm</code>
     */
    public static final Realm REALM = new Realm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RealmRecord> getRecordType() {
        return RealmRecord.class;
    }

    /**
     * The column <code>keycloak.realm.id</code>.
     */
    public final TableField<RealmRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.realm.access_code_lifespan</code>.
     */
    public final TableField<RealmRecord, Integer> ACCESS_CODE_LIFESPAN = createField(DSL.name("access_code_lifespan"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.user_action_lifespan</code>.
     */
    public final TableField<RealmRecord, Integer> USER_ACTION_LIFESPAN = createField(DSL.name("user_action_lifespan"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.access_token_lifespan</code>.
     */
    public final TableField<RealmRecord, Integer> ACCESS_TOKEN_LIFESPAN = createField(DSL.name("access_token_lifespan"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.account_theme</code>.
     */
    public final TableField<RealmRecord, String> ACCOUNT_THEME = createField(DSL.name("account_theme"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.admin_theme</code>.
     */
    public final TableField<RealmRecord, String> ADMIN_THEME = createField(DSL.name("admin_theme"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.email_theme</code>.
     */
    public final TableField<RealmRecord, String> EMAIL_THEME = createField(DSL.name("email_theme"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.enabled</code>.
     */
    public final TableField<RealmRecord, Boolean> ENABLED = createField(DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.events_enabled</code>.
     */
    public final TableField<RealmRecord, Boolean> EVENTS_ENABLED = createField(DSL.name("events_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.events_expiration</code>.
     */
    public final TableField<RealmRecord, Long> EVENTS_EXPIRATION = createField(DSL.name("events_expiration"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>keycloak.realm.login_theme</code>.
     */
    public final TableField<RealmRecord, String> LOGIN_THEME = createField(DSL.name("login_theme"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.name</code>.
     */
    public final TableField<RealmRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.not_before</code>.
     */
    public final TableField<RealmRecord, Integer> NOT_BEFORE = createField(DSL.name("not_before"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.password_policy</code>.
     */
    public final TableField<RealmRecord, String> PASSWORD_POLICY = createField(DSL.name("password_policy"), org.jooq.impl.SQLDataType.VARCHAR(2550), this, "");

    /**
     * The column <code>keycloak.realm.registration_allowed</code>.
     */
    public final TableField<RealmRecord, Boolean> REGISTRATION_ALLOWED = createField(DSL.name("registration_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.remember_me</code>.
     */
    public final TableField<RealmRecord, Boolean> REMEMBER_ME = createField(DSL.name("remember_me"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.reset_password_allowed</code>.
     */
    public final TableField<RealmRecord, Boolean> RESET_PASSWORD_ALLOWED = createField(DSL.name("reset_password_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.social</code>.
     */
    public final TableField<RealmRecord, Boolean> SOCIAL = createField(DSL.name("social"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.ssl_required</code>.
     */
    public final TableField<RealmRecord, String> SSL_REQUIRED = createField(DSL.name("ssl_required"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.sso_idle_timeout</code>.
     */
    public final TableField<RealmRecord, Integer> SSO_IDLE_TIMEOUT = createField(DSL.name("sso_idle_timeout"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.sso_max_lifespan</code>.
     */
    public final TableField<RealmRecord, Integer> SSO_MAX_LIFESPAN = createField(DSL.name("sso_max_lifespan"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.update_profile_on_soc_login</code>.
     */
    public final TableField<RealmRecord, Boolean> UPDATE_PROFILE_ON_SOC_LOGIN = createField(DSL.name("update_profile_on_soc_login"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.verify_email</code>.
     */
    public final TableField<RealmRecord, Boolean> VERIFY_EMAIL = createField(DSL.name("verify_email"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.master_admin_client</code>.
     */
    public final TableField<RealmRecord, String> MASTER_ADMIN_CLIENT = createField(DSL.name("master_admin_client"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.login_lifespan</code>.
     */
    public final TableField<RealmRecord, Integer> LOGIN_LIFESPAN = createField(DSL.name("login_lifespan"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>keycloak.realm.internationalization_enabled</code>.
     */
    public final TableField<RealmRecord, Boolean> INTERNATIONALIZATION_ENABLED = createField(DSL.name("internationalization_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.default_locale</code>.
     */
    public final TableField<RealmRecord, String> DEFAULT_LOCALE = createField(DSL.name("default_locale"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keycloak.realm.reg_email_as_username</code>.
     */
    public final TableField<RealmRecord, Boolean> REG_EMAIL_AS_USERNAME = createField(DSL.name("reg_email_as_username"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.admin_events_enabled</code>.
     */
    public final TableField<RealmRecord, Boolean> ADMIN_EVENTS_ENABLED = createField(DSL.name("admin_events_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.admin_events_details_enabled</code>.
     */
    public final TableField<RealmRecord, Boolean> ADMIN_EVENTS_DETAILS_ENABLED = createField(DSL.name("admin_events_details_enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.edit_username_allowed</code>.
     */
    public final TableField<RealmRecord, Boolean> EDIT_USERNAME_ALLOWED = createField(DSL.name("edit_username_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_counter</code>.
     */
    public final TableField<RealmRecord, Integer> OTP_POLICY_COUNTER = createField(DSL.name("otp_policy_counter"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_window</code>.
     */
    public final TableField<RealmRecord, Integer> OTP_POLICY_WINDOW = createField(DSL.name("otp_policy_window"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_period</code>.
     */
    public final TableField<RealmRecord, Integer> OTP_POLICY_PERIOD = createField(DSL.name("otp_policy_period"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("30", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_digits</code>.
     */
    public final TableField<RealmRecord, Integer> OTP_POLICY_DIGITS = createField(DSL.name("otp_policy_digits"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("6", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_alg</code>.
     */
    public final TableField<RealmRecord, String> OTP_POLICY_ALG = createField(DSL.name("otp_policy_alg"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("'HmacSHA1'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>keycloak.realm.otp_policy_type</code>.
     */
    public final TableField<RealmRecord, String> OTP_POLICY_TYPE = createField(DSL.name("otp_policy_type"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("'totp'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>keycloak.realm.browser_flow</code>.
     */
    public final TableField<RealmRecord, String> BROWSER_FLOW = createField(DSL.name("browser_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.registration_flow</code>.
     */
    public final TableField<RealmRecord, String> REGISTRATION_FLOW = createField(DSL.name("registration_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.direct_grant_flow</code>.
     */
    public final TableField<RealmRecord, String> DIRECT_GRANT_FLOW = createField(DSL.name("direct_grant_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.reset_credentials_flow</code>.
     */
    public final TableField<RealmRecord, String> RESET_CREDENTIALS_FLOW = createField(DSL.name("reset_credentials_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.client_auth_flow</code>.
     */
    public final TableField<RealmRecord, String> CLIENT_AUTH_FLOW = createField(DSL.name("client_auth_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.offline_session_idle_timeout</code>.
     */
    public final TableField<RealmRecord, Integer> OFFLINE_SESSION_IDLE_TIMEOUT = createField(DSL.name("offline_session_idle_timeout"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.revoke_refresh_token</code>.
     */
    public final TableField<RealmRecord, Boolean> REVOKE_REFRESH_TOKEN = createField(DSL.name("revoke_refresh_token"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.access_token_life_implicit</code>.
     */
    public final TableField<RealmRecord, Integer> ACCESS_TOKEN_LIFE_IMPLICIT = createField(DSL.name("access_token_life_implicit"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.login_with_email_allowed</code>.
     */
    public final TableField<RealmRecord, Boolean> LOGIN_WITH_EMAIL_ALLOWED = createField(DSL.name("login_with_email_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.duplicate_emails_allowed</code>.
     */
    public final TableField<RealmRecord, Boolean> DUPLICATE_EMAILS_ALLOWED = createField(DSL.name("duplicate_emails_allowed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.docker_auth_flow</code>.
     */
    public final TableField<RealmRecord, String> DOCKER_AUTH_FLOW = createField(DSL.name("docker_auth_flow"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>keycloak.realm.refresh_token_max_reuse</code>.
     */
    public final TableField<RealmRecord, Integer> REFRESH_TOKEN_MAX_REUSE = createField(DSL.name("refresh_token_max_reuse"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.allow_user_managed_access</code>.
     */
    public final TableField<RealmRecord, Boolean> ALLOW_USER_MANAGED_ACCESS = createField(DSL.name("allow_user_managed_access"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>keycloak.realm.sso_max_lifespan_remember_me</code>.
     */
    public final TableField<RealmRecord, Integer> SSO_MAX_LIFESPAN_REMEMBER_ME = createField(DSL.name("sso_max_lifespan_remember_me"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>keycloak.realm.sso_idle_timeout_remember_me</code>.
     */
    public final TableField<RealmRecord, Integer> SSO_IDLE_TIMEOUT_REMEMBER_ME = createField(DSL.name("sso_idle_timeout_remember_me"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>keycloak.realm</code> table reference
     */
    public Realm() {
        this(DSL.name("realm"), null);
    }

    /**
     * Create an aliased <code>keycloak.realm</code> table reference
     */
    public Realm(String alias) {
        this(DSL.name(alias), REALM);
    }

    /**
     * Create an aliased <code>keycloak.realm</code> table reference
     */
    public Realm(Name alias) {
        this(alias, REALM);
    }

    private Realm(Name alias, Table<RealmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Realm(Name alias, Table<RealmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Realm(Table<O> child, ForeignKey<O, RealmRecord> key) {
        super(child, key, REALM);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_REALM_MASTER_ADM_CLI);
    }

    @Override
    public UniqueKey<RealmRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4A;
    }

    @Override
    public List<UniqueKey<RealmRecord>> getKeys() {
        return Arrays.<UniqueKey<RealmRecord>>asList(Keys.CONSTRAINT_4A, Keys.UK_ORVSDMLA56612EAEFIQ6WL5OI);
    }

    @Override
    public Realm as(String alias) {
        return new Realm(DSL.name(alias), this);
    }

    @Override
    public Realm as(Name alias) {
        return new Realm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Realm rename(String name) {
        return new Realm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Realm rename(Name name) {
        return new Realm(name, null);
    }
}
