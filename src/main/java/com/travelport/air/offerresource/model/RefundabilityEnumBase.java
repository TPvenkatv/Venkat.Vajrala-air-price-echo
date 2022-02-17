package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RefundabilityEnum_Base
 */
public enum RefundabilityEnumBase {
  REFUNDABLE("Refundable"),
    NONREFUNDABLE("NonRefundable"),
    REUSABLE("Reusable"),
    OTHER_("Other_");

  private final String value;

  RefundabilityEnumBase(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RefundabilityEnumBase fromValue(String text) {
    for (RefundabilityEnumBase b : RefundabilityEnumBase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
