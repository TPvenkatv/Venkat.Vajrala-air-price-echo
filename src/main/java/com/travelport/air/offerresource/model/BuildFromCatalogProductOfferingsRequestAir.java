package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BuildFromCatalogProductOfferingsRequest;
import com.travelport.air.offerresource.model.CabinPreference;
import com.travelport.air.offerresource.model.CatalogProductOfferingSelection;
import com.travelport.air.offerresource.model.CatalogProductOfferingsIdentifier;
import com.travelport.air.offerresource.model.CustomResponseModifiersAir;
import com.travelport.air.offerresource.model.FareRuleCategoryEnum;
import com.travelport.air.offerresource.model.FareRuleEnum;
import com.travelport.air.offerresource.model.PricingModifiersAir;
import com.travelport.air.offerresource.model.UpsellOfferingIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildFromCatalogProductOfferingsRequestAir
 */
@Validated


public class BuildFromCatalogProductOfferingsRequestAir extends BuildFromCatalogProductOfferingsRequest implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PricingModifiersAir")
  private PricingModifiersAir pricingModifiersAir = null;

  @JsonProperty("CabinPreference")
  private CabinPreference cabinPreference = null;

  @JsonProperty("FareRuleCategory")
  @Valid
  private java.util.List<FareRuleCategoryEnum> fareRuleCategory = null;

  @JsonProperty("FareRuleType")
  private FareRuleEnum fareRuleType = null;

  @JsonProperty("CustomResponseModifiersAir")
  private CustomResponseModifiersAir customResponseModifiersAir = null;

  @JsonProperty("lowFareFinderInd")
  private Boolean lowFareFinderInd = null;

  @JsonProperty("reCheckInventoryInd")
  private Boolean reCheckInventoryInd = null;

  @JsonProperty("inhibitBrandContentInd")
  private Boolean inhibitBrandContentInd = null;

  public BuildFromCatalogProductOfferingsRequestAir pricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
    return this;
  }

  /**
   * Get pricingModifiersAir
   * @return pricingModifiersAir
   **/
  @Schema(description = "")
  
    @Valid
    public PricingModifiersAir getPricingModifiersAir() {
    return pricingModifiersAir;
  }

  public void setPricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
  }

  public BuildFromCatalogProductOfferingsRequestAir cabinPreference(CabinPreference cabinPreference) {
    this.cabinPreference = cabinPreference;
    return this;
  }

  /**
   * Get cabinPreference
   * @return cabinPreference
   **/
  @Schema(description = "")
  
    @Valid
    public CabinPreference getCabinPreference() {
    return cabinPreference;
  }

  public void setCabinPreference(CabinPreference cabinPreference) {
    this.cabinPreference = cabinPreference;
  }

  public BuildFromCatalogProductOfferingsRequestAir fareRuleCategory(java.util.List<FareRuleCategoryEnum> fareRuleCategory) {
    this.fareRuleCategory = fareRuleCategory;
    return this;
  }

  public BuildFromCatalogProductOfferingsRequestAir addFareRuleCategoryItem(FareRuleCategoryEnum fareRuleCategoryItem) {
    if (this.fareRuleCategory == null) {
      this.fareRuleCategory = new java.util.ArrayList<>();
    }
    this.fareRuleCategory.add(fareRuleCategoryItem);
    return this;
  }

  /**
   * Get fareRuleCategory
   * @return fareRuleCategory
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<FareRuleCategoryEnum> getFareRuleCategory() {
    return fareRuleCategory;
  }

  public void setFareRuleCategory(java.util.List<FareRuleCategoryEnum> fareRuleCategory) {
    this.fareRuleCategory = fareRuleCategory;
  }

  public BuildFromCatalogProductOfferingsRequestAir fareRuleType(FareRuleEnum fareRuleType) {
    this.fareRuleType = fareRuleType;
    return this;
  }

  /**
   * Get fareRuleType
   * @return fareRuleType
   **/
  @Schema(description = "")
  
    @Valid
    public FareRuleEnum getFareRuleType() {
    return fareRuleType;
  }

  public void setFareRuleType(FareRuleEnum fareRuleType) {
    this.fareRuleType = fareRuleType;
  }

  public BuildFromCatalogProductOfferingsRequestAir customResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
    return this;
  }

  /**
   * Get customResponseModifiersAir
   * @return customResponseModifiersAir
   **/
  @Schema(description = "")
  
    @Valid
    public CustomResponseModifiersAir getCustomResponseModifiersAir() {
    return customResponseModifiersAir;
  }

  public void setCustomResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
  }

  public BuildFromCatalogProductOfferingsRequestAir lowFareFinderInd(Boolean lowFareFinderInd) {
    this.lowFareFinderInd = lowFareFinderInd;
    return this;
  }

  /**
   * If true, the price service will return the lowest fare available for the itinerary requested
   * @return lowFareFinderInd
   **/
  @Schema(description = "If true, the price service will return the lowest fare available for the itinerary requested")
  
    public Boolean isLowFareFinderInd() {
    return lowFareFinderInd;
  }

  public void setLowFareFinderInd(Boolean lowFareFinderInd) {
    this.lowFareFinderInd = lowFareFinderInd;
  }

  public BuildFromCatalogProductOfferingsRequestAir reCheckInventoryInd(Boolean reCheckInventoryInd) {
    this.reCheckInventoryInd = reCheckInventoryInd;
    return this;
  }

  /**
   * If true, the price service will recheck inventory at the time of pricing the Offer
   * @return reCheckInventoryInd
   **/
  @Schema(description = "If true, the price service will recheck inventory at the time of pricing the Offer")
  
    public Boolean isReCheckInventoryInd() {
    return reCheckInventoryInd;
  }

  public void setReCheckInventoryInd(Boolean reCheckInventoryInd) {
    this.reCheckInventoryInd = reCheckInventoryInd;
  }

  public BuildFromCatalogProductOfferingsRequestAir inhibitBrandContentInd(Boolean inhibitBrandContentInd) {
    this.inhibitBrandContentInd = inhibitBrandContentInd;
    return this;
  }

  /**
   * If true, Brand content will not be returned with the Offer
   * @return inhibitBrandContentInd
   **/
  @Schema(description = "If true, Brand content will not be returned with the Offer")
  
    public Boolean isInhibitBrandContentInd() {
    return inhibitBrandContentInd;
  }

  public void setInhibitBrandContentInd(Boolean inhibitBrandContentInd) {
    this.inhibitBrandContentInd = inhibitBrandContentInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildFromCatalogProductOfferingsRequestAir buildFromCatalogProductOfferingsRequestAir = (BuildFromCatalogProductOfferingsRequestAir) o;
    return Objects.equals(this.pricingModifiersAir, buildFromCatalogProductOfferingsRequestAir.pricingModifiersAir) &&
        Objects.equals(this.cabinPreference, buildFromCatalogProductOfferingsRequestAir.cabinPreference) &&
        Objects.equals(this.fareRuleCategory, buildFromCatalogProductOfferingsRequestAir.fareRuleCategory) &&
        Objects.equals(this.fareRuleType, buildFromCatalogProductOfferingsRequestAir.fareRuleType) &&
        Objects.equals(this.customResponseModifiersAir, buildFromCatalogProductOfferingsRequestAir.customResponseModifiersAir) &&
        Objects.equals(this.lowFareFinderInd, buildFromCatalogProductOfferingsRequestAir.lowFareFinderInd) &&
        Objects.equals(this.reCheckInventoryInd, buildFromCatalogProductOfferingsRequestAir.reCheckInventoryInd) &&
        Objects.equals(this.inhibitBrandContentInd, buildFromCatalogProductOfferingsRequestAir.inhibitBrandContentInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingModifiersAir, cabinPreference, fareRuleCategory, fareRuleType, customResponseModifiersAir, lowFareFinderInd, reCheckInventoryInd, inhibitBrandContentInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildFromCatalogProductOfferingsRequestAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pricingModifiersAir: ").append(toIndentedString(pricingModifiersAir)).append("\n");
    sb.append("    cabinPreference: ").append(toIndentedString(cabinPreference)).append("\n");
    sb.append("    fareRuleCategory: ").append(toIndentedString(fareRuleCategory)).append("\n");
    sb.append("    fareRuleType: ").append(toIndentedString(fareRuleType)).append("\n");
    sb.append("    customResponseModifiersAir: ").append(toIndentedString(customResponseModifiersAir)).append("\n");
    sb.append("    lowFareFinderInd: ").append(toIndentedString(lowFareFinderInd)).append("\n");
    sb.append("    reCheckInventoryInd: ").append(toIndentedString(reCheckInventoryInd)).append("\n");
    sb.append("    inhibitBrandContentInd: ").append(toIndentedString(inhibitBrandContentInd)).append("\n");
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
