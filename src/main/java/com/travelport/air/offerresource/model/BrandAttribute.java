package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BrandClassificationEnum;
import com.travelport.air.offerresource.model.BrandInclusionEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrandAttribute
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class BrandAttribute  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("classification")
  private BrandClassificationEnum classification = null;

  @JsonProperty("inclusion")
  private BrandInclusionEnum inclusion = null;

  @JsonProperty("ImageURL")
  @Valid
  private java.util.List<String> imageURL = null;

  @JsonProperty("matchedAttributeInd")
  private Boolean matchedAttributeInd = null;

  public BrandAttribute _atType(String _atType) {
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

  public BrandAttribute classification(BrandClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BrandClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(BrandClassificationEnum classification) {
    this.classification = classification;
  }

  public BrandAttribute inclusion(BrandInclusionEnum inclusion) {
    this.inclusion = inclusion;
    return this;
  }

  /**
   * Get inclusion
   * @return inclusion
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BrandInclusionEnum getInclusion() {
    return inclusion;
  }

  public void setInclusion(BrandInclusionEnum inclusion) {
    this.inclusion = inclusion;
  }

  public BrandAttribute imageURL(java.util.List<String> imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  public BrandAttribute addImageURLItem(String imageURLItem) {
    if (this.imageURL == null) {
      this.imageURL = new java.util.ArrayList<>();
    }
    this.imageURL.add(imageURLItem);
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
   **/
  @Schema(description = "")
  
  @Size(max=10)   public java.util.List<String> getImageURL() {
    return imageURL;
  }

  public void setImageURL(java.util.List<String> imageURL) {
    this.imageURL = imageURL;
  }

  public BrandAttribute matchedAttributeInd(Boolean matchedAttributeInd) {
    this.matchedAttributeInd = matchedAttributeInd;
    return this;
  }

  /**
   * if true, this is a matched attribute.
   * @return matchedAttributeInd
   **/
  @Schema(description = "if true, this is a matched attribute.")
  
    public Boolean isMatchedAttributeInd() {
    return matchedAttributeInd;
  }

  public void setMatchedAttributeInd(Boolean matchedAttributeInd) {
    this.matchedAttributeInd = matchedAttributeInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAttribute brandAttribute = (BrandAttribute) o;
    return Objects.equals(this._atType, brandAttribute._atType) &&
        Objects.equals(this.classification, brandAttribute.classification) &&
        Objects.equals(this.inclusion, brandAttribute.inclusion) &&
        Objects.equals(this.imageURL, brandAttribute.imageURL) &&
        Objects.equals(this.matchedAttributeInd, brandAttribute.matchedAttributeInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, classification, inclusion, imageURL, matchedAttributeInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAttribute {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    matchedAttributeInd: ").append(toIndentedString(matchedAttributeInd)).append("\n");
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
