package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ConnectionTypeEnum
 */
public enum ConnectionTypeEnum {
  NONSTOPDIRECT("NonStopDirect"),
    STOPDIRECT("StopDirect"),
    SINGLECONNECTION("SingleConnection"),
    DOUBLECONNECTION("DoubleConnection"),
    TRIPLECONNECTION("TripleConnection");

  private final String value;

  ConnectionTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConnectionTypeEnum fromValue(String text) {
    for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
