package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CurrencyAmount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StopoverCharge
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class StopoverCharge  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("Amount")
  private CurrencyAmount amount = null;

  @JsonProperty("AlternativeAmount")
  private CurrencyAmount alternativeAmount = null;

  public StopoverCharge _atType(String _atType) {
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

  public StopoverCharge id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the stopoverCharge
   * @return id
   **/
  @Schema(required = true, description = "The ID of the stopoverCharge")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StopoverCharge quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of stopovers permitted at this charge
   * @return quantity
   **/
  @Schema(required = true, description = "The quantity of stopovers permitted at this charge")
      @NotNull

    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public StopoverCharge amount(CurrencyAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CurrencyAmount getAmount() {
    return amount;
  }

  public void setAmount(CurrencyAmount amount) {
    this.amount = amount;
  }

  public StopoverCharge alternativeAmount(CurrencyAmount alternativeAmount) {
    this.alternativeAmount = alternativeAmount;
    return this;
  }

  /**
   * Get alternativeAmount
   * @return alternativeAmount
   **/
  @Schema(description = "")
  
    @Valid
    public CurrencyAmount getAlternativeAmount() {
    return alternativeAmount;
  }

  public void setAlternativeAmount(CurrencyAmount alternativeAmount) {
    this.alternativeAmount = alternativeAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopoverCharge stopoverCharge = (StopoverCharge) o;
    return Objects.equals(this._atType, stopoverCharge._atType) &&
        Objects.equals(this.id, stopoverCharge.id) &&
        Objects.equals(this.quantity, stopoverCharge.quantity) &&
        Objects.equals(this.amount, stopoverCharge.amount) &&
        Objects.equals(this.alternativeAmount, stopoverCharge.alternativeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, quantity, amount, alternativeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopoverCharge {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    alternativeAmount: ").append(toIndentedString(alternativeAmount)).append("\n");
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
