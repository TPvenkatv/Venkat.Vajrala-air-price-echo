package com.travelport.air.offerresource.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of measurement such as width, height, weight
 */
public enum MeasurementTypeEnum {
  WIDTH("Width"),
    HEIGHT("Height"),
    DEPTH("Depth"),
    WEIGHT("Weight"),
    OVERALLDIMENSION("OverallDimension");

  private final String value;

  MeasurementTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MeasurementTypeEnum fromValue(String text) {
    for (MeasurementTypeEnum b : MeasurementTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
