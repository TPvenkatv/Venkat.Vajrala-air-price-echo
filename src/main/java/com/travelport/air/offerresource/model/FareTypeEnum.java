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
 * Defines the type of fares to return (Only public fares, Only private fares, Only agency private fares, Only
 */
public enum FareTypeEnum {
  PUBLICFARE("PublicFare"),
    AGENCYPRIVATEFARE("AgencyPrivateFare"),
    AIRLINEPRIVATEFARE("AirlinePrivateFare"),
    NETFARE("NetFare");

  private final String value;

  FareTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FareTypeEnum fromValue(String text) {
    for (FareTypeEnum b : FareTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
