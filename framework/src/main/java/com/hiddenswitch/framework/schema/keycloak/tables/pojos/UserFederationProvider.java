/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IUserFederationProvider;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserFederationProvider implements VertxPojo, IUserFederationProvider {

    private static final long serialVersionUID = 1166956304;

    private String  id;
    private Integer changedSyncPeriod;
    private String  displayName;
    private Integer fullSyncPeriod;
    private Integer lastSync;
    private Integer priority;
    private String  providerName;
    private String  realmId;

    public UserFederationProvider() {}

    public UserFederationProvider(IUserFederationProvider value) {
        this.id = value.getId();
        this.changedSyncPeriod = value.getChangedSyncPeriod();
        this.displayName = value.getDisplayName();
        this.fullSyncPeriod = value.getFullSyncPeriod();
        this.lastSync = value.getLastSync();
        this.priority = value.getPriority();
        this.providerName = value.getProviderName();
        this.realmId = value.getRealmId();
    }

    public UserFederationProvider(
        String  id,
        Integer changedSyncPeriod,
        String  displayName,
        Integer fullSyncPeriod,
        Integer lastSync,
        Integer priority,
        String  providerName,
        String  realmId
    ) {
        this.id = id;
        this.changedSyncPeriod = changedSyncPeriod;
        this.displayName = displayName;
        this.fullSyncPeriod = fullSyncPeriod;
        this.lastSync = lastSync;
        this.priority = priority;
        this.providerName = providerName;
        this.realmId = realmId;
    }

    public UserFederationProvider(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public UserFederationProvider setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Integer getChangedSyncPeriod() {
        return this.changedSyncPeriod;
    }

    @Override
    public UserFederationProvider setChangedSyncPeriod(Integer changedSyncPeriod) {
        this.changedSyncPeriod = changedSyncPeriod;
        return this;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public UserFederationProvider setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public Integer getFullSyncPeriod() {
        return this.fullSyncPeriod;
    }

    @Override
    public UserFederationProvider setFullSyncPeriod(Integer fullSyncPeriod) {
        this.fullSyncPeriod = fullSyncPeriod;
        return this;
    }

    @Override
    public Integer getLastSync() {
        return this.lastSync;
    }

    @Override
    public UserFederationProvider setLastSync(Integer lastSync) {
        this.lastSync = lastSync;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public UserFederationProvider setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String getProviderName() {
        return this.providerName;
    }

    @Override
    public UserFederationProvider setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public UserFederationProvider setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserFederationProvider (");

        sb.append(id);
        sb.append(", ").append(changedSyncPeriod);
        sb.append(", ").append(displayName);
        sb.append(", ").append(fullSyncPeriod);
        sb.append(", ").append(lastSync);
        sb.append(", ").append(priority);
        sb.append(", ").append(providerName);
        sb.append(", ").append(realmId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserFederationProvider from) {
        setId(from.getId());
        setChangedSyncPeriod(from.getChangedSyncPeriod());
        setDisplayName(from.getDisplayName());
        setFullSyncPeriod(from.getFullSyncPeriod());
        setLastSync(from.getLastSync());
        setPriority(from.getPriority());
        setProviderName(from.getProviderName());
        setRealmId(from.getRealmId());
    }

    @Override
    public <E extends IUserFederationProvider> E into(E into) {
        into.from(this);
        return into;
    }
}
