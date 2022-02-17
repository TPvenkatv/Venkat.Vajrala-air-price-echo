package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets CabinPreferenceTypeEnum
 */
public enum CabinPreferenceTypeEnum {
  PREFERRED("Preferred"),
    PERMITTED("Permitted"),
    PREFERREDWITHUPGRADE("PreferredWithUpgrade");

  private final String value;

  CabinPreferenceTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CabinPreferenceTypeEnum fromValue(String text) {
    for (CabinPreferenceTypeEnum b : CabinPreferenceTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
