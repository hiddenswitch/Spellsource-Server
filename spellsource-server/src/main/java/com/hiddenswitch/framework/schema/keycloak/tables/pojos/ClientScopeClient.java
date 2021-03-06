/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IClientScopeClient;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientScopeClient implements VertxPojo, IClientScopeClient {

    private static final long serialVersionUID = 1968104478;

    private String  clientId;
    private String  scopeId;
    private Boolean defaultScope;

    public ClientScopeClient() {}

    public ClientScopeClient(IClientScopeClient value) {
        this.clientId = value.getClientId();
        this.scopeId = value.getScopeId();
        this.defaultScope = value.getDefaultScope();
    }

    public ClientScopeClient(
        String  clientId,
        String  scopeId,
        Boolean defaultScope
    ) {
        this.clientId = clientId;
        this.scopeId = scopeId;
        this.defaultScope = defaultScope;
    }

    public ClientScopeClient(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public ClientScopeClient setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    @Override
    public String getScopeId() {
        return this.scopeId;
    }

    @Override
    public ClientScopeClient setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    @Override
    public Boolean getDefaultScope() {
        return this.defaultScope;
    }

    @Override
    public ClientScopeClient setDefaultScope(Boolean defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientScopeClient (");

        sb.append(clientId);
        sb.append(", ").append(scopeId);
        sb.append(", ").append(defaultScope);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClientScopeClient from) {
        setClientId(from.getClientId());
        setScopeId(from.getScopeId());
        setDefaultScope(from.getDefaultScope());
    }

    @Override
    public <E extends IClientScopeClient> E into(E into) {
        into.from(this);
        return into;
    }
}
