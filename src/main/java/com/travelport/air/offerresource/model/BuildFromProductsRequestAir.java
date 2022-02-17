package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BuildFromProductsRequest;
import com.travelport.air.offerresource.model.CustomResponseModifiersAir;
import com.travelport.air.offerresource.model.PassengerCriteria;
import com.travelport.air.offerresource.model.PricingModifiersAir;
import com.travelport.air.offerresource.model.ProductCriteriaAir;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildFromProductsRequestAir
 */
@Validated


public class BuildFromProductsRequestAir extends BuildFromProductsRequest implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PricingModifiersAir")
  private PricingModifiersAir pricingModifiersAir = null;

  @JsonProperty("PassengerCriteria")
  @Valid
  private java.util.List<PassengerCriteria> passengerCriteria = new java.util.ArrayList<>();

  @JsonProperty("ProductCriteriaAir")
  @Valid
  private java.util.List<ProductCriteriaAir> productCriteriaAir = new java.util.ArrayList<>();

  @JsonProperty("CustomResponseModifiersAir")
  private CustomResponseModifiersAir customResponseModifiersAir = null;

  public BuildFromProductsRequestAir pricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
    return this;
  }

  /**
   * Get pricingModifiersAir
   * @return pricingModifiersAir
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PricingModifiersAir getPricingModifiersAir() {
    return pricingModifiersAir;
  }

  public void setPricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
  }

  public BuildFromProductsRequestAir passengerCriteria(java.util.List<PassengerCriteria> passengerCriteria) {
    this.passengerCriteria = passengerCriteria;
    return this;
  }

  public BuildFromProductsRequestAir addPassengerCriteriaItem(PassengerCriteria passengerCriteriaItem) {
    this.passengerCriteria.add(passengerCriteriaItem);
    return this;
  }

  /**
   * Get passengerCriteria
   * @return passengerCriteria
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<PassengerCriteria> getPassengerCriteria() {
    return passengerCriteria;
  }

  public void setPassengerCriteria(java.util.List<PassengerCriteria> passengerCriteria) {
    this.passengerCriteria = passengerCriteria;
  }

  public BuildFromProductsRequestAir productCriteriaAir(java.util.List<ProductCriteriaAir> productCriteriaAir) {
    this.productCriteriaAir = productCriteriaAir;
    return this;
  }

  public BuildFromProductsRequestAir addProductCriteriaAirItem(ProductCriteriaAir productCriteriaAirItem) {
    this.productCriteriaAir.add(productCriteriaAirItem);
    return this;
  }

  /**
   * Get productCriteriaAir
   * @return productCriteriaAir
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<ProductCriteriaAir> getProductCriteriaAir() {
    return productCriteriaAir;
  }

  public void setProductCriteriaAir(java.util.List<ProductCriteriaAir> productCriteriaAir) {
    this.productCriteriaAir = productCriteriaAir;
  }

  public BuildFromProductsRequestAir customResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
    return this;
  }

  /**
   * Get customResponseModifiersAir
   * @return customResponseModifiersAir
   **/
  @Schema(description = "")
  
    @Valid
    public CustomResponseModifiersAir getCustomResponseModifiersAir() {
    return customResponseModifiersAir;
  }

  public void setCustomResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildFromProductsRequestAir buildFromProductsRequestAir = (BuildFromProductsRequestAir) o;
    return Objects.equals(this.pricingModifiersAir, buildFromProductsRequestAir.pricingModifiersAir) &&
        Objects.equals(this.passengerCriteria, buildFromProductsRequestAir.passengerCriteria) &&
        Objects.equals(this.productCriteriaAir, buildFromProductsRequestAir.productCriteriaAir) &&
        Objects.equals(this.customResponseModifiersAir, buildFromProductsRequestAir.customResponseModifiersAir) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingModifiersAir, passengerCriteria, productCriteriaAir, customResponseModifiersAir, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildFromProductsRequestAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pricingModifiersAir: ").append(toIndentedString(pricingModifiersAir)).append("\n");
    sb.append("    passengerCriteria: ").append(toIndentedString(passengerCriteria)).append("\n");
    sb.append("    productCriteriaAir: ").append(toIndentedString(productCriteriaAir)).append("\n");
    sb.append("    customResponseModifiersAir: ").append(toIndentedString(customResponseModifiersAir)).append("\n");
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
