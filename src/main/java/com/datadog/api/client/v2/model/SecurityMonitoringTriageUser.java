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
import org.openapitools.jackson.nullable.JsonNullable;

/** Object representing a given user entity. */
@JsonPropertyOrder({
  SecurityMonitoringTriageUser.JSON_PROPERTY_HANDLE,
  SecurityMonitoringTriageUser.JSON_PROPERTY_ICON,
  SecurityMonitoringTriageUser.JSON_PROPERTY_ID,
  SecurityMonitoringTriageUser.JSON_PROPERTY_NAME,
  SecurityMonitoringTriageUser.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringTriageUser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public SecurityMonitoringTriageUser() {}

  @JsonCreator
  public SecurityMonitoringTriageUser(
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) String uuid) {
    this.uuid = uuid;
  }

  public SecurityMonitoringTriageUser handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle for this user account.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Gravatar icon associated to the user.
   *
   * @return icon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }

  public SecurityMonitoringTriageUser id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Numerical ID assigned by Datadog to this user account.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SecurityMonitoringTriageUser name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * The name for this user account.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public SecurityMonitoringTriageUser uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID assigned by Datadog to this user account.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return SecurityMonitoringTriageUser
   */
  @JsonAnySetter
  public SecurityMonitoringTriageUser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringTriageUser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringTriageUser securityMonitoringTriageUser = (SecurityMonitoringTriageUser) o;
    return Objects.equals(this.handle, securityMonitoringTriageUser.handle)
        && Objects.equals(this.icon, securityMonitoringTriageUser.icon)
        && Objects.equals(this.id, securityMonitoringTriageUser.id)
        && Objects.equals(this.name, securityMonitoringTriageUser.name)
        && Objects.equals(this.uuid, securityMonitoringTriageUser.uuid)
        && Objects.equals(
            this.additionalProperties, securityMonitoringTriageUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, icon, id, name, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringTriageUser {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
