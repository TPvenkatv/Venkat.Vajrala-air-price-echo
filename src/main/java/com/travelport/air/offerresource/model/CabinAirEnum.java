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
 * Specifies the cabin type (e.g. first, business, economy).
 */
public enum CabinAirEnum {
  PREMIUMFIRST("PremiumFirst"),
    FIRST("First"),
    BUSINESS("Business"),
    PREMIUMECONOMY("PremiumEconomy"),
    ECONOMY("Economy");

  private final String value;

  CabinAirEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CabinAirEnum fromValue(String text) {
    for (CabinAirEnum b : CabinAirEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
