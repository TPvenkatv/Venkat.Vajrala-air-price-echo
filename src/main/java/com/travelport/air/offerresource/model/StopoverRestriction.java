package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.GeographicRestriction;
import com.travelport.air.offerresource.model.JourneyTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StopoverRestriction
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class StopoverRestriction  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("stopoverChargeRef")
  private String stopoverChargeRef = null;

  @JsonProperty("journeyTypes")
  @Valid
  private java.util.List<JourneyTypeEnum> journeyTypes = null;

  @JsonProperty("departureCarrier")
  private String departureCarrier = null;

  @JsonProperty("arrivalAirline")
  private String arrivalAirline = null;

  @JsonProperty("GeographicRestriction")
  @Valid
  private java.util.List<GeographicRestriction> geographicRestriction = null;

  @JsonProperty("onlineStopoverOnlyInd")
  private Boolean onlineStopoverOnlyInd = null;

  public StopoverRestriction _atType(String _atType) {
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

  public StopoverRestriction stopoverChargeRef(String stopoverChargeRef) {
    this.stopoverChargeRef = stopoverChargeRef;
    return this;
  }

  /**
   * Reference to the Stopover Charge
   * @return stopoverChargeRef
   **/
  @Schema(required = true, description = "Reference to the Stopover Charge")
      @NotNull

    public String getStopoverChargeRef() {
    return stopoverChargeRef;
  }

  public void setStopoverChargeRef(String stopoverChargeRef) {
    this.stopoverChargeRef = stopoverChargeRef;
  }

  public StopoverRestriction journeyTypes(java.util.List<JourneyTypeEnum> journeyTypes) {
    this.journeyTypes = journeyTypes;
    return this;
  }

  public StopoverRestriction addJourneyTypesItem(JourneyTypeEnum journeyTypesItem) {
    if (this.journeyTypes == null) {
      this.journeyTypes = new java.util.ArrayList<>();
    }
    this.journeyTypes.add(journeyTypesItem);
    return this;
  }

  /**
   * Get journeyTypes
   * @return journeyTypes
   **/
  @Schema(description = "")
      @Valid
    public java.util.List<JourneyTypeEnum> getJourneyTypes() {
    return journeyTypes;
  }

  public void setJourneyTypes(java.util.List<JourneyTypeEnum> journeyTypes) {
    this.journeyTypes = journeyTypes;
  }

  public StopoverRestriction departureCarrier(String departureCarrier) {
    this.departureCarrier = departureCarrier;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return departureCarrier
   **/
  @Schema(description = "Assigned Type: c-1100:AirlineCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getDepartureCarrier() {
    return departureCarrier;
  }

  public void setDepartureCarrier(String departureCarrier) {
    this.departureCarrier = departureCarrier;
  }

  public StopoverRestriction arrivalAirline(String arrivalAirline) {
    this.arrivalAirline = arrivalAirline;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return arrivalAirline
   **/
  @Schema(description = "Assigned Type: c-1100:AirlineCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getArrivalAirline() {
    return arrivalAirline;
  }

  public void setArrivalAirline(String arrivalAirline) {
    this.arrivalAirline = arrivalAirline;
  }

  public StopoverRestriction geographicRestriction(java.util.List<GeographicRestriction> geographicRestriction) {
    this.geographicRestriction = geographicRestriction;
    return this;
  }

  public StopoverRestriction addGeographicRestrictionItem(GeographicRestriction geographicRestrictionItem) {
    if (this.geographicRestriction == null) {
      this.geographicRestriction = new java.util.ArrayList<>();
    }
    this.geographicRestriction.add(geographicRestrictionItem);
    return this;
  }

  /**
   * Get geographicRestriction
   * @return geographicRestriction
   **/
  @Schema(description = "")
      @Valid
  @Size(max=5)   public java.util.List<GeographicRestriction> getGeographicRestriction() {
    return geographicRestriction;
  }

  public void setGeographicRestriction(java.util.List<GeographicRestriction> geographicRestriction) {
    this.geographicRestriction = geographicRestriction;
  }

  public StopoverRestriction onlineStopoverOnlyInd(Boolean onlineStopoverOnlyInd) {
    this.onlineStopoverOnlyInd = onlineStopoverOnlyInd;
    return this;
  }

  /**
   * If true, the stopover may only take place when the arriving and departing airline are the same
   * @return onlineStopoverOnlyInd
   **/
  @Schema(description = "If true, the stopover may only take place when the arriving and departing airline are the same")
  
    public Boolean isOnlineStopoverOnlyInd() {
    return onlineStopoverOnlyInd;
  }

  public void setOnlineStopoverOnlyInd(Boolean onlineStopoverOnlyInd) {
    this.onlineStopoverOnlyInd = onlineStopoverOnlyInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopoverRestriction stopoverRestriction = (StopoverRestriction) o;
    return Objects.equals(this._atType, stopoverRestriction._atType) &&
        Objects.equals(this.stopoverChargeRef, stopoverRestriction.stopoverChargeRef) &&
        Objects.equals(this.journeyTypes, stopoverRestriction.journeyTypes) &&
        Objects.equals(this.departureCarrier, stopoverRestriction.departureCarrier) &&
        Objects.equals(this.arrivalAirline, stopoverRestriction.arrivalAirline) &&
        Objects.equals(this.geographicRestriction, stopoverRestriction.geographicRestriction) &&
        Objects.equals(this.onlineStopoverOnlyInd, stopoverRestriction.onlineStopoverOnlyInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, stopoverChargeRef, journeyTypes, departureCarrier, arrivalAirline, geographicRestriction, onlineStopoverOnlyInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopoverRestriction {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    stopoverChargeRef: ").append(toIndentedString(stopoverChargeRef)).append("\n");
    sb.append("    journeyTypes: ").append(toIndentedString(journeyTypes)).append("\n");
    sb.append("    departureCarrier: ").append(toIndentedString(departureCarrier)).append("\n");
    sb.append("    arrivalAirline: ").append(toIndentedString(arrivalAirline)).append("\n");
    sb.append("    geographicRestriction: ").append(toIndentedString(geographicRestriction)).append("\n");
    sb.append("    onlineStopoverOnlyInd: ").append(toIndentedString(onlineStopoverOnlyInd)).append("\n");
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
