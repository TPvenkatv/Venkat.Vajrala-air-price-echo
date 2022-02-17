package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AncillaryOfferingID;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.Price;
import com.travelport.air.offerresource.model.ProductOptionsID;
import com.travelport.air.offerresource.model.TermsAndConditionsID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AncillaryOffering
 */
@Validated


public class AncillaryOffering extends AncillaryOfferingID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("productRefs")
  @Valid
  private java.util.List<String> productRefs = null;

  @JsonProperty("ProductOptions")
  @Valid
  private java.util.List<ProductOptionsID> productOptions = new java.util.ArrayList<>();

  @JsonProperty("Price")
  private Price price = null;

  @JsonProperty("TermsAndConditions")
  private TermsAndConditionsID termsAndConditions = null;

  public AncillaryOffering productRefs(java.util.List<String> productRefs) {
    this.productRefs = productRefs;
    return this;
  }

  public AncillaryOffering addProductRefsItem(String productRefsItem) {
    if (this.productRefs == null) {
      this.productRefs = new java.util.ArrayList<>();
    }
    this.productRefs.add(productRefsItem);
    return this;
  }

  /**
   * The product references that the AncillaryOffering must be sold in conjunction with
   * @return productRefs
   **/
  @Schema(description = "The product references that the AncillaryOffering must be sold in conjunction with")
  
    public java.util.List<String> getProductRefs() {
    return productRefs;
  }

  public void setProductRefs(java.util.List<String> productRefs) {
    this.productRefs = productRefs;
  }

  public AncillaryOffering productOptions(java.util.List<ProductOptionsID> productOptions) {
    this.productOptions = productOptions;
    return this;
  }

  public AncillaryOffering addProductOptionsItem(ProductOptionsID productOptionsItem) {
    this.productOptions.add(productOptionsItem);
    return this;
  }

  /**
   * Get productOptions
   * @return productOptions
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<ProductOptionsID> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(java.util.List<ProductOptionsID> productOptions) {
    this.productOptions = productOptions;
  }

  public AncillaryOffering price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public AncillaryOffering termsAndConditions(TermsAndConditionsID termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Get termsAndConditions
   * @return termsAndConditions
   **/
  @Schema(description = "")
  
    @Valid
    public TermsAndConditionsID getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(TermsAndConditionsID termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AncillaryOffering ancillaryOffering = (AncillaryOffering) o;
    return Objects.equals(this.productRefs, ancillaryOffering.productRefs) &&
        Objects.equals(this.productOptions, ancillaryOffering.productOptions) &&
        Objects.equals(this.price, ancillaryOffering.price) &&
        Objects.equals(this.termsAndConditions, ancillaryOffering.termsAndConditions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRefs, productOptions, price, termsAndConditions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncillaryOffering {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    productRefs: ").append(toIndentedString(productRefs)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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
