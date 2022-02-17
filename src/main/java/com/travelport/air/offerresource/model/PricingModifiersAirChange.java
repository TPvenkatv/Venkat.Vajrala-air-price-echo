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
import com.travelport.air.offerresource.model.WaiverCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingModifiersAirChange
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class PricingModifiersAirChange  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("FareSelection")
  private FareSelection fareSelection = null;

  @JsonProperty("OrganizationInformation")
  private OrganizationInformation organizationInformation = null;

  @JsonProperty("WaiverCode")
  private WaiverCode waiverCode = null;

  @JsonProperty("TaxExemption")
  private TaxExemption taxExemption = null;

  @JsonProperty("PromotionalCode")
  private PromotionalCode promotionalCode = null;

  @JsonProperty("SellCity")
  private String sellCity = null;

  @JsonProperty("TicketCity")
  private String ticketCity = null;

  @JsonProperty("keepToBrandInd")
  private Boolean keepToBrandInd = null;

  public PricingModifiersAirChange _atType(String _atType) {
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

  public PricingModifiersAirChange currencyCode(String currencyCode) {
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

  public PricingModifiersAirChange fareSelection(FareSelection fareSelection) {
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

  public PricingModifiersAirChange organizationInformation(OrganizationInformation organizationInformation) {
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

  public PricingModifiersAirChange waiverCode(WaiverCode waiverCode) {
    this.waiverCode = waiverCode;
    return this;
  }

  /**
   * Get waiverCode
   * @return waiverCode
   **/
  @Schema(description = "")
  
    @Valid
    public WaiverCode getWaiverCode() {
    return waiverCode;
  }

  public void setWaiverCode(WaiverCode waiverCode) {
    this.waiverCode = waiverCode;
  }

  public PricingModifiersAirChange taxExemption(TaxExemption taxExemption) {
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

  public PricingModifiersAirChange promotionalCode(PromotionalCode promotionalCode) {
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

  public PricingModifiersAirChange sellCity(String sellCity) {
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

  public PricingModifiersAirChange ticketCity(String ticketCity) {
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

  public PricingModifiersAirChange keepToBrandInd(Boolean keepToBrandInd) {
    this.keepToBrandInd = keepToBrandInd;
    return this;
  }

  /**
   * If true, the offerings returned will be of the same brand as the original Offer
   * @return keepToBrandInd
   **/
  @Schema(description = "If true, the offerings returned will be of the same brand as the original Offer")
  
    public Boolean isKeepToBrandInd() {
    return keepToBrandInd;
  }

  public void setKeepToBrandInd(Boolean keepToBrandInd) {
    this.keepToBrandInd = keepToBrandInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingModifiersAirChange pricingModifiersAirChange = (PricingModifiersAirChange) o;
    return Objects.equals(this._atType, pricingModifiersAirChange._atType) &&
        Objects.equals(this.currencyCode, pricingModifiersAirChange.currencyCode) &&
        Objects.equals(this.fareSelection, pricingModifiersAirChange.fareSelection) &&
        Objects.equals(this.organizationInformation, pricingModifiersAirChange.organizationInformation) &&
        Objects.equals(this.waiverCode, pricingModifiersAirChange.waiverCode) &&
        Objects.equals(this.taxExemption, pricingModifiersAirChange.taxExemption) &&
        Objects.equals(this.promotionalCode, pricingModifiersAirChange.promotionalCode) &&
        Objects.equals(this.sellCity, pricingModifiersAirChange.sellCity) &&
        Objects.equals(this.ticketCity, pricingModifiersAirChange.ticketCity) &&
        Objects.equals(this.keepToBrandInd, pricingModifiersAirChange.keepToBrandInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, currencyCode, fareSelection, organizationInformation, waiverCode, taxExemption, promotionalCode, sellCity, ticketCity, keepToBrandInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingModifiersAirChange {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fareSelection: ").append(toIndentedString(fareSelection)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    waiverCode: ").append(toIndentedString(waiverCode)).append("\n");
    sb.append("    taxExemption: ").append(toIndentedString(taxExemption)).append("\n");
    sb.append("    promotionalCode: ").append(toIndentedString(promotionalCode)).append("\n");
    sb.append("    sellCity: ").append(toIndentedString(sellCity)).append("\n");
    sb.append("    ticketCity: ").append(toIndentedString(ticketCity)).append("\n");
    sb.append("    keepToBrandInd: ").append(toIndentedString(keepToBrandInd)).append("\n");
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
