package net.demilich.metastone.game.spells.custom;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.cards.CardList;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.EntityType;
import net.demilich.metastone.game.spells.Spell;
import net.demilich.metastone.game.spells.SpellUtils;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.cards.Attribute;

/**
 * Retrieves all the cards generated by {@link SpellUtils#getCards(GameContext, Player, Entity, Entity, SpellDesc, int)}
 * and plays them randomly.
 * <p>
 * Does not resolve battlecries, because the cards are not played from the hand.
 * <p>
 * Summons minions to the rightmost position on the battlefield.
 * <p>
 * If the choose one or adaptation has a choice associated with it (i.e., it has been played before), the same choice is
 * made. Otherwise, a random choice is made.
 * <p>
 * Does not stop executing if a card wins up destroying the {@code source}.
 * <p>
 * If the card generates itself, it will not cast itself again (no infinite loops).
 * <p>
 * For <b>example</b>, to implement the card, "Cast copies of all spells in your deck (targets chosen randomly):"
 * <pre>
 *   "spell": {
 *     "class": "PlayCardsRandomlySpell",
 *     "cardFilter": {
 *       "class": "CardFilter",
 *       "cardType": "SPELL"
 *     },
 *     "cardSource": {
 *       "class": "DeckSource",
 *       "targetPlayer": "SELF"
 *     }
 *   },
 * </pre>
 */
public class PlayCardsRandomlySpell extends Spell {

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		CardList cards = getCards(context, player, desc, source, target);
		// Shuffle
		cards.shuffle(context.getLogic().getRandom());

		// Should not replay itself
		cards.remove(source.getSourceCard());
		cards.removeIf(c -> c.getCardId().equals(source.getSourceCard().getCardId()));
		// TODO: While invoking play cards randomly, should not play a play cards randomly. Use an environment stack.
		player.setAttribute(Attribute.RANDOM_CHOICES);

		// Replay
		for (int i = 0; i < cards.size(); i++) {
			Card card = cards.get(i);
			// TODO: Move the card temporarily to the set aside zone, so that effects apply to it correctly?

			if (card.equals(source)) {
				continue;
			}

			// The card may have been transformed!
			card = (Card) card.transformResolved(context);
			/*
			card.setId(context.getLogic().generateId());
			card.setOwner(player.getId());
			card.moveOrAddTo(context, Zones.SET_ASIDE_ZONE);
			*/
			if (SpellUtils.playCardRandomly(context, player, card, source, true, false, source.getEntityType()
					== EntityType.MINION, false, false)) {
				context.getLogic().revealCard(player, card);
			}
			// context.getLogic().removeCard(card);
		}

		player.getAttributes().remove(Attribute.RANDOM_CHOICES);

	}

	protected CardList getCards(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		// Retrieve all the cards
		return SpellUtils.getCards(context, player, target, source, desc, Integer.MAX_VALUE);
	}
}

