/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IUserConsentClientScope;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserConsentClientScope implements VertxPojo, IUserConsentClientScope {

    private static final long serialVersionUID = 349975626;

    private String userConsentId;
    private String scopeId;

    public UserConsentClientScope() {}

    public UserConsentClientScope(IUserConsentClientScope value) {
        this.userConsentId = value.getUserConsentId();
        this.scopeId = value.getScopeId();
    }

    public UserConsentClientScope(
        String userConsentId,
        String scopeId
    ) {
        this.userConsentId = userConsentId;
        this.scopeId = scopeId;
    }

    public UserConsentClientScope(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getUserConsentId() {
        return this.userConsentId;
    }

    @Override
    public UserConsentClientScope setUserConsentId(String userConsentId) {
        this.userConsentId = userConsentId;
        return this;
    }

    @Override
    public String getScopeId() {
        return this.scopeId;
    }

    @Override
    public UserConsentClientScope setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserConsentClientScope (");

        sb.append(userConsentId);
        sb.append(", ").append(scopeId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserConsentClientScope from) {
        setUserConsentId(from.getUserConsentId());
        setScopeId(from.getScopeId());
    }

    @Override
    public <E extends IUserConsentClientScope> E into(E into) {
        into.from(this);
        return into;
    }
}
