package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.ApplicationLimit;
import com.travelport.air.offerresource.model.CustomerLoyalty;
import com.travelport.air.offerresource.model.RefundabilityEnum;
import com.travelport.air.offerresource.model.TermsAndConditionsFull;
import com.travelport.air.offerresource.model.TextBlock;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TermsAndConditionsFullAncillary
 */
@Validated


public class TermsAndConditionsFullAncillary extends TermsAndConditionsFull implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ApplicationLimit")
  private ApplicationLimit applicationLimit = null;

  @JsonProperty("Refundability")
  private RefundabilityEnum refundability = null;

  public TermsAndConditionsFullAncillary applicationLimit(ApplicationLimit applicationLimit) {
    this.applicationLimit = applicationLimit;
    return this;
  }

  /**
   * Get applicationLimit
   * @return applicationLimit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ApplicationLimit getApplicationLimit() {
    return applicationLimit;
  }

  public void setApplicationLimit(ApplicationLimit applicationLimit) {
    this.applicationLimit = applicationLimit;
  }

  public TermsAndConditionsFullAncillary refundability(RefundabilityEnum refundability) {
    this.refundability = refundability;
    return this;
  }

  /**
   * Get refundability
   * @return refundability
   **/
  @Schema(description = "")
  
    @Valid
    public RefundabilityEnum getRefundability() {
    return refundability;
  }

  public void setRefundability(RefundabilityEnum refundability) {
    this.refundability = refundability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditionsFullAncillary termsAndConditionsFullAncillary = (TermsAndConditionsFullAncillary) o;
    return Objects.equals(this.applicationLimit, termsAndConditionsFullAncillary.applicationLimit) &&
        Objects.equals(this.refundability, termsAndConditionsFullAncillary.refundability) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLimit, refundability, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditionsFullAncillary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applicationLimit: ").append(toIndentedString(applicationLimit)).append("\n");
    sb.append("    refundability: ").append(toIndentedString(refundability)).append("\n");
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
