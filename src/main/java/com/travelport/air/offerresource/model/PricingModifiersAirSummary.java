package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.FareSelection;
import com.travelport.air.offerresource.model.OrganizationInformation;
import com.travelport.air.offerresource.model.PromotionalCode;
import com.travelport.air.offerresource.model.TaxExemption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingModifiersAirSummary
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class PricingModifiersAirSummary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("FareSelection")
  private FareSelection fareSelection = null;

  @JsonProperty("OrganizationInformation")
  private OrganizationInformation organizationInformation = null;

  @JsonProperty("TaxExemption")
  private TaxExemption taxExemption = null;

  @JsonProperty("PromotionalCode")
  @Valid
  private java.util.List<PromotionalCode> promotionalCode = null;

  @JsonProperty("SellCity")
  private String sellCity = null;

  @JsonProperty("TicketCity")
  private String ticketCity = null;

  @JsonProperty("includeSplitPaymentInd")
  private Boolean includeSplitPaymentInd = null;

  public PricingModifiersAirSummary _atType(String _atType) {
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

  public PricingModifiersAirSummary currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyCodeISO
   * @return currencyCode
   **/
  @Schema(description = "Assigned Type: c-1100:CurrencyCodeISO")
  
  @Pattern(regexp="[a-zA-Z]{3}")   public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PricingModifiersAirSummary fareSelection(FareSelection fareSelection) {
    this.fareSelection = fareSelection;
    return this;
  }

  /**
   * Get fareSelection
   * @return fareSelection
   **/
  @Schema(description = "")
  
    @Valid
    public FareSelection getFareSelection() {
    return fareSelection;
  }

  public void setFareSelection(FareSelection fareSelection) {
    this.fareSelection = fareSelection;
  }

  public PricingModifiersAirSummary organizationInformation(OrganizationInformation organizationInformation) {
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

  public PricingModifiersAirSummary taxExemption(TaxExemption taxExemption) {
    this.taxExemption = taxExemption;
    return this;
  }

  /**
   * Get taxExemption
   * @return taxExemption
   **/
  @Schema(description = "")
  
    @Valid
    public TaxExemption getTaxExemption() {
    return taxExemption;
  }

  public void setTaxExemption(TaxExemption taxExemption) {
    this.taxExemption = taxExemption;
  }

  public PricingModifiersAirSummary promotionalCode(java.util.List<PromotionalCode> promotionalCode) {
    this.promotionalCode = promotionalCode;
    return this;
  }

  public PricingModifiersAirSummary addPromotionalCodeItem(PromotionalCode promotionalCodeItem) {
    if (this.promotionalCode == null) {
      this.promotionalCode = new java.util.ArrayList<>();
    }
    this.promotionalCode.add(promotionalCodeItem);
    return this;
  }

  /**
   * Get promotionalCode
   * @return promotionalCode
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<PromotionalCode> getPromotionalCode() {
    return promotionalCode;
  }

  public void setPromotionalCode(java.util.List<PromotionalCode> promotionalCode) {
    this.promotionalCode = promotionalCode;
  }

  public PricingModifiersAirSummary sellCity(String sellCity) {
    this.sellCity = sellCity;
    return this;
  }

  /**
   * Overrides the sell city of the requestor.
   * @return sellCity
   **/
  @Schema(description = "Overrides the sell city of the requestor.")
  
  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getSellCity() {
    return sellCity;
  }

  public void setSellCity(String sellCity) {
    this.sellCity = sellCity;
  }

  public PricingModifiersAirSummary ticketCity(String ticketCity) {
    this.ticketCity = ticketCity;
    return this;
  }

  /**
   * Overrides the ticket city of the requestor.
   * @return ticketCity
   **/
  @Schema(description = "Overrides the ticket city of the requestor.")
  
  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getTicketCity() {
    return ticketCity;
  }

  public void setTicketCity(String ticketCity) {
    this.ticketCity = ticketCity;
  }

  public PricingModifiersAirSummary includeSplitPaymentInd(Boolean includeSplitPaymentInd) {
    this.includeSplitPaymentInd = includeSplitPaymentInd;
    return this;
  }

  /**
   * If true, split payment (split ticket) offerings/offers will be returned
   * @return includeSplitPaymentInd
   **/
  @Schema(description = "If true, split payment (split ticket) offerings/offers will be returned")
  
    public Boolean isIncludeSplitPaymentInd() {
    return includeSplitPaymentInd;
  }

  public void setIncludeSplitPaymentInd(Boolean includeSplitPaymentInd) {
    this.includeSplitPaymentInd = includeSplitPaymentInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingModifiersAirSummary pricingModifiersAirSummary = (PricingModifiersAirSummary) o;
    return Objects.equals(this._atType, pricingModifiersAirSummary._atType) &&
        Objects.equals(this.currencyCode, pricingModifiersAirSummary.currencyCode) &&
        Objects.equals(this.fareSelection, pricingModifiersAirSummary.fareSelection) &&
        Objects.equals(this.organizationInformation, pricingModifiersAirSummary.organizationInformation) &&
        Objects.equals(this.taxExemption, pricingModifiersAirSummary.taxExemption) &&
        Objects.equals(this.promotionalCode, pricingModifiersAirSummary.promotionalCode) &&
        Objects.equals(this.sellCity, pricingModifiersAirSummary.sellCity) &&
        Objects.equals(this.ticketCity, pricingModifiersAirSummary.ticketCity) &&
        Objects.equals(this.includeSplitPaymentInd, pricingModifiersAirSummary.includeSplitPaymentInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, currencyCode, fareSelection, organizationInformation, taxExemption, promotionalCode, sellCity, ticketCity, includeSplitPaymentInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingModifiersAirSummary {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fareSelection: ").append(toIndentedString(fareSelection)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    taxExemption: ").append(toIndentedString(taxExemption)).append("\n");
    sb.append("    promotionalCode: ").append(toIndentedString(promotionalCode)).append("\n");
    sb.append("    sellCity: ").append(toIndentedString(sellCity)).append("\n");
    sb.append("    ticketCity: ").append(toIndentedString(ticketCity)).append("\n");
    sb.append("    includeSplitPaymentInd: ").append(toIndentedString(includeSplitPaymentInd)).append("\n");
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
