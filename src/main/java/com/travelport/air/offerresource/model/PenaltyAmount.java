package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CommissionEnum;
import com.travelport.air.offerresource.model.CurrencyAmount;
import com.travelport.air.offerresource.model.Penalty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PenaltyAmount
 */
@Validated


public class PenaltyAmount extends Penalty implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Amount")
  private CurrencyAmount amount = null;

  public PenaltyAmount amount(CurrencyAmount amount) {
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
    PenaltyAmount penaltyAmount = (PenaltyAmount) o;
    return Objects.equals(this.amount, penaltyAmount.amount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PenaltyAmount {\n");
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
