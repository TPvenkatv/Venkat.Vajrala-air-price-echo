package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.ArrivalFlightID;
import com.travelport.air.offerresource.model.DepartureFlightID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaggageRecheck
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class BaggageRecheck  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("At")
  private String at = null;

  @JsonProperty("ArrivalFlight")
  private ArrivalFlightID arrivalFlight = null;

  @JsonProperty("DepartureFlight")
  private DepartureFlightID departureFlight = null;

  public BaggageRecheck _atType(String _atType) {
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

  public BaggageRecheck at(String at) {
    this.at = at;
    return this;
  }

  /**
   * The city where the baggage recheck is required
   * @return at
   **/
  @Schema(required = true, description = "The city where the baggage recheck is required")
      @NotNull

  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getAt() {
    return at;
  }

  public void setAt(String at) {
    this.at = at;
  }

  public BaggageRecheck arrivalFlight(ArrivalFlightID arrivalFlight) {
    this.arrivalFlight = arrivalFlight;
    return this;
  }

  /**
   * Get arrivalFlight
   * @return arrivalFlight
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ArrivalFlightID getArrivalFlight() {
    return arrivalFlight;
  }

  public void setArrivalFlight(ArrivalFlightID arrivalFlight) {
    this.arrivalFlight = arrivalFlight;
  }

  public BaggageRecheck departureFlight(DepartureFlightID departureFlight) {
    this.departureFlight = departureFlight;
    return this;
  }

  /**
   * Get departureFlight
   * @return departureFlight
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DepartureFlightID getDepartureFlight() {
    return departureFlight;
  }

  public void setDepartureFlight(DepartureFlightID departureFlight) {
    this.departureFlight = departureFlight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageRecheck baggageRecheck = (BaggageRecheck) o;
    return Objects.equals(this._atType, baggageRecheck._atType) &&
        Objects.equals(this.at, baggageRecheck.at) &&
        Objects.equals(this.arrivalFlight, baggageRecheck.arrivalFlight) &&
        Objects.equals(this.departureFlight, baggageRecheck.departureFlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, at, arrivalFlight, departureFlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageRecheck {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    arrivalFlight: ").append(toIndentedString(arrivalFlight)).append("\n");
    sb.append("    departureFlight: ").append(toIndentedString(departureFlight)).append("\n");
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
