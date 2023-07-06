/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The type of basic authentication to use when performing the test. */
@JsonSerialize(using = SyntheticsBasicAuthWebType.SyntheticsBasicAuthWebTypeSerializer.class)
public class SyntheticsBasicAuthWebType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("web"));

  public static final SyntheticsBasicAuthWebType WEB = new SyntheticsBasicAuthWebType("web");

  SyntheticsBasicAuthWebType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBasicAuthWebTypeSerializer
      extends StdSerializer<SyntheticsBasicAuthWebType> {
    public SyntheticsBasicAuthWebTypeSerializer(Class<SyntheticsBasicAuthWebType> t) {
      super(t);
    }

    public SyntheticsBasicAuthWebTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuthWebType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBasicAuthWebType fromValue(String value) {
    return new SyntheticsBasicAuthWebType(value);
  }
}
