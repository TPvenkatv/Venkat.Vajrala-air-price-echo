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
 * The unit of measure in a code format. Refer to OpenTravel Code List Unit of Measure Code (UOM).
 */
public enum UnitOfMeasureEnum {
  MILES("Miles"),
    KILOMETERS("Kilometers"),
    METERS("Meters"),
    MILLIMETERS("Millimeters"),
    CENTIMETERS("Centimeters"),
    YARDS("Yards"),
    FEET("Feet"),
    INCHES("Inches"),
    PIXELS("Pixels"),
    BLOCK("Block"),
    MEGABYTES("Megabytes"),
    GIGABYTES("Gigabytes"),
    SQUARE_FEET("Square feet"),
    SQUARE_METERS("Square meters"),
    POUNDS("Pounds"),
    KILOGRAMS("Kilograms"),
    SQUARE_INCH("Square inch"),
    SQUARE_YARD("Square yard"),
    ACRE("Acre"),
    SQUARE_MILLIMETER("Square millimeter"),
    SQUARE_CENTIMETER("Square centimeter"),
    HECTARE("Hectare"),
    OUNCE("Ounce"),
    GRAM("Gram"),
    GALLONS("Gallons"),
    LITERS("Liters"),
    KILOWATTS("Kilowatts"),
    CUBIC_METERS("Cubic meters");

  private final String value;

  UnitOfMeasureEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UnitOfMeasureEnum fromValue(String text) {
    for (UnitOfMeasureEnum b : UnitOfMeasureEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
