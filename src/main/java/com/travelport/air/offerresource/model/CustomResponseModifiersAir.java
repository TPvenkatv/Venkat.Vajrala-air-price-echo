package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BrandAttributeInclusion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomResponseModifiersAir
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CustomResponseModifiersAir  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("BrandAttributeInclusion")
  @Valid
  private java.util.List<BrandAttributeInclusion> brandAttributeInclusion = null;

  @JsonProperty("excludePenaltiesInd")
  private Boolean excludePenaltiesInd = null;

  @JsonProperty("excludeBaggageFeesInd")
  private Boolean excludeBaggageFeesInd = null;

  @JsonProperty("includeFareCalculationInd")
  private Boolean includeFareCalculationInd = null;

  @JsonProperty("excludeSurchargesInd")
  private Boolean excludeSurchargesInd = null;

  public CustomResponseModifiersAir _atType(String _atType) {
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

  public CustomResponseModifiersAir brandAttributeInclusion(java.util.List<BrandAttributeInclusion> brandAttributeInclusion) {
    this.brandAttributeInclusion = brandAttributeInclusion;
    return this;
  }

  public CustomResponseModifiersAir addBrandAttributeInclusionItem(BrandAttributeInclusion brandAttributeInclusionItem) {
    if (this.brandAttributeInclusion == null) {
      this.brandAttributeInclusion = new java.util.ArrayList<>();
    }
    this.brandAttributeInclusion.add(brandAttributeInclusionItem);
    return this;
  }

  /**
   * Get brandAttributeInclusion
   * @return brandAttributeInclusion
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<BrandAttributeInclusion> getBrandAttributeInclusion() {
    return brandAttributeInclusion;
  }

  public void setBrandAttributeInclusion(java.util.List<BrandAttributeInclusion> brandAttributeInclusion) {
    this.brandAttributeInclusion = brandAttributeInclusion;
  }

  public CustomResponseModifiersAir excludePenaltiesInd(Boolean excludePenaltiesInd) {
    this.excludePenaltiesInd = excludePenaltiesInd;
    return this;
  }

  /**
   * If true, Penalties will be excluded from the response
   * @return excludePenaltiesInd
   **/
  @Schema(description = "If true, Penalties will be excluded from the response")
  
    public Boolean isExcludePenaltiesInd() {
    return excludePenaltiesInd;
  }

  public void setExcludePenaltiesInd(Boolean excludePenaltiesInd) {
    this.excludePenaltiesInd = excludePenaltiesInd;
  }

  public CustomResponseModifiersAir excludeBaggageFeesInd(Boolean excludeBaggageFeesInd) {
    this.excludeBaggageFeesInd = excludeBaggageFeesInd;
    return this;
  }

  /**
   * If true, Baggage Fees will be inhibited from the response
   * @return excludeBaggageFeesInd
   **/
  @Schema(description = "If true, Baggage Fees will be inhibited from the response")
  
    public Boolean isExcludeBaggageFeesInd() {
    return excludeBaggageFeesInd;
  }

  public void setExcludeBaggageFeesInd(Boolean excludeBaggageFeesInd) {
    this.excludeBaggageFeesInd = excludeBaggageFeesInd;
  }

  public CustomResponseModifiersAir includeFareCalculationInd(Boolean includeFareCalculationInd) {
    this.includeFareCalculationInd = includeFareCalculationInd;
    return this;
  }

  /**
   * if true, the fare calculation string will be returned in the response
   * @return includeFareCalculationInd
   **/
  @Schema(description = "if true, the fare calculation string will be returned in the response")
  
    public Boolean isIncludeFareCalculationInd() {
    return includeFareCalculationInd;
  }

  public void setIncludeFareCalculationInd(Boolean includeFareCalculationInd) {
    this.includeFareCalculationInd = includeFareCalculationInd;
  }

  public CustomResponseModifiersAir excludeSurchargesInd(Boolean excludeSurchargesInd) {
    this.excludeSurchargesInd = excludeSurchargesInd;
    return this;
  }

  /**
   * If true, the surcharge breakdown will be excluded from Price_Detail
   * @return excludeSurchargesInd
   **/
  @Schema(description = "If true, the surcharge breakdown will be excluded from Price_Detail")
  
    public Boolean isExcludeSurchargesInd() {
    return excludeSurchargesInd;
  }

  public void setExcludeSurchargesInd(Boolean excludeSurchargesInd) {
    this.excludeSurchargesInd = excludeSurchargesInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomResponseModifiersAir customResponseModifiersAir = (CustomResponseModifiersAir) o;
    return Objects.equals(this._atType, customResponseModifiersAir._atType) &&
        Objects.equals(this.brandAttributeInclusion, customResponseModifiersAir.brandAttributeInclusion) &&
        Objects.equals(this.excludePenaltiesInd, customResponseModifiersAir.excludePenaltiesInd) &&
        Objects.equals(this.excludeBaggageFeesInd, customResponseModifiersAir.excludeBaggageFeesInd) &&
        Objects.equals(this.includeFareCalculationInd, customResponseModifiersAir.includeFareCalculationInd) &&
        Objects.equals(this.excludeSurchargesInd, customResponseModifiersAir.excludeSurchargesInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, brandAttributeInclusion, excludePenaltiesInd, excludeBaggageFeesInd, includeFareCalculationInd, excludeSurchargesInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomResponseModifiersAir {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    brandAttributeInclusion: ").append(toIndentedString(brandAttributeInclusion)).append("\n");
    sb.append("    excludePenaltiesInd: ").append(toIndentedString(excludePenaltiesInd)).append("\n");
    sb.append("    excludeBaggageFeesInd: ").append(toIndentedString(excludeBaggageFeesInd)).append("\n");
    sb.append("    includeFareCalculationInd: ").append(toIndentedString(includeFareCalculationInd)).append("\n");
    sb.append("    excludeSurchargesInd: ").append(toIndentedString(excludeSurchargesInd)).append("\n");
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
