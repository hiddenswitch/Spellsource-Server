/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.pojos;


import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IDatabasechangelog;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Databasechangelog implements VertxPojo, IDatabasechangelog {

    private static final long serialVersionUID = -87996236;

    private String        id;
    private String        author;
    private String        filename;
    private LocalDateTime dateexecuted;
    private Integer       orderexecuted;
    private String        exectype;
    private String        md5sum;
    private String        description;
    private String        comments;
    private String        tag;
    private String        liquibase;
    private String        contexts;
    private String        labels;
    private String        deploymentId;

    public Databasechangelog() {}

    public Databasechangelog(IDatabasechangelog value) {
        this.id = value.getId();
        this.author = value.getAuthor();
        this.filename = value.getFilename();
        this.dateexecuted = value.getDateexecuted();
        this.orderexecuted = value.getOrderexecuted();
        this.exectype = value.getExectype();
        this.md5sum = value.getMd5sum();
        this.description = value.getDescription();
        this.comments = value.getComments();
        this.tag = value.getTag();
        this.liquibase = value.getLiquibase();
        this.contexts = value.getContexts();
        this.labels = value.getLabels();
        this.deploymentId = value.getDeploymentId();
    }

    public Databasechangelog(
        String        id,
        String        author,
        String        filename,
        LocalDateTime dateexecuted,
        Integer       orderexecuted,
        String        exectype,
        String        md5sum,
        String        description,
        String        comments,
        String        tag,
        String        liquibase,
        String        contexts,
        String        labels,
        String        deploymentId
    ) {
        this.id = id;
        this.author = author;
        this.filename = filename;
        this.dateexecuted = dateexecuted;
        this.orderexecuted = orderexecuted;
        this.exectype = exectype;
        this.md5sum = md5sum;
        this.description = description;
        this.comments = comments;
        this.tag = tag;
        this.liquibase = liquibase;
        this.contexts = contexts;
        this.labels = labels;
        this.deploymentId = deploymentId;
    }

    public Databasechangelog(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Databasechangelog setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public Databasechangelog setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String getFilename() {
        return this.filename;
    }

    @Override
    public Databasechangelog setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    @Override
    public LocalDateTime getDateexecuted() {
        return this.dateexecuted;
    }

    @Override
    public Databasechangelog setDateexecuted(LocalDateTime dateexecuted) {
        this.dateexecuted = dateexecuted;
        return this;
    }

    @Override
    public Integer getOrderexecuted() {
        return this.orderexecuted;
    }

    @Override
    public Databasechangelog setOrderexecuted(Integer orderexecuted) {
        this.orderexecuted = orderexecuted;
        return this;
    }

    @Override
    public String getExectype() {
        return this.exectype;
    }

    @Override
    public Databasechangelog setExectype(String exectype) {
        this.exectype = exectype;
        return this;
    }

    @Override
    public String getMd5sum() {
        return this.md5sum;
    }

    @Override
    public Databasechangelog setMd5sum(String md5sum) {
        this.md5sum = md5sum;
        return this;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Databasechangelog setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String getComments() {
        return this.comments;
    }

    @Override
    public Databasechangelog setComments(String comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String getTag() {
        return this.tag;
    }

    @Override
    public Databasechangelog setTag(String tag) {
        this.tag = tag;
        return this;
    }

    @Override
    public String getLiquibase() {
        return this.liquibase;
    }

    @Override
    public Databasechangelog setLiquibase(String liquibase) {
        this.liquibase = liquibase;
        return this;
    }

    @Override
    public String getContexts() {
        return this.contexts;
    }

    @Override
    public Databasechangelog setContexts(String contexts) {
        this.contexts = contexts;
        return this;
    }

    @Override
    public String getLabels() {
        return this.labels;
    }

    @Override
    public Databasechangelog setLabels(String labels) {
        this.labels = labels;
        return this;
    }

    @Override
    public String getDeploymentId() {
        return this.deploymentId;
    }

    @Override
    public Databasechangelog setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangelog (");

        sb.append(id);
        sb.append(", ").append(author);
        sb.append(", ").append(filename);
        sb.append(", ").append(dateexecuted);
        sb.append(", ").append(orderexecuted);
        sb.append(", ").append(exectype);
        sb.append(", ").append(md5sum);
        sb.append(", ").append(description);
        sb.append(", ").append(comments);
        sb.append(", ").append(tag);
        sb.append(", ").append(liquibase);
        sb.append(", ").append(contexts);
        sb.append(", ").append(labels);
        sb.append(", ").append(deploymentId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDatabasechangelog from) {
        setId(from.getId());
        setAuthor(from.getAuthor());
        setFilename(from.getFilename());
        setDateexecuted(from.getDateexecuted());
        setOrderexecuted(from.getOrderexecuted());
        setExectype(from.getExectype());
        setMd5sum(from.getMd5sum());
        setDescription(from.getDescription());
        setComments(from.getComments());
        setTag(from.getTag());
        setLiquibase(from.getLiquibase());
        setContexts(from.getContexts());
        setLabels(from.getLabels());
        setDeploymentId(from.getDeploymentId());
    }

    @Override
    public <E extends IDatabasechangelog> E into(E into) {
        into.from(this);
        return into;
    }
}