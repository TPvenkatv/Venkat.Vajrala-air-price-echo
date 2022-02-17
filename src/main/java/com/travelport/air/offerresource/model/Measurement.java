package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.MeasurementTypeEnum;
import com.travelport.air.offerresource.model.UnitOfMeasureEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used for dimensional units (width, height, depth) or weight
 */
@Schema(description = "Used for dimensional units (width, height, depth) or weight")
@Validated


public class Measurement  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("measurementType")
  private MeasurementTypeEnum measurementType = null;

  @JsonProperty("unit")
  private UnitOfMeasureEnum unit = null;

  public Measurement value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Measurement measurementType(MeasurementTypeEnum measurementType) {
    this.measurementType = measurementType;
    return this;
  }

  /**
   * Get measurementType
   * @return measurementType
   **/
  @Schema(description = "")
  
    @Valid
    public MeasurementTypeEnum getMeasurementType() {
    return measurementType;
  }

  public void setMeasurementType(MeasurementTypeEnum measurementType) {
    this.measurementType = measurementType;
  }

  public Measurement unit(UnitOfMeasureEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   **/
  @Schema(description = "")
  
    @Valid
    public UnitOfMeasureEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitOfMeasureEnum unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.value, measurement.value) &&
        Objects.equals(this.measurementType, measurement.measurementType) &&
        Objects.equals(this.unit, measurement.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, measurementType, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    measurementType: ").append(toIndentedString(measurementType)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
