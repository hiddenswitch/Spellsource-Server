/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.daos;


import com.hiddenswitch.framework.schema.tables.ClientSessionProtMapper;
import com.hiddenswitch.framework.schema.tables.records.ClientSessionProtMapperRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientSessionProtMapperDao extends AbstractReactiveVertxDAO<ClientSessionProtMapperRecord, com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper, Record2<String, String>, Future<List<com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper>>, Future<com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ClientSessionProtMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public ClientSessionProtMapperDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(ClientSessionProtMapper.CLIENT_SESSION_PROT_MAPPER, com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper.class, new ReactiveClassicQueryExecutor<ClientSessionProtMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper,Record2<String, String>>(configuration,delegate,com.hiddenswitch.framework.schema.tables.mappers.RowMappers.getClientSessionProtMapperMapper()));
    }

    @Override
    protected Record2<String, String> getId(com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper object) {
        return compositeKeyRecord(object.getClientSession(), object.getProtocolMapperId());
    }

    /**
     * Find records that have <code>protocol_mapper_id IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper>> findManyByProtocolMapperId(Collection<String> values) {
        return findManyByCondition(ClientSessionProtMapper.CLIENT_SESSION_PROT_MAPPER.PROTOCOL_MAPPER_ID.in(values));
    }

    /**
     * Find records that have <code>protocol_mapper_id IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper>> findManyByProtocolMapperId(Collection<String> values, int limit) {
        return findManyByCondition(ClientSessionProtMapper.CLIENT_SESSION_PROT_MAPPER.PROTOCOL_MAPPER_ID.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<ClientSessionProtMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper,Record2<String, String>> queryExecutor(){
        return (ReactiveClassicQueryExecutor<ClientSessionProtMapperRecord,com.hiddenswitch.framework.schema.tables.pojos.ClientSessionProtMapper,Record2<String, String>>) super.queryExecutor();
    }
}
