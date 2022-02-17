package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CurrencyCode;
import com.travelport.air.offerresource.model.VendorCurrencyTotal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Price
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = PriceDetail.class, name = "PriceDetail"),
})


public class Price  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode = null;

  @JsonProperty("Base")
  private Float base = null;

  @JsonProperty("TotalTaxes")
  private Float totalTaxes = null;

  @JsonProperty("TotalFees")
  private Float totalFees = null;

  @JsonProperty("TotalPrice")
  private Float totalPrice = null;

  @JsonProperty("VendorCurrencyTotal")
  private VendorCurrencyTotal vendorCurrencyTotal = null;

  public Price _atType(String _atType) {
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

  public Price id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Internally referenced id
   * @return id
   **/
  @Schema(description = "Internally referenced id")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Price currencyCode(CurrencyCode currencyCode) {
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

  public Price base(Float base) {
    this.base = base;
    return this;
  }

  /**
   * The total amount not including taxes and/or fees
   * @return base
   **/
  @Schema(description = "The total amount not including taxes and/or fees")
  
    public Float getBase() {
    return base;
  }

  public void setBase(Float base) {
    this.base = base;
  }

  public Price totalTaxes(Float totalTaxes) {
    this.totalTaxes = totalTaxes;
    return this;
  }

  /**
   * The total of the taxes included in the total price
   * @return totalTaxes
   **/
  @Schema(description = "The total of the taxes included in the total price")
  
    public Float getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(Float totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public Price totalFees(Float totalFees) {
    this.totalFees = totalFees;
    return this;
  }

  /**
   * The total of the fees included in the total price
   * @return totalFees
   **/
  @Schema(description = "The total of the fees included in the total price")
  
    public Float getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Float totalFees) {
    this.totalFees = totalFees;
  }

  public Price totalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * The total price of the product in the currency indicated
   * @return totalPrice
   **/
  @Schema(description = "The total price of the product in the currency indicated")
  
    public Float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Price vendorCurrencyTotal(VendorCurrencyTotal vendorCurrencyTotal) {
    this.vendorCurrencyTotal = vendorCurrencyTotal;
    return this;
  }

  /**
   * Get vendorCurrencyTotal
   * @return vendorCurrencyTotal
   **/
  @Schema(description = "")
  
    @Valid
    public VendorCurrencyTotal getVendorCurrencyTotal() {
    return vendorCurrencyTotal;
  }

  public void setVendorCurrencyTotal(VendorCurrencyTotal vendorCurrencyTotal) {
    this.vendorCurrencyTotal = vendorCurrencyTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this._atType, price._atType) &&
        Objects.equals(this.id, price.id) &&
        Objects.equals(this.currencyCode, price.currencyCode) &&
        Objects.equals(this.base, price.base) &&
        Objects.equals(this.totalTaxes, price.totalTaxes) &&
        Objects.equals(this.totalFees, price.totalFees) &&
        Objects.equals(this.totalPrice, price.totalPrice) &&
        Objects.equals(this.vendorCurrencyTotal, price.vendorCurrencyTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, currencyCode, base, totalTaxes, totalFees, totalPrice, vendorCurrencyTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    totalTaxes: ").append(toIndentedString(totalTaxes)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    vendorCurrencyTotal: ").append(toIndentedString(vendorCurrencyTotal)).append("\n");
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
