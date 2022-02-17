package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TravelerGeographicTypeEnum
 */
public enum TravelerGeographicTypeEnum {
  COUNTRY("Country"),
    STATEPROVINCE("StateProvince"),
    CITY("City");

  private final String value;

  TravelerGeographicTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TravelerGeographicTypeEnum fromValue(String text) {
    for (TravelerGeographicTypeEnum b : TravelerGeographicTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
