package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FareRuleCategoryEnum
 */
public enum FareRuleCategoryEnum {
  ADVANCERESERVATIONSTICKETING("AdvanceReservationsTicketing"),
    MINIMUMSTAY("MinimumStay"),
    MAXIMUMSTAY("MaximumStay"),
    STOPOVERS("Stopovers"),
    PENALTIES("Penalties"),
    ELIGIBILITY("Eligibility"),
    DAYTIME("DayTime"),
    SEASONALITY("Seasonality"),
    FLIGHTAPPLICATION("FlightApplication"),
    TRANSFERS("Transfers"),
    COMBINATIONS("Combinations"),
    BLACKOUTDATES("BlackoutDates"),
    SURCHARGES("Surcharges"),
    ACCOMPANIEDTRAVEL("AccompaniedTravel"),
    TRAVELRESTRICTIONS("TravelRestrictions"),
    SALESRESTRICTIONS("SalesRestrictions"),
    HIPMILEAGEEXEPTIONS("HIPMileageExeptions"),
    TICKETENDORSEMENTS("TicketEndorsements"),
    CHILDRENDISCOUNTS("ChildrenDiscounts"),
    TOURCONDUCTORDISCOUNTS("TourConductorDiscounts"),
    AGENTDISCOUNTS("AgentDiscounts"),
    ALLOTHERDISCOUNTS("AllOtherDiscounts"),
    MISCELLANEOUSPROVISIONS("MiscellaneousProvisions"),
    FAREBYRULE("FareByRule"),
    GROUPS("Groups"),
    TOURS("Tours"),
    VISITANOTHERCOUNTRY("VisitAnotherCountry"),
    DEPOSITS("Deposits"),
    VOLUNTARYCHANGES("VoluntaryChanges"),
    VOLUNTARYREFUNDS("VoluntaryRefunds"),
    NEGOTIATEDFARES("NegotiatedFares"),
    APPLICATIONANDOTHERCONDITIONS("ApplicationAndOtherConditions");

  private final String value;

  FareRuleCategoryEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FareRuleCategoryEnum fromValue(String text) {
    for (FareRuleCategoryEnum b : FareRuleCategoryEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
