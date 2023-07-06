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

/** Assertion operator to apply. */
@JsonSerialize(
    using = SyntheticsAssertionXPathOperator.SyntheticsAssertionXPathOperatorSerializer.class)
public class SyntheticsAssertionXPathOperator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("validatesXPath"));

  public static final SyntheticsAssertionXPathOperator VALIDATES_X_PATH =
      new SyntheticsAssertionXPathOperator("validatesXPath");

  SyntheticsAssertionXPathOperator(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionXPathOperatorSerializer
      extends StdSerializer<SyntheticsAssertionXPathOperator> {
    public SyntheticsAssertionXPathOperatorSerializer(Class<SyntheticsAssertionXPathOperator> t) {
      super(t);
    }

    public SyntheticsAssertionXPathOperatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionXPathOperator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAssertionXPathOperator fromValue(String value) {
    return new SyntheticsAssertionXPathOperator(value);
  }
}
