package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CurrencyCode;
import com.travelport.air.offerresource.model.CurrencySourceEnum;
import com.travelport.air.offerresource.model.Fees;
import com.travelport.air.offerresource.model.Taxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CumulativeValue
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CumulativeValue  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("currencySource")
  private CurrencySourceEnum currencySource = null;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode = null;

  @JsonProperty("Base")
  private Float base = null;

  @JsonProperty("Taxes")
  private Taxes taxes = null;

  @JsonProperty("Fees")
  private Fees fees = null;

  @JsonProperty("Total")
  private Float total = null;

  @JsonProperty("approximateInd")
  private Boolean approximateInd = null;

  public CumulativeValue _atType(String _atType) {
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

  public CumulativeValue currencySource(CurrencySourceEnum currencySource) {
    this.currencySource = currencySource;
    return this;
  }

  /**
   * Get currencySource
   * @return currencySource
   **/
  @Schema(description = "")
  
    @Valid
    public CurrencySourceEnum getCurrencySource() {
    return currencySource;
  }

  public void setCurrencySource(CurrencySourceEnum currencySource) {
    this.currencySource = currencySource;
  }

  public CumulativeValue currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   **/
  @Schema(description = "")
  
    @Valid
    public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CumulativeValue base(Float base) {
    this.base = base;
    return this;
  }

  /**
   * The price prior to all applicable taxes of a product such as the rate for a room or fare for a flight.
   * @return base
   **/
  @Schema(description = "The price prior to all applicable taxes of a product such as the rate for a room or fare for a flight.")
  
    public Float getBase() {
    return base;
  }

  public void setBase(Float base) {
    this.base = base;
  }

  public CumulativeValue taxes(Taxes taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Get taxes
   * @return taxes
   **/
  @Schema(description = "")
  
    @Valid
    public Taxes getTaxes() {
    return taxes;
  }

  public void setTaxes(Taxes taxes) {
    this.taxes = taxes;
  }

  public CumulativeValue fees(Fees fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Get fees
   * @return fees
   **/
  @Schema(description = "")
  
    @Valid
    public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
  }

  public CumulativeValue total(Float total) {
    this.total = total;
    return this;
  }

  /**
   * Specifies the total price including base + taxes + fees
   * @return total
   **/
  @Schema(description = "Specifies the total price including base + taxes + fees")
  
    public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public CumulativeValue approximateInd(Boolean approximateInd) {
    this.approximateInd = approximateInd;
    return this;
  }

  /**
   * True if this amount has been converted from the original amount
   * @return approximateInd
   **/
  @Schema(description = "True if this amount has been converted from the original amount")
  
    public Boolean isApproximateInd() {
    return approximateInd;
  }

  public void setApproximateInd(Boolean approximateInd) {
    this.approximateInd = approximateInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativeValue cumulativeValue = (CumulativeValue) o;
    return Objects.equals(this._atType, cumulativeValue._atType) &&
        Objects.equals(this.currencySource, cumulativeValue.currencySource) &&
        Objects.equals(this.currencyCode, cumulativeValue.currencyCode) &&
        Objects.equals(this.base, cumulativeValue.base) &&
        Objects.equals(this.taxes, cumulativeValue.taxes) &&
        Objects.equals(this.fees, cumulativeValue.fees) &&
        Objects.equals(this.total, cumulativeValue.total) &&
        Objects.equals(this.approximateInd, cumulativeValue.approximateInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, currencySource, currencyCode, base, taxes, fees, total, approximateInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativeValue {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    currencySource: ").append(toIndentedString(currencySource)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    approximateInd: ").append(toIndentedString(approximateInd)).append("\n");
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
