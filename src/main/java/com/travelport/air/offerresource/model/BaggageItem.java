package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CurrencyAmount;
import com.travelport.air.offerresource.model.Measurement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaggageItem
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class BaggageItem  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("Measurement")
  @Valid
  private java.util.List<Measurement> measurement = null;

  @JsonProperty("BaggageFee")
  private CurrencyAmount baggageFee = null;

  @JsonProperty("Text")
  private String text = null;

  public BaggageItem _atType(String _atType) {
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

  public BaggageItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberSingleDigit
   * @return quantity
   **/
  @Schema(description = "Assigned Type: c-1100:NumberSingleDigit")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BaggageItem measurement(java.util.List<Measurement> measurement) {
    this.measurement = measurement;
    return this;
  }

  public BaggageItem addMeasurementItem(Measurement measurementItem) {
    if (this.measurement == null) {
      this.measurement = new java.util.ArrayList<>();
    }
    this.measurement.add(measurementItem);
    return this;
  }

  /**
   * Get measurement
   * @return measurement
   **/
  @Schema(description = "")
      @Valid
  @Size(max=6)   public java.util.List<Measurement> getMeasurement() {
    return measurement;
  }

  public void setMeasurement(java.util.List<Measurement> measurement) {
    this.measurement = measurement;
  }

  public BaggageItem baggageFee(CurrencyAmount baggageFee) {
    this.baggageFee = baggageFee;
    return this;
  }

  /**
   * Get baggageFee
   * @return baggageFee
   **/
  @Schema(description = "")
  
    @Valid
    public CurrencyAmount getBaggageFee() {
    return baggageFee;
  }

  public void setBaggageFee(CurrencyAmount baggageFee) {
    this.baggageFee = baggageFee;
  }

  public BaggageItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text returned from the shop response
   * @return text
   **/
  @Schema(description = "Text returned from the shop response")
  
  @Size(max=128)   public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageItem baggageItem = (BaggageItem) o;
    return Objects.equals(this._atType, baggageItem._atType) &&
        Objects.equals(this.quantity, baggageItem.quantity) &&
        Objects.equals(this.measurement, baggageItem.measurement) &&
        Objects.equals(this.baggageFee, baggageItem.baggageFee) &&
        Objects.equals(this.text, baggageItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, quantity, measurement, baggageFee, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageItem {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    baggageFee: ").append(toIndentedString(baggageFee)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
