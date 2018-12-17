package net.demilich.metastone.game.events;

import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.entities.Entity;

public final class CardRevealedEvent extends GameEvent implements HasCard {

	private static final long serialVersionUID = -6000745204769223822L;
	private final Card card;

	public CardRevealedEvent(GameContext context, int playerId, Card card) {
		super(context, playerId, -1);
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	@Override
	public Entity getEventTarget() {
		return getCard();
	}

	@Override
	public GameEventType getEventType() {
		return GameEventType.REVEAL_CARD;
	}

	@Override
	public boolean isClientInterested() {
		return true;
	}
}

