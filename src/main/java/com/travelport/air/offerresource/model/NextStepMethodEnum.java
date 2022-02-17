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
 * Describes the set of potential methods that can be taken after an operation.
 */
public enum NextStepMethodEnum {
  GET("GET"),
    DELETE("DELETE"),
    PUT("PUT"),
    POST("POST");

  private final String value;

  NextStepMethodEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NextStepMethodEnum fromValue(String text) {
    for (NextStepMethodEnum b : NextStepMethodEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
