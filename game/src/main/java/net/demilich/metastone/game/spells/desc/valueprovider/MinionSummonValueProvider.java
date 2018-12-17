package net.demilich.metastone.game.spells.desc.valueprovider;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.spells.desc.filter.EntityFilter;

import java.util.Map;

public class MinionSummonValueProvider extends ValueProvider {

	private static final long serialVersionUID = -7276225834751474729L;

	public MinionSummonValueProvider(ValueProviderDesc desc) {
		super(desc);
	}

	@Override
	protected int provideValue(GameContext context, Player player, Entity target, Entity host) {
		Map<String, Integer> minionIds = player.getStatistics().getMinionsSummoned();
		int count = 0;
		EntityFilter filter = (EntityFilter) getDesc().get(ValueProviderArg.FILTER);
		for (String minionId : minionIds.keySet()) {
			Entity entity = context.getCardById(minionId);
			if (filter == null || filter.matches(context, player, entity, host)) {
				count += minionIds.get(minionId);
			}
		}
		return count;
	}

}
