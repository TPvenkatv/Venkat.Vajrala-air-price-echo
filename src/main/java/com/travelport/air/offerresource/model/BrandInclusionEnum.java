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
 * The indicator as to hoe the brand and the product are associated.
 */
public enum BrandInclusionEnum {
  INCLUDED("Included"),
    CHARGEABLE("Chargeable"),
    NOT_OFFERED("Not Offered");

  private final String value;

  BrandInclusionEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrandInclusionEnum fromValue(String text) {
    for (BrandInclusionEnum b : BrandInclusionEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
