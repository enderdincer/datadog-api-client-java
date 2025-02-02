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

/** Details of a rule. */
@JsonPropertyOrder({
  OutcomesResponseIncludedRuleAttributes.JSON_PROPERTY_NAME,
  OutcomesResponseIncludedRuleAttributes.JSON_PROPERTY_SCORECARD_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OutcomesResponseIncludedRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCORECARD_NAME = "scorecard_name";
  private String scorecardName;

  public OutcomesResponseIncludedRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the rule.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutcomesResponseIncludedRuleAttributes scorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
    return this;
  }

  /**
   * The scorecard name to which this rule must belong.
   *
   * @return scorecardName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORECARD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScorecardName() {
    return scorecardName;
  }

  public void setScorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
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
   * @return OutcomesResponseIncludedRuleAttributes
   */
  @JsonAnySetter
  public OutcomesResponseIncludedRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OutcomesResponseIncludedRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomesResponseIncludedRuleAttributes outcomesResponseIncludedRuleAttributes =
        (OutcomesResponseIncludedRuleAttributes) o;
    return Objects.equals(this.name, outcomesResponseIncludedRuleAttributes.name)
        && Objects.equals(this.scorecardName, outcomesResponseIncludedRuleAttributes.scorecardName)
        && Objects.equals(
            this.additionalProperties, outcomesResponseIncludedRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scorecardName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomesResponseIncludedRuleAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scorecardName: ").append(toIndentedString(scorecardName)).append("\n");
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
