/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.3.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * StatusSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class StatusSnapshotDTO {
  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("statusMetrics")
  private Map<String, Long> statusMetrics = new HashMap<String, Long>();

  public StatusSnapshotDTO timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the snapshot.
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "The timestamp of the snapshot.")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public StatusSnapshotDTO statusMetrics(Map<String, Long> statusMetrics) {
    this.statusMetrics = statusMetrics;
    return this;
  }

  public StatusSnapshotDTO putStatusMetricsItem(String key, Long statusMetricsItem) {
    this.statusMetrics.put(key, statusMetricsItem);
    return this;
  }

   /**
   * The status metrics.
   * @return statusMetrics
  **/
  @ApiModelProperty(example = "null", value = "The status metrics.")
  public Map<String, Long> getStatusMetrics() {
    return statusMetrics;
  }

  public void setStatusMetrics(Map<String, Long> statusMetrics) {
    this.statusMetrics = statusMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusSnapshotDTO statusSnapshotDTO = (StatusSnapshotDTO) o;
    return Objects.equals(this.timestamp, statusSnapshotDTO.timestamp) &&
        Objects.equals(this.statusMetrics, statusSnapshotDTO.statusMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, statusMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusSnapshotDTO {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    statusMetrics: ").append(toIndentedString(statusMetrics)).append("\n");
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

