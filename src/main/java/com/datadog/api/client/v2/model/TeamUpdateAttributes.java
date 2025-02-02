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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Team update attributes */
@JsonPropertyOrder({
  TeamUpdateAttributes.JSON_PROPERTY_AVATAR,
  TeamUpdateAttributes.JSON_PROPERTY_BANNER,
  TeamUpdateAttributes.JSON_PROPERTY_COLOR,
  TeamUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  TeamUpdateAttributes.JSON_PROPERTY_HANDLE,
  TeamUpdateAttributes.JSON_PROPERTY_HIDDEN_MODULES,
  TeamUpdateAttributes.JSON_PROPERTY_NAME,
  TeamUpdateAttributes.JSON_PROPERTY_VISIBLE_MODULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANNER = "banner";
  private JsonNullable<Long> banner = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_COLOR = "color";
  private Integer color;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_HIDDEN_MODULES = "hidden_modules";
  private List<String> hiddenModules = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VISIBLE_MODULES = "visible_modules";
  private List<String> visibleModules = null;

  public TeamUpdateAttributes() {}

  @JsonCreator
  public TeamUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.handle = handle;
    this.name = name;
  }

  public TeamUpdateAttributes avatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    return this;
  }

  /**
   * Unicode representation of the avatar for the team, limited to a single grapheme
   *
   * @return avatar
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAvatar() {
    return avatar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }

  public TeamUpdateAttributes banner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
    return this;
  }

  /**
   * Banner selection for the team
   *
   * @return banner
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getBanner() {
    return banner.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBanner_JsonNullable() {
    return banner;
  }

  @JsonProperty(JSON_PROPERTY_BANNER)
  public void setBanner_JsonNullable(JsonNullable<Long> banner) {
    this.banner = banner;
  }

  public void setBanner(Long banner) {
    this.banner = JsonNullable.<Long>of(banner);
  }

  public TeamUpdateAttributes color(Integer color) {
    this.color = color;
    return this;
  }

  /**
   * An identifier for the color representing the team minimum: 0 maximum: 13
   *
   * @return color
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getColor() {
    return color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }

  public TeamUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-form markdown description/content for the team's homepage
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TeamUpdateAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The team's identifier
   *
   * @return handle
   */
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public TeamUpdateAttributes hiddenModules(List<String> hiddenModules) {
    this.hiddenModules = hiddenModules;
    return this;
  }

  public TeamUpdateAttributes addHiddenModulesItem(String hiddenModulesItem) {
    if (this.hiddenModules == null) {
      this.hiddenModules = new ArrayList<>();
    }
    this.hiddenModules.add(hiddenModulesItem);
    return this;
  }

  /**
   * Collection of hidden modules for the team
   *
   * @return hiddenModules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDDEN_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHiddenModules() {
    return hiddenModules;
  }

  public void setHiddenModules(List<String> hiddenModules) {
    this.hiddenModules = hiddenModules;
  }

  public TeamUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamUpdateAttributes visibleModules(List<String> visibleModules) {
    this.visibleModules = visibleModules;
    return this;
  }

  public TeamUpdateAttributes addVisibleModulesItem(String visibleModulesItem) {
    if (this.visibleModules == null) {
      this.visibleModules = new ArrayList<>();
    }
    this.visibleModules.add(visibleModulesItem);
    return this;
  }

  /**
   * Collection of visible modules for the team
   *
   * @return visibleModules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getVisibleModules() {
    return visibleModules;
  }

  public void setVisibleModules(List<String> visibleModules) {
    this.visibleModules = visibleModules;
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
   * @return TeamUpdateAttributes
   */
  @JsonAnySetter
  public TeamUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamUpdateAttributes teamUpdateAttributes = (TeamUpdateAttributes) o;
    return Objects.equals(this.avatar, teamUpdateAttributes.avatar)
        && Objects.equals(this.banner, teamUpdateAttributes.banner)
        && Objects.equals(this.color, teamUpdateAttributes.color)
        && Objects.equals(this.description, teamUpdateAttributes.description)
        && Objects.equals(this.handle, teamUpdateAttributes.handle)
        && Objects.equals(this.hiddenModules, teamUpdateAttributes.hiddenModules)
        && Objects.equals(this.name, teamUpdateAttributes.name)
        && Objects.equals(this.visibleModules, teamUpdateAttributes.visibleModules)
        && Objects.equals(this.additionalProperties, teamUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avatar,
        banner,
        color,
        description,
        handle,
        hiddenModules,
        name,
        visibleModules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamUpdateAttributes {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    hiddenModules: ").append(toIndentedString(hiddenModules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visibleModules: ").append(toIndentedString(visibleModules)).append("\n");
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
