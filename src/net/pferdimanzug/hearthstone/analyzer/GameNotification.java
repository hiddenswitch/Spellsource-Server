package net.pferdimanzug.hearthstone.analyzer;

public enum GameNotification {
	APPLICATION_STARTUP,
	CANVAS_CREATED,
	SHOW_VIEW,
	START_GAME,
	PLAY_GAME,
	GAME_STATE_UPDATE,
	GAME_ACTION_PERFORMED,
	GAME_OVER,
	BATCH_START,
	BATCH_STOP,
	
	HUMAN_PROMPT_FOR_MULLIGAN,
	HUMAN_PROMPT_FOR_ACTION,
	HUMAN_PROMPT_FOR_TARGET,
	
	MAIN_MENU,
	
	PLAY_MODE_SELECTED,
	DECK_BUILDER_SELECTED,
	
	REQUEST_DECKS,
	ANSWER_DECKS,
	COMMIT_PLAYMODE_CONFIG,
	
	LOAD_DECKS,
	DECKS_LOADED,
	CREATE_NEW_DECK,
	SET_ACTIVE_DECK,
	EDIT_DECK,
	CHANGE_DECK_NAME,
	ACTIVE_DECK_CHANGED,
	FILTERED_CARDS,
	FILTER_CARDS_BY_TEXT,
	ADD_CARD_TO_DECK,
	REMOVE_CARD_FROM_DECK,
	FILL_DECK_WITH_RANDOM_CARDS,
	SAVE_ACTIVE_DECK,
	IMPORT_DECK_FROM_URL
}
