package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets WaitlistStandbyConditionEnum_Base
 */
public enum WaitlistStandbyConditionEnumBase {
  WAITLISTSTANDBYNOTPERMITTED("WaitlistStandbyNotPermitted"),
    WAITLISTNOTPERMITTED("WaitlistNotPermitted"),
    WAITLISTSTANDBYNOTPERMITTEDORIGIN("WaitlistStandbyNotPermittedOrigin"),
    STANDBYNOTPERMITTEDORIGIN("StandbyNotPermittedOrigin"),
    WAITLISTNOTPERMITTEDORIGIN("WaitlistNotPermittedOrigin"),
    WAITLISTNOTPERMITTEDONANY("WaitlistNotPermittedOnAny"),
    STANDBYPERMITTEDEARLIERLATERSAMEDAYELSEWAITLISTSTANDBYNOTPERMITTED("StandbyPermittedEarlierLaterSameDayElseWaitlistStandbyNotPermitted"),
    STANDBYPERMITTEDEARLIERLATERSAMEDAYELSESTANDBYNOTPERMITTED("StandbyPermittedEarlierLaterSameDayElseStandbyNotPermitted"),
    STANDBYPERMITTEDEARLIERLATERSAMEDAYELSEWAITLISTSTANDBYNOTPERMITTEDORIGIN("StandbyPermittedEarlierLaterSameDayElseWaitlistStandbyNotPermittedOrigin"),
    WAITLISTPERMITTEDEARLIERLATERSAMEDAYELSEWAITLISTSTANDBYNOTPERMITTEDORIGIN("WaitlistPermittedEarlierLaterSameDayElseWaitlistStandbyNotPermittedOrigin"),
    STANDBYPERMITTEDSAMEDATEORIGINALLYTICKETEDPROVIDEDFLIGHTTIMESPECIFICRULESMET("StandbyPermittedSameDateOriginallyTicketedProvidedFlightTimeSpecificRulesMet"),
    STANDBYNOTPERMITTED("StandbyNotPermitted"),
    OTHER_("Other_");

  private final String value;

  WaitlistStandbyConditionEnumBase(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WaitlistStandbyConditionEnumBase fromValue(String text) {
    for (WaitlistStandbyConditionEnumBase b : WaitlistStandbyConditionEnumBase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
