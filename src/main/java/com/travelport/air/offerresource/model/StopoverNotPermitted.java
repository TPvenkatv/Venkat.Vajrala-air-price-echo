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
 * StopoverNotPermitted
 */
@Validated


public class StopoverNotPermitted extends Stopover implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("NotPermittedInd")
  private Boolean notPermittedInd = null;

  public StopoverNotPermitted notPermittedInd(Boolean notPermittedInd) {
    this.notPermittedInd = notPermittedInd;
    return this;
  }

  /**
   * if true, stopovers are not permitted
   * @return notPermittedInd
   **/
  @Schema(description = "if true, stopovers are not permitted")
  
    public Boolean isNotPermittedInd() {
    return notPermittedInd;
  }

  public void setNotPermittedInd(Boolean notPermittedInd) {
    this.notPermittedInd = notPermittedInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopoverNotPermitted stopoverNotPermitted = (StopoverNotPermitted) o;
    return Objects.equals(this.notPermittedInd, stopoverNotPermitted.notPermittedInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notPermittedInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopoverNotPermitted {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    notPermittedInd: ").append(toIndentedString(notPermittedInd)).append("\n");
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
