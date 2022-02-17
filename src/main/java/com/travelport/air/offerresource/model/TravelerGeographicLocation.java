package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.TravelerGeographicTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A counrty, provence/state or city code
 */
@Schema(description = "A counrty, provence/state or city code")
@Validated


public class TravelerGeographicLocation  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("travelerGeographicLocationType")
  private TravelerGeographicTypeEnum travelerGeographicLocationType = null;

  public TravelerGeographicLocation value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=32)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TravelerGeographicLocation travelerGeographicLocationType(TravelerGeographicTypeEnum travelerGeographicLocationType) {
    this.travelerGeographicLocationType = travelerGeographicLocationType;
    return this;
  }

  /**
   * Get travelerGeographicLocationType
   * @return travelerGeographicLocationType
   **/
  @Schema(description = "")
  
    @Valid
    public TravelerGeographicTypeEnum getTravelerGeographicLocationType() {
    return travelerGeographicLocationType;
  }

  public void setTravelerGeographicLocationType(TravelerGeographicTypeEnum travelerGeographicLocationType) {
    this.travelerGeographicLocationType = travelerGeographicLocationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelerGeographicLocation travelerGeographicLocation = (TravelerGeographicLocation) o;
    return Objects.equals(this.value, travelerGeographicLocation.value) &&
        Objects.equals(this.travelerGeographicLocationType, travelerGeographicLocation.travelerGeographicLocationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, travelerGeographicLocationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerGeographicLocation {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    travelerGeographicLocationType: ").append(toIndentedString(travelerGeographicLocationType)).append("\n");
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
