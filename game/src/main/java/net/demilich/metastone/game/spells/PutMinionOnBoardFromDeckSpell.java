package net.demilich.metastone.game.spells;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.MinionCard;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.SpellDesc;

public class PutMinionOnBoardFromDeckSpell extends Spell {

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		MinionCard minionCard = (MinionCard) target;
		if (minionCard == null || !player.getDeck().contains(minionCard)) {
			return;
		}
		
		player.getDeck().remove(minionCard);
		player.getSetAsideZone().add(minionCard);
		
		boolean summonSuccess = context.getLogic().summon(player.getId(), minionCard.summon(), null, -1, false);
		
		// re-add the card here if we removed it before
		player.getSetAsideZone().remove(minionCard);
		player.getDeck().addCard(minionCard);
		
		if (summonSuccess) {
			context.getLogic().removeCardFromDeck(player.getId(), minionCard);
		}
	}

}
