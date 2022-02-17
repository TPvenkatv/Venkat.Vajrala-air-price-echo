package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.YesNoUnknownEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tax
 */
@Validated


public class Tax  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("taxCode")
  private String taxCode = null;

  @JsonProperty("reportingAuthority")
  private String reportingAuthority = null;

  @JsonProperty("purpose")
  private String purpose = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("includedInBase")
  private YesNoUnknownEnum includedInBase = null;

  @JsonProperty("codeAuthority")
  private String codeAuthority = null;

  @JsonProperty("decimalPlace")
  private Integer decimalPlace = null;

  @JsonProperty("decimalAuthority")
  private String decimalAuthority = null;

  @JsonProperty("exemptInd")
  private Boolean exemptInd = null;

  public Tax value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Tax currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyCode
   * @return currencyCode
   **/
  @Schema(description = "Assigned Type: c-1100:CurrencyCode")
  
  @Pattern(regexp="[a-zA-Z]{3}")   public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Tax taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return taxCode
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public Tax reportingAuthority(String reportingAuthority) {
    this.reportingAuthority = reportingAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return reportingAuthority
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getReportingAuthority() {
    return reportingAuthority;
  }

  public void setReportingAuthority(String reportingAuthority) {
    this.reportingAuthority = reportingAuthority;
  }

  public Tax purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return purpose
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Tax description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringLong
   * @return description
   **/
  @Schema(description = "Assigned Type: c-1100:StringLong")
  
  @Size(max=4096)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tax includedInBase(YesNoUnknownEnum includedInBase) {
    this.includedInBase = includedInBase;
    return this;
  }

  /**
   * Get includedInBase
   * @return includedInBase
   **/
  @Schema(description = "")
  
    @Valid
    public YesNoUnknownEnum getIncludedInBase() {
    return includedInBase;
  }

  public void setIncludedInBase(YesNoUnknownEnum includedInBase) {
    this.includedInBase = includedInBase;
  }

  public Tax codeAuthority(String codeAuthority) {
    this.codeAuthority = codeAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return codeAuthority
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CodeContext")
      @NotNull

  @Size(max=32)   public String getCodeAuthority() {
    return codeAuthority;
  }

  public void setCodeAuthority(String codeAuthority) {
    this.codeAuthority = codeAuthority;
  }

  public Tax decimalPlace(Integer decimalPlace) {
    this.decimalPlace = decimalPlace;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyMinorUnit
   * minimum: 0
   * @return decimalPlace
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CurrencyMinorUnit")
      @NotNull

  @Min(0)  public Integer getDecimalPlace() {
    return decimalPlace;
  }

  public void setDecimalPlace(Integer decimalPlace) {
    this.decimalPlace = decimalPlace;
  }

  public Tax decimalAuthority(String decimalAuthority) {
    this.decimalAuthority = decimalAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return decimalAuthority
   **/
  @Schema(description = "Assigned Type: c-1100:CodeContext")
  
  @Size(max=32)   public String getDecimalAuthority() {
    return decimalAuthority;
  }

  public void setDecimalAuthority(String decimalAuthority) {
    this.decimalAuthority = decimalAuthority;
  }

  public Tax exemptInd(Boolean exemptInd) {
    this.exemptInd = exemptInd;
    return this;
  }

  /**
   * If true, this tax is exempt
   * @return exemptInd
   **/
  @Schema(description = "If true, this tax is exempt")
  
    public Boolean isExemptInd() {
    return exemptInd;
  }

  public void setExemptInd(Boolean exemptInd) {
    this.exemptInd = exemptInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.value, tax.value) &&
        Objects.equals(this.currencyCode, tax.currencyCode) &&
        Objects.equals(this.taxCode, tax.taxCode) &&
        Objects.equals(this.reportingAuthority, tax.reportingAuthority) &&
        Objects.equals(this.purpose, tax.purpose) &&
        Objects.equals(this.description, tax.description) &&
        Objects.equals(this.includedInBase, tax.includedInBase) &&
        Objects.equals(this.codeAuthority, tax.codeAuthority) &&
        Objects.equals(this.decimalPlace, tax.decimalPlace) &&
        Objects.equals(this.decimalAuthority, tax.decimalAuthority) &&
        Objects.equals(this.exemptInd, tax.exemptInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyCode, taxCode, reportingAuthority, purpose, description, includedInBase, codeAuthority, decimalPlace, decimalAuthority, exemptInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    reportingAuthority: ").append(toIndentedString(reportingAuthority)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includedInBase: ").append(toIndentedString(includedInBase)).append("\n");
    sb.append("    codeAuthority: ").append(toIndentedString(codeAuthority)).append("\n");
    sb.append("    decimalPlace: ").append(toIndentedString(decimalPlace)).append("\n");
    sb.append("    decimalAuthority: ").append(toIndentedString(decimalAuthority)).append("\n");
    sb.append("    exemptInd: ").append(toIndentedString(exemptInd)).append("\n");
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
