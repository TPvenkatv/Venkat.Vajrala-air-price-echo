package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.FlightProduct;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerFlight
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class PassengerFlight  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("passengerQuantity")
  private Integer passengerQuantity = null;

  @JsonProperty("passengerTypeCode")
  private String passengerTypeCode = null;

  @JsonProperty("FlightProduct")
  @Valid
  private java.util.List<FlightProduct> flightProduct = null;

  public PassengerFlight _atType(String _atType) {
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

  public PassengerFlight passengerQuantity(Integer passengerQuantity) {
    this.passengerQuantity = passengerQuantity;
    return this;
  }

  /**
   * Number of passengers of the specified passenger type code
   * @return passengerQuantity
   **/
  @Schema(description = "Number of passengers of the specified passenger type code")
  
    public Integer getPassengerQuantity() {
    return passengerQuantity;
  }

  public void setPassengerQuantity(Integer passengerQuantity) {
    this.passengerQuantity = passengerQuantity;
  }

  public PassengerFlight passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:PassengerTypeCode
   * @return passengerTypeCode
   **/
  @Schema(description = "Assigned Type: c-1100:PassengerTypeCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{3,5})") @Size(min=3,max=5)   public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public PassengerFlight flightProduct(java.util.List<FlightProduct> flightProduct) {
    this.flightProduct = flightProduct;
    return this;
  }

  public PassengerFlight addFlightProductItem(FlightProduct flightProductItem) {
    if (this.flightProduct == null) {
      this.flightProduct = new java.util.ArrayList<>();
    }
    this.flightProduct.add(flightProductItem);
    return this;
  }

  /**
   * Get flightProduct
   * @return flightProduct
   **/
  @Schema(description = "")
      @Valid
  @Size(max=99)   public java.util.List<FlightProduct> getFlightProduct() {
    return flightProduct;
  }

  public void setFlightProduct(java.util.List<FlightProduct> flightProduct) {
    this.flightProduct = flightProduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerFlight passengerFlight = (PassengerFlight) o;
    return Objects.equals(this._atType, passengerFlight._atType) &&
        Objects.equals(this.passengerQuantity, passengerFlight.passengerQuantity) &&
        Objects.equals(this.passengerTypeCode, passengerFlight.passengerTypeCode) &&
        Objects.equals(this.flightProduct, passengerFlight.flightProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, passengerQuantity, passengerTypeCode, flightProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerFlight {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    passengerQuantity: ").append(toIndentedString(passengerQuantity)).append("\n");
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
    sb.append("    flightProduct: ").append(toIndentedString(flightProduct)).append("\n");
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
