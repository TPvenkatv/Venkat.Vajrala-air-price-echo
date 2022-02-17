package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CommissionEnum;
import com.travelport.air.offerresource.model.CurrencyAmount;
import com.travelport.air.offerresource.model.Minimum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinimumAmount
 */
@Validated


public class MinimumAmount extends Minimum implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Amount")
  private CurrencyAmount amount = null;

  public MinimumAmount amount(CurrencyAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public CurrencyAmount getAmount() {
    return amount;
  }

  public void setAmount(CurrencyAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimumAmount minimumAmount = (MinimumAmount) o;
    return Objects.equals(this.amount, minimumAmount.amount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumAmount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
