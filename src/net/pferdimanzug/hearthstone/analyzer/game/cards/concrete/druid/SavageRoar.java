package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.druid;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.actions.TargetSelection;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.events.TurnEndEventlistener;
import net.pferdimanzug.hearthstone.analyzer.game.spells.ISpell;

public class SavageRoar extends SpellCard {

	public SavageRoar() {
		super("Savage Roar", Rarity.FREE, HeroClass.DRUID, 3);
		
		setTargetRequirement(TargetSelection.NONE);
	}
	
	private class SavageRoarSpell implements ISpell {
		private static final int ATTACK_BONUS = 2;

		@Override
		public void cast(GameContext context, Player player, Entity target) {
			player.getHero().modifyTag(GameTag.ATTACK_BONUS, +ATTACK_BONUS);
			context.getEventManager().registerGameEventListener(new TurnEndEventlistener(new EndSavageRoarSpell(), player.getHero()));
			for (Minion minion : player.getMinions()) {
				minion.modifyTag(GameTag.ATTACK_BONUS, +ATTACK_BONUS);
				context.getEventManager().registerGameEventListener(new TurnEndEventlistener(new EndSavageRoarSpell(), minion));
			}
		}
		private class EndSavageRoarSpell implements ISpell {

			@Override
			public void cast(GameContext context, Player player, Entity target) {
				target.modifyTag(GameTag.ATTACK_BONUS, -ATTACK_BONUS);
			}
			
		}
	}

}
