/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing information about the tests triggered. */
@ApiModel(description = "Object containing information about the tests triggered.")
@JsonPropertyOrder({
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_BATCH_ID,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_LOCATIONS,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_RESULTS,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_TRIGGERED_CHECK_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTriggerCITestsResponse {
  public static final String JSON_PROPERTY_BATCH_ID = "batch_id";
  private String batchId;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<SyntheticsTriggerCITestLocation> locations = null;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsTriggerCITestRunResult> results = null;

  public static final String JSON_PROPERTY_TRIGGERED_CHECK_IDS = "triggered_check_ids";
  private List<String> triggeredCheckIds = null;

  public SyntheticsTriggerCITestsResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The public ID of the batch triggered.
   *
   * @return batchId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public ID of the batch triggered.")
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public SyntheticsTriggerCITestsResponse locations(
      List<SyntheticsTriggerCITestLocation> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsTriggerCITestsResponse addLocationsItem(
      SyntheticsTriggerCITestLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * List of Synthetics locations.
   *
   * @return locations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Synthetics locations.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTriggerCITestLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<SyntheticsTriggerCITestLocation> locations) {
    this.locations = locations;
  }

  public SyntheticsTriggerCITestsResponse results(List<SyntheticsTriggerCITestRunResult> results) {
    this.results = results;
    return this;
  }

  public SyntheticsTriggerCITestsResponse addResultsItem(
      SyntheticsTriggerCITestRunResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Information about the tests runs.
   *
   * @return results
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the tests runs.")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTriggerCITestRunResult> getResults() {
    return results;
  }

  public void setResults(List<SyntheticsTriggerCITestRunResult> results) {
    this.results = results;
  }

  public SyntheticsTriggerCITestsResponse triggeredCheckIds(List<String> triggeredCheckIds) {
    this.triggeredCheckIds = triggeredCheckIds;
    return this;
  }

  public SyntheticsTriggerCITestsResponse addTriggeredCheckIdsItem(String triggeredCheckIdsItem) {
    if (this.triggeredCheckIds == null) {
      this.triggeredCheckIds = new ArrayList<>();
    }
    this.triggeredCheckIds.add(triggeredCheckIdsItem);
    return this;
  }

  /**
   * The public IDs of the Synthetics test triggered.
   *
   * @return triggeredCheckIds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public IDs of the Synthetics test triggered.")
  @JsonProperty(JSON_PROPERTY_TRIGGERED_CHECK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTriggeredCheckIds() {
    return triggeredCheckIds;
  }

  public void setTriggeredCheckIds(List<String> triggeredCheckIds) {
    this.triggeredCheckIds = triggeredCheckIds;
  }

  /** Return true if this SyntheticsTriggerCITestsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerCITestsResponse syntheticsTriggerCITestsResponse =
        (SyntheticsTriggerCITestsResponse) o;
    return Objects.equals(this.batchId, syntheticsTriggerCITestsResponse.batchId)
        && Objects.equals(this.locations, syntheticsTriggerCITestsResponse.locations)
        && Objects.equals(this.results, syntheticsTriggerCITestsResponse.results)
        && Objects.equals(
            this.triggeredCheckIds, syntheticsTriggerCITestsResponse.triggeredCheckIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, locations, results, triggeredCheckIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerCITestsResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    triggeredCheckIds: ").append(toIndentedString(triggeredCheckIds)).append("\n");
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
