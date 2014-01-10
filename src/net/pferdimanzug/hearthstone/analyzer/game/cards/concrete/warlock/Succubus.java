package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.warlock;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.actions.Battlecry;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Race;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DiscardCardSpell;

public class Succubus extends MinionCard {

	public Succubus() {
		super("Succubus", Rarity.FREE, HeroClass.WARLOCK, 2);
	}

	@Override
	public Minion summon() {
		Minion succubus = createMinion(4, 3, Race.DEMON);
		succubus.setTag(GameTag.BATTLECRY, Battlecry.createBattlecry(new DiscardCardSpell()));
		return succubus;
	}

}
