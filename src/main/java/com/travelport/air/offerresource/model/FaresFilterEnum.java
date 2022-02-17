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
 * REVIEW: Defines the type of fares to return (Only public fares, Only private fares, Only agency private fares, Only
 */
public enum FaresFilterEnum {
  PUBLICFARESONLY("PublicFaresOnly"),
    PRIVATEFARESONLY("PrivateFaresOnly"),
    AGENCYPRIVATEFARESONLY("AgencyPrivateFaresOnly"),
    AIRLINEPRIVATEFARESONLY("AirlinePrivateFaresOnly"),
    PUBLICANDPRIVATEFARES("PublicAndPrivateFares"),
    NETFARESONLY("NetFaresOnly"),
    ALLFARES("AllFares");

  private final String value;

  FaresFilterEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FaresFilterEnum fromValue(String text) {
    for (FaresFilterEnum b : FaresFilterEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
