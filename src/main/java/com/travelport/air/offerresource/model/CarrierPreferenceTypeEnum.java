package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets CarrierPreferenceTypeEnum
 */
public enum CarrierPreferenceTypeEnum {
  PREFERRED("Preferred"),
    PERMITTED("Permitted"),
    PROHIBITED("Prohibited");

  private final String value;

  CarrierPreferenceTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CarrierPreferenceTypeEnum fromValue(String text) {
    for (CarrierPreferenceTypeEnum b : CarrierPreferenceTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
