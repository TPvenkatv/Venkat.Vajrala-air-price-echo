package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Arrival;
import com.travelport.air.offerresource.model.AvailabilitySourceCodeENUM;
import com.travelport.air.offerresource.model.Departure;
import com.travelport.air.offerresource.model.Flight;
import com.travelport.air.offerresource.model.IntermediateStop;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightDetail
 */
@Validated


public class FlightDetail extends Flight implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("AvailabilitySourceCode")
  private AvailabilitySourceCodeENUM availabilitySourceCode = null;

  public FlightDetail availabilitySourceCode(AvailabilitySourceCodeENUM availabilitySourceCode) {
    this.availabilitySourceCode = availabilitySourceCode;
    return this;
  }

  /**
   * Get availabilitySourceCode
   * @return availabilitySourceCode
   **/
  @Schema(description = "")
  
    @Valid
    public AvailabilitySourceCodeENUM getAvailabilitySourceCode() {
    return availabilitySourceCode;
  }

  public void setAvailabilitySourceCode(AvailabilitySourceCodeENUM availabilitySourceCode) {
    this.availabilitySourceCode = availabilitySourceCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightDetail flightDetail = (FlightDetail) o;
    return Objects.equals(this.availabilitySourceCode, flightDetail.availabilitySourceCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilitySourceCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availabilitySourceCode: ").append(toIndentedString(availabilitySourceCode)).append("\n");
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
