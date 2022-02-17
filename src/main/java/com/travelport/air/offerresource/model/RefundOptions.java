package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.RefundPenaltyRange;
import com.travelport.air.offerresource.model.RefundTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundOptions
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class RefundOptions  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("refundTypes")
  @Valid
  private java.util.List<RefundTypeEnum> refundTypes = new java.util.ArrayList<>();

  @JsonProperty("RefundPenaltyRange")
  private RefundPenaltyRange refundPenaltyRange = null;

  public RefundOptions _atType(String _atType) {
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

  public RefundOptions refundTypes(java.util.List<RefundTypeEnum> refundTypes) {
    this.refundTypes = refundTypes;
    return this;
  }

  public RefundOptions addRefundTypesItem(RefundTypeEnum refundTypesItem) {
    this.refundTypes.add(refundTypesItem);
    return this;
  }

  /**
   * Get refundTypes
   * @return refundTypes
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public java.util.List<RefundTypeEnum> getRefundTypes() {
    return refundTypes;
  }

  public void setRefundTypes(java.util.List<RefundTypeEnum> refundTypes) {
    this.refundTypes = refundTypes;
  }

  public RefundOptions refundPenaltyRange(RefundPenaltyRange refundPenaltyRange) {
    this.refundPenaltyRange = refundPenaltyRange;
    return this;
  }

  /**
   * Get refundPenaltyRange
   * @return refundPenaltyRange
   **/
  @Schema(description = "")
  
    @Valid
    public RefundPenaltyRange getRefundPenaltyRange() {
    return refundPenaltyRange;
  }

  public void setRefundPenaltyRange(RefundPenaltyRange refundPenaltyRange) {
    this.refundPenaltyRange = refundPenaltyRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundOptions refundOptions = (RefundOptions) o;
    return Objects.equals(this._atType, refundOptions._atType) &&
        Objects.equals(this.refundTypes, refundOptions.refundTypes) &&
        Objects.equals(this.refundPenaltyRange, refundOptions.refundPenaltyRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, refundTypes, refundPenaltyRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundOptions {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    refundTypes: ").append(toIndentedString(refundTypes)).append("\n");
    sb.append("    refundPenaltyRange: ").append(toIndentedString(refundPenaltyRange)).append("\n");
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
