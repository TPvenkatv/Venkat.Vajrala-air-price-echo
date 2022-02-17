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
 * Defines the type of code given to the Organization to obtain discounts or additional benefits
 */
public enum OrganizationCodeTypeEnum {
  ACCOUNT("Account"),
    ORGANIZATIONLOYALTYPROGRAM("OrganizationLoyaltyProgram"),
    TOUR("Tour");

  private final String value;

  OrganizationCodeTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrganizationCodeTypeEnum fromValue(String text) {
    for (OrganizationCodeTypeEnum b : OrganizationCodeTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
