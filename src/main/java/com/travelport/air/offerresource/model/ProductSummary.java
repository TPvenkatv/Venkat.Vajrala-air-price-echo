package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.ProductID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductSummary
 */
@Validated


public class ProductSummary extends ProductID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  public ProductSummary quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The number of products dependent on context
   * minimum: 0
   * @return quantity
   **/
  @Schema(description = "The number of products dependent on context")
  
  @Min(0)  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSummary productSummary = (ProductSummary) o;
    return Objects.equals(this.quantity, productSummary.quantity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
