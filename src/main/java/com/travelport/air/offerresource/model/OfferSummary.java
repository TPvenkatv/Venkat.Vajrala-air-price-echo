package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.OfferID;
import com.travelport.air.offerresource.model.Price;
import com.travelport.air.offerresource.model.ProductID;
import com.travelport.air.offerresource.model.TermsAndConditionsFullID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferSummary
 */
@Validated


public class OfferSummary extends OfferID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("parentOfferRef")
  private String parentOfferRef = null;

  @JsonProperty("Product")
  @Valid
  private java.util.List<ProductID> product = new java.util.ArrayList<>();

  @JsonProperty("Price")
  private Price price = null;

  @JsonProperty("TermsAndConditionsFull")
  @Valid
  private java.util.List<TermsAndConditionsFullID> termsAndConditionsFull = new java.util.ArrayList<>();

  @JsonProperty("passiveOfferInd")
  private Boolean passiveOfferInd = null;

  public OfferSummary parentOfferRef(String parentOfferRef) {
    this.parentOfferRef = parentOfferRef;
    return this;
  }

  /**
   * A reference to the Offer this offer is sold in conjunction with
   * @return parentOfferRef
   **/
  @Schema(description = "A reference to the Offer this offer is sold in conjunction with")
  
    public String getParentOfferRef() {
    return parentOfferRef;
  }

  public void setParentOfferRef(String parentOfferRef) {
    this.parentOfferRef = parentOfferRef;
  }

  public OfferSummary product(java.util.List<ProductID> product) {
    this.product = product;
    return this;
  }

  public OfferSummary addProductItem(ProductID productItem) {
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=100)   public java.util.List<ProductID> getProduct() {
    return product;
  }

  public void setProduct(java.util.List<ProductID> product) {
    this.product = product;
  }

  public OfferSummary price(Price price) {
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

  public OfferSummary termsAndConditionsFull(java.util.List<TermsAndConditionsFullID> termsAndConditionsFull) {
    this.termsAndConditionsFull = termsAndConditionsFull;
    return this;
  }

  public OfferSummary addTermsAndConditionsFullItem(TermsAndConditionsFullID termsAndConditionsFullItem) {
    this.termsAndConditionsFull.add(termsAndConditionsFullItem);
    return this;
  }

  /**
   * Get termsAndConditionsFull
   * @return termsAndConditionsFull
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=100)   public java.util.List<TermsAndConditionsFullID> getTermsAndConditionsFull() {
    return termsAndConditionsFull;
  }

  public void setTermsAndConditionsFull(java.util.List<TermsAndConditionsFullID> termsAndConditionsFull) {
    this.termsAndConditionsFull = termsAndConditionsFull;
  }

  public OfferSummary passiveOfferInd(Boolean passiveOfferInd) {
    this.passiveOfferInd = passiveOfferInd;
    return this;
  }

  /**
   * If true, the Offer is passive for booking purposes.
   * @return passiveOfferInd
   **/
  @Schema(description = "If true, the Offer is passive for booking purposes.")
  
    public Boolean isPassiveOfferInd() {
    return passiveOfferInd;
  }

  public void setPassiveOfferInd(Boolean passiveOfferInd) {
    this.passiveOfferInd = passiveOfferInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferSummary offerSummary = (OfferSummary) o;
    return Objects.equals(this.parentOfferRef, offerSummary.parentOfferRef) &&
        Objects.equals(this.product, offerSummary.product) &&
        Objects.equals(this.price, offerSummary.price) &&
        Objects.equals(this.termsAndConditionsFull, offerSummary.termsAndConditionsFull) &&
        Objects.equals(this.passiveOfferInd, offerSummary.passiveOfferInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentOfferRef, product, price, termsAndConditionsFull, passiveOfferInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parentOfferRef: ").append(toIndentedString(parentOfferRef)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    termsAndConditionsFull: ").append(toIndentedString(termsAndConditionsFull)).append("\n");
    sb.append("    passiveOfferInd: ").append(toIndentedString(passiveOfferInd)).append("\n");
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
