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
 * Type of commission
 */
public enum CommissionEnum {
  FULL("Full"),
    PARTIAL("Partial"),
    NON_PAYING("Non-paying"),
    NO_SHOW("No-show"),
    ADJUSTMENT("Adjustment"),
    COMMISSIONABLE("Commissionable");

  private final String value;

  CommissionEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CommissionEnum fromValue(String text) {
    for (CommissionEnum b : CommissionEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
