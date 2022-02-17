package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ConfirmedStatusEnum_Base
 */
public enum ConfirmedStatusEnumBase {
  ALLFLIGHTSMUSTBECONFIRMED("AllFlightsMustBeConfirmed"),
    OPENRETURNSNOTPERMITTED("OpenReturnsNotPermitted"),
    FIRSTFLIGHTMUSTBECONFIRMED("FirstFlightMustBeConfirmed"),
    OPENRETURNSAREPERMITTED("OpenReturnsArePermitted"),
    OTHER_("Other_");

  private final String value;

  ConfirmedStatusEnumBase(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConfirmedStatusEnumBase fromValue(String text) {
    for (ConfirmedStatusEnumBase b : ConfirmedStatusEnumBase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
