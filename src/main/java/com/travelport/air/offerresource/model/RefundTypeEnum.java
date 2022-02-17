package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RefundTypeEnum
 */
public enum RefundTypeEnum {
  REFUNDABLE("Refundable"),
    NONREFUNDABLE("NonRefundable"),
    PARTIALREFUND("PartialRefund");

  private final String value;

  RefundTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RefundTypeEnum fromValue(String text) {
    for (RefundTypeEnum b : RefundTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
