package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BrandClassificationEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrandAttributeInclusion
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class BrandAttributeInclusion  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("legSequence")
  @Valid
  private java.util.List<Integer> legSequence = null;

  @JsonProperty("Classification")
  @Valid
  private java.util.List<BrandClassificationEnum> classification = null;

  @JsonProperty("AdditionalClassification")
  @Valid
  private java.util.List<String> additionalClassification = null;

  public BrandAttributeInclusion _atType(String _atType) {
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

  public BrandAttributeInclusion legSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
    return this;
  }

  public BrandAttributeInclusion addLegSequenceItem(Integer legSequenceItem) {
    if (this.legSequence == null) {
      this.legSequence = new java.util.ArrayList<>();
    }
    this.legSequence.add(legSequenceItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequenceList
   * @return legSequence
   **/
  @Schema(description = "Assigned Type: c-1100:SegmentSequenceList")
  
    public java.util.List<Integer> getLegSequence() {
    return legSequence;
  }

  public void setLegSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
  }

  public BrandAttributeInclusion classification(java.util.List<BrandClassificationEnum> classification) {
    this.classification = classification;
    return this;
  }

  public BrandAttributeInclusion addClassificationItem(BrandClassificationEnum classificationItem) {
    if (this.classification == null) {
      this.classification = new java.util.ArrayList<>();
    }
    this.classification.add(classificationItem);
    return this;
  }

  /**
   * Get classification
   * @return classification
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<BrandClassificationEnum> getClassification() {
    return classification;
  }

  public void setClassification(java.util.List<BrandClassificationEnum> classification) {
    this.classification = classification;
  }

  public BrandAttributeInclusion additionalClassification(java.util.List<String> additionalClassification) {
    this.additionalClassification = additionalClassification;
    return this;
  }

  public BrandAttributeInclusion addAdditionalClassificationItem(String additionalClassificationItem) {
    if (this.additionalClassification == null) {
      this.additionalClassification = new java.util.ArrayList<>();
    }
    this.additionalClassification.add(additionalClassificationItem);
    return this;
  }

  /**
   * Get additionalClassification
   * @return additionalClassification
   **/
  @Schema(description = "")
  
  @Size(max=10)   public java.util.List<String> getAdditionalClassification() {
    return additionalClassification;
  }

  public void setAdditionalClassification(java.util.List<String> additionalClassification) {
    this.additionalClassification = additionalClassification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAttributeInclusion brandAttributeInclusion = (BrandAttributeInclusion) o;
    return Objects.equals(this._atType, brandAttributeInclusion._atType) &&
        Objects.equals(this.legSequence, brandAttributeInclusion.legSequence) &&
        Objects.equals(this.classification, brandAttributeInclusion.classification) &&
        Objects.equals(this.additionalClassification, brandAttributeInclusion.additionalClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, legSequence, classification, additionalClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAttributeInclusion {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    legSequence: ").append(toIndentedString(legSequence)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    additionalClassification: ").append(toIndentedString(additionalClassification)).append("\n");
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
