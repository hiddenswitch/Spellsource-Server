/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.records;


import com.hiddenswitch.framework.schema.tables.FedUserGroupMembership;
import com.hiddenswitch.framework.schema.tables.interfaces.IFedUserGroupMembership;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FedUserGroupMembershipRecord extends UpdatableRecordImpl<FedUserGroupMembershipRecord> implements VertxPojo, Record4<String, String, String, String>, IFedUserGroupMembership {

    private static final long serialVersionUID = 1996799944;

    /**
     * Setter for <code>public.fed_user_group_membership.group_id</code>.
     */
    @Override
    public FedUserGroupMembershipRecord setGroupId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_group_membership.group_id</code>.
     */
    @Override
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.fed_user_group_membership.user_id</code>.
     */
    @Override
    public FedUserGroupMembershipRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_group_membership.user_id</code>.
     */
    @Override
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.fed_user_group_membership.realm_id</code>.
     */
    @Override
    public FedUserGroupMembershipRecord setRealmId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_group_membership.realm_id</code>.
     */
    @Override
    public String getRealmId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.fed_user_group_membership.storage_provider_id</code>.
     */
    @Override
    public FedUserGroupMembershipRecord setStorageProviderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.fed_user_group_membership.storage_provider_id</code>.
     */
    @Override
    public String getStorageProviderId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.GROUP_ID;
    }

    @Override
    public Field<String> field2() {
        return FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.REALM_ID;
    }

    @Override
    public Field<String> field4() {
        return FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP.STORAGE_PROVIDER_ID;
    }

    @Override
    public String component1() {
        return getGroupId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getRealmId();
    }

    @Override
    public String component4() {
        return getStorageProviderId();
    }

    @Override
    public String value1() {
        return getGroupId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getRealmId();
    }

    @Override
    public String value4() {
        return getStorageProviderId();
    }

    @Override
    public FedUserGroupMembershipRecord value1(String value) {
        setGroupId(value);
        return this;
    }

    @Override
    public FedUserGroupMembershipRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public FedUserGroupMembershipRecord value3(String value) {
        setRealmId(value);
        return this;
    }

    @Override
    public FedUserGroupMembershipRecord value4(String value) {
        setStorageProviderId(value);
        return this;
    }

    @Override
    public FedUserGroupMembershipRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFedUserGroupMembership from) {
        setGroupId(from.getGroupId());
        setUserId(from.getUserId());
        setRealmId(from.getRealmId());
        setStorageProviderId(from.getStorageProviderId());
    }

    @Override
    public <E extends IFedUserGroupMembership> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FedUserGroupMembershipRecord
     */
    public FedUserGroupMembershipRecord() {
        super(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP);
    }

    /**
     * Create a detached, initialised FedUserGroupMembershipRecord
     */
    public FedUserGroupMembershipRecord(String groupId, String userId, String realmId, String storageProviderId) {
        super(FedUserGroupMembership.FED_USER_GROUP_MEMBERSHIP);

        set(0, groupId);
        set(1, userId);
        set(2, realmId);
        set(3, storageProviderId);
    }

    public FedUserGroupMembershipRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
