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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.TableWidgetRequest;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The table visualization is available on timeboards and screenboards. It displays columns of metrics grouped by tag key.
 */
@ApiModel(description = "The table visualization is available on timeboards and screenboards. It displays columns of metrics grouped by tag key.")
@JsonPropertyOrder({
  TableWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TableWidgetDefinition.JSON_PROPERTY_TIME,
  TableWidgetDefinition.JSON_PROPERTY_TITLE,
  TableWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  TableWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  TableWidgetDefinition.JSON_PROPERTY_TYPE
})

public class TableWidgetDefinition implements WidgetDefinition {
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TableWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "query_table";


  public TableWidgetDefinition requests(List<TableWidgetRequest> requests) {
    
    this.requests = requests;
    return this;
  }

  public TableWidgetDefinition addRequestsItem(TableWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * TODO.
   * @return requests
  **/
  @ApiModelProperty(example = "[{\"q/apm_query/log_query\":\"<METRIC_1>{<SCOPE_1>}\"}]", required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TableWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<TableWidgetRequest> requests) {
    this.requests = requests;
  }


  public TableWidgetDefinition time(WidgetTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTime getTime() {
    return time;
  }


  public void setTime(WidgetTime time) {
    this.time = time;
  }


  public TableWidgetDefinition title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of your widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TableWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }


  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }


  public TableWidgetDefinition titleSize(String titleSize) {
    
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title.
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


   /**
   * Type of the widget.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the widget.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetDefinition tableWidgetDefinition = (TableWidgetDefinition) o;
    return Objects.equals(this.requests, tableWidgetDefinition.requests) &&
        Objects.equals(this.time, tableWidgetDefinition.time) &&
        Objects.equals(this.title, tableWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, tableWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, tableWidgetDefinition.titleSize) &&
        Objects.equals(this.type, tableWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, time, title, titleAlign, titleSize, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetDefinition {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

