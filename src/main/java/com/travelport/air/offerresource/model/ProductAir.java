package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.FlightSegment;
import com.travelport.air.offerresource.model.PassengerFlight;
import com.travelport.air.offerresource.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductAir
 */
@Validated


public class ProductAir extends Product implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("totalDuration")
  private String totalDuration = null;

  @JsonProperty("FlightSegment")
  @Valid
  private java.util.List<FlightSegment> flightSegment = new java.util.ArrayList<>();

  @JsonProperty("PassengerFlight")
  @Valid
  private java.util.List<PassengerFlight> passengerFlight = new java.util.ArrayList<>();

  public ProductAir totalDuration(String totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

  /**
   * Total duration of all Segments that are part of this ProductAir
   * @return totalDuration
   **/
  @Schema(description = "Total duration of all Segments that are part of this ProductAir")
  
    public String getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(String totalDuration) {
    this.totalDuration = totalDuration;
  }

  public ProductAir flightSegment(java.util.List<FlightSegment> flightSegment) {
    this.flightSegment = flightSegment;
    return this;
  }

  public ProductAir addFlightSegmentItem(FlightSegment flightSegmentItem) {
    this.flightSegment.add(flightSegmentItem);
    return this;
  }

  /**
   * Get flightSegment
   * @return flightSegment
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=99)   public java.util.List<FlightSegment> getFlightSegment() {
    return flightSegment;
  }

  public void setFlightSegment(java.util.List<FlightSegment> flightSegment) {
    this.flightSegment = flightSegment;
  }

  public ProductAir passengerFlight(java.util.List<PassengerFlight> passengerFlight) {
    this.passengerFlight = passengerFlight;
    return this;
  }

  public ProductAir addPassengerFlightItem(PassengerFlight passengerFlightItem) {
    this.passengerFlight.add(passengerFlightItem);
    return this;
  }

  /**
   * Get passengerFlight
   * @return passengerFlight
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<PassengerFlight> getPassengerFlight() {
    return passengerFlight;
  }

  public void setPassengerFlight(java.util.List<PassengerFlight> passengerFlight) {
    this.passengerFlight = passengerFlight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAir productAir = (ProductAir) o;
    return Objects.equals(this.totalDuration, productAir.totalDuration) &&
        Objects.equals(this.flightSegment, productAir.flightSegment) &&
        Objects.equals(this.passengerFlight, productAir.passengerFlight) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDuration, flightSegment, passengerFlight, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    flightSegment: ").append(toIndentedString(flightSegment)).append("\n");
    sb.append("    passengerFlight: ").append(toIndentedString(passengerFlight)).append("\n");
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
