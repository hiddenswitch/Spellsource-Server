/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.FederatedUser;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IFederatedUser;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FederatedUserRecord extends UpdatableRecordImpl<FederatedUserRecord> implements VertxPojo, Record3<String, String, String>, IFederatedUser {

    private static final long serialVersionUID = -887738846;

    /**
     * Setter for <code>keycloak.federated_user.id</code>.
     */
    @Override
    public FederatedUserRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.federated_user.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.federated_user.storage_provider_id</code>.
     */
    @Override
    public FederatedUserRecord setStorageProviderId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.federated_user.storage_provider_id</code>.
     */
    @Override
    public String getStorageProviderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.federated_user.realm_id</code>.
     */
    @Override
    public FederatedUserRecord setRealmId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.federated_user.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
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
        return FederatedUser.FEDERATED_USER.ID;
    }

    @Override
    public Field<String> field2() {
        return FederatedUser.FEDERATED_USER.STORAGE_PROVIDER_ID;
    }

    @Override
    public Field<String> field3() {
        return FederatedUser.FEDERATED_USER.REALM_ID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getStorageProviderId();
    }

    @Override
    public String component3() {
        return getRealmId();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getStorageProviderId();
    }

    @Override
    public String value3() {
        return getRealmId();
    }

    @Override
    public FederatedUserRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public FederatedUserRecord value2(String value) {
        setStorageProviderId(value);
        return this;
    }

    @Override
    public FederatedUserRecord value3(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public FederatedUserRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFederatedUser from) {
        setId(from.getId());
        setStorageProviderId(from.getStorageProviderId());
        setRealmId(from.getRealmId());
    }

    @Override
    public <E extends IFederatedUser> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FederatedUserRecord
     */
    public FederatedUserRecord() {
        super(FederatedUser.FEDERATED_USER);
    }

    /**
     * Create a detached, initialised FederatedUserRecord
     */
    public FederatedUserRecord(String id, String storageProviderId, String realmId) {
        super(FederatedUser.FEDERATED_USER);

        set(0, id);
        set(1, storageProviderId);
        set(2, realmId);
    }

    public FederatedUserRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
