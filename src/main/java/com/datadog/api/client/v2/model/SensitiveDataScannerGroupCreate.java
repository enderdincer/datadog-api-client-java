/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Data related to the creation of a group. */
@JsonPropertyOrder({
  SensitiveDataScannerGroupCreate.JSON_PROPERTY_ATTRIBUTES,
  SensitiveDataScannerGroupCreate.JSON_PROPERTY_RELATIONSHIPS,
  SensitiveDataScannerGroupCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SensitiveDataScannerGroupAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SensitiveDataScannerGroupRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerGroupType type =
      SensitiveDataScannerGroupType.SENSITIVE_DATA_SCANNER_GROUP;

  public SensitiveDataScannerGroupCreate() {}

  @JsonCreator
  public SensitiveDataScannerGroupCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SensitiveDataScannerGroupAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SensitiveDataScannerGroupType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SensitiveDataScannerGroupCreate attributes(
      SensitiveDataScannerGroupAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the Sensitive Data Scanner group.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerGroupAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SensitiveDataScannerGroupAttributes attributes) {
    this.attributes = attributes;
  }

  public SensitiveDataScannerGroupCreate relationships(
      SensitiveDataScannerGroupRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of the group.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SensitiveDataScannerGroupRelationships relationships) {
    this.relationships = relationships;
  }

  public SensitiveDataScannerGroupCreate type(SensitiveDataScannerGroupType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Sensitive Data Scanner group type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerGroupType getType() {
    return type;
  }

  public void setType(SensitiveDataScannerGroupType type) {
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
   * @return SensitiveDataScannerGroupCreate
   */
  @JsonAnySetter
  public SensitiveDataScannerGroupCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerGroupCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupCreate sensitiveDataScannerGroupCreate =
        (SensitiveDataScannerGroupCreate) o;
    return Objects.equals(this.attributes, sensitiveDataScannerGroupCreate.attributes)
        && Objects.equals(this.relationships, sensitiveDataScannerGroupCreate.relationships)
        && Objects.equals(this.type, sensitiveDataScannerGroupCreate.type)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerGroupCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGroupCreate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
