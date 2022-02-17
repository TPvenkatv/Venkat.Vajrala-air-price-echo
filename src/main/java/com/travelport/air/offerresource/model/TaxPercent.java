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
 * TaxPercent
 */
@Validated


public class TaxPercent  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

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

  public TaxPercent value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * minimum: 0
   * @return value
   **/
  @Schema(description = "")
  
  @DecimalMin("0")  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public TaxPercent taxCode(String taxCode) {
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

  public TaxPercent reportingAuthority(String reportingAuthority) {
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

  public TaxPercent purpose(String purpose) {
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

  public TaxPercent description(String description) {
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

  public TaxPercent includedInBase(YesNoUnknownEnum includedInBase) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxPercent taxPercent = (TaxPercent) o;
    return Objects.equals(this.value, taxPercent.value) &&
        Objects.equals(this.taxCode, taxPercent.taxCode) &&
        Objects.equals(this.reportingAuthority, taxPercent.reportingAuthority) &&
        Objects.equals(this.purpose, taxPercent.purpose) &&
        Objects.equals(this.description, taxPercent.description) &&
        Objects.equals(this.includedInBase, taxPercent.includedInBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, taxCode, reportingAuthority, purpose, description, includedInBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxPercent {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    reportingAuthority: ").append(toIndentedString(reportingAuthority)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includedInBase: ").append(toIndentedString(includedInBase)).append("\n");
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
