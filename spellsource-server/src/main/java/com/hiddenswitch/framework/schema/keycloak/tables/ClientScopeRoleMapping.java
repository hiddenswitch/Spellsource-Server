/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables;


import com.hiddenswitch.framework.schema.keycloak.Indexes;
import com.hiddenswitch.framework.schema.keycloak.Keycloak;
import com.hiddenswitch.framework.schema.keycloak.Keys;
import com.hiddenswitch.framework.schema.keycloak.tables.records.ClientScopeRoleMappingRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientScopeRoleMapping extends TableImpl<ClientScopeRoleMappingRecord> {

    private static final long serialVersionUID = 1024046765;

    /**
     * The reference instance of <code>keycloak.client_scope_role_mapping</code>
     */
    public static final ClientScopeRoleMapping CLIENT_SCOPE_ROLE_MAPPING = new ClientScopeRoleMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientScopeRoleMappingRecord> getRecordType() {
        return ClientScopeRoleMappingRecord.class;
    }

    /**
     * The column <code>keycloak.client_scope_role_mapping.scope_id</code>.
     */
    public final TableField<ClientScopeRoleMappingRecord, String> SCOPE_ID = createField(DSL.name("scope_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>keycloak.client_scope_role_mapping.role_id</code>.
     */
    public final TableField<ClientScopeRoleMappingRecord, String> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * Create a <code>keycloak.client_scope_role_mapping</code> table reference
     */
    public ClientScopeRoleMapping() {
        this(DSL.name("client_scope_role_mapping"), null);
    }

    /**
     * Create an aliased <code>keycloak.client_scope_role_mapping</code> table reference
     */
    public ClientScopeRoleMapping(String alias) {
        this(DSL.name(alias), CLIENT_SCOPE_ROLE_MAPPING);
    }

    /**
     * Create an aliased <code>keycloak.client_scope_role_mapping</code> table reference
     */
    public ClientScopeRoleMapping(Name alias) {
        this(alias, CLIENT_SCOPE_ROLE_MAPPING);
    }

    private ClientScopeRoleMapping(Name alias, Table<ClientScopeRoleMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClientScopeRoleMapping(Name alias, Table<ClientScopeRoleMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ClientScopeRoleMapping(Table<O> child, ForeignKey<O, ClientScopeRoleMappingRecord> key) {
        super(child, key, CLIENT_SCOPE_ROLE_MAPPING);
    }

    @Override
    public Schema getSchema() {
        return Keycloak.KEYCLOAK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_CLSCOPE_ROLE, Indexes.IDX_ROLE_CLSCOPE);
    }

    @Override
    public UniqueKey<ClientScopeRoleMappingRecord> getPrimaryKey() {
        return Keys.PK_TEMPLATE_SCOPE;
    }

    @Override
    public List<UniqueKey<ClientScopeRoleMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientScopeRoleMappingRecord>>asList(Keys.PK_TEMPLATE_SCOPE);
    }

    @Override
    public List<ForeignKey<ClientScopeRoleMappingRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClientScopeRoleMappingRecord, ?>>asList(Keys.CLIENT_SCOPE_ROLE_MAPPING__FK_CL_SCOPE_RM_SCOPE);
    }

    public ClientScope clientScope() {
        return new ClientScope(this, Keys.CLIENT_SCOPE_ROLE_MAPPING__FK_CL_SCOPE_RM_SCOPE);
    }

    @Override
    public ClientScopeRoleMapping as(String alias) {
        return new ClientScopeRoleMapping(DSL.name(alias), this);
    }

    @Override
    public ClientScopeRoleMapping as(Name alias) {
        return new ClientScopeRoleMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientScopeRoleMapping rename(String name) {
        return new ClientScopeRoleMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientScopeRoleMapping rename(Name name) {
        return new ClientScopeRoleMapping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
