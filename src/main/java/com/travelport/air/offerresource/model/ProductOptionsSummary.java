package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.ProductID;
import com.travelport.air.offerresource.model.ProductOptionsID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductOptionsSummary
 */
@Validated


public class ProductOptionsSummary extends ProductOptionsID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("Product")
  @Valid
  private java.util.List<ProductID> product = new java.util.ArrayList<>();

  public ProductOptionsSummary sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return sequence
   **/
  @Schema(description = "Assigned Type: c-1100:NonnegativeInteger")
  
  @Min(0)  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public ProductOptionsSummary product(java.util.List<ProductID> product) {
    this.product = product;
    return this;
  }

  public ProductOptionsSummary addProductItem(ProductID productItem) {
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
  @Size(min=1,max=1000)   public java.util.List<ProductID> getProduct() {
    return product;
  }

  public void setProduct(java.util.List<ProductID> product) {
    this.product = product;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOptionsSummary productOptionsSummary = (ProductOptionsSummary) o;
    return Objects.equals(this.sequence, productOptionsSummary.sequence) &&
        Objects.equals(this.product, productOptionsSummary.product) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, product, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionsSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
