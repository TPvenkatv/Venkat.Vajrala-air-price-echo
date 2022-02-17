package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxExemption
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class TaxExemption  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("countries")
  @Valid
  private java.util.List<String> countries = null;

  @JsonProperty("taxCodes")
  @Valid
  private java.util.List<String> taxCodes = null;

  @JsonProperty("allTaxesExemptInd")
  private Boolean allTaxesExemptInd = null;

  public TaxExemption _atType(String _atType) {
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

  public TaxExemption countries(java.util.List<String> countries) {
    this.countries = countries;
    return this;
  }

  public TaxExemption addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new java.util.ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:CountryCodesISO
   * @return countries
   **/
  @Schema(description = "Assigned Type: c-1100:CountryCodesISO")
  
    public java.util.List<String> getCountries() {
    return countries;
  }

  public void setCountries(java.util.List<String> countries) {
    this.countries = countries;
  }

  public TaxExemption taxCodes(java.util.List<String> taxCodes) {
    this.taxCodes = taxCodes;
    return this;
  }

  public TaxExemption addTaxCodesItem(String taxCodesItem) {
    if (this.taxCodes == null) {
      this.taxCodes = new java.util.ArrayList<>();
    }
    this.taxCodes.add(taxCodesItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:TinyStrings
   * @return taxCodes
   **/
  @Schema(description = "Assigned Type: c-1100:TinyStrings")
  
    public java.util.List<String> getTaxCodes() {
    return taxCodes;
  }

  public void setTaxCodes(java.util.List<String> taxCodes) {
    this.taxCodes = taxCodes;
  }

  public TaxExemption allTaxesExemptInd(Boolean allTaxesExemptInd) {
    this.allTaxesExemptInd = allTaxesExemptInd;
    return this;
  }

  /**
   * If true, the Offer/Offering is exempt from all taxes
   * @return allTaxesExemptInd
   **/
  @Schema(description = "If true, the Offer/Offering is exempt from all taxes")
  
    public Boolean isAllTaxesExemptInd() {
    return allTaxesExemptInd;
  }

  public void setAllTaxesExemptInd(Boolean allTaxesExemptInd) {
    this.allTaxesExemptInd = allTaxesExemptInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxExemption taxExemption = (TaxExemption) o;
    return Objects.equals(this._atType, taxExemption._atType) &&
        Objects.equals(this.countries, taxExemption.countries) &&
        Objects.equals(this.taxCodes, taxExemption.taxCodes) &&
        Objects.equals(this.allTaxesExemptInd, taxExemption.allTaxesExemptInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, countries, taxCodes, allTaxesExemptInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxExemption {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
    sb.append("    allTaxesExemptInd: ").append(toIndentedString(allTaxesExemptInd)).append("\n");
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
