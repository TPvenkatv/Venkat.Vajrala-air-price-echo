package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CommissionEnum;
import com.travelport.air.offerresource.model.RefundedCommission;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundedCommissionPercent
 */
@Validated


public class RefundedCommissionPercent extends RefundedCommission implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Percent")
  private Float percent = null;

  public RefundedCommissionPercent percent(Float percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Percent amount of commission
   * minimum: 0
   * @return percent
   **/
  @Schema(description = "Percent amount of commission")
  
  @DecimalMin("0")  public Float getPercent() {
    return percent;
  }

  public void setPercent(Float percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundedCommissionPercent refundedCommissionPercent = (RefundedCommissionPercent) o;
    return Objects.equals(this.percent, refundedCommissionPercent.percent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundedCommissionPercent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
