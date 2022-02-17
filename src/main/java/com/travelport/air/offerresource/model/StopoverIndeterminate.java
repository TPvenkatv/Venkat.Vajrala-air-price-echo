package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Stopover;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StopoverIndeterminate
 */
@Validated


public class StopoverIndeterminate extends Stopover implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("IndeterminatedInd")
  private Boolean indeterminatedInd = null;

  public StopoverIndeterminate indeterminatedInd(Boolean indeterminatedInd) {
    this.indeterminatedInd = indeterminatedInd;
    return this;
  }

  /**
   * If true the stopover restrictions could not be determined
   * @return indeterminatedInd
   **/
  @Schema(description = "If true the stopover restrictions could not be determined")
  
    public Boolean isIndeterminatedInd() {
    return indeterminatedInd;
  }

  public void setIndeterminatedInd(Boolean indeterminatedInd) {
    this.indeterminatedInd = indeterminatedInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopoverIndeterminate stopoverIndeterminate = (StopoverIndeterminate) o;
    return Objects.equals(this.indeterminatedInd, stopoverIndeterminate.indeterminatedInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indeterminatedInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopoverIndeterminate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    indeterminatedInd: ").append(toIndentedString(indeterminatedInd)).append("\n");
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
