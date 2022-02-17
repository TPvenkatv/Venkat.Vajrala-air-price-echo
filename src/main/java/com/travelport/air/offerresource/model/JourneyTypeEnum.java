package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets JourneyTypeEnum
 */
public enum JourneyTypeEnum {
  OPENJAW("OpenJaw"),
    ROUNDTRIP("RoundTrip"),
    CIRCLETRIP("CircleTrip"),
    OUTBOUND("Outbound"),
    INBOUND("Inbound");

  private final String value;

  JourneyTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static JourneyTypeEnum fromValue(String text) {
    for (JourneyTypeEnum b : JourneyTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
