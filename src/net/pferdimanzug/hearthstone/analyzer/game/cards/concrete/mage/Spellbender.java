package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage;

import net.pferdimanzug.hearthstone.analyzer.game.actions.ActionType;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SecretCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.SummonNewAttackTargetSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.SummonNewTargetTrigger;

public class Spellbender extends SecretCard {

	public Spellbender() {
		super("Spellbender", Rarity.EPIC, HeroClass.MAGE, 3);
		setDescription("Secret: When an enemy casts a spell on a minion, summon a 1/3 as the new target.");

		Spell spellbenderSpell = new SummonNewAttackTargetSpell(new SpellbenderMinion());
		setTriggerAndEffect(new SummonNewTargetTrigger(ActionType.SPELL), spellbenderSpell);
	}

	private class SpellbenderMinion extends MinionCard {

		public SpellbenderMinion() {
			super("Spellbender", 1, 3, Rarity.EPIC, HeroClass.MAGE, 0);
			setCollectible(false);
		}

		@Override
		public Minion summon() {
			return createMinion();
		}

	}

}
