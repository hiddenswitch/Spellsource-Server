/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.UserConsentProtMapper;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IUserConsentProtMapper;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserConsentProtMapperRecord extends TableRecordImpl<UserConsentProtMapperRecord> implements VertxPojo, IUserConsentProtMapper {

    private static final long serialVersionUID = 1608509214;

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserConsentProtMapper from) {
    }

    @Override
    public <E extends IUserConsentProtMapper> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserConsentProtMapperRecord
     */
    public UserConsentProtMapperRecord() {
        super(UserConsentProtMapper.USER_CONSENT_PROT_MAPPER);
    }

    public UserConsentProtMapperRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
