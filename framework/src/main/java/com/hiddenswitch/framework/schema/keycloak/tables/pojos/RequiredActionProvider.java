/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRequiredActionProvider;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RequiredActionProvider implements VertxPojo, IRequiredActionProvider {

    private static final long serialVersionUID = 828536465;

    private String  id;
    private String  alias;
    private String  name;
    private String  realmId;
    private Boolean enabled;
    private Boolean defaultAction;
    private String  providerId;
    private Integer priority;

    public RequiredActionProvider() {}

    public RequiredActionProvider(IRequiredActionProvider value) {
        this.id = value.getId();
        this.alias = value.getAlias();
        this.name = value.getName();
        this.realmId = value.getRealmId();
        this.enabled = value.getEnabled();
        this.defaultAction = value.getDefaultAction();
        this.providerId = value.getProviderId();
        this.priority = value.getPriority();
    }

    public RequiredActionProvider(
        String  id,
        String  alias,
        String  name,
        String  realmId,
        Boolean enabled,
        Boolean defaultAction,
        String  providerId,
        Integer priority
    ) {
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.realmId = realmId;
        this.enabled = enabled;
        this.defaultAction = defaultAction;
        this.providerId = providerId;
        this.priority = priority;
    }

    public RequiredActionProvider(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public RequiredActionProvider setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getAlias() {
        return this.alias;
    }

    @Override
    public RequiredActionProvider setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public RequiredActionProvider setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getRealmId() {
        return this.realmId;
    }

    @Override
    public RequiredActionProvider setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }

    @Override
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public RequiredActionProvider setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public Boolean getDefaultAction() {
        return this.defaultAction;
    }

    @Override
    public RequiredActionProvider setDefaultAction(Boolean defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    @Override
    public String getProviderId() {
        return this.providerId;
    }

    @Override
    public RequiredActionProvider setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public RequiredActionProvider setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RequiredActionProvider (");

        sb.append(id);
        sb.append(", ").append(alias);
        sb.append(", ").append(name);
        sb.append(", ").append(realmId);
        sb.append(", ").append(enabled);
        sb.append(", ").append(defaultAction);
        sb.append(", ").append(providerId);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
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
}
