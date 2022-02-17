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
 * The status of an error or warning
 */
public enum ResultStatusEnum {
  NOT_PROCESSED("Not processed"),
    INCOMPLETE("Incomplete"),
    COMPLETE("Complete"),
    UNKNOWN("Unknown");

  private final String value;

  ResultStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ResultStatusEnum fromValue(String text) {
    for (ResultStatusEnum b : ResultStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
