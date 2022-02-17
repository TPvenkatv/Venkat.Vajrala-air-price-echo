package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.MinimumStay;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinimumStayIndeterminate
 */
@Validated


public class MinimumStayIndeterminate extends MinimumStay implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("IndeterminateInd")
  private Boolean indeterminateInd = null;

  public MinimumStayIndeterminate indeterminateInd(Boolean indeterminateInd) {
    this.indeterminateInd = indeterminateInd;
    return this;
  }

  /**
   * Structured fare rules could not be determined for this category
   * @return indeterminateInd
   **/
  @Schema(description = "Structured fare rules could not be determined for this category")
  
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
    MinimumStayIndeterminate minimumStayIndeterminate = (MinimumStayIndeterminate) o;
    return Objects.equals(this.indeterminateInd, minimumStayIndeterminate.indeterminateInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indeterminateInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumStayIndeterminate {\n");
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
