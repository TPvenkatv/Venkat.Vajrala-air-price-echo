package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Amount;
import com.travelport.air.offerresource.model.Commission;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceBreakdown
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = PriceBreakdownAir.class, name = "PriceBreakdownAir"),
        @JsonSubTypes.Type(value = PriceBreakdownAncillary.class, name = "PriceBreakdownAncillary"),
})


public class PriceBreakdown  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Amount")
  private Amount amount = null;

  @JsonProperty("Commission")
  private Commission commission = null;

  public PriceBreakdown _atType(String _atType) {
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

  public PriceBreakdown amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PriceBreakdown commission(Commission commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
   **/
  @Schema(description = "")
  
    @Valid
    public Commission getCommission() {
    return commission;
  }

  public void setCommission(Commission commission) {
    this.commission = commission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBreakdown priceBreakdown = (PriceBreakdown) o;
    return Objects.equals(this._atType, priceBreakdown._atType) &&
        Objects.equals(this.amount, priceBreakdown.amount) &&
        Objects.equals(this.commission, priceBreakdown.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, amount, commission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBreakdown {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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
