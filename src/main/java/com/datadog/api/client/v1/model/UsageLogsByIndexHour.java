/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Number of indexed logs for each hour and index for a given organization. */
@JsonPropertyOrder({
  UsageLogsByIndexHour.JSON_PROPERTY_EVENT_COUNT,
  UsageLogsByIndexHour.JSON_PROPERTY_HOUR,
  UsageLogsByIndexHour.JSON_PROPERTY_INDEX_ID,
  UsageLogsByIndexHour.JSON_PROPERTY_INDEX_NAME,
  UsageLogsByIndexHour.JSON_PROPERTY_ORG_NAME,
  UsageLogsByIndexHour.JSON_PROPERTY_PUBLIC_ID,
  UsageLogsByIndexHour.JSON_PROPERTY_RETENTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLogsByIndexHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_COUNT = "event_count";
  private Long eventCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEX_ID = "index_id";
  private String indexId;

  public static final String JSON_PROPERTY_INDEX_NAME = "index_name";
  private String indexName;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RETENTION = "retention";
  private Long retention;

  public UsageLogsByIndexHour eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

  /**
   * The total number of indexed logs for the queried hour.
   *
   * @return eventCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventCount() {
    return eventCount;
  }

  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  public UsageLogsByIndexHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageLogsByIndexHour indexId(String indexId) {
    this.indexId = indexId;
    return this;
  }

  /**
   * The index ID for this usage.
   *
   * @return indexId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndexId() {
    return indexId;
  }

  public void setIndexId(String indexId) {
    this.indexId = indexId;
  }

  public UsageLogsByIndexHour indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * The user specified name for this index ID.
   *
   * @return indexName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public UsageLogsByIndexHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageLogsByIndexHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageLogsByIndexHour retention(Long retention) {
    this.retention = retention;
    return this;
  }

  /**
   * The retention period (in days) for this index ID.
   *
   * @return retention
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRetention() {
    return retention;
  }

  public void setRetention(Long retention) {
    this.retention = retention;
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
   * @return UsageLogsByIndexHour
   */
  @JsonAnySetter
  public UsageLogsByIndexHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageLogsByIndexHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsByIndexHour usageLogsByIndexHour = (UsageLogsByIndexHour) o;
    return Objects.equals(this.eventCount, usageLogsByIndexHour.eventCount)
        && Objects.equals(this.hour, usageLogsByIndexHour.hour)
        && Objects.equals(this.indexId, usageLogsByIndexHour.indexId)
        && Objects.equals(this.indexName, usageLogsByIndexHour.indexName)
        && Objects.equals(this.orgName, usageLogsByIndexHour.orgName)
        && Objects.equals(this.publicId, usageLogsByIndexHour.publicId)
        && Objects.equals(this.retention, usageLogsByIndexHour.retention)
        && Objects.equals(this.additionalProperties, usageLogsByIndexHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventCount, hour, indexId, indexName, orgName, publicId, retention, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsByIndexHour {\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
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
