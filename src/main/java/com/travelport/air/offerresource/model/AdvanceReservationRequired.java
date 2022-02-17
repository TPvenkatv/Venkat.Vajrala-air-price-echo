package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AdvanceReservation;
import com.travelport.air.offerresource.model.ConfirmedStatusEnum;
import com.travelport.air.offerresource.model.FirstReservation;
import com.travelport.air.offerresource.model.LastReservation;
import com.travelport.air.offerresource.model.WaitlistStandbyConditionEnum;
import com.travelport.air.offerresource.model.YesNoUnknownEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdvanceReservationRequired
 */
@Validated


public class AdvanceReservationRequired extends AdvanceReservation implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("instantPurchase")
  private YesNoUnknownEnum instantPurchase = null;

  @JsonProperty("standby")
  private YesNoUnknownEnum standby = null;

  @JsonProperty("waiverDate")
  private String waiverDate = null;

  @JsonProperty("ReservationTravelSegmentIndicatorATPCO")
  private Integer reservationTravelSegmentIndicatorATPCO = null;

  @JsonProperty("ConfirmedStatus")
  @Valid
  private java.util.List<ConfirmedStatusEnum> confirmedStatus = null;

  @JsonProperty("WaitlistStandbyCondition")
  @Valid
  private java.util.List<WaitlistStandbyConditionEnum> waitlistStandbyCondition = null;

  @JsonProperty("FirstReservation")
  private FirstReservation firstReservation = null;

  @JsonProperty("LastReservation")
  private LastReservation lastReservation = null;

  public AdvanceReservationRequired instantPurchase(YesNoUnknownEnum instantPurchase) {
    this.instantPurchase = instantPurchase;
    return this;
  }

  /**
   * Get instantPurchase
   * @return instantPurchase
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public YesNoUnknownEnum getInstantPurchase() {
    return instantPurchase;
  }

  public void setInstantPurchase(YesNoUnknownEnum instantPurchase) {
    this.instantPurchase = instantPurchase;
  }

  public AdvanceReservationRequired standby(YesNoUnknownEnum standby) {
    this.standby = standby;
    return this;
  }

  /**
   * Get standby
   * @return standby
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public YesNoUnknownEnum getStandby() {
    return standby;
  }

  public void setStandby(YesNoUnknownEnum standby) {
    this.standby = standby;
  }

  public AdvanceReservationRequired waiverDate(String waiverDate) {
    this.waiverDate = waiverDate;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalDate
   * @return waiverDate
   **/
  @Schema(description = "Assigned Type: ota2:LocalDate")
  
  @Pattern(regexp="(\\d{4}-\\d{2}-\\d{2})")   public String getWaiverDate() {
    return waiverDate;
  }

  public void setWaiverDate(String waiverDate) {
    this.waiverDate = waiverDate;
  }

  public AdvanceReservationRequired reservationTravelSegmentIndicatorATPCO(Integer reservationTravelSegmentIndicatorATPCO) {
    this.reservationTravelSegmentIndicatorATPCO = reservationTravelSegmentIndicatorATPCO;
    return this;
  }

  /**
   * The ATPCO travel segment geographic indicator. Example \\\"55\\\" = 1st segment over the water
   * minimum: 0
   * @return reservationTravelSegmentIndicatorATPCO
   **/
  @Schema(description = "The ATPCO travel segment geographic indicator. Example \\\"55\\\" = 1st segment over the water")
  
  @Min(0)  public Integer getReservationTravelSegmentIndicatorATPCO() {
    return reservationTravelSegmentIndicatorATPCO;
  }

  public void setReservationTravelSegmentIndicatorATPCO(Integer reservationTravelSegmentIndicatorATPCO) {
    this.reservationTravelSegmentIndicatorATPCO = reservationTravelSegmentIndicatorATPCO;
  }

  public AdvanceReservationRequired confirmedStatus(java.util.List<ConfirmedStatusEnum> confirmedStatus) {
    this.confirmedStatus = confirmedStatus;
    return this;
  }

  public AdvanceReservationRequired addConfirmedStatusItem(ConfirmedStatusEnum confirmedStatusItem) {
    if (this.confirmedStatus == null) {
      this.confirmedStatus = new java.util.ArrayList<>();
    }
    this.confirmedStatus.add(confirmedStatusItem);
    return this;
  }

  /**
   * Get confirmedStatus
   * @return confirmedStatus
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<ConfirmedStatusEnum> getConfirmedStatus() {
    return confirmedStatus;
  }

  public void setConfirmedStatus(java.util.List<ConfirmedStatusEnum> confirmedStatus) {
    this.confirmedStatus = confirmedStatus;
  }

  public AdvanceReservationRequired waitlistStandbyCondition(java.util.List<WaitlistStandbyConditionEnum> waitlistStandbyCondition) {
    this.waitlistStandbyCondition = waitlistStandbyCondition;
    return this;
  }

  public AdvanceReservationRequired addWaitlistStandbyConditionItem(WaitlistStandbyConditionEnum waitlistStandbyConditionItem) {
    if (this.waitlistStandbyCondition == null) {
      this.waitlistStandbyCondition = new java.util.ArrayList<>();
    }
    this.waitlistStandbyCondition.add(waitlistStandbyConditionItem);
    return this;
  }

  /**
   * Get waitlistStandbyCondition
   * @return waitlistStandbyCondition
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<WaitlistStandbyConditionEnum> getWaitlistStandbyCondition() {
    return waitlistStandbyCondition;
  }

  public void setWaitlistStandbyCondition(java.util.List<WaitlistStandbyConditionEnum> waitlistStandbyCondition) {
    this.waitlistStandbyCondition = waitlistStandbyCondition;
  }

  public AdvanceReservationRequired firstReservation(FirstReservation firstReservation) {
    this.firstReservation = firstReservation;
    return this;
  }

  /**
   * Get firstReservation
   * @return firstReservation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FirstReservation getFirstReservation() {
    return firstReservation;
  }

  public void setFirstReservation(FirstReservation firstReservation) {
    this.firstReservation = firstReservation;
  }

  public AdvanceReservationRequired lastReservation(LastReservation lastReservation) {
    this.lastReservation = lastReservation;
    return this;
  }

  /**
   * Get lastReservation
   * @return lastReservation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LastReservation getLastReservation() {
    return lastReservation;
  }

  public void setLastReservation(LastReservation lastReservation) {
    this.lastReservation = lastReservation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceReservationRequired advanceReservationRequired = (AdvanceReservationRequired) o;
    return Objects.equals(this.instantPurchase, advanceReservationRequired.instantPurchase) &&
        Objects.equals(this.standby, advanceReservationRequired.standby) &&
        Objects.equals(this.waiverDate, advanceReservationRequired.waiverDate) &&
        Objects.equals(this.reservationTravelSegmentIndicatorATPCO, advanceReservationRequired.reservationTravelSegmentIndicatorATPCO) &&
        Objects.equals(this.confirmedStatus, advanceReservationRequired.confirmedStatus) &&
        Objects.equals(this.waitlistStandbyCondition, advanceReservationRequired.waitlistStandbyCondition) &&
        Objects.equals(this.firstReservation, advanceReservationRequired.firstReservation) &&
        Objects.equals(this.lastReservation, advanceReservationRequired.lastReservation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instantPurchase, standby, waiverDate, reservationTravelSegmentIndicatorATPCO, confirmedStatus, waitlistStandbyCondition, firstReservation, lastReservation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceReservationRequired {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    instantPurchase: ").append(toIndentedString(instantPurchase)).append("\n");
    sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
    sb.append("    waiverDate: ").append(toIndentedString(waiverDate)).append("\n");
    sb.append("    reservationTravelSegmentIndicatorATPCO: ").append(toIndentedString(reservationTravelSegmentIndicatorATPCO)).append("\n");
    sb.append("    confirmedStatus: ").append(toIndentedString(confirmedStatus)).append("\n");
    sb.append("    waitlistStandbyCondition: ").append(toIndentedString(waitlistStandbyCondition)).append("\n");
    sb.append("    firstReservation: ").append(toIndentedString(firstReservation)).append("\n");
    sb.append("    lastReservation: ").append(toIndentedString(lastReservation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
