package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AdvancePayment;
import com.travelport.air.offerresource.model.PaymentAfterReservation;
import com.travelport.air.offerresource.model.PaymentBeforeDeparture;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdvancePaymentRequired
 */
@Validated


public class AdvancePaymentRequired extends AdvancePayment implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("waverDate")
  private String waverDate = null;

  @JsonProperty("PaymentAfterReservation")
  private PaymentAfterReservation paymentAfterReservation = null;

  @JsonProperty("PaymentBeforeDeparture")
  private PaymentBeforeDeparture paymentBeforeDeparture = null;

  @JsonProperty("PaymentTravelSegmentIndicatorATPCO")
  private Integer paymentTravelSegmentIndicatorATPCO = null;

  @JsonProperty("instantPaymentInd")
  private Boolean instantPaymentInd = null;

  @JsonProperty("ealierAppliesInd")
  private Boolean ealierAppliesInd = null;

  @JsonProperty("laterAppliesInd")
  private Boolean laterAppliesInd = null;

  public AdvancePaymentRequired waverDate(String waverDate) {
    this.waverDate = waverDate;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalDate
   * @return waverDate
   **/
  @Schema(description = "Assigned Type: ota2:LocalDate")
  
  @Pattern(regexp="(\\d{4}-\\d{2}-\\d{2})")   public String getWaverDate() {
    return waverDate;
  }

  public void setWaverDate(String waverDate) {
    this.waverDate = waverDate;
  }

  public AdvancePaymentRequired paymentAfterReservation(PaymentAfterReservation paymentAfterReservation) {
    this.paymentAfterReservation = paymentAfterReservation;
    return this;
  }

  /**
   * Get paymentAfterReservation
   * @return paymentAfterReservation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PaymentAfterReservation getPaymentAfterReservation() {
    return paymentAfterReservation;
  }

  public void setPaymentAfterReservation(PaymentAfterReservation paymentAfterReservation) {
    this.paymentAfterReservation = paymentAfterReservation;
  }

  public AdvancePaymentRequired paymentBeforeDeparture(PaymentBeforeDeparture paymentBeforeDeparture) {
    this.paymentBeforeDeparture = paymentBeforeDeparture;
    return this;
  }

  /**
   * Get paymentBeforeDeparture
   * @return paymentBeforeDeparture
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PaymentBeforeDeparture getPaymentBeforeDeparture() {
    return paymentBeforeDeparture;
  }

  public void setPaymentBeforeDeparture(PaymentBeforeDeparture paymentBeforeDeparture) {
    this.paymentBeforeDeparture = paymentBeforeDeparture;
  }

  public AdvancePaymentRequired paymentTravelSegmentIndicatorATPCO(Integer paymentTravelSegmentIndicatorATPCO) {
    this.paymentTravelSegmentIndicatorATPCO = paymentTravelSegmentIndicatorATPCO;
    return this;
  }

  /**
   * The ATPCO paymentgeographic indicator. Example \\\"55\\\" = 1st segment over the water between area 2 and 3
   * minimum: 0
   * @return paymentTravelSegmentIndicatorATPCO
   **/
  @Schema(description = "The ATPCO paymentgeographic indicator. Example \\\"55\\\" = 1st segment over the water between area 2 and 3")
  
  @Min(0)  public Integer getPaymentTravelSegmentIndicatorATPCO() {
    return paymentTravelSegmentIndicatorATPCO;
  }

  public void setPaymentTravelSegmentIndicatorATPCO(Integer paymentTravelSegmentIndicatorATPCO) {
    this.paymentTravelSegmentIndicatorATPCO = paymentTravelSegmentIndicatorATPCO;
  }

  public AdvancePaymentRequired instantPaymentInd(Boolean instantPaymentInd) {
    this.instantPaymentInd = instantPaymentInd;
    return this;
  }

  /**
   * if true, the Offer must be paid at the same time as the reservation is created
   * @return instantPaymentInd
   **/
  @Schema(description = "if true, the Offer must be paid at the same time as the reservation is created")
  
    public Boolean isInstantPaymentInd() {
    return instantPaymentInd;
  }

  public void setInstantPaymentInd(Boolean instantPaymentInd) {
    this.instantPaymentInd = instantPaymentInd;
  }

  public AdvancePaymentRequired ealierAppliesInd(Boolean ealierAppliesInd) {
    this.ealierAppliesInd = ealierAppliesInd;
    return this;
  }

  /**
   * If true, the earlier of the payment restrictions apply
   * @return ealierAppliesInd
   **/
  @Schema(description = "If true, the earlier of the payment restrictions apply")
  
    public Boolean isEalierAppliesInd() {
    return ealierAppliesInd;
  }

  public void setEalierAppliesInd(Boolean ealierAppliesInd) {
    this.ealierAppliesInd = ealierAppliesInd;
  }

  public AdvancePaymentRequired laterAppliesInd(Boolean laterAppliesInd) {
    this.laterAppliesInd = laterAppliesInd;
    return this;
  }

  /**
   * If true, the later of the payment restrictions apply
   * @return laterAppliesInd
   **/
  @Schema(description = "If true, the later of the payment restrictions apply")
  
    public Boolean isLaterAppliesInd() {
    return laterAppliesInd;
  }

  public void setLaterAppliesInd(Boolean laterAppliesInd) {
    this.laterAppliesInd = laterAppliesInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancePaymentRequired advancePaymentRequired = (AdvancePaymentRequired) o;
    return Objects.equals(this.waverDate, advancePaymentRequired.waverDate) &&
        Objects.equals(this.paymentAfterReservation, advancePaymentRequired.paymentAfterReservation) &&
        Objects.equals(this.paymentBeforeDeparture, advancePaymentRequired.paymentBeforeDeparture) &&
        Objects.equals(this.paymentTravelSegmentIndicatorATPCO, advancePaymentRequired.paymentTravelSegmentIndicatorATPCO) &&
        Objects.equals(this.instantPaymentInd, advancePaymentRequired.instantPaymentInd) &&
        Objects.equals(this.ealierAppliesInd, advancePaymentRequired.ealierAppliesInd) &&
        Objects.equals(this.laterAppliesInd, advancePaymentRequired.laterAppliesInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waverDate, paymentAfterReservation, paymentBeforeDeparture, paymentTravelSegmentIndicatorATPCO, instantPaymentInd, ealierAppliesInd, laterAppliesInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancePaymentRequired {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    waverDate: ").append(toIndentedString(waverDate)).append("\n");
    sb.append("    paymentAfterReservation: ").append(toIndentedString(paymentAfterReservation)).append("\n");
    sb.append("    paymentBeforeDeparture: ").append(toIndentedString(paymentBeforeDeparture)).append("\n");
    sb.append("    paymentTravelSegmentIndicatorATPCO: ").append(toIndentedString(paymentTravelSegmentIndicatorATPCO)).append("\n");
    sb.append("    instantPaymentInd: ").append(toIndentedString(instantPaymentInd)).append("\n");
    sb.append("    ealierAppliesInd: ").append(toIndentedString(ealierAppliesInd)).append("\n");
    sb.append("    laterAppliesInd: ").append(toIndentedString(laterAppliesInd)).append("\n");
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
