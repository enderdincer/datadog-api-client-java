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

/** Service definition v2.1 for providing service metadata and integrations. */
@JsonPropertyOrder({
  ServiceDefinitionV2Dot1.JSON_PROPERTY_APPLICATION,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_CONTACTS,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_DD_SERVICE,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_DESCRIPTION,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_EXTENSIONS,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_INTEGRATIONS,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_LIFECYCLE,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_LINKS,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_SCHEMA_VERSION,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_TAGS,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_TEAM,
  ServiceDefinitionV2Dot1.JSON_PROPERTY_TIER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Dot1 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  private List<ServiceDefinitionV2Dot1Contact> contacts = null;

  public static final String JSON_PROPERTY_DD_SERVICE = "dd-service";
  private String ddService;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Map<String, Object> extensions = null;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private ServiceDefinitionV2Dot1Integrations integrations;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<ServiceDefinitionV2Dot1Link> links = null;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema-version";
  private ServiceDefinitionV2Dot1Version schemaVersion = ServiceDefinitionV2Dot1Version.V2_1;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public ServiceDefinitionV2Dot1() {}

  @JsonCreator
  public ServiceDefinitionV2Dot1(
      @JsonProperty(required = true, value = JSON_PROPERTY_DD_SERVICE) String ddService,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEMA_VERSION)
          ServiceDefinitionV2Dot1Version schemaVersion) {
    this.ddService = ddService;
    this.schemaVersion = schemaVersion;
    this.unparsed |= !schemaVersion.isValid();
  }

  public ServiceDefinitionV2Dot1 application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Identifier for a group of related services serving a product feature, which the service is a
   * part of.
   *
   * @return application
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public ServiceDefinitionV2Dot1 contacts(List<ServiceDefinitionV2Dot1Contact> contacts) {
    this.contacts = contacts;
    for (ServiceDefinitionV2Dot1Contact item : contacts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceDefinitionV2Dot1 addContactsItem(ServiceDefinitionV2Dot1Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    this.unparsed |= contactsItem.unparsed;
    return this;
  }

  /**
   * A list of contacts related to the services.
   *
   * @return contacts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ServiceDefinitionV2Dot1Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<ServiceDefinitionV2Dot1Contact> contacts) {
    this.contacts = contacts;
  }

  public ServiceDefinitionV2Dot1 ddService(String ddService) {
    this.ddService = ddService;
    return this;
  }

  /**
   * Unique identifier of the service. Must be unique across all services and is used to match with
   * a service in Datadog.
   *
   * @return ddService
   */
  @JsonProperty(JSON_PROPERTY_DD_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDdService() {
    return ddService;
  }

  public void setDdService(String ddService) {
    this.ddService = ddService;
  }

  public ServiceDefinitionV2Dot1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the service.
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

  public ServiceDefinitionV2Dot1 extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ServiceDefinitionV2Dot1 putExtensionsItem(String key, Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

  /**
   * Extensions to v2.1 schema.
   *
   * @return extensions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  public ServiceDefinitionV2Dot1 integrations(ServiceDefinitionV2Dot1Integrations integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * Third party integrations that Datadog supports.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV2Dot1Integrations getIntegrations() {
    return integrations;
  }

  public void setIntegrations(ServiceDefinitionV2Dot1Integrations integrations) {
    this.integrations = integrations;
  }

  public ServiceDefinitionV2Dot1 lifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * The current life cycle phase of the service.
   *
   * @return lifecycle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
  }

  public ServiceDefinitionV2Dot1 links(List<ServiceDefinitionV2Dot1Link> links) {
    this.links = links;
    for (ServiceDefinitionV2Dot1Link item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceDefinitionV2Dot1 addLinksItem(ServiceDefinitionV2Dot1Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * A list of links related to the services.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ServiceDefinitionV2Dot1Link> getLinks() {
    return links;
  }

  public void setLinks(List<ServiceDefinitionV2Dot1Link> links) {
    this.links = links;
  }

  public ServiceDefinitionV2Dot1 schemaVersion(ServiceDefinitionV2Dot1Version schemaVersion) {
    this.schemaVersion = schemaVersion;
    this.unparsed |= !schemaVersion.isValid();
    return this;
  }

  /**
   * Schema version being used.
   *
   * @return schemaVersion
   */
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV2Dot1Version getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(ServiceDefinitionV2Dot1Version schemaVersion) {
    if (!schemaVersion.isValid()) {
      this.unparsed = true;
    }
    this.schemaVersion = schemaVersion;
  }

  public ServiceDefinitionV2Dot1 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ServiceDefinitionV2Dot1 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of custom tags.
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

  public ServiceDefinitionV2Dot1 team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Team that owns the service. It is used to locate a team defined in Datadog Teams if it exists.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public ServiceDefinitionV2Dot1 tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Importance of the service.
   *
   * @return tier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
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
   * @return ServiceDefinitionV2Dot1
   */
  @JsonAnySetter
  public ServiceDefinitionV2Dot1 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceDefinitionV2Dot1 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Dot1 serviceDefinitionV2Dot1 = (ServiceDefinitionV2Dot1) o;
    return Objects.equals(this.application, serviceDefinitionV2Dot1.application)
        && Objects.equals(this.contacts, serviceDefinitionV2Dot1.contacts)
        && Objects.equals(this.ddService, serviceDefinitionV2Dot1.ddService)
        && Objects.equals(this.description, serviceDefinitionV2Dot1.description)
        && Objects.equals(this.extensions, serviceDefinitionV2Dot1.extensions)
        && Objects.equals(this.integrations, serviceDefinitionV2Dot1.integrations)
        && Objects.equals(this.lifecycle, serviceDefinitionV2Dot1.lifecycle)
        && Objects.equals(this.links, serviceDefinitionV2Dot1.links)
        && Objects.equals(this.schemaVersion, serviceDefinitionV2Dot1.schemaVersion)
        && Objects.equals(this.tags, serviceDefinitionV2Dot1.tags)
        && Objects.equals(this.team, serviceDefinitionV2Dot1.team)
        && Objects.equals(this.tier, serviceDefinitionV2Dot1.tier)
        && Objects.equals(this.additionalProperties, serviceDefinitionV2Dot1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        application,
        contacts,
        ddService,
        description,
        extensions,
        integrations,
        lifecycle,
        links,
        schemaVersion,
        tags,
        team,
        tier,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Dot1 {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    ddService: ").append(toIndentedString(ddService)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
