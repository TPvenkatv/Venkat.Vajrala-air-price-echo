package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AdvancePayment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdvancePaymentIndeterminate
 */
@Validated


public class AdvancePaymentIndeterminate extends AdvancePayment implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("IndeterminateInd")
  private Boolean indeterminateInd = null;

  public AdvancePaymentIndeterminate indeterminateInd(Boolean indeterminateInd) {
    this.indeterminateInd = indeterminateInd;
    return this;
  }

  /**
   * If true the advance Payment restrictions could not be determined
   * @return indeterminateInd
   **/
  @Schema(description = "If true the advance Payment restrictions could not be determined")
  
    public Boolean isIndeterminateInd() {
    return indeterminateInd;
  }

  public void setIndeterminateInd(Boolean indeterminateInd) {
    this.indeterminateInd = indeterminateInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancePaymentIndeterminate advancePaymentIndeterminate = (AdvancePaymentIndeterminate) o;
    return Objects.equals(this.indeterminateInd, advancePaymentIndeterminate.indeterminateInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indeterminateInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancePaymentIndeterminate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    indeterminateInd: ").append(toIndentedString(indeterminateInd)).append("\n");
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
