package net.demilich.metastone.game.events;

public enum GameEventType {
	ALL,
	DAMAGE,
	SUMMON,
	HEAL,
	KILL,
	PHYSICAL_ATTACK,
	AFTER_PHYSICAL_ATTACK,
	TURN_START,
	TURN_END,
	SPELL_CASTED,
	AFTER_SPELL_CASTED,
	OVERLOAD,
	DRAW_CARD,
	PLAY_CARD,
	HERO_POWER_USED,
	TARGET_ACQUISITION,
	SECRET_PLAYED,
	SECRET_REVEALED,
	SILENCE,
	WEAPON_EQUIPPED,
	WEAPON_DESTROYED,
	BOARD_CHANGED,
	ARMOR_GAINED,
	ENRAGE_CHANGED,
	PRE_DAMAGE,
	JOUST,
	DISCARD
}
