package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AdvanceReservation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdvanceReservationIndeterminate
 */
@Validated


public class AdvanceReservationIndeterminate extends AdvanceReservation implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("IndeterminateInd")
  private Boolean indeterminateInd = null;

  public AdvanceReservationIndeterminate indeterminateInd(Boolean indeterminateInd) {
    this.indeterminateInd = indeterminateInd;
    return this;
  }

  /**
   * If true the advance Reservation restrictions could not be determined
   * @return indeterminateInd
   **/
  @Schema(description = "If true the advance Reservation restrictions could not be determined")
  
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
    AdvanceReservationIndeterminate advanceReservationIndeterminate = (AdvanceReservationIndeterminate) o;
    return Objects.equals(this.indeterminateInd, advanceReservationIndeterminate.indeterminateInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indeterminateInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceReservationIndeterminate {\n");
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
