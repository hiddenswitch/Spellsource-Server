package com.hiddenswitch.protos;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hubspot.jackson.datatype.protobuf.ProtobufModule;
import io.vertx.core.json.jackson.DatabindCodec;

public class Serialization {
	private static final ObjectMapper yaml = new ObjectMapper(new YAMLFactory(), new DefaultSerializerProvider.Impl(), new DefaultDeserializationContext.Impl(new BeanDeserializerFactory(new DeserializerFactoryConfig())))
			.registerModule(new ProtobufModule())
			.setPropertyNamingStrategy(new JavaCamelCaseNamingStrategy());


	public static void configureSerialization() {
		configure(DatabindCodec.mapper());
	}

	public static ObjectMapper yamlMapper() {
		return yaml;
	}

	public static ObjectMapper configure(ObjectMapper mapper) {
		return mapper.registerModule(new ProtobufModule())
				.setAnnotationIntrospector(new JacksonAnnotationIntrospector())
				.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
				.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
				.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
				.setPropertyNamingStrategy(new JavaCamelCaseNamingStrategy());
	}

	public static class JavaCamelCaseNamingStrategy extends PropertyNamingStrategy.PropertyNamingStrategyBase {
		@Override
		public String translate(String input) {
			return input;
		}
	}
}
