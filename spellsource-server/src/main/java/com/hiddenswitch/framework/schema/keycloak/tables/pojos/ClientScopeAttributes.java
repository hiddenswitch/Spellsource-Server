/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IClientScopeAttributes;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientScopeAttributes implements VertxPojo, IClientScopeAttributes {

    private static final long serialVersionUID = 1233468485;

    private String scopeId;
    private String value;
    private String name;

    public ClientScopeAttributes() {}

    public ClientScopeAttributes(IClientScopeAttributes value) {
        this.scopeId = value.getScopeId();
        this.value = value.getValue();
        this.name = value.getName();
    }

    public ClientScopeAttributes(
        String scopeId,
        String value,
        String name
    ) {
        this.scopeId = scopeId;
        this.value = value;
        this.name = name;
    }

    public ClientScopeAttributes(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getScopeId() {
        return this.scopeId;
    }

    @Override
    public ClientScopeAttributes setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public ClientScopeAttributes setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ClientScopeAttributes setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientScopeAttributes (");

        sb.append(scopeId);
        sb.append(", ").append(value);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClientScopeAttributes from) {
        setScopeId(from.getScopeId());
        setValue(from.getValue());
        setName(from.getName());
    }

    @Override
    public <E extends IClientScopeAttributes> E into(E into) {
        into.from(this);
        return into;
    }
}
