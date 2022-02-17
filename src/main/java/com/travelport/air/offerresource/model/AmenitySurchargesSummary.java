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
 * AmenitySurchargesSummary
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class AmenitySurchargesSummary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("TotalSurcharges")
  private Float totalSurcharges = null;

  @JsonProperty("approximateInd")
  private Boolean approximateInd = null;

  public AmenitySurchargesSummary _atType(String _atType) {
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

  public AmenitySurchargesSummary totalSurcharges(Float totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
    return this;
  }

  /**
   * A monetary amount, up to 4 decimal places. Decimal place needs to be included.
   * @return totalSurcharges
   **/
  @Schema(description = "A monetary amount, up to 4 decimal places. Decimal place needs to be included.")
  
    public Float getTotalSurcharges() {
    return totalSurcharges;
  }

  public void setTotalSurcharges(Float totalSurcharges) {
    this.totalSurcharges = totalSurcharges;
  }

  public AmenitySurchargesSummary approximateInd(Boolean approximateInd) {
    this.approximateInd = approximateInd;
    return this;
  }

  /**
   * if true, the surcharge amounts are approximate
   * @return approximateInd
   **/
  @Schema(description = "if true, the surcharge amounts are approximate")
  
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
    AmenitySurchargesSummary amenitySurchargesSummary = (AmenitySurchargesSummary) o;
    return Objects.equals(this._atType, amenitySurchargesSummary._atType) &&
        Objects.equals(this.totalSurcharges, amenitySurchargesSummary.totalSurcharges) &&
        Objects.equals(this.approximateInd, amenitySurchargesSummary.approximateInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, totalSurcharges, approximateInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmenitySurchargesSummary {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    totalSurcharges: ").append(toIndentedString(totalSurcharges)).append("\n");
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
