package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DestroySpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class DeadlyShot extends SpellCard {

	public DeadlyShot() {
		super("Deadly Shot", Rarity.COMMON, HeroClass.HUNTER, 3);
		setDescription("Destroy a random enemy minion.");
		SpellDesc destroyRandom = DestroySpell.create();
		destroyRandom.pickRandomTarget(true);
		setSpell(destroyRandom);
		setPredefinedTarget(EntityReference.ENEMY_MINIONS);
		setTargetRequirement(TargetSelection.NONE);
	}

	@Override
	public boolean canBeCast(GameContext context, Player player) {
		if (!super.canBeCast(context, player)) {
			return false;
		}
		Player opponent = context.getOpponent(player);
		return opponent.getMinions().size() > 0;
	}

	@Override
	public int getTypeId() {
		return 29;
	}
}
