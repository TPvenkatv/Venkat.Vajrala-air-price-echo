package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GeographicRestrictionTypeEnum
 */
public enum GeographicRestrictionTypeEnum {
  AREA("Area"),
    AIRPORT("Airport"),
    CITY("City"),
    COUNTRY("Country"),
    STATEPROVINCE("StateProvince"),
    ZONE("Zone");

  private final String value;

  GeographicRestrictionTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GeographicRestrictionTypeEnum fromValue(String text) {
    for (GeographicRestrictionTypeEnum b : GeographicRestrictionTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
