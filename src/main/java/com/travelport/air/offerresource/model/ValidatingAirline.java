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
 * ValidatingAirline
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class ValidatingAirline  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("SegmentSequenceList")
  @Valid
  private java.util.List<Integer> segmentSequenceList = null;

  @JsonProperty("ValidatingAirline")
  private String validatingAirline = null;

  @JsonProperty("ProductRef")
  @Valid
  private java.util.List<String> productRef = null;

  public ValidatingAirline _atType(String _atType) {
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

  public ValidatingAirline segmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
    return this;
  }

  public ValidatingAirline addSegmentSequenceListItem(Integer segmentSequenceListItem) {
    if (this.segmentSequenceList == null) {
      this.segmentSequenceList = new java.util.ArrayList<>();
    }
    this.segmentSequenceList.add(segmentSequenceListItem);
    return this;
  }

  /**
   * The segmentSequenceList the validatingCarrier applies to
   * @return segmentSequenceList
   **/
  @Schema(description = "The segmentSequenceList the validatingCarrier applies to")
  
    public java.util.List<Integer> getSegmentSequenceList() {
    return segmentSequenceList;
  }

  public void setSegmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
  }

  public ValidatingAirline validatingAirline(String validatingAirline) {
    this.validatingAirline = validatingAirline;
    return this;
  }

  /**
   * Represents the airline responsible for ticketing/fulfillment of this Offer
   * @return validatingAirline
   **/
  @Schema(required = true, description = "Represents the airline responsible for ticketing/fulfillment of this Offer")
      @NotNull

  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getValidatingAirline() {
    return validatingAirline;
  }

  public void setValidatingAirline(String validatingAirline) {
    this.validatingAirline = validatingAirline;
  }

  public ValidatingAirline productRef(java.util.List<String> productRef) {
    this.productRef = productRef;
    return this;
  }

  public ValidatingAirline addProductRefItem(String productRefItem) {
    if (this.productRef == null) {
      this.productRef = new java.util.ArrayList<>();
    }
    this.productRef.add(productRefItem);
    return this;
  }

  /**
   * The productRef the validatingCarrier applies to
   * @return productRef
   **/
  @Schema(description = "The productRef the validatingCarrier applies to")
  
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
    ValidatingAirline validatingAirline = (ValidatingAirline) o;
    return Objects.equals(this._atType, validatingAirline._atType) &&
        Objects.equals(this.segmentSequenceList, validatingAirline.segmentSequenceList) &&
        Objects.equals(this.validatingAirline, validatingAirline.validatingAirline) &&
        Objects.equals(this.productRef, validatingAirline.productRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, segmentSequenceList, validatingAirline, productRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatingAirline {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    segmentSequenceList: ").append(toIndentedString(segmentSequenceList)).append("\n");
    sb.append("    validatingAirline: ").append(toIndentedString(validatingAirline)).append("\n");
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
