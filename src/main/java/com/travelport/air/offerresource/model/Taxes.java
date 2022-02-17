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
 * Taxes
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = TaxesDetail.class, name = "TaxesDetail"),
})


public class Taxes  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("TotalTaxes")
  private Float totalTaxes = null;

  public Taxes _atType(String _atType) {
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

  public Taxes totalTaxes(Float totalTaxes) {
    this.totalTaxes = totalTaxes;
    return this;
  }

  /**
   * A monetary amount, up to 4 decimal places. Decimal place needs to be included.
   * @return totalTaxes
   **/
  @Schema(description = "A monetary amount, up to 4 decimal places. Decimal place needs to be included.")
  
    public Float getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(Float totalTaxes) {
    this.totalTaxes = totalTaxes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxes taxes = (Taxes) o;
    return Objects.equals(this._atType, taxes._atType) &&
        Objects.equals(this.totalTaxes, taxes.totalTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, totalTaxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxes {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    totalTaxes: ").append(toIndentedString(totalTaxes)).append("\n");
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
