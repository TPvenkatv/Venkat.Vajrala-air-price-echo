package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ApplicableLevelEnum
 */
public enum ApplicableLevelEnum {
  PASSENGERSEGMENT("PassengerSegment"),
    SEGMENT("Segment"),
    ITINERARY("Itinerary"),
    PASSENGERS("Passengers"),
    PASSENGEROD("PassengerOD"),
    OTHER("Other");

  private final String value;

  ApplicableLevelEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicableLevelEnum fromValue(String text) {
    for (ApplicableLevelEnum b : ApplicableLevelEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
