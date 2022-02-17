package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BuildFromCatalogOfferingsRequestAir;
import com.travelport.air.offerresource.model.CabinPreference;
import com.travelport.air.offerresource.model.FareRuleCategoryEnum;
import com.travelport.air.offerresource.model.FareRuleEnum;
import com.travelport.air.offerresource.model.PaymentCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferQueryBuildFromCatalogOfferings
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class OfferQueryBuildFromCatalogOfferings  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("BuildFromCatalogOfferingsRequest")
  private BuildFromCatalogOfferingsRequestAir buildFromCatalogOfferingsRequest = null;

  @JsonProperty("CabinPreference")
  private CabinPreference cabinPreference = null;

  @JsonProperty("PaymentCriteria")
  private PaymentCriteria paymentCriteria = null;

  @JsonProperty("FareRuleType")
  private FareRuleEnum fareRuleType = null;

  @JsonProperty("FareRuleCategory")
  @Valid
  private java.util.List<FareRuleCategoryEnum> fareRuleCategory = null;

  @JsonProperty("lowFareFinderInd")
  private Boolean lowFareFinderInd = null;

  @JsonProperty("returnBrandedFaresInd")
  private Boolean returnBrandedFaresInd = null;

  @JsonProperty("reCheckInventoryInd")
  private Boolean reCheckInventoryInd = null;

  public OfferQueryBuildFromCatalogOfferings _atType(String _atType) {
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

  public OfferQueryBuildFromCatalogOfferings buildFromCatalogOfferingsRequest(BuildFromCatalogOfferingsRequestAir buildFromCatalogOfferingsRequest) {
    this.buildFromCatalogOfferingsRequest = buildFromCatalogOfferingsRequest;
    return this;
  }

  /**
   * Get buildFromCatalogOfferingsRequest
   * @return buildFromCatalogOfferingsRequest
   **/
  @Schema(description = "")
  
    @Valid
    public BuildFromCatalogOfferingsRequestAir getBuildFromCatalogOfferingsRequest() {
    return buildFromCatalogOfferingsRequest;
  }

  public void setBuildFromCatalogOfferingsRequest(BuildFromCatalogOfferingsRequestAir buildFromCatalogOfferingsRequest) {
    this.buildFromCatalogOfferingsRequest = buildFromCatalogOfferingsRequest;
  }

  public OfferQueryBuildFromCatalogOfferings cabinPreference(CabinPreference cabinPreference) {
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

  public OfferQueryBuildFromCatalogOfferings paymentCriteria(PaymentCriteria paymentCriteria) {
    this.paymentCriteria = paymentCriteria;
    return this;
  }

  /**
   * Get paymentCriteria
   * @return paymentCriteria
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentCriteria getPaymentCriteria() {
    return paymentCriteria;
  }

  public void setPaymentCriteria(PaymentCriteria paymentCriteria) {
    this.paymentCriteria = paymentCriteria;
  }

  public OfferQueryBuildFromCatalogOfferings fareRuleType(FareRuleEnum fareRuleType) {
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

  public OfferQueryBuildFromCatalogOfferings fareRuleCategory(java.util.List<FareRuleCategoryEnum> fareRuleCategory) {
    this.fareRuleCategory = fareRuleCategory;
    return this;
  }

  public OfferQueryBuildFromCatalogOfferings addFareRuleCategoryItem(FareRuleCategoryEnum fareRuleCategoryItem) {
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

  public OfferQueryBuildFromCatalogOfferings lowFareFinderInd(Boolean lowFareFinderInd) {
    this.lowFareFinderInd = lowFareFinderInd;
    return this;
  }

  /**
   * If present and true, this is a low fare finder request
   * @return lowFareFinderInd
   **/
  @Schema(description = "If present and true, this is a low fare finder request")
  
    public Boolean isLowFareFinderInd() {
    return lowFareFinderInd;
  }

  public void setLowFareFinderInd(Boolean lowFareFinderInd) {
    this.lowFareFinderInd = lowFareFinderInd;
  }

  public OfferQueryBuildFromCatalogOfferings returnBrandedFaresInd(Boolean returnBrandedFaresInd) {
    this.returnBrandedFaresInd = returnBrandedFaresInd;
    return this;
  }

  /**
   * If present and true, branded fares are returned
   * @return returnBrandedFaresInd
   **/
  @Schema(description = "If present and true, branded fares are returned")
  
    public Boolean isReturnBrandedFaresInd() {
    return returnBrandedFaresInd;
  }

  public void setReturnBrandedFaresInd(Boolean returnBrandedFaresInd) {
    this.returnBrandedFaresInd = returnBrandedFaresInd;
  }

  public OfferQueryBuildFromCatalogOfferings reCheckInventoryInd(Boolean reCheckInventoryInd) {
    this.reCheckInventoryInd = reCheckInventoryInd;
    return this;
  }

  /**
   * If present and true, then the host system will perform a sell inventory check.
   * @return reCheckInventoryInd
   **/
  @Schema(description = "If present and true, then the host system will perform a sell inventory check.")
  
    public Boolean isReCheckInventoryInd() {
    return reCheckInventoryInd;
  }

  public void setReCheckInventoryInd(Boolean reCheckInventoryInd) {
    this.reCheckInventoryInd = reCheckInventoryInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferQueryBuildFromCatalogOfferings offerQueryBuildFromCatalogOfferings = (OfferQueryBuildFromCatalogOfferings) o;
    return Objects.equals(this._atType, offerQueryBuildFromCatalogOfferings._atType) &&
        Objects.equals(this.buildFromCatalogOfferingsRequest, offerQueryBuildFromCatalogOfferings.buildFromCatalogOfferingsRequest) &&
        Objects.equals(this.cabinPreference, offerQueryBuildFromCatalogOfferings.cabinPreference) &&
        Objects.equals(this.paymentCriteria, offerQueryBuildFromCatalogOfferings.paymentCriteria) &&
        Objects.equals(this.fareRuleType, offerQueryBuildFromCatalogOfferings.fareRuleType) &&
        Objects.equals(this.fareRuleCategory, offerQueryBuildFromCatalogOfferings.fareRuleCategory) &&
        Objects.equals(this.lowFareFinderInd, offerQueryBuildFromCatalogOfferings.lowFareFinderInd) &&
        Objects.equals(this.returnBrandedFaresInd, offerQueryBuildFromCatalogOfferings.returnBrandedFaresInd) &&
        Objects.equals(this.reCheckInventoryInd, offerQueryBuildFromCatalogOfferings.reCheckInventoryInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, buildFromCatalogOfferingsRequest, cabinPreference, paymentCriteria, fareRuleType, fareRuleCategory, lowFareFinderInd, returnBrandedFaresInd, reCheckInventoryInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferQueryBuildFromCatalogOfferings {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    buildFromCatalogOfferingsRequest: ").append(toIndentedString(buildFromCatalogOfferingsRequest)).append("\n");
    sb.append("    cabinPreference: ").append(toIndentedString(cabinPreference)).append("\n");
    sb.append("    paymentCriteria: ").append(toIndentedString(paymentCriteria)).append("\n");
    sb.append("    fareRuleType: ").append(toIndentedString(fareRuleType)).append("\n");
    sb.append("    fareRuleCategory: ").append(toIndentedString(fareRuleCategory)).append("\n");
    sb.append("    lowFareFinderInd: ").append(toIndentedString(lowFareFinderInd)).append("\n");
    sb.append("    returnBrandedFaresInd: ").append(toIndentedString(returnBrandedFaresInd)).append("\n");
    sb.append("    reCheckInventoryInd: ").append(toIndentedString(reCheckInventoryInd)).append("\n");
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
