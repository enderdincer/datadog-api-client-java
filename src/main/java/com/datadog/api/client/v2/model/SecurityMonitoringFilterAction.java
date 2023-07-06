/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The type of filtering action. */
@JsonSerialize(
    using = SecurityMonitoringFilterAction.SecurityMonitoringFilterActionSerializer.class)
public class SecurityMonitoringFilterAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("require", "suppress"));

  public static final SecurityMonitoringFilterAction REQUIRE =
      new SecurityMonitoringFilterAction("require");
  public static final SecurityMonitoringFilterAction SUPPRESS =
      new SecurityMonitoringFilterAction("suppress");

  SecurityMonitoringFilterAction(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringFilterActionSerializer
      extends StdSerializer<SecurityMonitoringFilterAction> {
    public SecurityMonitoringFilterActionSerializer(Class<SecurityMonitoringFilterAction> t) {
      super(t);
    }

    public SecurityMonitoringFilterActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringFilterAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringFilterAction fromValue(String value) {
    return new SecurityMonitoringFilterAction(value);
  }
}
