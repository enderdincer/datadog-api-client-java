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

/** The PagerDuty service that is available for integration with Datadog. */
@JsonPropertyOrder({
  PagerDutyService.JSON_PROPERTY_SERVICE_KEY,
  PagerDutyService.JSON_PROPERTY_SERVICE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PagerDutyService {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERVICE_KEY = "service_key";
  private String serviceKey;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public PagerDutyService() {}

  @JsonCreator
  public PagerDutyService(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_KEY) String serviceKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_NAME) String serviceName) {
    this.serviceKey = serviceKey;
    this.serviceName = serviceName;
  }

  public PagerDutyService serviceKey(String serviceKey) {
    this.serviceKey = serviceKey;
    return this;
  }

  /**
   * Your service key in PagerDuty.
   *
   * @return serviceKey
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceKey() {
    return serviceKey;
  }

  public void setServiceKey(String serviceKey) {
    this.serviceKey = serviceKey;
  }

  public PagerDutyService serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Your service name associated with a service key in PagerDuty.
   *
   * @return serviceName
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
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
   * @return PagerDutyService
   */
  @JsonAnySetter
  public PagerDutyService putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PagerDutyService object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagerDutyService pagerDutyService = (PagerDutyService) o;
    return Objects.equals(this.serviceKey, pagerDutyService.serviceKey)
        && Objects.equals(this.serviceName, pagerDutyService.serviceName)
        && Objects.equals(this.additionalProperties, pagerDutyService.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceKey, serviceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagerDutyService {\n");
    sb.append("    serviceKey: ").append(toIndentedString(serviceKey)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
