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
 * The Travelport classification used for a category of ancillaries such as Seat, Bags, etc. This is an initial list that will be added to.
 */
public enum BrandClassificationEnum {
  CHECKEDBAG("CheckedBag"),
    CARRYON("CarryOn"),
    PERSONALITEM("PersonalItem"),
    REBOOKING("Rebooking"),
    REFUND("Refund"),
    SEATASSIGNMENT("SeatAssignment"),
    PREMIUMSEAT("PremiumSeat"),
    LIEFLATSEAT("LieFlatSeat"),
    MEALS("Meals"),
    WIFI("WiFi"),
    OTHER("Other");

  private final String value;

  BrandClassificationEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrandClassificationEnum fromValue(String text) {
    for (BrandClassificationEnum b : BrandClassificationEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
