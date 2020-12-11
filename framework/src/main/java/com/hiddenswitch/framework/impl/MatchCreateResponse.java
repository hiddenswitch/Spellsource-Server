package com.hiddenswitch.framework.impl;

import java.io.Serializable;

public class MatchCreateResponse implements Serializable {
	private final CreateGameSessionResponse createGameSessionResponse;

	public MatchCreateResponse(CreateGameSessionResponse createGameSessionResponse) {
		this.createGameSessionResponse = createGameSessionResponse;
	}

	public CreateGameSessionResponse getCreateGameSessionResponse() {
		return createGameSessionResponse;
	}
}
