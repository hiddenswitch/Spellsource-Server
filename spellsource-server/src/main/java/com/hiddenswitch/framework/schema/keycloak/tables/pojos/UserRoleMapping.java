/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IUserRoleMapping;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRoleMapping implements VertxPojo, IUserRoleMapping {

    private static final long serialVersionUID = -634541035;

    private String roleId;
    private String userId;

    public UserRoleMapping() {}

    public UserRoleMapping(IUserRoleMapping value) {
        this.roleId = value.getRoleId();
        this.userId = value.getUserId();
    }

    public UserRoleMapping(
        String roleId,
        String userId
    ) {
        this.roleId = roleId;
        this.userId = userId;
    }

    public UserRoleMapping(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getRoleId() {
        return this.roleId;
    }

    @Override
    public UserRoleMapping setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public UserRoleMapping setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserRoleMapping (");

        sb.append(roleId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserRoleMapping from) {
        setRoleId(from.getRoleId());
        setUserId(from.getUserId());
    }

    @Override
    public <E extends IUserRoleMapping> E into(E into) {
        into.from(this);
        return into;
    }
}