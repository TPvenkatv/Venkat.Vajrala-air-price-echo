package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.ApplicationEnum;
import com.travelport.air.offerresource.model.FeeAmountOrPercent;
import com.travelport.air.offerresource.model.FrequencyEnum;
import com.travelport.air.offerresource.model.Tax;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fee
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class Fee  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("feeCode")
  private String feeCode = null;

  @JsonProperty("reportingAuthority")
  private String reportingAuthority = null;

  @JsonProperty("purpose")
  private String purpose = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("feeApplication")
  private ApplicationEnum feeApplication = null;

  @JsonProperty("feeFrequency")
  private FrequencyEnum feeFrequency = null;

  @JsonProperty("FeeAmountOrPercent")
  private FeeAmountOrPercent feeAmountOrPercent = null;

  @JsonProperty("Tax")
  @Valid
  private java.util.List<Tax> tax = null;

  @JsonProperty("includedinBaseInd")
  private Boolean includedinBaseInd = null;

  public Fee _atType(String _atType) {
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

  public Fee feeCode(String feeCode) {
    this.feeCode = feeCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return feeCode
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getFeeCode() {
    return feeCode;
  }

  public void setFeeCode(String feeCode) {
    this.feeCode = feeCode;
  }

  public Fee reportingAuthority(String reportingAuthority) {
    this.reportingAuthority = reportingAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return reportingAuthority
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getReportingAuthority() {
    return reportingAuthority;
  }

  public void setReportingAuthority(String reportingAuthority) {
    this.reportingAuthority = reportingAuthority;
  }

  public Fee purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return purpose
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Fee description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return description
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Fee feeApplication(ApplicationEnum feeApplication) {
    this.feeApplication = feeApplication;
    return this;
  }

  /**
   * Get feeApplication
   * @return feeApplication
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationEnum getFeeApplication() {
    return feeApplication;
  }

  public void setFeeApplication(ApplicationEnum feeApplication) {
    this.feeApplication = feeApplication;
  }

  public Fee feeFrequency(FrequencyEnum feeFrequency) {
    this.feeFrequency = feeFrequency;
    return this;
  }

  /**
   * Get feeFrequency
   * @return feeFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public FrequencyEnum getFeeFrequency() {
    return feeFrequency;
  }

  public void setFeeFrequency(FrequencyEnum feeFrequency) {
    this.feeFrequency = feeFrequency;
  }

  public Fee feeAmountOrPercent(FeeAmountOrPercent feeAmountOrPercent) {
    this.feeAmountOrPercent = feeAmountOrPercent;
    return this;
  }

  /**
   * Get feeAmountOrPercent
   * @return feeAmountOrPercent
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public FeeAmountOrPercent getFeeAmountOrPercent() {
    return feeAmountOrPercent;
  }

  public void setFeeAmountOrPercent(FeeAmountOrPercent feeAmountOrPercent) {
    this.feeAmountOrPercent = feeAmountOrPercent;
  }

  public Fee tax(java.util.List<Tax> tax) {
    this.tax = tax;
    return this;
  }

  public Fee addTaxItem(Tax taxItem) {
    if (this.tax == null) {
      this.tax = new java.util.ArrayList<>();
    }
    this.tax.add(taxItem);
    return this;
  }

  /**
   * Get tax
   * @return tax
   **/
  @Schema(description = "")
      @Valid
  @Size(max=5)   public java.util.List<Tax> getTax() {
    return tax;
  }

  public void setTax(java.util.List<Tax> tax) {
    this.tax = tax;
  }

  public Fee includedinBaseInd(Boolean includedinBaseInd) {
    this.includedinBaseInd = includedinBaseInd;
    return this;
  }

  /**
   * If the fee is included in the Base Price
   * @return includedinBaseInd
   **/
  @Schema(description = "If the fee is included in the Base Price")
  
    public Boolean isIncludedinBaseInd() {
    return includedinBaseInd;
  }

  public void setIncludedinBaseInd(Boolean includedinBaseInd) {
    this.includedinBaseInd = includedinBaseInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fee fee = (Fee) o;
    return Objects.equals(this._atType, fee._atType) &&
        Objects.equals(this.feeCode, fee.feeCode) &&
        Objects.equals(this.reportingAuthority, fee.reportingAuthority) &&
        Objects.equals(this.purpose, fee.purpose) &&
        Objects.equals(this.description, fee.description) &&
        Objects.equals(this.feeApplication, fee.feeApplication) &&
        Objects.equals(this.feeFrequency, fee.feeFrequency) &&
        Objects.equals(this.feeAmountOrPercent, fee.feeAmountOrPercent) &&
        Objects.equals(this.tax, fee.tax) &&
        Objects.equals(this.includedinBaseInd, fee.includedinBaseInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, feeCode, reportingAuthority, purpose, description, feeApplication, feeFrequency, feeAmountOrPercent, tax, includedinBaseInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    feeCode: ").append(toIndentedString(feeCode)).append("\n");
    sb.append("    reportingAuthority: ").append(toIndentedString(reportingAuthority)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feeApplication: ").append(toIndentedString(feeApplication)).append("\n");
    sb.append("    feeFrequency: ").append(toIndentedString(feeFrequency)).append("\n");
    sb.append("    feeAmountOrPercent: ").append(toIndentedString(feeAmountOrPercent)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    includedinBaseInd: ").append(toIndentedString(includedinBaseInd)).append("\n");
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
