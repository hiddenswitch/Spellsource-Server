package com.hiddenswitch.framework.impl;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;

import java.io.IOException;
import java.util.function.Supplier;

public class ProtobufCodec<T extends Message> implements MessageCodec<T, T> {

	private final T target;

	public ProtobufCodec(T defaultInstance) {
		this.target = defaultInstance;
	}

	@Override
	public void encodeToWire(Buffer buffer, T t) {
		try {
			t.writeDelimitedTo(new VertxBufferOutputStream(buffer));
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	@Override
	public T decodeFromWire(int pos, Buffer buffer) {
		try {
			@SuppressWarnings("unchecked")
			var parserForType = (Parser<T>) target.getParserForType();
			return parserForType.parseDelimitedFrom(new VertxBufferInputStream(buffer.getBuffer(pos, buffer.length())));
		} catch (InvalidProtocolBufferException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public T transform(T t) {
		return t;
	}

	@Override
	public String name() {
		return "protobufcodec" + target.getClass().getName();
	}

	@Override
	public byte systemCodecID() {
		return -1;
	}

	public Class<T> getTargetClass() {
		return (Class<T>)target.getClass();
	}
}
