package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.actions.Battlecry;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.BuffSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.IValueProvider;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;

public class FrostwolfWarlord extends MinionCard {

	public FrostwolfWarlord() {
		super("Frostwolf Warlord", 4, 4, Rarity.FREE, HeroClass.ANY, 5);
		setDescription("Battlecry: Gain +1/+1 for each other friendly minion on the battlefield. ");
		setTag(GameTag.BATTLECRY);
	}

	@Override
	public int getTypeId() {
		return 131;
	}

	@Override
	public Minion summon() {
		Minion frostwolfWarlord = createMinion();
		IValueProvider valueProvider = (context, player, target) -> player.getMinions().size();
		SpellDesc buffSpell = BuffSpell.create(valueProvider, valueProvider);
		buffSpell.setTarget(EntityReference.SELF);
		Battlecry battlecry = Battlecry.createBattlecry(buffSpell);
		frostwolfWarlord.setBattlecry(battlecry);
		return frostwolfWarlord;
	}
}
