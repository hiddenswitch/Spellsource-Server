/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IUserEntityAddons;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEntityAddons implements VertxPojo, IUserEntityAddons {

    private static final long serialVersionUID = 877301895;

    private String  id;
    private String  privacyToken;
    private Boolean migrated;

    public UserEntityAddons() {}

    public UserEntityAddons(IUserEntityAddons value) {
        this.id = value.getId();
        this.privacyToken = value.getPrivacyToken();
        this.migrated = value.getMigrated();
    }

    public UserEntityAddons(
        String  id,
        String  privacyToken,
        Boolean migrated
    ) {
        this.id = id;
        this.privacyToken = privacyToken;
        this.migrated = migrated;
    }

    public UserEntityAddons(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public UserEntityAddons setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getPrivacyToken() {
        return this.privacyToken;
    }

    @Override
    public UserEntityAddons setPrivacyToken(String privacyToken) {
        this.privacyToken = privacyToken;
        return this;
    }

    @Override
    public Boolean getMigrated() {
        return this.migrated;
    }

    @Override
    public UserEntityAddons setMigrated(Boolean migrated) {
        this.migrated = migrated;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserEntityAddons (");

        sb.append(id);
        sb.append(", ").append(privacyToken);
        sb.append(", ").append(migrated);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserEntityAddons from) {
        setId(from.getId());
        setPrivacyToken(from.getPrivacyToken());
        setMigrated(from.getMigrated());
    }

    @Override
    public <E extends IUserEntityAddons> E into(E into) {
        into.from(this);
        return into;
    }
}