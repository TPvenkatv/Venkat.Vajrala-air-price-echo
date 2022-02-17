package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PromotionalCode
 */
@Validated


public class PromotionalCode  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("supplierCode")
  private String supplierCode = null;

  public PromotionalCode value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=32)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PromotionalCode supplierCode(String supplierCode) {
    this.supplierCode = supplierCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:SupplierCode
   * @return supplierCode
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:SupplierCode")
      @NotNull

  @Pattern(regexp="([a-zA-Z0-9]{2,5})") @Size(min=2,max=5)   public String getSupplierCode() {
    return supplierCode;
  }

  public void setSupplierCode(String supplierCode) {
    this.supplierCode = supplierCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionalCode promotionalCode = (PromotionalCode) o;
    return Objects.equals(this.value, promotionalCode.value) &&
        Objects.equals(this.supplierCode, promotionalCode.supplierCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, supplierCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionalCode {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    supplierCode: ").append(toIndentedString(supplierCode)).append("\n");
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
