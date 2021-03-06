/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.hiddenswitch.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFlywaySchemaHistory extends VertxPojo, Serializable {

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.installed_rank</code>.
     */
    public IFlywaySchemaHistory setInstalledRank(Integer value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.installed_rank</code>.
     */
    public Integer getInstalledRank();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.version</code>.
     */
    public IFlywaySchemaHistory setVersion(String value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.version</code>.
     */
    public String getVersion();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.description</code>.
     */
    public IFlywaySchemaHistory setDescription(String value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.description</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.type</code>.
     */
    public IFlywaySchemaHistory setType(String value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.type</code>.
     */
    public String getType();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.script</code>.
     */
    public IFlywaySchemaHistory setScript(String value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.script</code>.
     */
    public String getScript();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.checksum</code>.
     */
    public IFlywaySchemaHistory setChecksum(Integer value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.checksum</code>.
     */
    public Integer getChecksum();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.installed_by</code>.
     */
    public IFlywaySchemaHistory setInstalledBy(String value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.installed_by</code>.
     */
    public String getInstalledBy();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.installed_on</code>.
     */
    public IFlywaySchemaHistory setInstalledOn(LocalDateTime value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.installed_on</code>.
     */
    public LocalDateTime getInstalledOn();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.execution_time</code>.
     */
    public IFlywaySchemaHistory setExecutionTime(Integer value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.execution_time</code>.
     */
    public Integer getExecutionTime();

    /**
     * Setter for <code>hiddenswitch.flyway_schema_history.success</code>.
     */
    public IFlywaySchemaHistory setSuccess(Boolean value);

    /**
     * Getter for <code>hiddenswitch.flyway_schema_history.success</code>.
     */
    public Boolean getSuccess();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFlywaySchemaHistory
     */
    public void from(IFlywaySchemaHistory from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFlywaySchemaHistory
     */
    public <E extends IFlywaySchemaHistory> E into(E into);

    @Override
    public default IFlywaySchemaHistory fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setInstalledRank(json.getInteger("installed_rank"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("installed_rank","java.lang.Integer",e);
        }
        try {
            setVersion(json.getString("version"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("version","java.lang.String",e);
        }
        try {
            setDescription(json.getString("description"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("description","java.lang.String",e);
        }
        try {
            setType(json.getString("type"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("type","java.lang.String",e);
        }
        try {
            setScript(json.getString("script"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("script","java.lang.String",e);
        }
        try {
            setChecksum(json.getInteger("checksum"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("checksum","java.lang.Integer",e);
        }
        try {
            setInstalledBy(json.getString("installed_by"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("installed_by","java.lang.String",e);
        }
        try {
            String installed_onString = json.getString("installed_on");
            setInstalledOn(installed_onString == null?null:java.time.LocalDateTime.parse(installed_onString));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("installed_on","java.time.LocalDateTime",e);
        }
        try {
            setExecutionTime(json.getInteger("execution_time"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("execution_time","java.lang.Integer",e);
        }
        try {
            setSuccess(json.getBoolean("success"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("success","java.lang.Boolean",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("installed_rank",getInstalledRank());
        json.put("version",getVersion());
        json.put("description",getDescription());
        json.put("type",getType());
        json.put("script",getScript());
        json.put("checksum",getChecksum());
        json.put("installed_by",getInstalledBy());
        json.put("installed_on",getInstalledOn()==null?null:getInstalledOn().toString());
        json.put("execution_time",getExecutionTime());
        json.put("success",getSuccess());
        return json;
    }

}
