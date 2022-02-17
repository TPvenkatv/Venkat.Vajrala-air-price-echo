package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.ConversionRate;
import com.travelport.air.offerresource.model.CurrencyCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrencyRateConversion
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CurrencyRateConversion  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("SourceCurrency")
  private CurrencyCode sourceCurrency = null;

  @JsonProperty("TargetCurrency")
  private CurrencyCode targetCurrency = null;

  @JsonProperty("ConversionRate")
  private ConversionRate conversionRate = null;

  public CurrencyRateConversion _atType(String _atType) {
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

  public CurrencyRateConversion sourceCurrency(CurrencyCode sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Get sourceCurrency
   * @return sourceCurrency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CurrencyCode getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(CurrencyCode sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public CurrencyRateConversion targetCurrency(CurrencyCode targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Get targetCurrency
   * @return targetCurrency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CurrencyCode getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(CurrencyCode targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public CurrencyRateConversion conversionRate(ConversionRate conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Get conversionRate
   * @return conversionRate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ConversionRate getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(ConversionRate conversionRate) {
    this.conversionRate = conversionRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyRateConversion currencyRateConversion = (CurrencyRateConversion) o;
    return Objects.equals(this._atType, currencyRateConversion._atType) &&
        Objects.equals(this.sourceCurrency, currencyRateConversion.sourceCurrency) &&
        Objects.equals(this.targetCurrency, currencyRateConversion.targetCurrency) &&
        Objects.equals(this.conversionRate, currencyRateConversion.conversionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, sourceCurrency, targetCurrency, conversionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyRateConversion {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
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
