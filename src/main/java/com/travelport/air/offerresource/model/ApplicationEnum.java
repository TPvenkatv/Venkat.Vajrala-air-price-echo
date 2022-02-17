package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ApplicationEnum
 */
public enum ApplicationEnum {
  PERPERSON("PerPerson"),
    PERROOM("PerRoom"),
    PERACCOMMODATION("PerAccommodation"),
    PERHOUSE("PerHouse"),
    PERAPARTMENT("PerApartment"),
    PERADULT("PerAdult"),
    PERCHILD("PerChild");

  private final String value;

  ApplicationEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationEnum fromValue(String text) {
    for (ApplicationEnum b : ApplicationEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
