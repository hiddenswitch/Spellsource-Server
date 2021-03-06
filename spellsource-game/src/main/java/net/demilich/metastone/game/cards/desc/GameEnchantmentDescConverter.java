package net.demilich.metastone.game.cards.desc;

import com.fasterxml.jackson.databind.util.StdConverter;
import net.demilich.metastone.game.spells.desc.trigger.EnchantmentDesc;
import net.demilich.metastone.game.spells.trigger.Enchantment;

public class GameEnchantmentDescConverter extends StdConverter<EnchantmentDesc, EnchantmentDesc> {
	@Override
	public EnchantmentDesc convert(EnchantmentDesc value) {
		value.setZones(Enchantment.getDefaultGameZones());
		return value;
	}
}
