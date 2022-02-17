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
 * FeesSummary
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class FeesSummary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("TotalFees")
  private Float totalFees = null;

  public FeesSummary _atType(String _atType) {
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

  public FeesSummary totalFees(Float totalFees) {
    this.totalFees = totalFees;
    return this;
  }

  /**
   * A monetary amount, up to 4 decimal places. Decimal place needs to be included.
   * @return totalFees
   **/
  @Schema(description = "A monetary amount, up to 4 decimal places. Decimal place needs to be included.")
  
    public Float getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Float totalFees) {
    this.totalFees = totalFees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesSummary feesSummary = (FeesSummary) o;
    return Objects.equals(this._atType, feesSummary._atType) &&
        Objects.equals(this.totalFees, feesSummary.totalFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, totalFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesSummary {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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
