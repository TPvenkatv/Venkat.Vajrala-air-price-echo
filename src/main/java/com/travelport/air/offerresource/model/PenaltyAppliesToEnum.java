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
 * Penalty applicable list
 */
public enum PenaltyAppliesToEnum {
  ONEWAY("OneWay"),
    ROUNDTRIP("RoundTrip"),
    PERTICKET("PerTicket"),
    PERCOUPON("PerCoupon"),
    PERDIRECTIONOFTRAVEL("PerDirectionOfTravel");

  private final String value;

  PenaltyAppliesToEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PenaltyAppliesToEnum fromValue(String text) {
    for (PenaltyAppliesToEnum b : PenaltyAppliesToEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
