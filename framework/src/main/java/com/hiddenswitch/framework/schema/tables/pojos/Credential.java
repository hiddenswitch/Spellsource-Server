/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.ICredential;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Credential implements VertxPojo, ICredential {

    private static final long serialVersionUID = -121988140;

    private String  id;
    private byte[]  salt;
    private String  type;
    private String  userId;
    private Long    createdDate;
    private String  userLabel;
    private String  secretData;
    private String  credentialData;
    private Integer priority;

    public Credential() {}

    public Credential(ICredential value) {
        this.id = value.getId();
        this.salt = value.getSalt();
        this.type = value.getType();
        this.userId = value.getUserId();
        this.createdDate = value.getCreatedDate();
        this.userLabel = value.getUserLabel();
        this.secretData = value.getSecretData();
        this.credentialData = value.getCredentialData();
        this.priority = value.getPriority();
    }

    public Credential(
        String  id,
        byte[]  salt,
        String  type,
        String  userId,
        Long    createdDate,
        String  userLabel,
        String  secretData,
        String  credentialData,
        Integer priority
    ) {
        this.id = id;
        this.salt = salt;
        this.type = type;
        this.userId = userId;
        this.createdDate = createdDate;
        this.userLabel = userLabel;
        this.secretData = secretData;
        this.credentialData = credentialData;
        this.priority = priority;
    }

    public Credential(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Credential setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public byte[] getSalt() {
        return this.salt;
    }

    @Override
    public Credential setSalt(byte[] salt) {
        this.salt = salt;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Credential setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public Credential setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public Long getCreatedDate() {
        return this.createdDate;
    }

    @Override
    public Credential setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public String getUserLabel() {
        return this.userLabel;
    }

    @Override
    public Credential setUserLabel(String userLabel) {
        this.userLabel = userLabel;
        return this;
    }

    @Override
    public String getSecretData() {
        return this.secretData;
    }

    @Override
    public Credential setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }

    @Override
    public String getCredentialData() {
        return this.credentialData;
    }

    @Override
    public Credential setCredentialData(String credentialData) {
        this.credentialData = credentialData;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public Credential setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Credential (");

        sb.append(id);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(type);
        sb.append(", ").append(userId);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(userLabel);
        sb.append(", ").append(secretData);
        sb.append(", ").append(credentialData);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICredential from) {
        setId(from.getId());
        setSalt(from.getSalt());
        setType(from.getType());
        setUserId(from.getUserId());
        setCreatedDate(from.getCreatedDate());
        setUserLabel(from.getUserLabel());
        setSecretData(from.getSecretData());
        setCredentialData(from.getCredentialData());
        setPriority(from.getPriority());
    }

    @Override
    public <E extends ICredential> E into(E into) {
        into.from(this);
        return into;
    }
}
