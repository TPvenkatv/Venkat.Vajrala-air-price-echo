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
 * The audience targeted for the brand information
 */
public enum BrandTargetEnum {
  STRAPLINE("Strapline"),
    MARKETINGAGENT("MarketingAgent"),
    MARKETINGCONSUMER("MarketingConsumer"),
    EXTERNAL("External"),
    SHORT("Short"),
    AGENT("Agent"),
    CONSUMER("Consumer"),
    UPSELL("Upsell");

  private final String value;

  BrandTargetEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrandTargetEnum fromValue(String text) {
    for (BrandTargetEnum b : BrandTargetEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
