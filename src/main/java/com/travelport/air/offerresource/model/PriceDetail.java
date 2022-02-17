package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CurrencyCode;
import com.travelport.air.offerresource.model.Price;
import com.travelport.air.offerresource.model.PriceBreakdown;
import com.travelport.air.offerresource.model.VendorCurrencyTotal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceDetail
 */
@Validated


public class PriceDetail extends Price implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PriceBreakdown")
  @Valid
  private java.util.List<PriceBreakdown> priceBreakdown = null;

  public PriceDetail priceBreakdown(java.util.List<PriceBreakdown> priceBreakdown) {
    this.priceBreakdown = priceBreakdown;
    return this;
  }

  public PriceDetail addPriceBreakdownItem(PriceBreakdown priceBreakdownItem) {
    if (this.priceBreakdown == null) {
      this.priceBreakdown = new java.util.ArrayList<>();
    }
    this.priceBreakdown.add(priceBreakdownItem);
    return this;
  }

  /**
   * Get priceBreakdown
   * @return priceBreakdown
   **/
  @Schema(description = "")
      @Valid
  @Size(max=50)   public java.util.List<PriceBreakdown> getPriceBreakdown() {
    return priceBreakdown;
  }

  public void setPriceBreakdown(java.util.List<PriceBreakdown> priceBreakdown) {
    this.priceBreakdown = priceBreakdown;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetail priceDetail = (PriceDetail) o;
    return Objects.equals(this.priceBreakdown, priceDetail.priceBreakdown) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceBreakdown, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    priceBreakdown: ").append(toIndentedString(priceBreakdown)).append("\n");
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
