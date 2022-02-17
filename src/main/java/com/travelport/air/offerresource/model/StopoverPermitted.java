package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.JourneyTypeEnum;
import com.travelport.air.offerresource.model.Stopover;
import com.travelport.air.offerresource.model.StopoverCharge;
import com.travelport.air.offerresource.model.StopoverRestriction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StopoverPermitted
 */
@Validated


public class StopoverPermitted extends Stopover implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("journeyTypes")
  @Valid
  private java.util.List<JourneyTypeEnum> journeyTypes = null;

  @JsonProperty("minimumDuration")
  private String minimumDuration = null;

  @JsonProperty("maximumDuration")
  private String maximumDuration = null;

  @JsonProperty("minimum")
  private Integer minimum = null;

  @JsonProperty("maximum")
  private Integer maximum = null;

  @JsonProperty("outbound")
  private Integer outbound = null;

  @JsonProperty("inbound")
  private Integer inbound = null;

  @JsonProperty("StopoverCharge")
  @Valid
  private java.util.List<StopoverCharge> stopoverCharge = new java.util.ArrayList<>();

  @JsonProperty("StopoverRestriction")
  @Valid
  private java.util.List<StopoverRestriction> stopoverRestriction = null;

  @JsonProperty("permittedAtGatewayOnlyInd")
  private Boolean permittedAtGatewayOnlyInd = null;

  public StopoverPermitted journeyTypes(java.util.List<JourneyTypeEnum> journeyTypes) {
    this.journeyTypes = journeyTypes;
    return this;
  }

  public StopoverPermitted addJourneyTypesItem(JourneyTypeEnum journeyTypesItem) {
    if (this.journeyTypes == null) {
      this.journeyTypes = new java.util.ArrayList<>();
    }
    this.journeyTypes.add(journeyTypesItem);
    return this;
  }

  /**
   * Get journeyTypes
   * @return journeyTypes
   **/
  @Schema(description = "")
      @Valid
    public java.util.List<JourneyTypeEnum> getJourneyTypes() {
    return journeyTypes;
  }

  public void setJourneyTypes(java.util.List<JourneyTypeEnum> journeyTypes) {
    this.journeyTypes = journeyTypes;
  }

  public StopoverPermitted minimumDuration(String minimumDuration) {
    this.minimumDuration = minimumDuration;
    return this;
  }

  /**
   * The minimum amount of time permitted for a stopover
   * @return minimumDuration
   **/
  @Schema(required = true, description = "The minimum amount of time permitted for a stopover")
      @NotNull

    public String getMinimumDuration() {
    return minimumDuration;
  }

  public void setMinimumDuration(String minimumDuration) {
    this.minimumDuration = minimumDuration;
  }

  public StopoverPermitted maximumDuration(String maximumDuration) {
    this.maximumDuration = maximumDuration;
    return this;
  }

  /**
   * The maximum amount of time permitted for a stopover
   * @return maximumDuration
   **/
  @Schema(required = true, description = "The maximum amount of time permitted for a stopover")
      @NotNull

    public String getMaximumDuration() {
    return maximumDuration;
  }

  public void setMaximumDuration(String maximumDuration) {
    this.maximumDuration = maximumDuration;
  }

  public StopoverPermitted minimum(Integer minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return minimum
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:NonnegativeInteger")
      @NotNull

  @Min(0)  public Integer getMinimum() {
    return minimum;
  }

  public void setMinimum(Integer minimum) {
    this.minimum = minimum;
  }

  public StopoverPermitted maximum(Integer maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return maximum
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:NonnegativeInteger")
      @NotNull

  @Min(0)  public Integer getMaximum() {
    return maximum;
  }

  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }

  public StopoverPermitted outbound(Integer outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return outbound
   **/
  @Schema(description = "Assigned Type: c-1100:NonnegativeInteger")
  
  @Min(0)  public Integer getOutbound() {
    return outbound;
  }

  public void setOutbound(Integer outbound) {
    this.outbound = outbound;
  }

  public StopoverPermitted inbound(Integer inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return inbound
   **/
  @Schema(description = "Assigned Type: c-1100:NonnegativeInteger")
  
  @Min(0)  public Integer getInbound() {
    return inbound;
  }

  public void setInbound(Integer inbound) {
    this.inbound = inbound;
  }

  public StopoverPermitted stopoverCharge(java.util.List<StopoverCharge> stopoverCharge) {
    this.stopoverCharge = stopoverCharge;
    return this;
  }

  public StopoverPermitted addStopoverChargeItem(StopoverCharge stopoverChargeItem) {
    this.stopoverCharge.add(stopoverChargeItem);
    return this;
  }

  /**
   * Get stopoverCharge
   * @return stopoverCharge
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<StopoverCharge> getStopoverCharge() {
    return stopoverCharge;
  }

  public void setStopoverCharge(java.util.List<StopoverCharge> stopoverCharge) {
    this.stopoverCharge = stopoverCharge;
  }

  public StopoverPermitted stopoverRestriction(java.util.List<StopoverRestriction> stopoverRestriction) {
    this.stopoverRestriction = stopoverRestriction;
    return this;
  }

  public StopoverPermitted addStopoverRestrictionItem(StopoverRestriction stopoverRestrictionItem) {
    if (this.stopoverRestriction == null) {
      this.stopoverRestriction = new java.util.ArrayList<>();
    }
    this.stopoverRestriction.add(stopoverRestrictionItem);
    return this;
  }

  /**
   * Get stopoverRestriction
   * @return stopoverRestriction
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<StopoverRestriction> getStopoverRestriction() {
    return stopoverRestriction;
  }

  public void setStopoverRestriction(java.util.List<StopoverRestriction> stopoverRestriction) {
    this.stopoverRestriction = stopoverRestriction;
  }

  public StopoverPermitted permittedAtGatewayOnlyInd(Boolean permittedAtGatewayOnlyInd) {
    this.permittedAtGatewayOnlyInd = permittedAtGatewayOnlyInd;
    return this;
  }

  /**
   * If true, stopovers are permitted at gateway points only
   * @return permittedAtGatewayOnlyInd
   **/
  @Schema(description = "If true, stopovers are permitted at gateway points only")
  
    public Boolean isPermittedAtGatewayOnlyInd() {
    return permittedAtGatewayOnlyInd;
  }

  public void setPermittedAtGatewayOnlyInd(Boolean permittedAtGatewayOnlyInd) {
    this.permittedAtGatewayOnlyInd = permittedAtGatewayOnlyInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopoverPermitted stopoverPermitted = (StopoverPermitted) o;
    return Objects.equals(this.journeyTypes, stopoverPermitted.journeyTypes) &&
        Objects.equals(this.minimumDuration, stopoverPermitted.minimumDuration) &&
        Objects.equals(this.maximumDuration, stopoverPermitted.maximumDuration) &&
        Objects.equals(this.minimum, stopoverPermitted.minimum) &&
        Objects.equals(this.maximum, stopoverPermitted.maximum) &&
        Objects.equals(this.outbound, stopoverPermitted.outbound) &&
        Objects.equals(this.inbound, stopoverPermitted.inbound) &&
        Objects.equals(this.stopoverCharge, stopoverPermitted.stopoverCharge) &&
        Objects.equals(this.stopoverRestriction, stopoverPermitted.stopoverRestriction) &&
        Objects.equals(this.permittedAtGatewayOnlyInd, stopoverPermitted.permittedAtGatewayOnlyInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journeyTypes, minimumDuration, maximumDuration, minimum, maximum, outbound, inbound, stopoverCharge, stopoverRestriction, permittedAtGatewayOnlyInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopoverPermitted {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    journeyTypes: ").append(toIndentedString(journeyTypes)).append("\n");
    sb.append("    minimumDuration: ").append(toIndentedString(minimumDuration)).append("\n");
    sb.append("    maximumDuration: ").append(toIndentedString(maximumDuration)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    stopoverCharge: ").append(toIndentedString(stopoverCharge)).append("\n");
    sb.append("    stopoverRestriction: ").append(toIndentedString(stopoverRestriction)).append("\n");
    sb.append("    permittedAtGatewayOnlyInd: ").append(toIndentedString(permittedAtGatewayOnlyInd)).append("\n");
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
