package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.AvailabilitySourceCodeENUM;
import com.travelport.air.offerresource.model.CabinAirEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificFlightCriteria
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class SpecificFlightCriteria  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("flightNumber")
  private String flightNumber = null;

  @JsonProperty("departureDate")
  private LocalDate departureDate = null;

  @JsonProperty("departureTime")
  private String departureTime = null;

  @JsonProperty("arrivalDate")
  private LocalDate arrivalDate = null;

  @JsonProperty("arrivalTime")
  private String arrivalTime = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("cabin")
  private CabinAirEnum cabin = null;

  @JsonProperty("classOfService")
  private String classOfService = null;

  @JsonProperty("brandTier")
  private Integer brandTier = null;

  @JsonProperty("segmentSequence")
  private Integer segmentSequence = null;

  @JsonProperty("AvailabilitySourceCode")
  private AvailabilitySourceCodeENUM availabilitySourceCode = null;

  @JsonProperty("boundFlightsInd")
  private Boolean boundFlightsInd = null;

  public SpecificFlightCriteria _atType(String _atType) {
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

  public SpecificFlightCriteria carrier(String carrier) {
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

  public SpecificFlightCriteria flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

  /**
   * Assigned Type: c-1100:FlightNumber
   * @return flightNumber
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:FlightNumber")
      @NotNull

  @Pattern(regexp="[0-9]{1,4}[A-Z]?|OPEN|ARNK")   public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public SpecificFlightCriteria departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * date of departure
   * @return departureDate
   **/
  @Schema(required = true, description = "date of departure")
      @NotNull

    @Valid
    public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public SpecificFlightCriteria departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalTime
   * @return departureTime
   **/
  @Schema(description = "Assigned Type: ota2:LocalTime")
  
  @Pattern(regexp="(([01]\\d|2[0-3])((:?)[0-5]\\d)?|24\\:?00)((:?)[0-5]\\d)?([\\.,]\\d+(?!:))?")   public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public SpecificFlightCriteria arrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Arrival date
   * @return arrivalDate
   **/
  @Schema(description = "Arrival date")
  
    @Valid
    public LocalDate getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public SpecificFlightCriteria arrivalTime(String arrivalTime) {
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

  public SpecificFlightCriteria from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirportCodeIATA
   * @return from
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:AirportCodeIATA")
      @NotNull

  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SpecificFlightCriteria to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirportCodeIATA
   * @return to
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:AirportCodeIATA")
      @NotNull

  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public SpecificFlightCriteria cabin(CabinAirEnum cabin) {
    this.cabin = cabin;
    return this;
  }

  /**
   * Get cabin
   * @return cabin
   **/
  @Schema(description = "")
  
    @Valid
    public CabinAirEnum getCabin() {
    return cabin;
  }

  public void setCabin(CabinAirEnum cabin) {
    this.cabin = cabin;
  }

  public SpecificFlightCriteria classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

  /**
   * Assigned Type: c-1100:ClassOfService
   * @return classOfService
   **/
  @Schema(description = "Assigned Type: c-1100:ClassOfService")
  
  @Pattern(regexp="([a-zA-Z0-9]{1,2})") @Size(min=1,max=2)   public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public SpecificFlightCriteria brandTier(Integer brandTier) {
    this.brandTier = brandTier;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberSingleDigit
   * @return brandTier
   **/
  @Schema(description = "Assigned Type: c-1100:NumberSingleDigit")
  
    public Integer getBrandTier() {
    return brandTier;
  }

  public void setBrandTier(Integer brandTier) {
    this.brandTier = brandTier;
  }

  public SpecificFlightCriteria segmentSequence(Integer segmentSequence) {
    this.segmentSequence = segmentSequence;
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequence
   * @return segmentSequence
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:SegmentSequence")
      @NotNull

    public Integer getSegmentSequence() {
    return segmentSequence;
  }

  public void setSegmentSequence(Integer segmentSequence) {
    this.segmentSequence = segmentSequence;
  }

  public SpecificFlightCriteria availabilitySourceCode(AvailabilitySourceCodeENUM availabilitySourceCode) {
    this.availabilitySourceCode = availabilitySourceCode;
    return this;
  }

  /**
   * Get availabilitySourceCode
   * @return availabilitySourceCode
   **/
  @Schema(description = "")
  
    @Valid
    public AvailabilitySourceCodeENUM getAvailabilitySourceCode() {
    return availabilitySourceCode;
  }

  public void setAvailabilitySourceCode(AvailabilitySourceCodeENUM availabilitySourceCode) {
    this.availabilitySourceCode = availabilitySourceCode;
  }

  public SpecificFlightCriteria boundFlightsInd(Boolean boundFlightsInd) {
    this.boundFlightsInd = boundFlightsInd;
    return this;
  }

  /**
   * if true indicates that the flight availability was polled (availability check) using connecting segments. If false, flights were polled as point to point segments.
   * @return boundFlightsInd
   **/
  @Schema(description = "if true indicates that the flight availability was polled (availability check) using connecting segments. If false, flights were polled as point to point segments.")
  
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
    SpecificFlightCriteria specificFlightCriteria = (SpecificFlightCriteria) o;
    return Objects.equals(this._atType, specificFlightCriteria._atType) &&
        Objects.equals(this.carrier, specificFlightCriteria.carrier) &&
        Objects.equals(this.flightNumber, specificFlightCriteria.flightNumber) &&
        Objects.equals(this.departureDate, specificFlightCriteria.departureDate) &&
        Objects.equals(this.departureTime, specificFlightCriteria.departureTime) &&
        Objects.equals(this.arrivalDate, specificFlightCriteria.arrivalDate) &&
        Objects.equals(this.arrivalTime, specificFlightCriteria.arrivalTime) &&
        Objects.equals(this.from, specificFlightCriteria.from) &&
        Objects.equals(this.to, specificFlightCriteria.to) &&
        Objects.equals(this.cabin, specificFlightCriteria.cabin) &&
        Objects.equals(this.classOfService, specificFlightCriteria.classOfService) &&
        Objects.equals(this.brandTier, specificFlightCriteria.brandTier) &&
        Objects.equals(this.segmentSequence, specificFlightCriteria.segmentSequence) &&
        Objects.equals(this.availabilitySourceCode, specificFlightCriteria.availabilitySourceCode) &&
        Objects.equals(this.boundFlightsInd, specificFlightCriteria.boundFlightsInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, carrier, flightNumber, departureDate, departureTime, arrivalDate, arrivalTime, from, to, cabin, classOfService, brandTier, segmentSequence, availabilitySourceCode, boundFlightsInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificFlightCriteria {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    brandTier: ").append(toIndentedString(brandTier)).append("\n");
    sb.append("    segmentSequence: ").append(toIndentedString(segmentSequence)).append("\n");
    sb.append("    availabilitySourceCode: ").append(toIndentedString(availabilitySourceCode)).append("\n");
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
