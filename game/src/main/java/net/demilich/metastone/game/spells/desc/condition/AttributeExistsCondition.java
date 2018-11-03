package net.demilich.metastone.game.spells.desc.condition;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.TargetPlayer;
import net.demilich.metastone.game.cards.Attribute;

public class AttributeExistsCondition extends Condition {

	public AttributeExistsCondition(ConditionDesc desc) {
		super(desc);
	}

	@Override
	protected boolean isFulfilled(GameContext context, Player player, ConditionDesc desc, Entity source, Entity target) {
		Attribute attribute = (Attribute) desc.get(ConditionArg.ATTRIBUTE);
		if (desc.containsKey(ConditionArg.TARGET_PLAYER)) {
			switch ((TargetPlayer) desc.get(ConditionArg.TARGET_PLAYER)) {
				case OPPONENT:
					return context.getLogic().hasAttribute(context.getOpponent(player), attribute);
				case SELF:
					return context.getLogic().hasAttribute(player, attribute);
				case ACTIVE:
					return context.getLogic().hasAttribute(context.getActivePlayer(), attribute);
				case INACTIVE:
					return context.getLogic().hasAttribute(context.getOpponent(context.getActivePlayer()), attribute);
				default:
					break;
			}
		}
		return context.getLogic().attributeExists(attribute);
	}
}
