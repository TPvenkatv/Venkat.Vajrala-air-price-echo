package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BuildFromCatalogProductOfferingsRequestAir;
import com.travelport.air.offerresource.model.PaymentCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferQueryBuildFromCatalogProductOfferings
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class OfferQueryBuildFromCatalogProductOfferings  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("PaymentCriteria")
  private PaymentCriteria paymentCriteria = null;

  @JsonProperty("BuildFromCatalogProductOfferingsRequest")
  private BuildFromCatalogProductOfferingsRequestAir buildFromCatalogProductOfferingsRequest = null;

  public OfferQueryBuildFromCatalogProductOfferings _atType(String _atType) {
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

  public OfferQueryBuildFromCatalogProductOfferings paymentCriteria(PaymentCriteria paymentCriteria) {
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

  public OfferQueryBuildFromCatalogProductOfferings buildFromCatalogProductOfferingsRequest(BuildFromCatalogProductOfferingsRequestAir buildFromCatalogProductOfferingsRequest) {
    this.buildFromCatalogProductOfferingsRequest = buildFromCatalogProductOfferingsRequest;
    return this;
  }

  /**
   * Get buildFromCatalogProductOfferingsRequest
   * @return buildFromCatalogProductOfferingsRequest
   **/
  @Schema(description = "")
  
    @Valid
    public BuildFromCatalogProductOfferingsRequestAir getBuildFromCatalogProductOfferingsRequest() {
    return buildFromCatalogProductOfferingsRequest;
  }

  public void setBuildFromCatalogProductOfferingsRequest(BuildFromCatalogProductOfferingsRequestAir buildFromCatalogProductOfferingsRequest) {
    this.buildFromCatalogProductOfferingsRequest = buildFromCatalogProductOfferingsRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferQueryBuildFromCatalogProductOfferings offerQueryBuildFromCatalogProductOfferings = (OfferQueryBuildFromCatalogProductOfferings) o;
    return Objects.equals(this._atType, offerQueryBuildFromCatalogProductOfferings._atType) &&
        Objects.equals(this.paymentCriteria, offerQueryBuildFromCatalogProductOfferings.paymentCriteria) &&
        Objects.equals(this.buildFromCatalogProductOfferingsRequest, offerQueryBuildFromCatalogProductOfferings.buildFromCatalogProductOfferingsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, paymentCriteria, buildFromCatalogProductOfferingsRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferQueryBuildFromCatalogProductOfferings {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    paymentCriteria: ").append(toIndentedString(paymentCriteria)).append("\n");
    sb.append("    buildFromCatalogProductOfferingsRequest: ").append(toIndentedString(buildFromCatalogProductOfferingsRequest)).append("\n");
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
