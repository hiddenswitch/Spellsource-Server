package net.demilich.metastone.game.spells.custom;

import co.paralleluniverse.fibers.Suspendable;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.cards.CardList;
import net.demilich.metastone.game.cards.CardType;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.weapons.Weapon;
import net.demilich.metastone.game.spells.Spell;
import net.demilich.metastone.game.spells.SpellUtils;
import net.demilich.metastone.game.spells.desc.SpellDesc;

import java.util.ArrayList;
import java.util.List;

public class WeaponOnEquipEffectSpell extends Spell {

	private static final long serialVersionUID = 7682347163376489981L;

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		List<Entity> targets = new ArrayList<>();
		CardList cards = SpellUtils.getCards(context, player, target, source, desc, 99);
		if (cards != null) {
			targets.addAll(cards);
		}
		if (target != null) {
			targets.add(target);
		}

		for (Entity entity : targets) {
			if (entity instanceof Weapon) {
				Weapon weapon = (Weapon) entity;
				Card card = weapon.getSourceCard();
				if (card.getDesc().getOnEquip() != null) {
					SpellUtils.castChildSpell(context, player, card.getDesc().getOnEquip(), source, source);
				}
			} else if (entity instanceof Card) {
				Card card = (Card) entity;
				if (card.getCardType().isCardType(CardType.WEAPON)) {
					if (card.getDesc().getOnEquip() != null) {
						SpellUtils.castChildSpell(context, player, card.getDesc().getOnEquip(), source, source);
					}
				}

			}
		}
	}
}
