package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameContext;
import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.actions.Battlecry;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Card;
import net.pferdimanzug.hearthstone.analyzer.game.cards.CardCollection;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Entity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Race;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;

public class CaptainsParrot extends MinionCard {

	public CaptainsParrot() {
		super("Captain's Parrot", 1, 1, Rarity.RARE, HeroClass.ANY, 2);
		setDescription("Battlecry: Put a random Pirate from your deck into your hand.");
		setRace(Race.BEAST);
	}

	@Override
	public Minion summon() {
		Minion captainsParrot = createMinion();
		captainsParrot.setBattlecry(Battlecry.createBattlecry(new CaptainsParrotSpell()));
		return captainsParrot;
	}

	private class CaptainsParrotSpell extends Spell {

		private CardCollection findPirateCards(CardCollection deck) {
			CardCollection cards = new CardCollection();
			for (Card card : deck) {
				if (card.getTag(GameTag.RACE) == Race.PIRATE) {
					cards.add(card);
				}
			}
			return cards;
		}

		@Override
		protected void onCast(GameContext context, Player player, Entity target) {
			CardCollection pirateCards = findPirateCards(player.getDeck());
			if (pirateCards.isEmpty()) {
				return;
			}
			Card randomPirateCard = pirateCards.getRandom();
			player.getDeck().remove(randomPirateCard);
			context.getLogic().receiveCard(player.getId(), randomPirateCard);
		}

	}

}
