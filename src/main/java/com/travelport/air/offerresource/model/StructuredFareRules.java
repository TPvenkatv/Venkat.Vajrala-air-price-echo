package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.AdvancePayment;
import com.travelport.air.offerresource.model.AdvanceReservation;
import com.travelport.air.offerresource.model.MaximumStay;
import com.travelport.air.offerresource.model.MinimumStay;
import com.travelport.air.offerresource.model.Penalties;
import com.travelport.air.offerresource.model.Stopover;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredFareRules
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class StructuredFareRules  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("passengerTypeCodes")
  @Valid
  private java.util.List<String> passengerTypeCodes = null;

  @JsonProperty("Penalties")
  @Valid
  private java.util.List<Penalties> penalties = null;

  @JsonProperty("MinimumStay")
  @Valid
  private java.util.List<MinimumStay> minimumStay = null;

  @JsonProperty("MaximumStay")
  @Valid
  private java.util.List<MaximumStay> maximumStay = null;

  @JsonProperty("AdvanceReservation")
  @Valid
  private java.util.List<AdvanceReservation> advanceReservation = null;

  @JsonProperty("AdvancePayment")
  @Valid
  private java.util.List<AdvancePayment> advancePayment = null;

  @JsonProperty("Stopover")
  @Valid
  private java.util.List<Stopover> stopover = null;

  public StructuredFareRules _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * Get _atType
   * @return _atType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public StructuredFareRules passengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
    return this;
  }

  public StructuredFareRules addPassengerTypeCodesItem(String passengerTypeCodesItem) {
    if (this.passengerTypeCodes == null) {
      this.passengerTypeCodes = new java.util.ArrayList<>();
    }
    this.passengerTypeCodes.add(passengerTypeCodesItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:PassengerTypeCodeList
   * @return passengerTypeCodes
   **/
  @Schema(description = "Assigned Type: c-1100:PassengerTypeCodeList")
  
    public java.util.List<String> getPassengerTypeCodes() {
    return passengerTypeCodes;
  }

  public void setPassengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
  }

  public StructuredFareRules penalties(java.util.List<Penalties> penalties) {
    this.penalties = penalties;
    return this;
  }

  public StructuredFareRules addPenaltiesItem(Penalties penaltiesItem) {
    if (this.penalties == null) {
      this.penalties = new java.util.ArrayList<>();
    }
    this.penalties.add(penaltiesItem);
    return this;
  }

  /**
   * Get penalties
   * @return penalties
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<Penalties> getPenalties() {
    return penalties;
  }

  public void setPenalties(java.util.List<Penalties> penalties) {
    this.penalties = penalties;
  }

  public StructuredFareRules minimumStay(java.util.List<MinimumStay> minimumStay) {
    this.minimumStay = minimumStay;
    return this;
  }

  public StructuredFareRules addMinimumStayItem(MinimumStay minimumStayItem) {
    if (this.minimumStay == null) {
      this.minimumStay = new java.util.ArrayList<>();
    }
    this.minimumStay.add(minimumStayItem);
    return this;
  }

  /**
   * Get minimumStay
   * @return minimumStay
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<MinimumStay> getMinimumStay() {
    return minimumStay;
  }

  public void setMinimumStay(java.util.List<MinimumStay> minimumStay) {
    this.minimumStay = minimumStay;
  }

  public StructuredFareRules maximumStay(java.util.List<MaximumStay> maximumStay) {
    this.maximumStay = maximumStay;
    return this;
  }

  public StructuredFareRules addMaximumStayItem(MaximumStay maximumStayItem) {
    if (this.maximumStay == null) {
      this.maximumStay = new java.util.ArrayList<>();
    }
    this.maximumStay.add(maximumStayItem);
    return this;
  }

  /**
   * Get maximumStay
   * @return maximumStay
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<MaximumStay> getMaximumStay() {
    return maximumStay;
  }

  public void setMaximumStay(java.util.List<MaximumStay> maximumStay) {
    this.maximumStay = maximumStay;
  }

  public StructuredFareRules advanceReservation(java.util.List<AdvanceReservation> advanceReservation) {
    this.advanceReservation = advanceReservation;
    return this;
  }

  public StructuredFareRules addAdvanceReservationItem(AdvanceReservation advanceReservationItem) {
    if (this.advanceReservation == null) {
      this.advanceReservation = new java.util.ArrayList<>();
    }
    this.advanceReservation.add(advanceReservationItem);
    return this;
  }

  /**
   * Get advanceReservation
   * @return advanceReservation
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<AdvanceReservation> getAdvanceReservation() {
    return advanceReservation;
  }

  public void setAdvanceReservation(java.util.List<AdvanceReservation> advanceReservation) {
    this.advanceReservation = advanceReservation;
  }

  public StructuredFareRules advancePayment(java.util.List<AdvancePayment> advancePayment) {
    this.advancePayment = advancePayment;
    return this;
  }

  public StructuredFareRules addAdvancePaymentItem(AdvancePayment advancePaymentItem) {
    if (this.advancePayment == null) {
      this.advancePayment = new java.util.ArrayList<>();
    }
    this.advancePayment.add(advancePaymentItem);
    return this;
  }

  /**
   * Get advancePayment
   * @return advancePayment
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<AdvancePayment> getAdvancePayment() {
    return advancePayment;
  }

  public void setAdvancePayment(java.util.List<AdvancePayment> advancePayment) {
    this.advancePayment = advancePayment;
  }

  public StructuredFareRules stopover(java.util.List<Stopover> stopover) {
    this.stopover = stopover;
    return this;
  }

  public StructuredFareRules addStopoverItem(Stopover stopoverItem) {
    if (this.stopover == null) {
      this.stopover = new java.util.ArrayList<>();
    }
    this.stopover.add(stopoverItem);
    return this;
  }

  /**
   * Get stopover
   * @return stopover
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<Stopover> getStopover() {
    return stopover;
  }

  public void setStopover(java.util.List<Stopover> stopover) {
    this.stopover = stopover;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFareRules structuredFareRules = (StructuredFareRules) o;
    return Objects.equals(this._atType, structuredFareRules._atType) &&
        Objects.equals(this.passengerTypeCodes, structuredFareRules.passengerTypeCodes) &&
        Objects.equals(this.penalties, structuredFareRules.penalties) &&
        Objects.equals(this.minimumStay, structuredFareRules.minimumStay) &&
        Objects.equals(this.maximumStay, structuredFareRules.maximumStay) &&
        Objects.equals(this.advanceReservation, structuredFareRules.advanceReservation) &&
        Objects.equals(this.advancePayment, structuredFareRules.advancePayment) &&
        Objects.equals(this.stopover, structuredFareRules.stopover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, passengerTypeCodes, penalties, minimumStay, maximumStay, advanceReservation, advancePayment, stopover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFareRules {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    passengerTypeCodes: ").append(toIndentedString(passengerTypeCodes)).append("\n");
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
    sb.append("    minimumStay: ").append(toIndentedString(minimumStay)).append("\n");
    sb.append("    maximumStay: ").append(toIndentedString(maximumStay)).append("\n");
    sb.append("    advanceReservation: ").append(toIndentedString(advanceReservation)).append("\n");
    sb.append("    advancePayment: ").append(toIndentedString(advancePayment)).append("\n");
    sb.append("    stopover: ").append(toIndentedString(stopover)).append("\n");
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
