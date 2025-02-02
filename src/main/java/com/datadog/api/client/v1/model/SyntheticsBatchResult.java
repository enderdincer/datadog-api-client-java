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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object with the results of a Synthetic batch. */
@JsonPropertyOrder({
  SyntheticsBatchResult.JSON_PROPERTY_DEVICE,
  SyntheticsBatchResult.JSON_PROPERTY_DURATION,
  SyntheticsBatchResult.JSON_PROPERTY_EXECUTION_RULE,
  SyntheticsBatchResult.JSON_PROPERTY_LOCATION,
  SyntheticsBatchResult.JSON_PROPERTY_RESULT_ID,
  SyntheticsBatchResult.JSON_PROPERTY_RETRIES,
  SyntheticsBatchResult.JSON_PROPERTY_STATUS,
  SyntheticsBatchResult.JSON_PROPERTY_TEST_NAME,
  SyntheticsBatchResult.JSON_PROPERTY_TEST_PUBLIC_ID,
  SyntheticsBatchResult.JSON_PROPERTY_TEST_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBatchResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEVICE = "device";
  private SyntheticsDeviceID device;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_EXECUTION_RULE = "execution_rule";
  private SyntheticsTestExecutionRule executionRule;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Double retries;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsStatus status;

  public static final String JSON_PROPERTY_TEST_NAME = "test_name";
  private String testName;

  public static final String JSON_PROPERTY_TEST_PUBLIC_ID = "test_public_id";
  private String testPublicId;

  public static final String JSON_PROPERTY_TEST_TYPE = "test_type";
  private SyntheticsTestDetailsType testType;

  public SyntheticsBatchResult device(SyntheticsDeviceID device) {
    this.device = device;
    this.unparsed |= !device.isValid();
    return this;
  }

  /**
   * The device ID.
   *
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsDeviceID getDevice() {
    return device;
  }

  public void setDevice(SyntheticsDeviceID device) {
    if (!device.isValid()) {
      this.unparsed = true;
    }
    this.device = device;
  }

  public SyntheticsBatchResult duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Total duration in millisecond of the test.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public SyntheticsBatchResult executionRule(SyntheticsTestExecutionRule executionRule) {
    this.executionRule = executionRule;
    this.unparsed |= !executionRule.isValid();
    return this;
  }

  /**
   * Execution rule for a Synthetic test.
   *
   * @return executionRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestExecutionRule getExecutionRule() {
    return executionRule;
  }

  public void setExecutionRule(SyntheticsTestExecutionRule executionRule) {
    if (!executionRule.isValid()) {
      this.unparsed = true;
    }
    this.executionRule = executionRule;
  }

  public SyntheticsBatchResult location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the location.
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SyntheticsBatchResult resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * The ID of the result to get.
   *
   * @return resultId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public SyntheticsBatchResult retries(Double retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Number of times this result has been retried.
   *
   * @return retries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRetries() {
    return retries;
  }

  public void setRetries(Double retries) {
    this.retries = retries;
  }

  public SyntheticsBatchResult status(SyntheticsStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Determines whether or not the batch has passed, failed, or is in progress.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SyntheticsBatchResult testName(String testName) {
    this.testName = testName;
    return this;
  }

  /**
   * Name of the test.
   *
   * @return testName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTestName() {
    return testName;
  }

  public void setTestName(String testName) {
    this.testName = testName;
  }

  public SyntheticsBatchResult testPublicId(String testPublicId) {
    this.testPublicId = testPublicId;
    return this;
  }

  /**
   * The public ID of the Synthetic test.
   *
   * @return testPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTestPublicId() {
    return testPublicId;
  }

  public void setTestPublicId(String testPublicId) {
    this.testPublicId = testPublicId;
  }

  public SyntheticsBatchResult testType(SyntheticsTestDetailsType testType) {
    this.testType = testType;
    this.unparsed |= !testType.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test, either <code>api</code> or <code>browser</code>.
   *
   * @return testType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestDetailsType getTestType() {
    return testType;
  }

  public void setTestType(SyntheticsTestDetailsType testType) {
    if (!testType.isValid()) {
      this.unparsed = true;
    }
    this.testType = testType;
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
   * @return SyntheticsBatchResult
   */
  @JsonAnySetter
  public SyntheticsBatchResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBatchResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBatchResult syntheticsBatchResult = (SyntheticsBatchResult) o;
    return Objects.equals(this.device, syntheticsBatchResult.device)
        && Objects.equals(this.duration, syntheticsBatchResult.duration)
        && Objects.equals(this.executionRule, syntheticsBatchResult.executionRule)
        && Objects.equals(this.location, syntheticsBatchResult.location)
        && Objects.equals(this.resultId, syntheticsBatchResult.resultId)
        && Objects.equals(this.retries, syntheticsBatchResult.retries)
        && Objects.equals(this.status, syntheticsBatchResult.status)
        && Objects.equals(this.testName, syntheticsBatchResult.testName)
        && Objects.equals(this.testPublicId, syntheticsBatchResult.testPublicId)
        && Objects.equals(this.testType, syntheticsBatchResult.testType)
        && Objects.equals(this.additionalProperties, syntheticsBatchResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        device,
        duration,
        executionRule,
        location,
        resultId,
        retries,
        status,
        testName,
        testPublicId,
        testType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBatchResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    executionRule: ").append(toIndentedString(executionRule)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testPublicId: ").append(toIndentedString(testPublicId)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
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
