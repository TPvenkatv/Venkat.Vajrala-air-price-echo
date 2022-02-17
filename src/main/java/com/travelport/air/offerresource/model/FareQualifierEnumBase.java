package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FareQualifierEnum_Base
 */
public enum FareQualifierEnumBase {
  TOUR("Tour"),
    CONSOLIDATOR("Consolidator"),
    VISTFRIENDSANDRELATIVES("VistFriendsAndRelatives"),
    MARINE("Marine"),
    OTHER_("Other_");

  private final String value;

  FareQualifierEnumBase(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FareQualifierEnumBase fromValue(String text) {
    for (FareQualifierEnumBase b : FareQualifierEnumBase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
