package com.hiddenswitch.framework.impl;

import io.vertx.core.buffer.Buffer;

import java.io.IOException;
import java.io.InputStream;

/**
 * Converts a vertx buffer into an {@link InputStream}.
 */
public class VertxBufferInputStream extends InputStream {
	private Buffer input;
	private long position = 0;

	public VertxBufferInputStream(Buffer input) {
		this.input = input;
	}

	@Override
	public int read() throws IOException {
		return (int) input.getByte((int) (position++));
	}

	@Override
	public int read(byte b[], int off, int len) {
		var start = this.position;
		var end = Math.min(start + len, input.length());
		input.getBytes((int) start, (int) end, b, off);
		this.position = end;
		return (int) (end - start);
	}

	@Override
	public int available() {
		return input.length() - (int) position;
	}

	@Override
	public long skip(long n) {
		var destination = Math.min(position + n, input.length() - 1);
		var difference = destination - position;
		position = destination;
		return difference;
	}

	public long getPosition() {
		return this.position;
	}
}
