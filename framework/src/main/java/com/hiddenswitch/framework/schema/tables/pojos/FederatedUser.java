/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IFederatedUser;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FederatedUser implements VertxPojo, IFederatedUser {

    private static final long serialVersionUID = 964917732;

    private String id;
    private String storageProviderId;
    private String realmId;

    public FederatedUser() {}

    public FederatedUser(IFederatedUser value) {
        this.id = value.getId();
        this.storageProviderId = value.getStorageProviderId();
        this.realmId = value.getRealmId();
    }

    public FederatedUser(
        String id,
        String storageProviderId,
        String realmId
    ) {
        this.id = id;
        this.storageProviderId = storageProviderId;
        this.realmId = realmId;
    }

    public FederatedUser(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public FederatedUser setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getStorageProviderId() {
        return this.storageProviderId;
    }

    @Override
    public FederatedUser setStorageProviderId(String storageProviderId) {
        this.storageProviderId = storageProviderId;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public FederatedUser setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FederatedUser (");

        sb.append(id);
        sb.append(", ").append(storageProviderId);
        sb.append(", ").append(realmId);

        sb.append(")");
        return sb.toString();
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
}
