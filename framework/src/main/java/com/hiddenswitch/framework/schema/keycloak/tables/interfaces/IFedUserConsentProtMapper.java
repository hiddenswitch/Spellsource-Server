/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFedUserConsentProtMapper extends VertxPojo, Serializable {

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFedUserConsentProtMapper
     */
    public void from(IFedUserConsentProtMapper from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFedUserConsentProtMapper
     */
    public <E extends IFedUserConsentProtMapper> E into(E into);

    @Override
    public default IFedUserConsentProtMapper fromJson(io.vertx.core.json.JsonObject json) {
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        return json;
    }

}
