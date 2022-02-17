package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FrequencyEnum
 */
public enum FrequencyEnum {
  PERNIGHT("PerNight"),
    PERDAY("PerDay"),
    PERSTAY("PerStay"),
    PERWEEK("PerWeek"),
    ROUNDTRIP("RoundTrip"),
    ONEWAY("OneWay");

  private final String value;

  FrequencyEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FrequencyEnum fromValue(String text) {
    for (FrequencyEnum b : FrequencyEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
