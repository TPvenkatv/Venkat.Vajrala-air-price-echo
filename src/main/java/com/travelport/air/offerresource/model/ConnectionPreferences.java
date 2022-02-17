package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnectionPreferences
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = ConnectionPreferencesAir.class, name = "ConnectionPreferencesAir"),
})


public class ConnectionPreferences  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("legSequence")
  @Valid
  private java.util.List<Integer> legSequence = null;

  @JsonProperty("maxConnectionDuration")
  private String maxConnectionDuration = null;

  @JsonProperty("maxOvernightDuration")
  private String maxOvernightDuration = null;

  @JsonProperty("ConnectionPoint")
  @Valid
  private java.util.List<String> connectionPoint = null;

  public ConnectionPreferences _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * Get _atType
   * @return _atType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public ConnectionPreferences legSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
    return this;
  }

  public ConnectionPreferences addLegSequenceItem(Integer legSequenceItem) {
    if (this.legSequence == null) {
      this.legSequence = new java.util.ArrayList<>();
    }
    this.legSequence.add(legSequenceItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequenceList
   * @return legSequence
   **/
  @Schema(description = "Assigned Type: c-1100:SegmentSequenceList")
  
    public java.util.List<Integer> getLegSequence() {
    return legSequence;
  }

  public void setLegSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
  }

  public ConnectionPreferences maxConnectionDuration(String maxConnectionDuration) {
    this.maxConnectionDuration = maxConnectionDuration;
    return this;
  }

  /**
   * The maximum acceptable duration of the connection
   * @return maxConnectionDuration
   **/
  @Schema(description = "The maximum acceptable duration of the connection")
  
    public String getMaxConnectionDuration() {
    return maxConnectionDuration;
  }

  public void setMaxConnectionDuration(String maxConnectionDuration) {
    this.maxConnectionDuration = maxConnectionDuration;
  }

  public ConnectionPreferences maxOvernightDuration(String maxOvernightDuration) {
    this.maxOvernightDuration = maxOvernightDuration;
    return this;
  }

  /**
   * The maximum acceptable overnight duration of the connection
   * @return maxOvernightDuration
   **/
  @Schema(description = "The maximum acceptable overnight duration of the connection")
  
    public String getMaxOvernightDuration() {
    return maxOvernightDuration;
  }

  public void setMaxOvernightDuration(String maxOvernightDuration) {
    this.maxOvernightDuration = maxOvernightDuration;
  }

  public ConnectionPreferences connectionPoint(java.util.List<String> connectionPoint) {
    this.connectionPoint = connectionPoint;
    return this;
  }

  public ConnectionPreferences addConnectionPointItem(String connectionPointItem) {
    if (this.connectionPoint == null) {
      this.connectionPoint = new java.util.ArrayList<>();
    }
    this.connectionPoint.add(connectionPointItem);
    return this;
  }

  /**
   * Get connectionPoint
   * @return connectionPoint
   **/
  @Schema(description = "")
  
  @Size(max=5)   public java.util.List<String> getConnectionPoint() {
    return connectionPoint;
  }

  public void setConnectionPoint(java.util.List<String> connectionPoint) {
    this.connectionPoint = connectionPoint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionPreferences connectionPreferences = (ConnectionPreferences) o;
    return Objects.equals(this._atType, connectionPreferences._atType) &&
        Objects.equals(this.legSequence, connectionPreferences.legSequence) &&
        Objects.equals(this.maxConnectionDuration, connectionPreferences.maxConnectionDuration) &&
        Objects.equals(this.maxOvernightDuration, connectionPreferences.maxOvernightDuration) &&
        Objects.equals(this.connectionPoint, connectionPreferences.connectionPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, legSequence, maxConnectionDuration, maxOvernightDuration, connectionPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPreferences {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    legSequence: ").append(toIndentedString(legSequence)).append("\n");
    sb.append("    maxConnectionDuration: ").append(toIndentedString(maxConnectionDuration)).append("\n");
    sb.append("    maxOvernightDuration: ").append(toIndentedString(maxOvernightDuration)).append("\n");
    sb.append("    connectionPoint: ").append(toIndentedString(connectionPoint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
