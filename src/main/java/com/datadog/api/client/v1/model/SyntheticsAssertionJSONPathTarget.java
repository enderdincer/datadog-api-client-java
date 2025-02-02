/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An assertion for the <code>validatesJSONPath</code> operator. */
@JsonPropertyOrder({
  SyntheticsAssertionJSONPathTarget.JSON_PROPERTY_OPERATOR,
  SyntheticsAssertionJSONPathTarget.JSON_PROPERTY_PROPERTY,
  SyntheticsAssertionJSONPathTarget.JSON_PROPERTY_TARGET,
  SyntheticsAssertionJSONPathTarget.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAssertionJSONPathTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsAssertionJSONPathOperator operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private SyntheticsAssertionJSONPathTargetTarget target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsAssertionType type;

  public SyntheticsAssertionJSONPathTarget() {}

  @JsonCreator
  public SyntheticsAssertionJSONPathTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          SyntheticsAssertionJSONPathOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsAssertionType type) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsAssertionJSONPathTarget operator(SyntheticsAssertionJSONPathOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Assertion operator to apply.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAssertionJSONPathOperator getOperator() {
    return operator;
  }

  public void setOperator(SyntheticsAssertionJSONPathOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public SyntheticsAssertionJSONPathTarget property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The associated assertion property.
   *
   * @return property
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public SyntheticsAssertionJSONPathTarget target(SyntheticsAssertionJSONPathTargetTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Composed target for <code>validatesJSONPath</code> operator.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsAssertionJSONPathTargetTarget getTarget() {
    return target;
  }

  public void setTarget(SyntheticsAssertionJSONPathTargetTarget target) {
    this.target = target;
  }

  public SyntheticsAssertionJSONPathTarget type(SyntheticsAssertionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the assertion.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAssertionType getType() {
    return type;
  }

  public void setType(SyntheticsAssertionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsAssertionJSONPathTarget
   */
  @JsonAnySetter
  public SyntheticsAssertionJSONPathTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAssertionJSONPathTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAssertionJSONPathTarget syntheticsAssertionJsonPathTarget =
        (SyntheticsAssertionJSONPathTarget) o;
    return Objects.equals(this.operator, syntheticsAssertionJsonPathTarget.operator)
        && Objects.equals(this.property, syntheticsAssertionJsonPathTarget.property)
        && Objects.equals(this.target, syntheticsAssertionJsonPathTarget.target)
        && Objects.equals(this.type, syntheticsAssertionJsonPathTarget.type)
        && Objects.equals(
            this.additionalProperties, syntheticsAssertionJsonPathTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, property, target, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAssertionJSONPathTarget {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
