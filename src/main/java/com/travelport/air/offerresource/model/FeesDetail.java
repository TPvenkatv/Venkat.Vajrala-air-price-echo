package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Fee;
import com.travelport.air.offerresource.model.Fees;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeesDetail
 */
@Validated


public class FeesDetail extends Fees implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Fee")
  @Valid
  private java.util.List<Fee> fee = null;

  public FeesDetail fee(java.util.List<Fee> fee) {
    this.fee = fee;
    return this;
  }

  public FeesDetail addFeeItem(Fee feeItem) {
    if (this.fee == null) {
      this.fee = new java.util.ArrayList<>();
    }
    this.fee.add(feeItem);
    return this;
  }

  /**
   * Get fee
   * @return fee
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<Fee> getFee() {
    return fee;
  }

  public void setFee(java.util.List<Fee> fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesDetail feesDetail = (FeesDetail) o;
    return Objects.equals(this.fee, feesDetail.fee) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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
