package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Amount;
import com.travelport.air.offerresource.model.Commission;
import com.travelport.air.offerresource.model.Discount;
import com.travelport.air.offerresource.model.FiledAmount;
import com.travelport.air.offerresource.model.PriceBreakdown;
import com.travelport.air.offerresource.model.Surcharges;
import com.travelport.air.offerresource.model.TravelerIdentifierRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceBreakdownAir
 */
@Validated


public class PriceBreakdownAir extends PriceBreakdown implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("requestedPassengerType")
  private String requestedPassengerType = null;

  @JsonProperty("FiledAmount")
  private FiledAmount filedAmount = null;

  @JsonProperty("Discount")
  private Discount discount = null;

  @JsonProperty("TravelerIdentifierRef")
  private TravelerIdentifierRef travelerIdentifierRef = null;

  @JsonProperty("NetBaseAmount")
  private FiledAmount netBaseAmount = null;

  @JsonProperty("FareCalculation")
  private String fareCalculation = null;

  @JsonProperty("Surcharges")
  private Surcharges surcharges = null;

  public PriceBreakdownAir quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberDoubleDigit
   * @return quantity
   **/
  @Schema(description = "Assigned Type: c-1100:NumberDoubleDigit")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PriceBreakdownAir requestedPassengerType(String requestedPassengerType) {
    this.requestedPassengerType = requestedPassengerType;
    return this;
  }

  /**
   * Assigned Type: c-1100:PassengerTypeCode
   * @return requestedPassengerType
   **/
  @Schema(description = "Assigned Type: c-1100:PassengerTypeCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{3,5})") @Size(min=3,max=5)   public String getRequestedPassengerType() {
    return requestedPassengerType;
  }

  public void setRequestedPassengerType(String requestedPassengerType) {
    this.requestedPassengerType = requestedPassengerType;
  }

  public PriceBreakdownAir filedAmount(FiledAmount filedAmount) {
    this.filedAmount = filedAmount;
    return this;
  }

  /**
   * Get filedAmount
   * @return filedAmount
   **/
  @Schema(description = "")
  
    @Valid
    public FiledAmount getFiledAmount() {
    return filedAmount;
  }

  public void setFiledAmount(FiledAmount filedAmount) {
    this.filedAmount = filedAmount;
  }

  public PriceBreakdownAir discount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
   **/
  @Schema(description = "")
  
    @Valid
    public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public PriceBreakdownAir travelerIdentifierRef(TravelerIdentifierRef travelerIdentifierRef) {
    this.travelerIdentifierRef = travelerIdentifierRef;
    return this;
  }

  /**
   * Get travelerIdentifierRef
   * @return travelerIdentifierRef
   **/
  @Schema(description = "")
  
    @Valid
    public TravelerIdentifierRef getTravelerIdentifierRef() {
    return travelerIdentifierRef;
  }

  public void setTravelerIdentifierRef(TravelerIdentifierRef travelerIdentifierRef) {
    this.travelerIdentifierRef = travelerIdentifierRef;
  }

  public PriceBreakdownAir netBaseAmount(FiledAmount netBaseAmount) {
    this.netBaseAmount = netBaseAmount;
    return this;
  }

  /**
   * Get netBaseAmount
   * @return netBaseAmount
   **/
  @Schema(description = "")
  
    @Valid
    public FiledAmount getNetBaseAmount() {
    return netBaseAmount;
  }

  public void setNetBaseAmount(FiledAmount netBaseAmount) {
    this.netBaseAmount = netBaseAmount;
  }

  public PriceBreakdownAir fareCalculation(String fareCalculation) {
    this.fareCalculation = fareCalculation;
    return this;
  }

  /**
   * The fare calculation string showing how the base fare is calculated
   * @return fareCalculation
   **/
  @Schema(description = "The fare calculation string showing how the base fare is calculated")
  
  @Size(max=512)   public String getFareCalculation() {
    return fareCalculation;
  }

  public void setFareCalculation(String fareCalculation) {
    this.fareCalculation = fareCalculation;
  }

  public PriceBreakdownAir surcharges(Surcharges surcharges) {
    this.surcharges = surcharges;
    return this;
  }

  /**
   * Get surcharges
   * @return surcharges
   **/
  @Schema(description = "")
  
    @Valid
    public Surcharges getSurcharges() {
    return surcharges;
  }

  public void setSurcharges(Surcharges surcharges) {
    this.surcharges = surcharges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBreakdownAir priceBreakdownAir = (PriceBreakdownAir) o;
    return Objects.equals(this.quantity, priceBreakdownAir.quantity) &&
        Objects.equals(this.requestedPassengerType, priceBreakdownAir.requestedPassengerType) &&
        Objects.equals(this.filedAmount, priceBreakdownAir.filedAmount) &&
        Objects.equals(this.discount, priceBreakdownAir.discount) &&
        Objects.equals(this.travelerIdentifierRef, priceBreakdownAir.travelerIdentifierRef) &&
        Objects.equals(this.netBaseAmount, priceBreakdownAir.netBaseAmount) &&
        Objects.equals(this.fareCalculation, priceBreakdownAir.fareCalculation) &&
        Objects.equals(this.surcharges, priceBreakdownAir.surcharges) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, requestedPassengerType, filedAmount, discount, travelerIdentifierRef, netBaseAmount, fareCalculation, surcharges, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBreakdownAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requestedPassengerType: ").append(toIndentedString(requestedPassengerType)).append("\n");
    sb.append("    filedAmount: ").append(toIndentedString(filedAmount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    travelerIdentifierRef: ").append(toIndentedString(travelerIdentifierRef)).append("\n");
    sb.append("    netBaseAmount: ").append(toIndentedString(netBaseAmount)).append("\n");
    sb.append("    fareCalculation: ").append(toIndentedString(fareCalculation)).append("\n");
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
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
