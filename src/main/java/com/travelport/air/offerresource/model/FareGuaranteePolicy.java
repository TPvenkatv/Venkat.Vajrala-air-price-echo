package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Code;
import com.travelport.air.offerresource.model.YesNoUnknownEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareGuaranteePolicy
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class FareGuaranteePolicy  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("passengerTypeCodes")
  @Valid
  private java.util.List<String> passengerTypeCodes = null;

  @JsonProperty("EligibleforADMReview")
  private YesNoUnknownEnum eligibleforADMReview = null;

  @JsonProperty("Code")
  private Code code = null;

  public FareGuaranteePolicy _atType(String _atType) {
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

  public FareGuaranteePolicy passengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
    return this;
  }

  public FareGuaranteePolicy addPassengerTypeCodesItem(String passengerTypeCodesItem) {
    if (this.passengerTypeCodes == null) {
      this.passengerTypeCodes = new java.util.ArrayList<>();
    }
    this.passengerTypeCodes.add(passengerTypeCodesItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:PassengerTypeCodeList
   * @return passengerTypeCodes
   **/
  @Schema(description = "Assigned Type: c-1100:PassengerTypeCodeList")
  
    public java.util.List<String> getPassengerTypeCodes() {
    return passengerTypeCodes;
  }

  public void setPassengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
  }

  public FareGuaranteePolicy eligibleforADMReview(YesNoUnknownEnum eligibleforADMReview) {
    this.eligibleforADMReview = eligibleforADMReview;
    return this;
  }

  /**
   * Get eligibleforADMReview
   * @return eligibleforADMReview
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public YesNoUnknownEnum getEligibleforADMReview() {
    return eligibleforADMReview;
  }

  public void setEligibleforADMReview(YesNoUnknownEnum eligibleforADMReview) {
    this.eligibleforADMReview = eligibleforADMReview;
  }

  public FareGuaranteePolicy code(Code code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @Schema(description = "")
  
    @Valid
    public Code getCode() {
    return code;
  }

  public void setCode(Code code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareGuaranteePolicy fareGuaranteePolicy = (FareGuaranteePolicy) o;
    return Objects.equals(this._atType, fareGuaranteePolicy._atType) &&
        Objects.equals(this.passengerTypeCodes, fareGuaranteePolicy.passengerTypeCodes) &&
        Objects.equals(this.eligibleforADMReview, fareGuaranteePolicy.eligibleforADMReview) &&
        Objects.equals(this.code, fareGuaranteePolicy.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, passengerTypeCodes, eligibleforADMReview, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareGuaranteePolicy {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    passengerTypeCodes: ").append(toIndentedString(passengerTypeCodes)).append("\n");
    sb.append("    eligibleforADMReview: ").append(toIndentedString(eligibleforADMReview)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
