package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An intermediate stop location and duration
 */
@Schema(description = "An intermediate stop location and duration")
@Validated


public class IntermediateStop  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("arrivalFlightDuration")
  private String arrivalFlightDuration = null;

  @JsonProperty("departureFlightDuration")
  private String departureFlightDuration = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("equipment")
  private String equipment = null;

  @JsonProperty("arrivalDate")
  private String arrivalDate = null;

  @JsonProperty("departureDate")
  private String departureDate = null;

  @JsonProperty("arrivalTime")
  private String arrivalTime = null;

  @JsonProperty("departurelTime")
  private String departurelTime = null;

  @JsonProperty("arrivalTerminal")
  private String arrivalTerminal = null;

  @JsonProperty("departureTerminal")
  private String departureTerminal = null;

  public IntermediateStop value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IntermediateStop arrivalFlightDuration(String arrivalFlightDuration) {
    this.arrivalFlightDuration = arrivalFlightDuration;
    return this;
  }

  /**
   * Get arrivalFlightDuration
   * @return arrivalFlightDuration
   **/
  @Schema(description = "")
  
    public String getArrivalFlightDuration() {
    return arrivalFlightDuration;
  }

  public void setArrivalFlightDuration(String arrivalFlightDuration) {
    this.arrivalFlightDuration = arrivalFlightDuration;
  }

  public IntermediateStop departureFlightDuration(String departureFlightDuration) {
    this.departureFlightDuration = departureFlightDuration;
    return this;
  }

  /**
   * Get departureFlightDuration
   * @return departureFlightDuration
   **/
  @Schema(description = "")
  
    public String getDepartureFlightDuration() {
    return departureFlightDuration;
  }

  public void setDepartureFlightDuration(String departureFlightDuration) {
    this.departureFlightDuration = departureFlightDuration;
  }

  public IntermediateStop duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration stopped at this location
   * @return duration
   **/
  @Schema(description = "Duration stopped at this location")
  
    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public IntermediateStop equipment(String equipment) {
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

  public IntermediateStop arrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalDate
   * @return arrivalDate
   **/
  @Schema(description = "Assigned Type: ota2:LocalDate")
  
  @Pattern(regexp="(\\d{4}-\\d{2}-\\d{2})")   public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public IntermediateStop departureDate(String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalDate
   * @return departureDate
   **/
  @Schema(description = "Assigned Type: ota2:LocalDate")
  
  @Pattern(regexp="(\\d{4}-\\d{2}-\\d{2})")   public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public IntermediateStop arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalTime
   * @return arrivalTime
   **/
  @Schema(description = "Assigned Type: ota2:LocalTime")
  
  @Pattern(regexp="(([01]\\d|2[0-3])((:?)[0-5]\\d)?|24\\:?00)((:?)[0-5]\\d)?([\\.,]\\d+(?!:))?")   public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public IntermediateStop departurelTime(String departurelTime) {
    this.departurelTime = departurelTime;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalTime
   * @return departurelTime
   **/
  @Schema(description = "Assigned Type: ota2:LocalTime")
  
  @Pattern(regexp="(([01]\\d|2[0-3])((:?)[0-5]\\d)?|24\\:?00)((:?)[0-5]\\d)?([\\.,]\\d+(?!:))?")   public String getDeparturelTime() {
    return departurelTime;
  }

  public void setDeparturelTime(String departurelTime) {
    this.departurelTime = departurelTime;
  }

  public IntermediateStop arrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringAlphaNumeric
   * @return arrivalTerminal
   **/
  @Schema(description = "Assigned Type: c-1100:StringAlphaNumeric")
  
  @Pattern(regexp="([0-9a-zA-Z]+)?") @Size(max=4096)   public String getArrivalTerminal() {
    return arrivalTerminal;
  }

  public void setArrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
  }

  public IntermediateStop departureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringAlphaNumeric
   * @return departureTerminal
   **/
  @Schema(description = "Assigned Type: c-1100:StringAlphaNumeric")
  
  @Pattern(regexp="([0-9a-zA-Z]+)?") @Size(max=4096)   public String getDepartureTerminal() {
    return departureTerminal;
  }

  public void setDepartureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediateStop intermediateStop = (IntermediateStop) o;
    return Objects.equals(this.value, intermediateStop.value) &&
        Objects.equals(this.arrivalFlightDuration, intermediateStop.arrivalFlightDuration) &&
        Objects.equals(this.departureFlightDuration, intermediateStop.departureFlightDuration) &&
        Objects.equals(this.duration, intermediateStop.duration) &&
        Objects.equals(this.equipment, intermediateStop.equipment) &&
        Objects.equals(this.arrivalDate, intermediateStop.arrivalDate) &&
        Objects.equals(this.departureDate, intermediateStop.departureDate) &&
        Objects.equals(this.arrivalTime, intermediateStop.arrivalTime) &&
        Objects.equals(this.departurelTime, intermediateStop.departurelTime) &&
        Objects.equals(this.arrivalTerminal, intermediateStop.arrivalTerminal) &&
        Objects.equals(this.departureTerminal, intermediateStop.departureTerminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, arrivalFlightDuration, departureFlightDuration, duration, equipment, arrivalDate, departureDate, arrivalTime, departurelTime, arrivalTerminal, departureTerminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntermediateStop {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    arrivalFlightDuration: ").append(toIndentedString(arrivalFlightDuration)).append("\n");
    sb.append("    departureFlightDuration: ").append(toIndentedString(departureFlightDuration)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departurelTime: ").append(toIndentedString(departurelTime)).append("\n");
    sb.append("    arrivalTerminal: ").append(toIndentedString(arrivalTerminal)).append("\n");
    sb.append("    departureTerminal: ").append(toIndentedString(departureTerminal)).append("\n");
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
