package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.priest;

import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DamageSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.HealingSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.MetaSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class HolyFire extends SpellCard {

	public HolyFire() {
		super("Holy Fire", Rarity.RARE, HeroClass.PRIEST, 6);
		setDescription("Deal $5 damage. Restore 5 Health to your hero.");

		SpellDesc damageSpell = DamageSpell.create(5);
		SpellDesc healHeroSpell = HealingSpell.create(5);
		healHeroSpell.setTarget(EntityReference.FRIENDLY_HERO);

		setSpell(MetaSpell.create(damageSpell, healHeroSpell));
		setTargetRequirement(TargetSelection.ANY);
	}

	@Override
	public int getTypeId() {
		return 263;
	}
}
