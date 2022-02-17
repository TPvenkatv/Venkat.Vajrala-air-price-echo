package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Amount;
import com.travelport.air.offerresource.model.AncillaryDescription;
import com.travelport.air.offerresource.model.Commission;
import com.travelport.air.offerresource.model.PriceBreakdown;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceBreakdownAncillary
 */
@Validated


public class PriceBreakdownAncillary extends PriceBreakdown implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("Description")
  private AncillaryDescription description = null;

  public PriceBreakdownAncillary quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of ancillary items included in this PriceBreakdown
   * @return quantity
   **/
  @Schema(description = "The quantity of ancillary items included in this PriceBreakdown")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PriceBreakdownAncillary description(AncillaryDescription description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    @Valid
    public AncillaryDescription getDescription() {
    return description;
  }

  public void setDescription(AncillaryDescription description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBreakdownAncillary priceBreakdownAncillary = (PriceBreakdownAncillary) o;
    return Objects.equals(this.quantity, priceBreakdownAncillary.quantity) &&
        Objects.equals(this.description, priceBreakdownAncillary.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBreakdownAncillary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
