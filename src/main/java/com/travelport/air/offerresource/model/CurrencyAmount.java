package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CurrencySourceEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A monetary amount, up to 4 decimal places. Decimal place needs to be included.
 */
@Schema(description = "A monetary amount, up to 4 decimal places. Decimal place needs to be included.")
@Validated


public class CurrencyAmount  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("minorUnit")
  private Integer minorUnit = null;

  @JsonProperty("currencySource")
  private CurrencySourceEnum currencySource = null;

  @JsonProperty("approximateInd")
  private Boolean approximateInd = null;

  public CurrencyAmount value(Float value) {
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

  public CurrencyAmount code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyCodeISO
   * @return code
   **/
  @Schema(description = "Assigned Type: c-1100:CurrencyCodeISO")
  
  @Pattern(regexp="[a-zA-Z]{3}")   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CurrencyAmount minorUnit(Integer minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyMinorUnit
   * minimum: 0
   * @return minorUnit
   **/
  @Schema(description = "Assigned Type: c-1100:CurrencyMinorUnit")
  
  @Min(0)  public Integer getMinorUnit() {
    return minorUnit;
  }

  public void setMinorUnit(Integer minorUnit) {
    this.minorUnit = minorUnit;
  }

  public CurrencyAmount currencySource(CurrencySourceEnum currencySource) {
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

  public CurrencyAmount approximateInd(Boolean approximateInd) {
    this.approximateInd = approximateInd;
    return this;
  }

  /**
   * True if the currency amount has been converted from the original amount
   * @return approximateInd
   **/
  @Schema(description = "True if the currency amount has been converted from the original amount")
  
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
    CurrencyAmount currencyAmount = (CurrencyAmount) o;
    return Objects.equals(this.value, currencyAmount.value) &&
        Objects.equals(this.code, currencyAmount.code) &&
        Objects.equals(this.minorUnit, currencyAmount.minorUnit) &&
        Objects.equals(this.currencySource, currencyAmount.currencySource) &&
        Objects.equals(this.approximateInd, currencyAmount.approximateInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, code, minorUnit, currencySource, approximateInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyAmount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    minorUnit: ").append(toIndentedString(minorUnit)).append("\n");
    sb.append("    currencySource: ").append(toIndentedString(currencySource)).append("\n");
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
