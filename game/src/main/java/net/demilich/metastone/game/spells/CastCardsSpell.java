package net.demilich.metastone.game.spells;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.EntityReference;
import net.demilich.metastone.game.targeting.IdFactory;
import net.demilich.metastone.game.targeting.TargetSelection;

/**
 * Casts the specified {@link SpellArg#CARD} or the card targeted by {@link SpellArg#SECONDARY_TARGET} onto the {@code
 * target}. Currently only tested with spell cards.
 * <p>
 * To cast a choose one spell card, cast the choice card.
 * <p>
 * For example, to cast Inner Fire on every minion in your deck:
 * <pre>
 *   {
 *     "class": "CastCardsSpell",
 *     "card": "spell_inner_fire",
 *     "target": "FRIENDLY_DECK",
 *     "filter": {
 *       "class": "CardFilter",
 *       "cardType": "MINION"
 *     }
 *   }
 * </pre>
 */
public final class CastCardsSpell extends Spell {

	private static final long serialVersionUID = 8804077369907401986L;

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		EntityReference secondaryTarget = (EntityReference) desc.get(SpellArg.SECONDARY_TARGET);
		Card card;
		if (secondaryTarget != null) {
			card = context.resolveSingleTarget(player, source, secondaryTarget);
		} else {
			card = SpellUtils.getCard(context, desc);
		}

		if (card == null) {
			return;
		}

		if (card.isSpell()
				&& card.getSpell() != null) {
			SpellUtils.castChildSpell(context, player, card.getSpell().removeArg(SpellArg.FILTER),
					card.getId() == IdFactory.UNASSIGNED ? source : card,
					card.getTargetSelection().equals(TargetSelection.NONE) ? null : target);
		}
	}
}


