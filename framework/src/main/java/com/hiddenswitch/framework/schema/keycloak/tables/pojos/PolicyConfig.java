/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IPolicyConfig;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PolicyConfig implements VertxPojo, IPolicyConfig {

    private static final long serialVersionUID = -1958427733;

    private String policyId;
    private String name;
    private String value;

    public PolicyConfig() {}

    public PolicyConfig(IPolicyConfig value) {
        this.policyId = value.getPolicyId();
        this.name = value.getName();
        this.value = value.getValue();
    }

    public PolicyConfig(
        String policyId,
        String name,
        String value
    ) {
        this.policyId = policyId;
        this.name = name;
        this.value = value;
    }

    public PolicyConfig(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getPolicyId() {
        return this.policyId;
    }

    @Override
    public PolicyConfig setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public PolicyConfig setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public PolicyConfig setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolicyConfig (");

        sb.append(policyId);
        sb.append(", ").append(name);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPolicyConfig from) {
        setPolicyId(from.getPolicyId());
        setName(from.getName());
        setValue(from.getValue());
    }

    @Override
    public <E extends IPolicyConfig> E into(E into) {
        into.from(this);
        return into;
    }
}
