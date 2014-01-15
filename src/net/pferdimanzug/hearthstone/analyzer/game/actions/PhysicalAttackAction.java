package net.pferdimanzug.hearthstone.analyzer.game.actions;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class PhysicalAttackAction extends GameAction {
	
	private Entity attacker;

	public PhysicalAttackAction(Entity attacker) {
		setTargetRequirement(TargetSelection.ENEMY_CHARACTERS);
		setActionType(ActionType.PHYSICAL_ATTACK);
		this.attacker = attacker;
	}

	@Override
	public void execute(GameContext context, int playerId) {
		Entity target = context.resolveSingleTarget(playerId, getTargetKey()); 
		context.getLogic().fight(attacker, target);
	}


}
