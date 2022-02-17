package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FareRuleEnum
 */
public enum FareRuleEnum {
  STRUCTURED("Structured"),
    SHORTTEXT("ShortText"),
    LONGTEXT("LongText");

  private final String value;

  FareRuleEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FareRuleEnum fromValue(String text) {
    for (FareRuleEnum b : FareRuleEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
