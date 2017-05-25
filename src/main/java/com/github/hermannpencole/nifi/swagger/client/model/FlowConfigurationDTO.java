/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FlowConfigurationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T23:49:37.943+02:00")
public class FlowConfigurationDTO {
  @SerializedName("supportsConfigurableAuthorizer")
  private Boolean supportsConfigurableAuthorizer = false;

  @SerializedName("autoRefreshIntervalSeconds")
  private Long autoRefreshIntervalSeconds = null;

  @SerializedName("currentTime")
  private String currentTime = null;

  @SerializedName("timeOffset")
  private Integer timeOffset = null;

   /**
   * Whether this NiFi supports a configurable authorizer.
   * @return supportsConfigurableAuthorizer
  **/
  @ApiModelProperty(example = "null", value = "Whether this NiFi supports a configurable authorizer.")
  public Boolean getSupportsConfigurableAuthorizer() {
    return supportsConfigurableAuthorizer;
  }

   /**
   * The interval in seconds between the automatic NiFi refresh requests.
   * @return autoRefreshIntervalSeconds
  **/
  @ApiModelProperty(example = "null", value = "The interval in seconds between the automatic NiFi refresh requests.")
  public Long getAutoRefreshIntervalSeconds() {
    return autoRefreshIntervalSeconds;
  }

  public FlowConfigurationDTO currentTime(String currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * The current time on the system.
   * @return currentTime
  **/
  @ApiModelProperty(example = "null", value = "The current time on the system.")
  public String getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }

  public FlowConfigurationDTO timeOffset(Integer timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

   /**
   * The time offset of the system.
   * @return timeOffset
  **/
  @ApiModelProperty(example = "null", value = "The time offset of the system.")
  public Integer getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Integer timeOffset) {
    this.timeOffset = timeOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowConfigurationDTO flowConfigurationDTO = (FlowConfigurationDTO) o;
    return Objects.equals(this.supportsConfigurableAuthorizer, flowConfigurationDTO.supportsConfigurableAuthorizer) &&
        Objects.equals(this.autoRefreshIntervalSeconds, flowConfigurationDTO.autoRefreshIntervalSeconds) &&
        Objects.equals(this.currentTime, flowConfigurationDTO.currentTime) &&
        Objects.equals(this.timeOffset, flowConfigurationDTO.timeOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsConfigurableAuthorizer, autoRefreshIntervalSeconds, currentTime, timeOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowConfigurationDTO {\n");
    
    sb.append("    supportsConfigurableAuthorizer: ").append(toIndentedString(supportsConfigurableAuthorizer)).append("\n");
    sb.append("    autoRefreshIntervalSeconds: ").append(toIndentedString(autoRefreshIntervalSeconds)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
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
