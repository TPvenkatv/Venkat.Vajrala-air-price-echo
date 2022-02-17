package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.FareQualifierEnum;
import com.travelport.air.offerresource.model.FaresFilterEnum;
import com.travelport.air.offerresource.model.RefundOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareSelection
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = FareSelectionDetail.class, name = "FareSelectionDetail"),
})


public class FareSelection  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("fareType")
  private FaresFilterEnum fareType = null;

  @JsonProperty("RefundOptions")
  private RefundOptions refundOptions = null;

  @JsonProperty("FareQualifier")
  private FareQualifierEnum fareQualifier = null;

  public FareSelection _atType(String _atType) {
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

  public FareSelection fareType(FaresFilterEnum fareType) {
    this.fareType = fareType;
    return this;
  }

  /**
   * Get fareType
   * @return fareType
   **/
  @Schema(description = "")
  
    @Valid
    public FaresFilterEnum getFareType() {
    return fareType;
  }

  public void setFareType(FaresFilterEnum fareType) {
    this.fareType = fareType;
  }

  public FareSelection refundOptions(RefundOptions refundOptions) {
    this.refundOptions = refundOptions;
    return this;
  }

  /**
   * Get refundOptions
   * @return refundOptions
   **/
  @Schema(description = "")
  
    @Valid
    public RefundOptions getRefundOptions() {
    return refundOptions;
  }

  public void setRefundOptions(RefundOptions refundOptions) {
    this.refundOptions = refundOptions;
  }

  public FareSelection fareQualifier(FareQualifierEnum fareQualifier) {
    this.fareQualifier = fareQualifier;
    return this;
  }

  /**
   * Get fareQualifier
   * @return fareQualifier
   **/
  @Schema(description = "")
  
    @Valid
    public FareQualifierEnum getFareQualifier() {
    return fareQualifier;
  }

  public void setFareQualifier(FareQualifierEnum fareQualifier) {
    this.fareQualifier = fareQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareSelection fareSelection = (FareSelection) o;
    return Objects.equals(this._atType, fareSelection._atType) &&
        Objects.equals(this.fareType, fareSelection.fareType) &&
        Objects.equals(this.refundOptions, fareSelection.refundOptions) &&
        Objects.equals(this.fareQualifier, fareSelection.fareQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, fareType, refundOptions, fareQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareSelection {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    fareType: ").append(toIndentedString(fareType)).append("\n");
    sb.append("    refundOptions: ").append(toIndentedString(refundOptions)).append("\n");
    sb.append("    fareQualifier: ").append(toIndentedString(fareQualifier)).append("\n");
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
