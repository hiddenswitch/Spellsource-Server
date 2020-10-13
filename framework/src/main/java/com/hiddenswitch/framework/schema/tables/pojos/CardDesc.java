/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.tables.pojos;


import com.hiddenswitch.framework.schema.tables.interfaces.ICardDesc;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.JSONB;


/**
 * a particular instance of a card desc, which may be referenced by a card
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CardDesc implements VertxPojo, ICardDesc {

    private static final long serialVersionUID = 68372179;

    private Long   id;
    private String uri;
    private Object blocklyWorkspace;
    private JSONB  cardScript;

    public CardDesc() {}

    public CardDesc(ICardDesc value) {
        this.id = value.getId();
        this.uri = value.getUri();
        this.blocklyWorkspace = value.getBlocklyWorkspace();
        this.cardScript = value.getCardScript();
    }

    public CardDesc(
        Long   id,
        String uri,
        Object blocklyWorkspace,
        JSONB  cardScript
    ) {
        this.id = id;
        this.uri = uri;
        this.blocklyWorkspace = blocklyWorkspace;
        this.cardScript = cardScript;
    }

    public CardDesc(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public CardDesc setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getUri() {
        return this.uri;
    }

    @Override
    public CardDesc setUri(String uri) {
        this.uri = uri;
        return this;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object getBlocklyWorkspace() {
        return this.blocklyWorkspace;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public CardDesc setBlocklyWorkspace(Object blocklyWorkspace) {
        this.blocklyWorkspace = blocklyWorkspace;
        return this;
    }

    @Override
    public JSONB getCardScript() {
        return this.cardScript;
    }

    @Override
    public CardDesc setCardScript(JSONB cardScript) {
        this.cardScript = cardScript;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CardDesc (");

        sb.append(id);
        sb.append(", ").append(uri);
        sb.append(", ").append(blocklyWorkspace);
        sb.append(", ").append(cardScript);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICardDesc from) {
        setId(from.getId());
        setUri(from.getUri());
        setBlocklyWorkspace(from.getBlocklyWorkspace());
        setCardScript(from.getCardScript());
    }

    @Override
    public <E extends ICardDesc> E into(E into) {
        into.from(this);
        return into;
    }
}
