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
 * Type of Waiver like Death of Pessanger,illness Of Passenger, Death of Immediate Family Member  etc
 */
public enum WaiverEnum {
  DEATHOFPASSENGER("DeathOfPassenger"),
    ILLNESSOFPASSENGER("IllnessOfPassenger"),
    DEATHOFIMMEDIATEFAMILYMEMBER("DeathOfImmediateFamilyMember"),
    ILLNESSOFIMMEDIATEFAMILYMEMBER("IllnessOfImmediateFamilyMember"),
    TICKETUPGRADE("TicketUpgrade"),
    SCHEDULECHANGE("ScheduleChange");

  private final String value;

  WaiverEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WaiverEnum fromValue(String text) {
    for (WaiverEnum b : WaiverEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
