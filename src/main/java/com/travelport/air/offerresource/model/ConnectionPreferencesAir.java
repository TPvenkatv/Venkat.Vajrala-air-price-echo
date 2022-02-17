package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.ConnectionPreferences;
import com.travelport.air.offerresource.model.FlightType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnectionPreferencesAir
 */
@Validated


public class ConnectionPreferencesAir extends ConnectionPreferences implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("FlightType")
  private FlightType flightType = null;

  public ConnectionPreferencesAir flightType(FlightType flightType) {
    this.flightType = flightType;
    return this;
  }

  /**
   * Get flightType
   * @return flightType
   **/
  @Schema(description = "")
  
    @Valid
    public FlightType getFlightType() {
    return flightType;
  }

  public void setFlightType(FlightType flightType) {
    this.flightType = flightType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionPreferencesAir connectionPreferencesAir = (ConnectionPreferencesAir) o;
    return Objects.equals(this.flightType, connectionPreferencesAir.flightType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPreferencesAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flightType: ").append(toIndentedString(flightType)).append("\n");
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
