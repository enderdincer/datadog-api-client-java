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

/** Pagination object. */
@JsonPropertyOrder({
  Pagination.JSON_PROPERTY_TOTAL_COUNT,
  Pagination.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Pagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public Pagination totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total count.
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Pagination totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Total count of elements matched by the filter.
   *
   * @return totalFilteredCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
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
   * @return Pagination
   */
  @JsonAnySetter
  public Pagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Pagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.totalCount, pagination.totalCount)
        && Objects.equals(this.totalFilteredCount, pagination.totalFilteredCount)
        && Objects.equals(this.additionalProperties, pagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, totalFilteredCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
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
