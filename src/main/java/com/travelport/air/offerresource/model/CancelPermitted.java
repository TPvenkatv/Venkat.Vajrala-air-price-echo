package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Cancel;
import com.travelport.air.offerresource.model.Penalty;
import com.travelport.air.offerresource.model.PenaltyAppliesToEnum;
import com.travelport.air.offerresource.model.PenaltyTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancelPermitted
 */
@Validated


public class CancelPermitted extends Cancel implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("penaltyTypes")
  @Valid
  private java.util.List<PenaltyTypeEnum> penaltyTypes = new java.util.ArrayList<>();

  @JsonProperty("PenaltyAppliesTo")
  private PenaltyAppliesToEnum penaltyAppliesTo = null;

  @JsonProperty("Penalty")
  @Valid
  private java.util.List<Penalty> penalty = null;

  @JsonProperty("higherPenatltyAppliesInd")
  private Boolean higherPenatltyAppliesInd = null;

  public CancelPermitted penaltyTypes(java.util.List<PenaltyTypeEnum> penaltyTypes) {
    this.penaltyTypes = penaltyTypes;
    return this;
  }

  public CancelPermitted addPenaltyTypesItem(PenaltyTypeEnum penaltyTypesItem) {
    this.penaltyTypes.add(penaltyTypesItem);
    return this;
  }

  /**
   * Get penaltyTypes
   * @return penaltyTypes
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public java.util.List<PenaltyTypeEnum> getPenaltyTypes() {
    return penaltyTypes;
  }

  public void setPenaltyTypes(java.util.List<PenaltyTypeEnum> penaltyTypes) {
    this.penaltyTypes = penaltyTypes;
  }

  public CancelPermitted penaltyAppliesTo(PenaltyAppliesToEnum penaltyAppliesTo) {
    this.penaltyAppliesTo = penaltyAppliesTo;
    return this;
  }

  /**
   * Get penaltyAppliesTo
   * @return penaltyAppliesTo
   **/
  @Schema(description = "")
  
    @Valid
    public PenaltyAppliesToEnum getPenaltyAppliesTo() {
    return penaltyAppliesTo;
  }

  public void setPenaltyAppliesTo(PenaltyAppliesToEnum penaltyAppliesTo) {
    this.penaltyAppliesTo = penaltyAppliesTo;
  }

  public CancelPermitted penalty(java.util.List<Penalty> penalty) {
    this.penalty = penalty;
    return this;
  }

  public CancelPermitted addPenaltyItem(Penalty penaltyItem) {
    if (this.penalty == null) {
      this.penalty = new java.util.ArrayList<>();
    }
    this.penalty.add(penaltyItem);
    return this;
  }

  /**
   * Get penalty
   * @return penalty
   **/
  @Schema(description = "")
      @Valid
  @Size(max=2)   public java.util.List<Penalty> getPenalty() {
    return penalty;
  }

  public void setPenalty(java.util.List<Penalty> penalty) {
    this.penalty = penalty;
  }

  public CancelPermitted higherPenatltyAppliesInd(Boolean higherPenatltyAppliesInd) {
    this.higherPenatltyAppliesInd = higherPenatltyAppliesInd;
    return this;
  }

  /**
   * If true, when an amount and a percent are specified in the Penalty then the higher of these apply
   * @return higherPenatltyAppliesInd
   **/
  @Schema(description = "If true, when an amount and a percent are specified in the Penalty then the higher of these apply")
  
    public Boolean isHigherPenatltyAppliesInd() {
    return higherPenatltyAppliesInd;
  }

  public void setHigherPenatltyAppliesInd(Boolean higherPenatltyAppliesInd) {
    this.higherPenatltyAppliesInd = higherPenatltyAppliesInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPermitted cancelPermitted = (CancelPermitted) o;
    return Objects.equals(this.penaltyTypes, cancelPermitted.penaltyTypes) &&
        Objects.equals(this.penaltyAppliesTo, cancelPermitted.penaltyAppliesTo) &&
        Objects.equals(this.penalty, cancelPermitted.penalty) &&
        Objects.equals(this.higherPenatltyAppliesInd, cancelPermitted.higherPenatltyAppliesInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(penaltyTypes, penaltyAppliesTo, penalty, higherPenatltyAppliesInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPermitted {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    penaltyTypes: ").append(toIndentedString(penaltyTypes)).append("\n");
    sb.append("    penaltyAppliesTo: ").append(toIndentedString(penaltyAppliesTo)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    higherPenatltyAppliesInd: ").append(toIndentedString(higherPenatltyAppliesInd)).append("\n");
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
