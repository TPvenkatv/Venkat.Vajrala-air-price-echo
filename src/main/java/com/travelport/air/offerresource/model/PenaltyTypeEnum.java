package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PenaltyTypeEnum
 */
public enum PenaltyTypeEnum {
  BEFOREDEPARTURE("BeforeDeparture"),
    AFTERDEPARTURE("AfterDeparture"),
    ANYTIME("Anytime"),
    NOSHOW("NoShow"),
    MINIMUM("Minimum"),
    MAXIMUM("Maximum"),
    EXCHANGEREQUIRED("ExchangeRequired"),
    EXCHANGENOTREQUIRED("ExchangeNotRequired");

  private final String value;

  PenaltyTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PenaltyTypeEnum fromValue(String text) {
    for (PenaltyTypeEnum b : PenaltyTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
