package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.GeographicRestrictionTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeographicRestriction
 */
@Validated


public class GeographicRestriction  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("geographicRestrictionType")
  private GeographicRestrictionTypeEnum geographicRestrictionType = null;

  public GeographicRestriction value(String value) {
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

  public GeographicRestriction geographicRestrictionType(GeographicRestrictionTypeEnum geographicRestrictionType) {
    this.geographicRestrictionType = geographicRestrictionType;
    return this;
  }

  /**
   * Get geographicRestrictionType
   * @return geographicRestrictionType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public GeographicRestrictionTypeEnum getGeographicRestrictionType() {
    return geographicRestrictionType;
  }

  public void setGeographicRestrictionType(GeographicRestrictionTypeEnum geographicRestrictionType) {
    this.geographicRestrictionType = geographicRestrictionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicRestriction geographicRestriction = (GeographicRestriction) o;
    return Objects.equals(this.value, geographicRestriction.value) &&
        Objects.equals(this.geographicRestrictionType, geographicRestriction.geographicRestrictionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, geographicRestrictionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicRestriction {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    geographicRestrictionType: ").append(toIndentedString(geographicRestrictionType)).append("\n");
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
