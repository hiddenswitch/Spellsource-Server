/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource.tables.pojos;


import com.hiddenswitch.framework.schema.spellsource.enums.GameUserVictoryEnum;
import com.hiddenswitch.framework.schema.spellsource.tables.interfaces.IGameUsers;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameUsers implements VertxPojo, IGameUsers {

    private static final long serialVersionUID = 1090340847;

    private Short               playerIndex;
    private Long                gameId;
    private String              userId;
    private String              deckId;
    private GameUserVictoryEnum victoryStatus;

    public GameUsers() {}

    public GameUsers(IGameUsers value) {
        this.playerIndex = value.getPlayerIndex();
        this.gameId = value.getGameId();
        this.userId = value.getUserId();
        this.deckId = value.getDeckId();
        this.victoryStatus = value.getVictoryStatus();
    }

    public GameUsers(
        Short               playerIndex,
        Long                gameId,
        String              userId,
        String              deckId,
        GameUserVictoryEnum victoryStatus
    ) {
        this.playerIndex = playerIndex;
        this.gameId = gameId;
        this.userId = userId;
        this.deckId = deckId;
        this.victoryStatus = victoryStatus;
    }

    public GameUsers(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Short getPlayerIndex() {
        return this.playerIndex;
    }

    @Override
    public GameUsers setPlayerIndex(Short playerIndex) {
        this.playerIndex = playerIndex;
        return this;
    }

    @Override
    public Long getGameId() {
        return this.gameId;
    }

    @Override
    public GameUsers setGameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public GameUsers setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getDeckId() {
        return this.deckId;
    }

    @Override
    public GameUsers setDeckId(String deckId) {
        this.deckId = deckId;
        return this;
    }

    @Override
    public GameUserVictoryEnum getVictoryStatus() {
        return this.victoryStatus;
    }

    @Override
    public GameUsers setVictoryStatus(GameUserVictoryEnum victoryStatus) {
        this.victoryStatus = victoryStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GameUsers (");

        sb.append(playerIndex);
        sb.append(", ").append(gameId);
        sb.append(", ").append(userId);
        sb.append(", ").append(deckId);
        sb.append(", ").append(victoryStatus);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IGameUsers from) {
        setPlayerIndex(from.getPlayerIndex());
        setGameId(from.getGameId());
        setUserId(from.getUserId());
        setDeckId(from.getDeckId());
        setVictoryStatus(from.getVictoryStatus());
    }

    @Override
    public <E extends IGameUsers> E into(E into) {
        into.from(this);
        return into;
    }
}
