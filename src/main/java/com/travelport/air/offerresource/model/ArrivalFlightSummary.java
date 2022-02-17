package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Arrival;
import com.travelport.air.offerresource.model.ArrivalFlightID;
import com.travelport.air.offerresource.model.Departure;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.IntermediateStop;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ArrivalFlightSummary
 */
@Validated


public class ArrivalFlightSummary extends ArrivalFlightID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("distance")
  private Integer distance = null;

  @JsonProperty("stops")
  private Integer stops = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("operatingCarrier")
  private String operatingCarrier = null;

  @JsonProperty("operatingCarrierName")
  private String operatingCarrierName = null;

  @JsonProperty("equipment")
  private String equipment = null;

  @JsonProperty("Departure")
  private Departure departure = null;

  @JsonProperty("Arrival")
  private Arrival arrival = null;

  @JsonProperty("IntermediateStop")
  @Valid
  private java.util.List<IntermediateStop> intermediateStop = null;

  @JsonProperty("subjectToGovernmentApprovalInd")
  private Boolean subjectToGovernmentApprovalInd = null;

  public ArrivalFlightSummary distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return distance
   **/
  @Schema(description = "Assigned Type: c-1100:NonnegativeInteger")
  
  @Min(0)  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public ArrivalFlightSummary stops(Integer stops) {
    this.stops = stops;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberSingleDigit
   * @return stops
   **/
  @Schema(description = "Assigned Type: c-1100:NumberSingleDigit")
  
    public Integer getStops() {
    return stops;
  }

  public void setStops(Integer stops) {
    this.stops = stops;
  }

  public ArrivalFlightSummary duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Elapsed flight time represented in ISO 8601 format
   * @return duration
   **/
  @Schema(description = "Elapsed flight time represented in ISO 8601 format")
  
    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ArrivalFlightSummary carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return carrier
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:AirlineCode")
      @NotNull

  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ArrivalFlightSummary number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Assigned Type: c-1100:FlightNumber
   * @return number
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:FlightNumber")
      @NotNull

  @Pattern(regexp="[0-9]{1,4}[A-Z]?|OPEN|ARNK")   public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ArrivalFlightSummary operatingCarrier(String operatingCarrier) {
    this.operatingCarrier = operatingCarrier;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return operatingCarrier
   **/
  @Schema(description = "Assigned Type: c-1100:AirlineCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getOperatingCarrier() {
    return operatingCarrier;
  }

  public void setOperatingCarrier(String operatingCarrier) {
    this.operatingCarrier = operatingCarrier;
  }

  public ArrivalFlightSummary operatingCarrierName(String operatingCarrierName) {
    this.operatingCarrierName = operatingCarrierName;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return operatingCarrierName
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getOperatingCarrierName() {
    return operatingCarrierName;
  }

  public void setOperatingCarrierName(String operatingCarrierName) {
    this.operatingCarrierName = operatingCarrierName;
  }

  public ArrivalFlightSummary equipment(String equipment) {
    this.equipment = equipment;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirEquipCodeIATA
   * @return equipment
   **/
  @Schema(description = "Assigned Type: c-1100:AirEquipCodeIATA")
  
  @Pattern(regexp="([A-Z0-9]{3})?")   public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public ArrivalFlightSummary departure(Departure departure) {
    this.departure = departure;
    return this;
  }

  /**
   * Get departure
   * @return departure
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Departure getDeparture() {
    return departure;
  }

  public void setDeparture(Departure departure) {
    this.departure = departure;
  }

  public ArrivalFlightSummary arrival(Arrival arrival) {
    this.arrival = arrival;
    return this;
  }

  /**
   * Get arrival
   * @return arrival
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Arrival getArrival() {
    return arrival;
  }

  public void setArrival(Arrival arrival) {
    this.arrival = arrival;
  }

  public ArrivalFlightSummary intermediateStop(java.util.List<IntermediateStop> intermediateStop) {
    this.intermediateStop = intermediateStop;
    return this;
  }

  public ArrivalFlightSummary addIntermediateStopItem(IntermediateStop intermediateStopItem) {
    if (this.intermediateStop == null) {
      this.intermediateStop = new java.util.ArrayList<>();
    }
    this.intermediateStop.add(intermediateStopItem);
    return this;
  }

  /**
   * Get intermediateStop
   * @return intermediateStop
   **/
  @Schema(description = "")
      @Valid
  @Size(max=9)   public java.util.List<IntermediateStop> getIntermediateStop() {
    return intermediateStop;
  }

  public void setIntermediateStop(java.util.List<IntermediateStop> intermediateStop) {
    this.intermediateStop = intermediateStop;
  }

  public ArrivalFlightSummary subjectToGovernmentApprovalInd(Boolean subjectToGovernmentApprovalInd) {
    this.subjectToGovernmentApprovalInd = subjectToGovernmentApprovalInd;
    return this;
  }

  /**
   * If true, this flight schedule is yet to receive government approval
   * @return subjectToGovernmentApprovalInd
   **/
  @Schema(description = "If true, this flight schedule is yet to receive government approval")
  
    public Boolean isSubjectToGovernmentApprovalInd() {
    return subjectToGovernmentApprovalInd;
  }

  public void setSubjectToGovernmentApprovalInd(Boolean subjectToGovernmentApprovalInd) {
    this.subjectToGovernmentApprovalInd = subjectToGovernmentApprovalInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrivalFlightSummary arrivalFlightSummary = (ArrivalFlightSummary) o;
    return Objects.equals(this.distance, arrivalFlightSummary.distance) &&
        Objects.equals(this.stops, arrivalFlightSummary.stops) &&
        Objects.equals(this.duration, arrivalFlightSummary.duration) &&
        Objects.equals(this.carrier, arrivalFlightSummary.carrier) &&
        Objects.equals(this.number, arrivalFlightSummary.number) &&
        Objects.equals(this.operatingCarrier, arrivalFlightSummary.operatingCarrier) &&
        Objects.equals(this.operatingCarrierName, arrivalFlightSummary.operatingCarrierName) &&
        Objects.equals(this.equipment, arrivalFlightSummary.equipment) &&
        Objects.equals(this.departure, arrivalFlightSummary.departure) &&
        Objects.equals(this.arrival, arrivalFlightSummary.arrival) &&
        Objects.equals(this.intermediateStop, arrivalFlightSummary.intermediateStop) &&
        Objects.equals(this.subjectToGovernmentApprovalInd, arrivalFlightSummary.subjectToGovernmentApprovalInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, stops, duration, carrier, number, operatingCarrier, operatingCarrierName, equipment, departure, arrival, intermediateStop, subjectToGovernmentApprovalInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrivalFlightSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    operatingCarrier: ").append(toIndentedString(operatingCarrier)).append("\n");
    sb.append("    operatingCarrierName: ").append(toIndentedString(operatingCarrierName)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    intermediateStop: ").append(toIndentedString(intermediateStop)).append("\n");
    sb.append("    subjectToGovernmentApprovalInd: ").append(toIndentedString(subjectToGovernmentApprovalInd)).append("\n");
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
