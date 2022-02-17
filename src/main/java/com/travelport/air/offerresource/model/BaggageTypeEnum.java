package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets BaggageTypeEnum
 */
public enum BaggageTypeEnum {
  CARRYON("CarryOn"),
    FIRSTCHECKEDBAG("FirstCheckedBag"),
    SECONDCHECKEDBAG("SecondCheckedBag"),
    ADDITIONALBAGS("AdditionalBags"),
    BAGGAGEEMBARGO("BaggageEmbargo");

  private final String value;

  BaggageTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BaggageTypeEnum fromValue(String text) {
    for (BaggageTypeEnum b : BaggageTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
