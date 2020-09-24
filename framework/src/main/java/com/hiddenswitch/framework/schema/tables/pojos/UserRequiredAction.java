/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.IUserRequiredAction;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRequiredAction implements VertxPojo, IUserRequiredAction {

    private static final long serialVersionUID = -66871562;

    private String userId;
    private String requiredAction;

    public UserRequiredAction() {}

    public UserRequiredAction(IUserRequiredAction value) {
        this.userId = value.getUserId();
        this.requiredAction = value.getRequiredAction();
    }

    public UserRequiredAction(
        String userId,
        String requiredAction
    ) {
        this.userId = userId;
        this.requiredAction = requiredAction;
    }

    public UserRequiredAction(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public UserRequiredAction setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getRequiredAction() {
        return this.requiredAction;
    }

    @Override
    public UserRequiredAction setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserRequiredAction (");

        sb.append(userId);
        sb.append(", ").append(requiredAction);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserRequiredAction from) {
        setUserId(from.getUserId());
        setRequiredAction(from.getRequiredAction());
    }

    @Override
    public <E extends IUserRequiredAction> E into(E into) {
        into.from(this);
        return into;
    }
}
