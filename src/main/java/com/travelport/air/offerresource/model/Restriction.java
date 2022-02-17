package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Restriction
 */
@Schema(description = "Restriction")
@Validated


public class Restriction  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("segmentSequenceList")
  @Valid
  private java.util.List<Integer> segmentSequenceList = null;

  @JsonProperty("productRef")
  @Valid
  private java.util.List<String> productRef = null;

  public Restriction value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=128)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Restriction segmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
    return this;
  }

  public Restriction addSegmentSequenceListItem(Integer segmentSequenceListItem) {
    if (this.segmentSequenceList == null) {
      this.segmentSequenceList = new java.util.ArrayList<>();
    }
    this.segmentSequenceList.add(segmentSequenceListItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequenceList
   * @return segmentSequenceList
   **/
  @Schema(description = "Assigned Type: c-1100:SegmentSequenceList")
  
    public java.util.List<Integer> getSegmentSequenceList() {
    return segmentSequenceList;
  }

  public void setSegmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
  }

  public Restriction productRef(java.util.List<String> productRef) {
    this.productRef = productRef;
    return this;
  }

  public Restriction addProductRefItem(String productRefItem) {
    if (this.productRef == null) {
      this.productRef = new java.util.ArrayList<>();
    }
    this.productRef.add(productRefItem);
    return this;
  }

  /**
   * The productRef which the restriction applies to
   * @return productRef
   **/
  @Schema(description = "The productRef which the restriction applies to")
  
    public java.util.List<String> getProductRef() {
    return productRef;
  }

  public void setProductRef(java.util.List<String> productRef) {
    this.productRef = productRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restriction restriction = (Restriction) o;
    return Objects.equals(this.value, restriction.value) &&
        Objects.equals(this.segmentSequenceList, restriction.segmentSequenceList) &&
        Objects.equals(this.productRef, restriction.productRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, segmentSequenceList, productRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restriction {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    segmentSequenceList: ").append(toIndentedString(segmentSequenceList)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
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
