package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.FlightID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightSegment
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class FlightSegment  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("connectionDuration")
  private String connectionDuration = null;

  @JsonProperty("Flight")
  private FlightID flight = null;

  @JsonProperty("boundFlightsInd")
  private Boolean boundFlightsInd = null;

  public FlightSegment _atType(String _atType) {
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

  public FlightSegment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Local indentifier within a given message for this object.
   * @return id
   **/
  @Schema(description = "Local indentifier within a given message for this object.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlightSegment sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequence
   * @return sequence
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:SegmentSequence")
      @NotNull

    public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public FlightSegment connectionDuration(String connectionDuration) {
    this.connectionDuration = connectionDuration;
    return this;
  }

  /**
   * The actual duration (in minutes) between
   * @return connectionDuration
   **/
  @Schema(description = "The actual duration (in minutes) between")
  
    public String getConnectionDuration() {
    return connectionDuration;
  }

  public void setConnectionDuration(String connectionDuration) {
    this.connectionDuration = connectionDuration;
  }

  public FlightSegment flight(FlightID flight) {
    this.flight = flight;
    return this;
  }

  /**
   * Get flight
   * @return flight
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FlightID getFlight() {
    return flight;
  }

  public void setFlight(FlightID flight) {
    this.flight = flight;
  }

  public FlightSegment boundFlightsInd(Boolean boundFlightsInd) {
    this.boundFlightsInd = boundFlightsInd;
    return this;
  }

  /**
   * If present and true, the Segments in this Connection must be sold and cancelled together.
   * @return boundFlightsInd
   **/
  @Schema(description = "If present and true, the Segments in this Connection must be sold and cancelled together.")
  
    public Boolean isBoundFlightsInd() {
    return boundFlightsInd;
  }

  public void setBoundFlightsInd(Boolean boundFlightsInd) {
    this.boundFlightsInd = boundFlightsInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightSegment flightSegment = (FlightSegment) o;
    return Objects.equals(this._atType, flightSegment._atType) &&
        Objects.equals(this.id, flightSegment.id) &&
        Objects.equals(this.sequence, flightSegment.sequence) &&
        Objects.equals(this.connectionDuration, flightSegment.connectionDuration) &&
        Objects.equals(this.flight, flightSegment.flight) &&
        Objects.equals(this.boundFlightsInd, flightSegment.boundFlightsInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, sequence, connectionDuration, flight, boundFlightsInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSegment {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    connectionDuration: ").append(toIndentedString(connectionDuration)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    boundFlightsInd: ").append(toIndentedString(boundFlightsInd)).append("\n");
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
