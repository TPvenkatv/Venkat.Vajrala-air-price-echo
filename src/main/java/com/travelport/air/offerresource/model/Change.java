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
 * Change
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = ChangePermitted.class, name = "ChangePermitted"),
        @JsonSubTypes.Type(value = ChangeNotPermitted.class, name = "ChangeNotPermitted"),
        @JsonSubTypes.Type(value = ChangeIndeterminate.class, name = "ChangeIndeterminate"),
})


public class Change  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("ProductRefs")
  @Valid
  private java.util.List<String> productRefs = null;

  @JsonProperty("SegmentSequence")
  @Valid
  private java.util.List<Integer> segmentSequence = null;

  public Change _atType(String _atType) {
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

  public Change productRefs(java.util.List<String> productRefs) {
    this.productRefs = productRefs;
    return this;
  }

  public Change addProductRefsItem(String productRefsItem) {
    if (this.productRefs == null) {
      this.productRefs = new java.util.ArrayList<>();
    }
    this.productRefs.add(productRefsItem);
    return this;
  }

  /**
   * The productRefs this change or cancel applies to
   * @return productRefs
   **/
  @Schema(description = "The productRefs this change or cancel applies to")
  
    public java.util.List<String> getProductRefs() {
    return productRefs;
  }

  public void setProductRefs(java.util.List<String> productRefs) {
    this.productRefs = productRefs;
  }

  public Change segmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
    return this;
  }

  public Change addSegmentSequenceItem(Integer segmentSequenceItem) {
    if (this.segmentSequence == null) {
      this.segmentSequence = new java.util.ArrayList<>();
    }
    this.segmentSequence.add(segmentSequenceItem);
    return this;
  }

  /**
   * The SegmentSequence of the product this change or cancel applies to
   * @return segmentSequence
   **/
  @Schema(description = "The SegmentSequence of the product this change or cancel applies to")
  
    public java.util.List<Integer> getSegmentSequence() {
    return segmentSequence;
  }

  public void setSegmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Change change = (Change) o;
    return Objects.equals(this._atType, change._atType) &&
        Objects.equals(this.productRefs, change.productRefs) &&
        Objects.equals(this.segmentSequence, change.segmentSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, productRefs, segmentSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Change {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    productRefs: ").append(toIndentedString(productRefs)).append("\n");
    sb.append("    segmentSequence: ").append(toIndentedString(segmentSequence)).append("\n");
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
