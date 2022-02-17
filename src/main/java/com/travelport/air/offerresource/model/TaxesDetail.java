package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Tax;
import com.travelport.air.offerresource.model.TaxPercent;
import com.travelport.air.offerresource.model.Taxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxesDetail
 */
@Validated


public class TaxesDetail extends Taxes implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Tax")
  @Valid
  private java.util.List<Tax> tax = null;

  @JsonProperty("TaxPercent")
  private TaxPercent taxPercent = null;

  public TaxesDetail tax(java.util.List<Tax> tax) {
    this.tax = tax;
    return this;
  }

  public TaxesDetail addTaxItem(Tax taxItem) {
    if (this.tax == null) {
      this.tax = new java.util.ArrayList<>();
    }
    this.tax.add(taxItem);
    return this;
  }

  /**
   * Get tax
   * @return tax
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<Tax> getTax() {
    return tax;
  }

  public void setTax(java.util.List<Tax> tax) {
    this.tax = tax;
  }

  public TaxesDetail taxPercent(TaxPercent taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
   **/
  @Schema(description = "")
  
    @Valid
    public TaxPercent getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(TaxPercent taxPercent) {
    this.taxPercent = taxPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxesDetail taxesDetail = (TaxesDetail) o;
    return Objects.equals(this.tax, taxesDetail.tax) &&
        Objects.equals(this.taxPercent, taxesDetail.taxPercent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tax, taxPercent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxesDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
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
