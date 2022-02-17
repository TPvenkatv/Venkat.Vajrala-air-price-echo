package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.FareQualifierEnum;
import com.travelport.air.offerresource.model.FareSelection;
import com.travelport.air.offerresource.model.FaresFilterEnum;
import com.travelport.air.offerresource.model.RefundOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareSelectionDetail
 */
@Validated


public class FareSelectionDetail extends FareSelection implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("validatingCarrier")
  private String validatingCarrier = null;

  @JsonProperty("prohibitMinStayFaresInd")
  private Boolean prohibitMinStayFaresInd = null;

  @JsonProperty("prohibitMaxStayFaresInd")
  private Boolean prohibitMaxStayFaresInd = null;

  @JsonProperty("refundableOnlyInd")
  private Boolean refundableOnlyInd = null;

  @JsonProperty("prohibitAdvancePurchaseFaresInd")
  private Boolean prohibitAdvancePurchaseFaresInd = null;

  @JsonProperty("prohibitUnbundledFaresInd")
  private Boolean prohibitUnbundledFaresInd = null;

  @JsonProperty("prohibitRefundableFaresInd")
  private Boolean prohibitRefundableFaresInd = null;

  public FareSelectionDetail validatingCarrier(String validatingCarrier) {
    this.validatingCarrier = validatingCarrier;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return validatingCarrier
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:AirlineCode")
      @NotNull

  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getValidatingCarrier() {
    return validatingCarrier;
  }

  public void setValidatingCarrier(String validatingCarrier) {
    this.validatingCarrier = validatingCarrier;
  }

  public FareSelectionDetail prohibitMinStayFaresInd(Boolean prohibitMinStayFaresInd) {
    this.prohibitMinStayFaresInd = prohibitMinStayFaresInd;
    return this;
  }

  /**
   * If present and true, fares with minimum stays will not be returned
   * @return prohibitMinStayFaresInd
   **/
  @Schema(description = "If present and true, fares with minimum stays will not be returned")
  
    public Boolean isProhibitMinStayFaresInd() {
    return prohibitMinStayFaresInd;
  }

  public void setProhibitMinStayFaresInd(Boolean prohibitMinStayFaresInd) {
    this.prohibitMinStayFaresInd = prohibitMinStayFaresInd;
  }

  public FareSelectionDetail prohibitMaxStayFaresInd(Boolean prohibitMaxStayFaresInd) {
    this.prohibitMaxStayFaresInd = prohibitMaxStayFaresInd;
    return this;
  }

  /**
   * If present and true, fares with maximum stays will not be returned
   * @return prohibitMaxStayFaresInd
   **/
  @Schema(description = "If present and true, fares with maximum stays will not be returned")
  
    public Boolean isProhibitMaxStayFaresInd() {
    return prohibitMaxStayFaresInd;
  }

  public void setProhibitMaxStayFaresInd(Boolean prohibitMaxStayFaresInd) {
    this.prohibitMaxStayFaresInd = prohibitMaxStayFaresInd;
  }

  public FareSelectionDetail refundableOnlyInd(Boolean refundableOnlyInd) {
    this.refundableOnlyInd = refundableOnlyInd;
    return this;
  }

  /**
   * If present and true, only refundable fares will be returned
   * @return refundableOnlyInd
   **/
  @Schema(description = "If present and true, only refundable fares will be returned")
  
    public Boolean isRefundableOnlyInd() {
    return refundableOnlyInd;
  }

  public void setRefundableOnlyInd(Boolean refundableOnlyInd) {
    this.refundableOnlyInd = refundableOnlyInd;
  }

  public FareSelectionDetail prohibitAdvancePurchaseFaresInd(Boolean prohibitAdvancePurchaseFaresInd) {
    this.prohibitAdvancePurchaseFaresInd = prohibitAdvancePurchaseFaresInd;
    return this;
  }

  /**
   * If present and true, fares with advance purchase requirements will not be returned
   * @return prohibitAdvancePurchaseFaresInd
   **/
  @Schema(description = "If present and true, fares with advance purchase requirements will not be returned")
  
    public Boolean isProhibitAdvancePurchaseFaresInd() {
    return prohibitAdvancePurchaseFaresInd;
  }

  public void setProhibitAdvancePurchaseFaresInd(Boolean prohibitAdvancePurchaseFaresInd) {
    this.prohibitAdvancePurchaseFaresInd = prohibitAdvancePurchaseFaresInd;
  }

  public FareSelectionDetail prohibitUnbundledFaresInd(Boolean prohibitUnbundledFaresInd) {
    this.prohibitUnbundledFaresInd = prohibitUnbundledFaresInd;
    return this;
  }

  /**
   * Get prohibitUnbundledFaresInd
   * @return prohibitUnbundledFaresInd
   **/
  @Schema(description = "")
  
    public Boolean isProhibitUnbundledFaresInd() {
    return prohibitUnbundledFaresInd;
  }

  public void setProhibitUnbundledFaresInd(Boolean prohibitUnbundledFaresInd) {
    this.prohibitUnbundledFaresInd = prohibitUnbundledFaresInd;
  }

  public FareSelectionDetail prohibitRefundableFaresInd(Boolean prohibitRefundableFaresInd) {
    this.prohibitRefundableFaresInd = prohibitRefundableFaresInd;
    return this;
  }

  /**
   * Allows user to prohibit refundable fares from being offered
   * @return prohibitRefundableFaresInd
   **/
  @Schema(description = "Allows user to prohibit refundable fares from being offered")
  
    public Boolean isProhibitRefundableFaresInd() {
    return prohibitRefundableFaresInd;
  }

  public void setProhibitRefundableFaresInd(Boolean prohibitRefundableFaresInd) {
    this.prohibitRefundableFaresInd = prohibitRefundableFaresInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareSelectionDetail fareSelectionDetail = (FareSelectionDetail) o;
    return Objects.equals(this.validatingCarrier, fareSelectionDetail.validatingCarrier) &&
        Objects.equals(this.prohibitMinStayFaresInd, fareSelectionDetail.prohibitMinStayFaresInd) &&
        Objects.equals(this.prohibitMaxStayFaresInd, fareSelectionDetail.prohibitMaxStayFaresInd) &&
        Objects.equals(this.refundableOnlyInd, fareSelectionDetail.refundableOnlyInd) &&
        Objects.equals(this.prohibitAdvancePurchaseFaresInd, fareSelectionDetail.prohibitAdvancePurchaseFaresInd) &&
        Objects.equals(this.prohibitUnbundledFaresInd, fareSelectionDetail.prohibitUnbundledFaresInd) &&
        Objects.equals(this.prohibitRefundableFaresInd, fareSelectionDetail.prohibitRefundableFaresInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatingCarrier, prohibitMinStayFaresInd, prohibitMaxStayFaresInd, refundableOnlyInd, prohibitAdvancePurchaseFaresInd, prohibitUnbundledFaresInd, prohibitRefundableFaresInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareSelectionDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    validatingCarrier: ").append(toIndentedString(validatingCarrier)).append("\n");
    sb.append("    prohibitMinStayFaresInd: ").append(toIndentedString(prohibitMinStayFaresInd)).append("\n");
    sb.append("    prohibitMaxStayFaresInd: ").append(toIndentedString(prohibitMaxStayFaresInd)).append("\n");
    sb.append("    refundableOnlyInd: ").append(toIndentedString(refundableOnlyInd)).append("\n");
    sb.append("    prohibitAdvancePurchaseFaresInd: ").append(toIndentedString(prohibitAdvancePurchaseFaresInd)).append("\n");
    sb.append("    prohibitUnbundledFaresInd: ").append(toIndentedString(prohibitUnbundledFaresInd)).append("\n");
    sb.append("    prohibitRefundableFaresInd: ").append(toIndentedString(prohibitRefundableFaresInd)).append("\n");
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
