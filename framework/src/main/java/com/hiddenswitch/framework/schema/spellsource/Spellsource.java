/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.spellsource;


import com.hiddenswitch.framework.schema.DefaultCatalog;
import com.hiddenswitch.framework.schema.spellsource.tables.BotUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.Cards;
import com.hiddenswitch.framework.schema.spellsource.tables.CardsInDeck;
import com.hiddenswitch.framework.schema.spellsource.tables.DeckPlayerAttributeTuples;
import com.hiddenswitch.framework.schema.spellsource.tables.DeckShares;
import com.hiddenswitch.framework.schema.spellsource.tables.Decks;
import com.hiddenswitch.framework.schema.spellsource.tables.Friends;
import com.hiddenswitch.framework.schema.spellsource.tables.GameUsers;
import com.hiddenswitch.framework.schema.spellsource.tables.Games;
import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingQueues;
import com.hiddenswitch.framework.schema.spellsource.tables.MatchmakingTickets;
import com.hiddenswitch.framework.schema.spellsource.tables.UserEntityAddons;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Spellsource extends SchemaImpl {

    private static final long serialVersionUID = -1222667457;

    /**
     * The reference instance of <code>spellsource</code>
     */
    public static final Spellsource SPELLSOURCE = new Spellsource();

    /**
     * The table <code>spellsource.bot_users</code>.
     */
    public final BotUsers BOT_USERS = BotUsers.BOT_USERS;

    /**
     * The table <code>spellsource.cards</code>.
     */
    public final Cards CARDS = Cards.CARDS;

    /**
     * The table <code>spellsource.cards_in_deck</code>.
     */
    public final CardsInDeck CARDS_IN_DECK = CardsInDeck.CARDS_IN_DECK;

    /**
     * The table <code>spellsource.deck_player_attribute_tuples</code>.
     */
    public final DeckPlayerAttributeTuples DECK_PLAYER_ATTRIBUTE_TUPLES = DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES;

    /**
     * indicates a deck shared to a player
     */
    public final DeckShares DECK_SHARES = DeckShares.DECK_SHARES;

    /**
     * The table <code>spellsource.decks</code>.
     */
    public final Decks DECKS = Decks.DECKS;

    /**
     * The table <code>spellsource.friends</code>.
     */
    public final Friends FRIENDS = Friends.FRIENDS;

    /**
     * The table <code>spellsource.game_users</code>.
     */
    public final GameUsers GAME_USERS = GameUsers.GAME_USERS;

    /**
     * The table <code>spellsource.games</code>.
     */
    public final Games GAMES = Games.GAMES;

    /**
     * The table <code>spellsource.matchmaking_queues</code>.
     */
    public final MatchmakingQueues MATCHMAKING_QUEUES = MatchmakingQueues.MATCHMAKING_QUEUES;

    /**
     * The table <code>spellsource.matchmaking_tickets</code>.
     */
    public final MatchmakingTickets MATCHMAKING_TICKETS = MatchmakingTickets.MATCHMAKING_TICKETS;

    /**
     * The table <code>spellsource.user_entity_addons</code>.
     */
    public final UserEntityAddons USER_ENTITY_ADDONS = UserEntityAddons.USER_ENTITY_ADDONS;

    /**
     * No further instances allowed
     */
    private Spellsource() {
        super("spellsource", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            BotUsers.BOT_USERS,
            Cards.CARDS,
            CardsInDeck.CARDS_IN_DECK,
            DeckPlayerAttributeTuples.DECK_PLAYER_ATTRIBUTE_TUPLES,
            DeckShares.DECK_SHARES,
            Decks.DECKS,
            Friends.FRIENDS,
            GameUsers.GAME_USERS,
            Games.GAMES,
            MatchmakingQueues.MATCHMAKING_QUEUES,
            MatchmakingTickets.MATCHMAKING_TICKETS,
            UserEntityAddons.USER_ENTITY_ADDONS);
    }
}
