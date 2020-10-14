/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.RequiredActionProvider;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRequiredActionProvider;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RequiredActionProviderRecord extends UpdatableRecordImpl<RequiredActionProviderRecord> implements VertxPojo, Record8<String, String, String, String, Boolean, Boolean, String, Integer>, IRequiredActionProvider {

    private static final long serialVersionUID = 1047306558;

    /**
     * Setter for <code>keycloak.required_action_provider.id</code>.
     */
    @Override
    public RequiredActionProviderRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.alias</code>.
     */
    @Override
    public RequiredActionProviderRecord setAlias(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.alias</code>.
     */
    @Override
    public String getAlias() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.name</code>.
     */
    @Override
    public RequiredActionProviderRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.realm_id</code>.
     */
    @Override
    public RequiredActionProviderRecord setRealmId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.enabled</code>.
     */
    @Override
    public RequiredActionProviderRecord setEnabled(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.enabled</code>.
     */
    @Override
    public Boolean getEnabled() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.default_action</code>.
     */
    @Override
    public RequiredActionProviderRecord setDefaultAction(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.default_action</code>.
     */
    @Override
    public Boolean getDefaultAction() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.provider_id</code>.
     */
    @Override
    public RequiredActionProviderRecord setProviderId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.provider_id</code>.
     */
    @Override
    public String getProviderId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>keycloak.required_action_provider.priority</code>.
     */
    @Override
    public RequiredActionProviderRecord setPriority(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.required_action_provider.priority</code>.
     */
    @Override
    public Integer getPriority() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, Boolean, Boolean, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, Boolean, Boolean, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.ID;
    }

    @Override
    public Field<String> field2() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.ALIAS;
    }

    @Override
    public Field<String> field3() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.NAME;
    }

    @Override
    public Field<String> field4() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.REALM_ID;
    }

    @Override
    public Field<Boolean> field5() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.ENABLED;
    }

    @Override
    public Field<Boolean> field6() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.DEFAULT_ACTION;
    }

    @Override
    public Field<String> field7() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.PROVIDER_ID;
    }

    @Override
    public Field<Integer> field8() {
        return RequiredActionProvider.REQUIRED_ACTION_PROVIDER.PRIORITY;
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
        return getName();
    }

    @Override
    public String component4() {
        return getRealmId();
    }

    @Override
    public Boolean component5() {
        return getEnabled();
    }

    @Override
    public Boolean component6() {
        return getDefaultAction();
    }

    @Override
    public String component7() {
        return getProviderId();
    }

    @Override
    public Integer component8() {
        return getPriority();
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
        return getName();
    }

    @Override
    public String value4() {
        return getRealmId();
    }

    @Override
    public Boolean value5() {
        return getEnabled();
    }

    @Override
    public Boolean value6() {
        return getDefaultAction();
    }

    @Override
    public String value7() {
        return getProviderId();
    }

    @Override
    public Integer value8() {
        return getPriority();
    }

    @Override
    public RequiredActionProviderRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value2(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value4(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value5(Boolean value) {
        setEnabled(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value6(Boolean value) {
        setDefaultAction(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value7(String value) {
        setProviderId(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord value8(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public RequiredActionProviderRecord values(String value1, String value2, String value3, String value4, Boolean value5, Boolean value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRequiredActionProvider from) {
        setId(from.getId());
        setAlias(from.getAlias());
        setName(from.getName());
        setRealmId(from.getRealmId());
        setEnabled(from.getEnabled());
        setDefaultAction(from.getDefaultAction());
        setProviderId(from.getProviderId());
        setPriority(from.getPriority());
    }

    @Override
    public <E extends IRequiredActionProvider> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RequiredActionProviderRecord
     */
    public RequiredActionProviderRecord() {
        super(RequiredActionProvider.REQUIRED_ACTION_PROVIDER);
    }

    /**
     * Create a detached, initialised RequiredActionProviderRecord
     */
    public RequiredActionProviderRecord(String id, String alias, String name, String realmId, Boolean enabled, Boolean defaultAction, String providerId, Integer priority) {
        super(RequiredActionProvider.REQUIRED_ACTION_PROVIDER);

        set(0, id);
        set(1, alias);
        set(2, name);
        set(3, realmId);
        set(4, enabled);
        set(5, defaultAction);
        set(6, providerId);
        set(7, priority);
    }

    public RequiredActionProviderRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
