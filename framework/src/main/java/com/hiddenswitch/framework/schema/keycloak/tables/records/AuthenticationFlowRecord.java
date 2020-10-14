/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.AuthenticationFlow;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IAuthenticationFlow;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthenticationFlowRecord extends UpdatableRecordImpl<AuthenticationFlowRecord> implements VertxPojo, Record7<String, String, String, String, String, Boolean, Boolean>, IAuthenticationFlow {

    private static final long serialVersionUID = 248430510;

    /**
     * Setter for <code>keycloak.authentication_flow.id</code>.
     */
    @Override
    public AuthenticationFlowRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.alias</code>.
     */
    @Override
    public AuthenticationFlowRecord setAlias(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.alias</code>.
     */
    @Override
    public String getAlias() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.description</code>.
     */
    @Override
    public AuthenticationFlowRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.realm_id</code>.
     */
    @Override
    public AuthenticationFlowRecord setRealmId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.provider_id</code>.
     */
    @Override
    public AuthenticationFlowRecord setProviderId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.provider_id</code>.
     */
    @Override
    public String getProviderId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.top_level</code>.
     */
    @Override
    public AuthenticationFlowRecord setTopLevel(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.top_level</code>.
     */
    @Override
    public Boolean getTopLevel() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>keycloak.authentication_flow.built_in</code>.
     */
    @Override
    public AuthenticationFlowRecord setBuiltIn(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.authentication_flow.built_in</code>.
     */
    @Override
    public Boolean getBuiltIn() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, Boolean, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.ID;
    }

    @Override
    public Field<String> field2() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.ALIAS;
    }

    @Override
    public Field<String> field3() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.REALM_ID;
    }

    @Override
    public Field<String> field5() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.PROVIDER_ID;
    }

    @Override
    public Field<Boolean> field6() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.TOP_LEVEL;
    }

    @Override
    public Field<Boolean> field7() {
        return AuthenticationFlow.AUTHENTICATION_FLOW.BUILT_IN;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAlias();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public String component4() {
        return getRealmId();
    }

    @Override
    public String component5() {
        return getProviderId();
    }

    @Override
    public Boolean component6() {
        return getTopLevel();
    }

    @Override
    public Boolean component7() {
        return getBuiltIn();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAlias();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public String value4() {
        return getRealmId();
    }

    @Override
    public String value5() {
        return getProviderId();
    }

    @Override
    public Boolean value6() {
        return getTopLevel();
    }

    @Override
    public Boolean value7() {
        return getBuiltIn();
    }

    @Override
    public AuthenticationFlowRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value2(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value4(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value5(String value) {
        setProviderId(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value6(Boolean value) {
        setTopLevel(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord value7(Boolean value) {
        setBuiltIn(value);
        return this;
    }

    @Override
    public AuthenticationFlowRecord values(String value1, String value2, String value3, String value4, String value5, Boolean value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IAuthenticationFlow from) {
        setId(from.getId());
        setAlias(from.getAlias());
        setDescription(from.getDescription());
        setRealmId(from.getRealmId());
        setProviderId(from.getProviderId());
        setTopLevel(from.getTopLevel());
        setBuiltIn(from.getBuiltIn());
    }

    @Override
    public <E extends IAuthenticationFlow> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthenticationFlowRecord
     */
    public AuthenticationFlowRecord() {
        super(AuthenticationFlow.AUTHENTICATION_FLOW);
    }

    /**
     * Create a detached, initialised AuthenticationFlowRecord
     */
    public AuthenticationFlowRecord(String id, String alias, String description, String realmId, String providerId, Boolean topLevel, Boolean builtIn) {
        super(AuthenticationFlow.AUTHENTICATION_FLOW);

        set(0, id);
        set(1, alias);
        set(2, description);
        set(3, realmId);
        set(4, providerId);
        set(5, topLevel);
        set(6, builtIn);
    }

    public AuthenticationFlowRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
