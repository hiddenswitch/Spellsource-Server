/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.OfflineClientSession;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IOfflineClientSession;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfflineClientSessionRecord extends UpdatableRecordImpl<OfflineClientSessionRecord> implements VertxPojo, Record7<String, String, String, Integer, String, String, String>, IOfflineClientSession {

    private static final long serialVersionUID = -1835662481;

    /**
     * Setter for <code>keycloak.offline_client_session.user_session_id</code>.
     */
    @Override
    public OfflineClientSessionRecord setUserSessionId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.user_session_id</code>.
     */
    @Override
    public String getUserSessionId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.client_id</code>.
     */
    @Override
    public OfflineClientSessionRecord setClientId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.client_id</code>.
     */
    @Override
    public String getClientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.offline_flag</code>.
     */
    @Override
    public OfflineClientSessionRecord setOfflineFlag(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.offline_flag</code>.
     */
    @Override
    public String getOfflineFlag() {
        return (String) get(2);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.timestamp</code>.
     */
    @Override
    public OfflineClientSessionRecord setTimestamp(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.timestamp</code>.
     */
    @Override
    public Integer getTimestamp() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.data</code>.
     */
    @Override
    public OfflineClientSessionRecord setData(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.data</code>.
     */
    @Override
    public String getData() {
        return (String) get(4);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.client_storage_provider</code>.
     */
    @Override
    public OfflineClientSessionRecord setClientStorageProvider(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.client_storage_provider</code>.
     */
    @Override
    public String getClientStorageProvider() {
        return (String) get(5);
    }

    /**
     * Setter for <code>keycloak.offline_client_session.external_client_id</code>.
     */
    @Override
    public OfflineClientSessionRecord setExternalClientId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.offline_client_session.external_client_id</code>.
     */
    @Override
    public String getExternalClientId() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, String, String, String, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, Integer, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.USER_SESSION_ID;
    }

    @Override
    public Field<String> field2() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.CLIENT_ID;
    }

    @Override
    public Field<String> field3() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.OFFLINE_FLAG;
    }

    @Override
    public Field<Integer> field4() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.TIMESTAMP;
    }

    @Override
    public Field<String> field5() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.DATA;
    }

    @Override
    public Field<String> field6() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.CLIENT_STORAGE_PROVIDER;
    }

    @Override
    public Field<String> field7() {
        return OfflineClientSession.OFFLINE_CLIENT_SESSION.EXTERNAL_CLIENT_ID;
    }

    @Override
    public String component1() {
        return getUserSessionId();
    }

    @Override
    public String component2() {
        return getClientId();
    }

    @Override
    public String component3() {
        return getOfflineFlag();
    }

    @Override
    public Integer component4() {
        return getTimestamp();
    }

    @Override
    public String component5() {
        return getData();
    }

    @Override
    public String component6() {
        return getClientStorageProvider();
    }

    @Override
    public String component7() {
        return getExternalClientId();
    }

    @Override
    public String value1() {
        return getUserSessionId();
    }

    @Override
    public String value2() {
        return getClientId();
    }

    @Override
    public String value3() {
        return getOfflineFlag();
    }

    @Override
    public Integer value4() {
        return getTimestamp();
    }

    @Override
    public String value5() {
        return getData();
    }

    @Override
    public String value6() {
        return getClientStorageProvider();
    }

    @Override
    public String value7() {
        return getExternalClientId();
    }

    @Override
    public OfflineClientSessionRecord value1(String value) {
        setUserSessionId(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value2(String value) {
        setClientId(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value3(String value) {
        setOfflineFlag(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value4(Integer value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value5(String value) {
        setData(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value6(String value) {
        setClientStorageProvider(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord value7(String value) {
        setExternalClientId(value);
        return this;
    }

    @Override
    public OfflineClientSessionRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, String value7) {
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
    public void from(IOfflineClientSession from) {
        setUserSessionId(from.getUserSessionId());
        setClientId(from.getClientId());
        setOfflineFlag(from.getOfflineFlag());
        setTimestamp(from.getTimestamp());
        setData(from.getData());
        setClientStorageProvider(from.getClientStorageProvider());
        setExternalClientId(from.getExternalClientId());
    }

    @Override
    public <E extends IOfflineClientSession> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OfflineClientSessionRecord
     */
    public OfflineClientSessionRecord() {
        super(OfflineClientSession.OFFLINE_CLIENT_SESSION);
    }

    /**
     * Create a detached, initialised OfflineClientSessionRecord
     */
    public OfflineClientSessionRecord(String userSessionId, String clientId, String offlineFlag, Integer timestamp, String data, String clientStorageProvider, String externalClientId) {
        super(OfflineClientSession.OFFLINE_CLIENT_SESSION);

        set(0, userSessionId);
        set(1, clientId);
        set(2, offlineFlag);
        set(3, timestamp);
        set(4, data);
        set(5, clientStorageProvider);
        set(6, externalClientId);
    }

    public OfflineClientSessionRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
