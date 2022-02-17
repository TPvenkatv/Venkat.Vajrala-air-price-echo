package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.ApplicationEnum;
import com.travelport.air.offerresource.model.FrequencyEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The fee amount with feecode and reporting informtion
 */
@Schema(description = "The fee amount with feecode and reporting informtion")
@Validated


public class Surcharge  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("surchargeCode")
  private String surchargeCode = null;

  @JsonProperty("reportingAuthority")
  private String reportingAuthority = null;

  @JsonProperty("purpose")
  private String purpose = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("surchargeApplication")
  private ApplicationEnum surchargeApplication = null;

  @JsonProperty("surchargeFrequency")
  private FrequencyEnum surchargeFrequency = null;

  @JsonProperty("codeAuthority")
  private String codeAuthority = null;

  @JsonProperty("decimalPlace")
  private Integer decimalPlace = null;

  @JsonProperty("decimalAuthority")
  private String decimalAuthority = null;

  public Surcharge value(Float value) {
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

  public Surcharge currencyCode(String currencyCode) {
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

  public Surcharge surchargeCode(String surchargeCode) {
    this.surchargeCode = surchargeCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return surchargeCode
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getSurchargeCode() {
    return surchargeCode;
  }

  public void setSurchargeCode(String surchargeCode) {
    this.surchargeCode = surchargeCode;
  }

  public Surcharge reportingAuthority(String reportingAuthority) {
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

  public Surcharge purpose(String purpose) {
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

  public Surcharge description(String description) {
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

  public Surcharge surchargeApplication(ApplicationEnum surchargeApplication) {
    this.surchargeApplication = surchargeApplication;
    return this;
  }

  /**
   * Get surchargeApplication
   * @return surchargeApplication
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicationEnum getSurchargeApplication() {
    return surchargeApplication;
  }

  public void setSurchargeApplication(ApplicationEnum surchargeApplication) {
    this.surchargeApplication = surchargeApplication;
  }

  public Surcharge surchargeFrequency(FrequencyEnum surchargeFrequency) {
    this.surchargeFrequency = surchargeFrequency;
    return this;
  }

  /**
   * Get surchargeFrequency
   * @return surchargeFrequency
   **/
  @Schema(description = "")
  
    @Valid
    public FrequencyEnum getSurchargeFrequency() {
    return surchargeFrequency;
  }

  public void setSurchargeFrequency(FrequencyEnum surchargeFrequency) {
    this.surchargeFrequency = surchargeFrequency;
  }

  public Surcharge codeAuthority(String codeAuthority) {
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

  public Surcharge decimalPlace(Integer decimalPlace) {
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

  public Surcharge decimalAuthority(String decimalAuthority) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Surcharge surcharge = (Surcharge) o;
    return Objects.equals(this.value, surcharge.value) &&
        Objects.equals(this.currencyCode, surcharge.currencyCode) &&
        Objects.equals(this.surchargeCode, surcharge.surchargeCode) &&
        Objects.equals(this.reportingAuthority, surcharge.reportingAuthority) &&
        Objects.equals(this.purpose, surcharge.purpose) &&
        Objects.equals(this.description, surcharge.description) &&
        Objects.equals(this.surchargeApplication, surcharge.surchargeApplication) &&
        Objects.equals(this.surchargeFrequency, surcharge.surchargeFrequency) &&
        Objects.equals(this.codeAuthority, surcharge.codeAuthority) &&
        Objects.equals(this.decimalPlace, surcharge.decimalPlace) &&
        Objects.equals(this.decimalAuthority, surcharge.decimalAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyCode, surchargeCode, reportingAuthority, purpose, description, surchargeApplication, surchargeFrequency, codeAuthority, decimalPlace, decimalAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Surcharge {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    surchargeCode: ").append(toIndentedString(surchargeCode)).append("\n");
    sb.append("    reportingAuthority: ").append(toIndentedString(reportingAuthority)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    surchargeApplication: ").append(toIndentedString(surchargeApplication)).append("\n");
    sb.append("    surchargeFrequency: ").append(toIndentedString(surchargeFrequency)).append("\n");
    sb.append("    codeAuthority: ").append(toIndentedString(codeAuthority)).append("\n");
    sb.append("    decimalPlace: ").append(toIndentedString(decimalPlace)).append("\n");
    sb.append("    decimalAuthority: ").append(toIndentedString(decimalAuthority)).append("\n");
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
