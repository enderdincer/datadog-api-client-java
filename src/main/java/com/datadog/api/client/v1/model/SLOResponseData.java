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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A service level objective object includes a service level indicator, thresholds for one or more
 * timeframes, and metadata (<code>name</code>, <code>description</code>, <code>tags</code>, etc.).
 */
@JsonPropertyOrder({
  SLOResponseData.JSON_PROPERTY_CONFIGURED_ALERT_IDS,
  SLOResponseData.JSON_PROPERTY_CREATED_AT,
  SLOResponseData.JSON_PROPERTY_CREATOR,
  SLOResponseData.JSON_PROPERTY_DESCRIPTION,
  SLOResponseData.JSON_PROPERTY_GROUPS,
  SLOResponseData.JSON_PROPERTY_ID,
  SLOResponseData.JSON_PROPERTY_MODIFIED_AT,
  SLOResponseData.JSON_PROPERTY_MONITOR_IDS,
  SLOResponseData.JSON_PROPERTY_MONITOR_TAGS,
  SLOResponseData.JSON_PROPERTY_NAME,
  SLOResponseData.JSON_PROPERTY_QUERY,
  SLOResponseData.JSON_PROPERTY_TAGS,
  SLOResponseData.JSON_PROPERTY_TARGET_THRESHOLD,
  SLOResponseData.JSON_PROPERTY_THRESHOLDS,
  SLOResponseData.JSON_PROPERTY_TIMEFRAME,
  SLOResponseData.JSON_PROPERTY_TYPE,
  SLOResponseData.JSON_PROPERTY_WARNING_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURED_ALERT_IDS = "configured_alert_ids";
  private List<Long> configuredAlertIds = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<Long> monitorIds = null;

  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ServiceLevelObjectiveQuery query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TARGET_THRESHOLD = "target_threshold";
  private Double targetThreshold;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SLOThreshold> thresholds = null;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOTimeframe timeframe;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;

  public static final String JSON_PROPERTY_WARNING_THRESHOLD = "warning_threshold";
  private Double warningThreshold;

  public SLOResponseData configuredAlertIds(List<Long> configuredAlertIds) {
    this.configuredAlertIds = configuredAlertIds;
    return this;
  }

  public SLOResponseData addConfiguredAlertIdsItem(Long configuredAlertIdsItem) {
    if (this.configuredAlertIds == null) {
      this.configuredAlertIds = new ArrayList<>();
    }
    this.configuredAlertIds.add(configuredAlertIdsItem);
    return this;
  }

  /**
   * A list of SLO monitors IDs that reference this SLO. This field is returned only when <code>
   * with_configured_alert_ids</code> parameter is true in query.
   *
   * @return configuredAlertIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURED_ALERT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getConfiguredAlertIds() {
    return configuredAlertIds;
  }

  public void setConfiguredAlertIds(List<Long> configuredAlertIds) {
    this.configuredAlertIds = configuredAlertIds;
  }

  /**
   * Creation timestamp (UNIX time in seconds)
   *
   * <p>Always included in service level objective responses.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Object describing the creator of the shared element.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getCreator() {
    return creator;
  }

  public SLOResponseData description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A user-defined description of the service level objective.
   *
   * <p>Always included in service level objective responses (but may be <code>null</code>).
   * Optional in create/update requests.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public SLOResponseData groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public SLOResponseData addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * A list of (up to 20) monitor groups that narrow the scope of a monitor service level objective.
   *
   * <p>Included in service level objective responses if it is not empty. Optional in create/update
   * requests for monitor service level objectives, but may only be used when then length of the
   * <code>monitor_ids</code> field is one.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  /**
   * A unique identifier for the service level objective object.
   *
   * <p>Always included in service level objective responses.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * Modification timestamp (UNIX time in seconds)
   *
   * <p>Always included in service level objective responses.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public SLOResponseData monitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
    return this;
  }

  public SLOResponseData addMonitorIdsItem(Long monitorIdsItem) {
    if (this.monitorIds == null) {
      this.monitorIds = new ArrayList<>();
    }
    this.monitorIds.add(monitorIdsItem);
    return this;
  }

  /**
   * A list of monitor ids that defines the scope of a monitor service level objective.
   * <strong>Required if type is <code>monitor</code></strong>.
   *
   * @return monitorIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getMonitorIds() {
    return monitorIds;
  }

  public void setMonitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
  }

  public SLOResponseData monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public SLOResponseData addMonitorTagsItem(String monitorTagsItem) {
    if (this.monitorTags == null) {
      this.monitorTags = new ArrayList<>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

  /**
   * The union of monitor tags for all monitors referenced by the <code>monitor_ids</code> field.
   * Always included in service level objective responses for monitor service level objectives (but
   * may be empty). Ignored in create/update requests. Does not affect which monitors are included
   * in the service level objective (that is determined entirely by the <code>monitor_ids</code>
   * field).
   *
   * @return monitorTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMonitorTags() {
    return monitorTags;
  }

  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  public SLOResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service level objective object.
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

  public SLOResponseData query(ServiceLevelObjectiveQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * A metric-based SLO. <strong>Required if type is <code>metric</code></strong>. Note that Datadog
   * only allows the sum by aggregator to be used because this will sum up all request counts
   * instead of averaging them, or taking the max or min of all of those requests.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceLevelObjectiveQuery getQuery() {
    return query;
  }

  public void setQuery(ServiceLevelObjectiveQuery query) {
    this.query = query;
  }

  public SLOResponseData tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SLOResponseData addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with this service level objective. Always included in service level
   * objective responses (but may be empty). Optional in create/update requests.
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

  public SLOResponseData targetThreshold(Double targetThreshold) {
    this.targetThreshold = targetThreshold;
    return this;
  }

  /**
   * The target threshold such that when the service level indicator is above this threshold over
   * the given timeframe, the objective is being met.
   *
   * @return targetThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTargetThreshold() {
    return targetThreshold;
  }

  public void setTargetThreshold(Double targetThreshold) {
    this.targetThreshold = targetThreshold;
  }

  public SLOResponseData thresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
    for (SLOThreshold item : thresholds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOResponseData addThresholdsItem(SLOThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    this.unparsed |= thresholdsItem.unparsed;
    return this;
  }

  /**
   * The thresholds (timeframes and associated targets) for this service level objective object.
   *
   * @return thresholds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOThreshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }

  public SLOResponseData timeframe(SLOTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * The SLO time window options.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(SLOTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  public SLOResponseData type(SLOType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOType getType() {
    return type;
  }

  public void setType(SLOType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SLOResponseData warningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  /**
   * The optional warning threshold such that when the service level indicator is below this value
   * for the given threshold, but above the target threshold, the objective appears in a "warning"
   * state. This value must be greater than the target threshold.
   *
   * @return warningThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
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
   * @return SLOResponseData
   */
  @JsonAnySetter
  public SLOResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOResponseData sloResponseData = (SLOResponseData) o;
    return Objects.equals(this.configuredAlertIds, sloResponseData.configuredAlertIds)
        && Objects.equals(this.createdAt, sloResponseData.createdAt)
        && Objects.equals(this.creator, sloResponseData.creator)
        && Objects.equals(this.description, sloResponseData.description)
        && Objects.equals(this.groups, sloResponseData.groups)
        && Objects.equals(this.id, sloResponseData.id)
        && Objects.equals(this.modifiedAt, sloResponseData.modifiedAt)
        && Objects.equals(this.monitorIds, sloResponseData.monitorIds)
        && Objects.equals(this.monitorTags, sloResponseData.monitorTags)
        && Objects.equals(this.name, sloResponseData.name)
        && Objects.equals(this.query, sloResponseData.query)
        && Objects.equals(this.tags, sloResponseData.tags)
        && Objects.equals(this.targetThreshold, sloResponseData.targetThreshold)
        && Objects.equals(this.thresholds, sloResponseData.thresholds)
        && Objects.equals(this.timeframe, sloResponseData.timeframe)
        && Objects.equals(this.type, sloResponseData.type)
        && Objects.equals(this.warningThreshold, sloResponseData.warningThreshold)
        && Objects.equals(this.additionalProperties, sloResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configuredAlertIds,
        createdAt,
        creator,
        description,
        groups,
        id,
        modifiedAt,
        monitorIds,
        monitorTags,
        name,
        query,
        tags,
        targetThreshold,
        thresholds,
        timeframe,
        type,
        warningThreshold,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOResponseData {\n");
    sb.append("    configuredAlertIds: ").append(toIndentedString(configuredAlertIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetThreshold: ").append(toIndentedString(targetThreshold)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
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
