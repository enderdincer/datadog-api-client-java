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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Optional attributes for the status of a bulk tag configuration request. */
@JsonPropertyOrder({
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_EMAILS,
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_EXCLUDE_TAGS_MODE,
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_STATUS,
  MetricBulkTagConfigStatusAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricBulkTagConfigStatusAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = null;

  public static final String JSON_PROPERTY_EXCLUDE_TAGS_MODE = "exclude_tags_mode";
  private Boolean excludeTagsMode;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricBulkTagConfigStatusAttributes emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public MetricBulkTagConfigStatusAttributes addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * A list of account emails to notify when the configuration is applied.
   *
   * @return emails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public MetricBulkTagConfigStatusAttributes excludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
    return this;
  }

  /**
   * When set to true, the configuration will exclude the configured tags and include any other
   * submitted tags. When set to false, the configuration will include the configured tags and
   * exclude any other submitted tags.
   *
   * @return excludeTagsMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_TAGS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeTagsMode() {
    return excludeTagsMode;
  }

  public void setExcludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
  }

  public MetricBulkTagConfigStatusAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the request.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MetricBulkTagConfigStatusAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricBulkTagConfigStatusAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tag names to apply to the configuration.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return MetricBulkTagConfigStatusAttributes
   */
  @JsonAnySetter
  public MetricBulkTagConfigStatusAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricBulkTagConfigStatusAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigStatusAttributes metricBulkTagConfigStatusAttributes =
        (MetricBulkTagConfigStatusAttributes) o;
    return Objects.equals(this.emails, metricBulkTagConfigStatusAttributes.emails)
        && Objects.equals(this.excludeTagsMode, metricBulkTagConfigStatusAttributes.excludeTagsMode)
        && Objects.equals(this.status, metricBulkTagConfigStatusAttributes.status)
        && Objects.equals(this.tags, metricBulkTagConfigStatusAttributes.tags)
        && Objects.equals(
            this.additionalProperties, metricBulkTagConfigStatusAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, excludeTagsMode, status, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricBulkTagConfigStatusAttributes {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    excludeTagsMode: ").append(toIndentedString(excludeTagsMode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
