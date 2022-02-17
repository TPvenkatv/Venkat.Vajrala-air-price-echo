package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ExcludeGroundTypeEnum
 */
public enum ExcludeGroundTypeEnum {
  TRAIN("Train"),
    ALL("All");

  private final String value;

  ExcludeGroundTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExcludeGroundTypeEnum fromValue(String text) {
    for (ExcludeGroundTypeEnum b : ExcludeGroundTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
