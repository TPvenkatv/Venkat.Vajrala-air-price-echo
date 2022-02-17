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
 * Yes , No , Unknown
 */
public enum YesNoUnknownEnum {
  YES("Yes"),
    NO("No"),
    UNKNOWN("Unknown");

  private final String value;

  YesNoUnknownEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static YesNoUnknownEnum fromValue(String text) {
    for (YesNoUnknownEnum b : YesNoUnknownEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
