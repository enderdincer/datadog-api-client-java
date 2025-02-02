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

/** Updated SLO List widget. */
@JsonPropertyOrder({
  SLOListWidgetRequest.JSON_PROPERTY_QUERY,
  SLOListWidgetRequest.JSON_PROPERTY_REQUEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private SLOListWidgetQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private SLOListWidgetRequestType requestType;

  public SLOListWidgetRequest() {}

  @JsonCreator
  public SLOListWidgetRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) SLOListWidgetQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          SLOListWidgetRequestType requestType) {
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public SLOListWidgetRequest query(SLOListWidgetQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Updated SLO List widget.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOListWidgetQuery getQuery() {
    return query;
  }

  public void setQuery(SLOListWidgetQuery query) {
    this.query = query;
  }

  public SLOListWidgetRequest requestType(SLOListWidgetRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Widget request type.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOListWidgetRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(SLOListWidgetRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
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
   * @return SLOListWidgetRequest
   */
  @JsonAnySetter
  public SLOListWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOListWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListWidgetRequest sloListWidgetRequest = (SLOListWidgetRequest) o;
    return Objects.equals(this.query, sloListWidgetRequest.query)
        && Objects.equals(this.requestType, sloListWidgetRequest.requestType)
        && Objects.equals(this.additionalProperties, sloListWidgetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, requestType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListWidgetRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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
