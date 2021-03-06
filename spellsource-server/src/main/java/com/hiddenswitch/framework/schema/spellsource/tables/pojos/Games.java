/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.enums.GameStateEnum;
import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IGames;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;

import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Games implements VertxPojo, IGames {

    private static final long serialVersionUID = 541959188;

    private Long           id;
    private GameStateEnum  status;
    private String         gitHash;
    private JsonObject     trace;
    private OffsetDateTime createdAt;

    public Games() {}

    public Games(IGames value) {
        this.id = value.getId();
        this.status = value.getStatus();
        this.gitHash = value.getGitHash();
        this.trace = value.getTrace();
        this.createdAt = value.getCreatedAt();
    }

    public Games(
        Long           id,
        GameStateEnum  status,
        String         gitHash,
        JsonObject     trace,
        OffsetDateTime createdAt
    ) {
        this.id = id;
        this.status = status;
        this.gitHash = gitHash;
        this.trace = trace;
        this.createdAt = createdAt;
    }

    public Games(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Games setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public GameStateEnum getStatus() {
        return this.status;
    }

    @Override
    public Games setStatus(GameStateEnum status) {
        this.status = status;
        return this;
    }

    @Override
    public String getGitHash() {
        return this.gitHash;
    }

    @Override
    public Games setGitHash(String gitHash) {
        this.gitHash = gitHash;
        return this;
    }

    @Override
    public JsonObject getTrace() {
        return this.trace;
    }

    @Override
    public Games setTrace(JsonObject trace) {
        this.trace = trace;
        return this;
    }

    @Override
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Games setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Games (");

        sb.append(id);
        sb.append(", ").append(status);
        sb.append(", ").append(gitHash);
        sb.append(", ").append(trace);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IGames from) {
        setId(from.getId());
        setStatus(from.getStatus());
        setGitHash(from.getGitHash());
        setTrace(from.getTrace());
        setCreatedAt(from.getCreatedAt());
    }

    @Override
    public <E extends IGames> E into(E into) {
        into.from(this);
        return into;
    }
}
