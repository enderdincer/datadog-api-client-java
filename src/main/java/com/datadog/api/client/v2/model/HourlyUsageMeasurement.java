/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Usage amount for a given usage type. */
@JsonPropertyOrder({
  HourlyUsageMeasurement.JSON_PROPERTY_USAGE_TYPE,
  HourlyUsageMeasurement.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageMeasurement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private String usageType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Long> value = JsonNullable.<Long>undefined();

  public HourlyUsageMeasurement usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * Type of usage.
   *
   * @return usageType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public HourlyUsageMeasurement value(Long value) {
    this.value = JsonNullable.<Long>of(value);
    return this;
  }

  /**
   * Contains the number measured for the given usage_type during the hour.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Long> value) {
    this.value = value;
  }

  public void setValue(Long value) {
    this.value = JsonNullable.<Long>of(value);
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return HourlyUsageMeasurement
   */
  @JsonAnySetter
  public HourlyUsageMeasurement putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this HourlyUsageMeasurement object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageMeasurement hourlyUsageMeasurement = (HourlyUsageMeasurement) o;
    return Objects.equals(this.usageType, hourlyUsageMeasurement.usageType)
        && Objects.equals(this.value, hourlyUsageMeasurement.value)
        && Objects.equals(this.additionalProperties, hourlyUsageMeasurement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageType, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageMeasurement {\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
