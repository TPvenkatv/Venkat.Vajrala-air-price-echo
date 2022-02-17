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
 * The system requesting or returning the currency code specified in the attribute
 */
public enum CurrencySourceEnum {
  SUPPLIER("Supplier"),
    CHARGED("Charged"),
    REQUESTED("Requested");

  private final String value;

  CurrencySourceEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CurrencySourceEnum fromValue(String text) {
    for (CurrencySourceEnum b : CurrencySourceEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
