package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BrandID;
import com.travelport.air.offerresource.model.FareSelection;
import com.travelport.air.offerresource.model.OrganizationInformation;
import com.travelport.air.offerresource.model.PricingModifiersAir;
import com.travelport.air.offerresource.model.PromotionalCode;
import com.travelport.air.offerresource.model.TaxExemption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingModifiersAirDetail
 */
@Validated


public class PricingModifiersAirDetail extends PricingModifiersAir implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Brand")
  private BrandID brand = null;

  public PricingModifiersAirDetail brand(BrandID brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   **/
  @Schema(description = "")
  
    @Valid
    public BrandID getBrand() {
    return brand;
  }

  public void setBrand(BrandID brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingModifiersAirDetail pricingModifiersAirDetail = (PricingModifiersAirDetail) o;
    return Objects.equals(this.brand, pricingModifiersAirDetail.brand) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingModifiersAirDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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
