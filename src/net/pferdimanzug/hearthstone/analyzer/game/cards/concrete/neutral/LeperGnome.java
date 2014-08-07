package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DamageSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;

public class LeperGnome extends MinionCard {

	public LeperGnome() {
		super("Leper Gnome", 2, 1, Rarity.COMMON, HeroClass.ANY, 1);
		setDescription("Deathrattle: Deal 2 damage to the enemy hero.");
	}

	@Override
	public int getTypeId() {
		return 154;
	}

	@Override
	public Minion summon() {
		SpellDesc deathrattle = DamageSpell.create(2);
		deathrattle.setTarget(EntityReference.ENEMY_HERO);
		Minion leperGnome = createMinion();
		leperGnome.addDeathrattle(deathrattle);
		return leperGnome;
	}
}
