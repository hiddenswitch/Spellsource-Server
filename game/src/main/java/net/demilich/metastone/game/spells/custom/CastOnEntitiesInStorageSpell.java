package net.demilich.metastone.game.spells.custom;

import com.github.fromage.quasi.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.Spell;
import net.demilich.metastone.game.spells.SpellUtils;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.targeting.EntityReference;

import java.util.List;

/**
 * Casts the {@link SpellArg#SPELL} subspell with {@link EntityReference#OUTPUT} as a reference to {@link
 * SpellArg#VALUE} random entities (exact cards or e.g. actors in the graveyard) stored on the {@code source}.
 * <p>
 * If {@link SpellArg#SECONDARY_TARGET} is specified, retrieves the entity list keyed by that entity reference instead
 * of {@code source}.
 */
public final class CastOnEntitiesInStorageSpell extends Spell {

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		Entity storageSource = source;
		int count = desc.getValue(SpellArg.VALUE, context, player, target, source, 1);
		if (count == 0) {
			return;
		}

		if (desc.containsKey(SpellArg.SECONDARY_TARGET)) {
			storageSource = context.resolveSingleTarget(player, source, (EntityReference) desc.get(SpellArg.SECONDARY_TARGET));
		}

		List<EntityReference> entities = EnvironmentEntityList.getList(context).getReferences(context, storageSource);

		SpellDesc spell = desc.getSpell();
		for (int i = 0; i < count; i++) {
			if (entities.isEmpty()) {
				return;
			}
			EntityReference entity = context.getLogic().removeRandom(entities);
			SpellUtils.castChildSpell(context, player, spell, source, target, context.resolveSingleTarget(entity));
		}
	}
}
