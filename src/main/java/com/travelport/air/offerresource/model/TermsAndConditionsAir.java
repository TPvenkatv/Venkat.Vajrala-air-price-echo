package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BaggageAllowance;
import com.travelport.air.offerresource.model.BaggageRecheck;
import com.travelport.air.offerresource.model.CustomerLoyalty;
import com.travelport.air.offerresource.model.FareGuaranteePolicy;
import com.travelport.air.offerresource.model.FareRuleInfo;
import com.travelport.air.offerresource.model.IdentifierRef;
import com.travelport.air.offerresource.model.OrganizationInformation;
import com.travelport.air.offerresource.model.Penalties;
import com.travelport.air.offerresource.model.PromotionalCode;
import com.travelport.air.offerresource.model.Restriction;
import com.travelport.air.offerresource.model.TermsAndConditions;
import com.travelport.air.offerresource.model.TicketingAgency;
import com.travelport.air.offerresource.model.ValidatingAirline;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TermsAndConditionsAir
 */
@Validated


public class TermsAndConditionsAir extends TermsAndConditions implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("BaggageAllowance")
  @Valid
  private java.util.List<BaggageAllowance> baggageAllowance = null;

  @JsonProperty("FareRuleIdentifierRef")
  private IdentifierRef fareRuleIdentifierRef = null;

  @JsonProperty("FareRuleInfo")
  @Valid
  private java.util.List<FareRuleInfo> fareRuleInfo = null;

  @JsonProperty("Restriction")
  @Valid
  private java.util.List<Restriction> restriction = null;

  @JsonProperty("OrganizationInformation")
  private OrganizationInformation organizationInformation = null;

  @JsonProperty("ValidatingAirline")
  @Valid
  private java.util.List<ValidatingAirline> validatingAirline = null;

  @JsonProperty("BaggageRecheck")
  @Valid
  private java.util.List<BaggageRecheck> baggageRecheck = null;

  @JsonProperty("TicketingAgency")
  @Valid
  private java.util.List<TicketingAgency> ticketingAgency = null;

  @JsonProperty("PaymentTimeLimit")
  private OffsetDateTime paymentTimeLimit = null;

  @JsonProperty("PromotionalCode")
  private PromotionalCode promotionalCode = null;

  @JsonProperty("Penalties")
  @Valid
  private java.util.List<Penalties> penalties = null;

  @JsonProperty("FareGuaranteePolicy")
  @Valid
  private java.util.List<FareGuaranteePolicy> fareGuaranteePolicy = null;

  @JsonProperty("instantPurchaseInd")
  private Boolean instantPurchaseInd = null;

  @JsonProperty("secureFlightPassengerDataRequiredInd")
  private Boolean secureFlightPassengerDataRequiredInd = null;

  public TermsAndConditionsAir baggageAllowance(java.util.List<BaggageAllowance> baggageAllowance) {
    this.baggageAllowance = baggageAllowance;
    return this;
  }

  public TermsAndConditionsAir addBaggageAllowanceItem(BaggageAllowance baggageAllowanceItem) {
    if (this.baggageAllowance == null) {
      this.baggageAllowance = new java.util.ArrayList<>();
    }
    this.baggageAllowance.add(baggageAllowanceItem);
    return this;
  }

  /**
   * Get baggageAllowance
   * @return baggageAllowance
   **/
  @Schema(description = "")
      @Valid
  @Size(max=99)   public java.util.List<BaggageAllowance> getBaggageAllowance() {
    return baggageAllowance;
  }

  public void setBaggageAllowance(java.util.List<BaggageAllowance> baggageAllowance) {
    this.baggageAllowance = baggageAllowance;
  }

  public TermsAndConditionsAir fareRuleIdentifierRef(IdentifierRef fareRuleIdentifierRef) {
    this.fareRuleIdentifierRef = fareRuleIdentifierRef;
    return this;
  }

  /**
   * Get fareRuleIdentifierRef
   * @return fareRuleIdentifierRef
   **/
  @Schema(description = "")
  
    @Valid
    public IdentifierRef getFareRuleIdentifierRef() {
    return fareRuleIdentifierRef;
  }

  public void setFareRuleIdentifierRef(IdentifierRef fareRuleIdentifierRef) {
    this.fareRuleIdentifierRef = fareRuleIdentifierRef;
  }

  public TermsAndConditionsAir fareRuleInfo(java.util.List<FareRuleInfo> fareRuleInfo) {
    this.fareRuleInfo = fareRuleInfo;
    return this;
  }

  public TermsAndConditionsAir addFareRuleInfoItem(FareRuleInfo fareRuleInfoItem) {
    if (this.fareRuleInfo == null) {
      this.fareRuleInfo = new java.util.ArrayList<>();
    }
    this.fareRuleInfo.add(fareRuleInfoItem);
    return this;
  }

  /**
   * Get fareRuleInfo
   * @return fareRuleInfo
   **/
  @Schema(description = "")
      @Valid
  @Size(max=50)   public java.util.List<FareRuleInfo> getFareRuleInfo() {
    return fareRuleInfo;
  }

  public void setFareRuleInfo(java.util.List<FareRuleInfo> fareRuleInfo) {
    this.fareRuleInfo = fareRuleInfo;
  }

  public TermsAndConditionsAir restriction(java.util.List<Restriction> restriction) {
    this.restriction = restriction;
    return this;
  }

  public TermsAndConditionsAir addRestrictionItem(Restriction restrictionItem) {
    if (this.restriction == null) {
      this.restriction = new java.util.ArrayList<>();
    }
    this.restriction.add(restrictionItem);
    return this;
  }

  /**
   * Get restriction
   * @return restriction
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<Restriction> getRestriction() {
    return restriction;
  }

  public void setRestriction(java.util.List<Restriction> restriction) {
    this.restriction = restriction;
  }

  public TermsAndConditionsAir organizationInformation(OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
    return this;
  }

  /**
   * Get organizationInformation
   * @return organizationInformation
   **/
  @Schema(description = "")
  
    @Valid
    public OrganizationInformation getOrganizationInformation() {
    return organizationInformation;
  }

  public void setOrganizationInformation(OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
  }

  public TermsAndConditionsAir validatingAirline(java.util.List<ValidatingAirline> validatingAirline) {
    this.validatingAirline = validatingAirline;
    return this;
  }

  public TermsAndConditionsAir addValidatingAirlineItem(ValidatingAirline validatingAirlineItem) {
    if (this.validatingAirline == null) {
      this.validatingAirline = new java.util.ArrayList<>();
    }
    this.validatingAirline.add(validatingAirlineItem);
    return this;
  }

  /**
   * Get validatingAirline
   * @return validatingAirline
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<ValidatingAirline> getValidatingAirline() {
    return validatingAirline;
  }

  public void setValidatingAirline(java.util.List<ValidatingAirline> validatingAirline) {
    this.validatingAirline = validatingAirline;
  }

  public TermsAndConditionsAir baggageRecheck(java.util.List<BaggageRecheck> baggageRecheck) {
    this.baggageRecheck = baggageRecheck;
    return this;
  }

  public TermsAndConditionsAir addBaggageRecheckItem(BaggageRecheck baggageRecheckItem) {
    if (this.baggageRecheck == null) {
      this.baggageRecheck = new java.util.ArrayList<>();
    }
    this.baggageRecheck.add(baggageRecheckItem);
    return this;
  }

  /**
   * Get baggageRecheck
   * @return baggageRecheck
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<BaggageRecheck> getBaggageRecheck() {
    return baggageRecheck;
  }

  public void setBaggageRecheck(java.util.List<BaggageRecheck> baggageRecheck) {
    this.baggageRecheck = baggageRecheck;
  }

  public TermsAndConditionsAir ticketingAgency(java.util.List<TicketingAgency> ticketingAgency) {
    this.ticketingAgency = ticketingAgency;
    return this;
  }

  public TermsAndConditionsAir addTicketingAgencyItem(TicketingAgency ticketingAgencyItem) {
    if (this.ticketingAgency == null) {
      this.ticketingAgency = new java.util.ArrayList<>();
    }
    this.ticketingAgency.add(ticketingAgencyItem);
    return this;
  }

  /**
   * Get ticketingAgency
   * @return ticketingAgency
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<TicketingAgency> getTicketingAgency() {
    return ticketingAgency;
  }

  public void setTicketingAgency(java.util.List<TicketingAgency> ticketingAgency) {
    this.ticketingAgency = ticketingAgency;
  }

  public TermsAndConditionsAir paymentTimeLimit(OffsetDateTime paymentTimeLimit) {
    this.paymentTimeLimit = paymentTimeLimit;
    return this;
  }

  /**
   * The date and time by which the Offer must be paid for once the Reservation is completed
   * @return paymentTimeLimit
   **/
  @Schema(description = "The date and time by which the Offer must be paid for once the Reservation is completed")
  
    @Valid
    public OffsetDateTime getPaymentTimeLimit() {
    return paymentTimeLimit;
  }

  public void setPaymentTimeLimit(OffsetDateTime paymentTimeLimit) {
    this.paymentTimeLimit = paymentTimeLimit;
  }

  public TermsAndConditionsAir promotionalCode(PromotionalCode promotionalCode) {
    this.promotionalCode = promotionalCode;
    return this;
  }

  /**
   * Get promotionalCode
   * @return promotionalCode
   **/
  @Schema(description = "")
  
    @Valid
    public PromotionalCode getPromotionalCode() {
    return promotionalCode;
  }

  public void setPromotionalCode(PromotionalCode promotionalCode) {
    this.promotionalCode = promotionalCode;
  }

  public TermsAndConditionsAir penalties(java.util.List<Penalties> penalties) {
    this.penalties = penalties;
    return this;
  }

  public TermsAndConditionsAir addPenaltiesItem(Penalties penaltiesItem) {
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

  public TermsAndConditionsAir fareGuaranteePolicy(java.util.List<FareGuaranteePolicy> fareGuaranteePolicy) {
    this.fareGuaranteePolicy = fareGuaranteePolicy;
    return this;
  }

  public TermsAndConditionsAir addFareGuaranteePolicyItem(FareGuaranteePolicy fareGuaranteePolicyItem) {
    if (this.fareGuaranteePolicy == null) {
      this.fareGuaranteePolicy = new java.util.ArrayList<>();
    }
    this.fareGuaranteePolicy.add(fareGuaranteePolicyItem);
    return this;
  }

  /**
   * Get fareGuaranteePolicy
   * @return fareGuaranteePolicy
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<FareGuaranteePolicy> getFareGuaranteePolicy() {
    return fareGuaranteePolicy;
  }

  public void setFareGuaranteePolicy(java.util.List<FareGuaranteePolicy> fareGuaranteePolicy) {
    this.fareGuaranteePolicy = fareGuaranteePolicy;
  }

  public TermsAndConditionsAir instantPurchaseInd(Boolean instantPurchaseInd) {
    this.instantPurchaseInd = instantPurchaseInd;
    return this;
  }

  /**
   * If true the Offer/Offering must be paid for at the same time as creating the Reservation
   * @return instantPurchaseInd
   **/
  @Schema(description = "If true the Offer/Offering must be paid for at the same time as creating the Reservation")
  
    public Boolean isInstantPurchaseInd() {
    return instantPurchaseInd;
  }

  public void setInstantPurchaseInd(Boolean instantPurchaseInd) {
    this.instantPurchaseInd = instantPurchaseInd;
  }

  public TermsAndConditionsAir secureFlightPassengerDataRequiredInd(Boolean secureFlightPassengerDataRequiredInd) {
    this.secureFlightPassengerDataRequiredInd = secureFlightPassengerDataRequiredInd;
    return this;
  }

  /**
   * If true, Secure Flight Passenger Data must be input for all Travelers to complete the Reservation
   * @return secureFlightPassengerDataRequiredInd
   **/
  @Schema(description = "If true, Secure Flight Passenger Data must be input for all Travelers to complete the Reservation")
  
    public Boolean isSecureFlightPassengerDataRequiredInd() {
    return secureFlightPassengerDataRequiredInd;
  }

  public void setSecureFlightPassengerDataRequiredInd(Boolean secureFlightPassengerDataRequiredInd) {
    this.secureFlightPassengerDataRequiredInd = secureFlightPassengerDataRequiredInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditionsAir termsAndConditionsAir = (TermsAndConditionsAir) o;
    return Objects.equals(this.baggageAllowance, termsAndConditionsAir.baggageAllowance) &&
        Objects.equals(this.fareRuleIdentifierRef, termsAndConditionsAir.fareRuleIdentifierRef) &&
        Objects.equals(this.fareRuleInfo, termsAndConditionsAir.fareRuleInfo) &&
        Objects.equals(this.restriction, termsAndConditionsAir.restriction) &&
        Objects.equals(this.organizationInformation, termsAndConditionsAir.organizationInformation) &&
        Objects.equals(this.validatingAirline, termsAndConditionsAir.validatingAirline) &&
        Objects.equals(this.baggageRecheck, termsAndConditionsAir.baggageRecheck) &&
        Objects.equals(this.ticketingAgency, termsAndConditionsAir.ticketingAgency) &&
        Objects.equals(this.paymentTimeLimit, termsAndConditionsAir.paymentTimeLimit) &&
        Objects.equals(this.promotionalCode, termsAndConditionsAir.promotionalCode) &&
        Objects.equals(this.penalties, termsAndConditionsAir.penalties) &&
        Objects.equals(this.fareGuaranteePolicy, termsAndConditionsAir.fareGuaranteePolicy) &&
        Objects.equals(this.instantPurchaseInd, termsAndConditionsAir.instantPurchaseInd) &&
        Objects.equals(this.secureFlightPassengerDataRequiredInd, termsAndConditionsAir.secureFlightPassengerDataRequiredInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baggageAllowance, fareRuleIdentifierRef, fareRuleInfo, restriction, organizationInformation, validatingAirline, baggageRecheck, ticketingAgency, paymentTimeLimit, promotionalCode, penalties, fareGuaranteePolicy, instantPurchaseInd, secureFlightPassengerDataRequiredInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditionsAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baggageAllowance: ").append(toIndentedString(baggageAllowance)).append("\n");
    sb.append("    fareRuleIdentifierRef: ").append(toIndentedString(fareRuleIdentifierRef)).append("\n");
    sb.append("    fareRuleInfo: ").append(toIndentedString(fareRuleInfo)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    validatingAirline: ").append(toIndentedString(validatingAirline)).append("\n");
    sb.append("    baggageRecheck: ").append(toIndentedString(baggageRecheck)).append("\n");
    sb.append("    ticketingAgency: ").append(toIndentedString(ticketingAgency)).append("\n");
    sb.append("    paymentTimeLimit: ").append(toIndentedString(paymentTimeLimit)).append("\n");
    sb.append("    promotionalCode: ").append(toIndentedString(promotionalCode)).append("\n");
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
    sb.append("    fareGuaranteePolicy: ").append(toIndentedString(fareGuaranteePolicy)).append("\n");
    sb.append("    instantPurchaseInd: ").append(toIndentedString(instantPurchaseInd)).append("\n");
    sb.append("    secureFlightPassengerDataRequiredInd: ").append(toIndentedString(secureFlightPassengerDataRequiredInd)).append("\n");
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
