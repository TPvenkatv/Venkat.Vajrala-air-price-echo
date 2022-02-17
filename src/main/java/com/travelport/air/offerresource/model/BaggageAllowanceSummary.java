package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BaggageItem;
import com.travelport.air.offerresource.model.BaggageTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaggageAllowanceSummary
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class BaggageAllowanceSummary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("passengerTypeCodes")
  @Valid
  private java.util.List<String> passengerTypeCodes = null;

  @JsonProperty("baggageType")
  private BaggageTypeEnum baggageType = null;

  @JsonProperty("ProductRef")
  @Valid
  private java.util.List<String> productRef = null;

  @JsonProperty("BaggageItem")
  @Valid
  private java.util.List<BaggageItem> baggageItem = null;

  @JsonProperty("SegmentSequenceList")
  @Valid
  private java.util.List<Integer> segmentSequenceList = null;

  @JsonProperty("Text")
  @Valid
  private java.util.List<String> text = null;

  public BaggageAllowanceSummary _atType(String _atType) {
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

  public BaggageAllowanceSummary passengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
    return this;
  }

  public BaggageAllowanceSummary addPassengerTypeCodesItem(String passengerTypeCodesItem) {
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

  public BaggageAllowanceSummary baggageType(BaggageTypeEnum baggageType) {
    this.baggageType = baggageType;
    return this;
  }

  /**
   * Get baggageType
   * @return baggageType
   **/
  @Schema(description = "")
  
    @Valid
    public BaggageTypeEnum getBaggageType() {
    return baggageType;
  }

  public void setBaggageType(BaggageTypeEnum baggageType) {
    this.baggageType = baggageType;
  }

  public BaggageAllowanceSummary productRef(java.util.List<String> productRef) {
    this.productRef = productRef;
    return this;
  }

  public BaggageAllowanceSummary addProductRefItem(String productRefItem) {
    if (this.productRef == null) {
      this.productRef = new java.util.ArrayList<>();
    }
    this.productRef.add(productRefItem);
    return this;
  }

  /**
   * A product is any product, service or package of products and services  that can be priced and purchased by a specific supplier.
   * @return productRef
   **/
  @Schema(description = "A product is any product, service or package of products and services  that can be priced and purchased by a specific supplier.")
  
    public java.util.List<String> getProductRef() {
    return productRef;
  }

  public void setProductRef(java.util.List<String> productRef) {
    this.productRef = productRef;
  }

  public BaggageAllowanceSummary baggageItem(java.util.List<BaggageItem> baggageItem) {
    this.baggageItem = baggageItem;
    return this;
  }

  public BaggageAllowanceSummary addBaggageItemItem(BaggageItem baggageItemItem) {
    if (this.baggageItem == null) {
      this.baggageItem = new java.util.ArrayList<>();
    }
    this.baggageItem.add(baggageItemItem);
    return this;
  }

  /**
   * Get baggageItem
   * @return baggageItem
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<BaggageItem> getBaggageItem() {
    return baggageItem;
  }

  public void setBaggageItem(java.util.List<BaggageItem> baggageItem) {
    this.baggageItem = baggageItem;
  }

  public BaggageAllowanceSummary segmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
    return this;
  }

  public BaggageAllowanceSummary addSegmentSequenceListItem(Integer segmentSequenceListItem) {
    if (this.segmentSequenceList == null) {
      this.segmentSequenceList = new java.util.ArrayList<>();
    }
    this.segmentSequenceList.add(segmentSequenceListItem);
    return this;
  }

  /**
   * Segment sequence is only to be used when the baggage allowance differs between segments within a product. If so, then the ProducRef must be specified.
   * @return segmentSequenceList
   **/
  @Schema(description = "Segment sequence is only to be used when the baggage allowance differs between segments within a product. If so, then the ProducRef must be specified.")
  
    public java.util.List<Integer> getSegmentSequenceList() {
    return segmentSequenceList;
  }

  public void setSegmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
  }

  public BaggageAllowanceSummary text(java.util.List<String> text) {
    this.text = text;
    return this;
  }

  public BaggageAllowanceSummary addTextItem(String textItem) {
    if (this.text == null) {
      this.text = new java.util.ArrayList<>();
    }
    this.text.add(textItem);
    return this;
  }

  /**
   * Get text
   * @return text
   **/
  @Schema(description = "")
  
  @Size(max=35)   public java.util.List<String> getText() {
    return text;
  }

  public void setText(java.util.List<String> text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageAllowanceSummary baggageAllowanceSummary = (BaggageAllowanceSummary) o;
    return Objects.equals(this._atType, baggageAllowanceSummary._atType) &&
        Objects.equals(this.passengerTypeCodes, baggageAllowanceSummary.passengerTypeCodes) &&
        Objects.equals(this.baggageType, baggageAllowanceSummary.baggageType) &&
        Objects.equals(this.productRef, baggageAllowanceSummary.productRef) &&
        Objects.equals(this.baggageItem, baggageAllowanceSummary.baggageItem) &&
        Objects.equals(this.segmentSequenceList, baggageAllowanceSummary.segmentSequenceList) &&
        Objects.equals(this.text, baggageAllowanceSummary.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, passengerTypeCodes, baggageType, productRef, baggageItem, segmentSequenceList, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageAllowanceSummary {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    passengerTypeCodes: ").append(toIndentedString(passengerTypeCodes)).append("\n");
    sb.append("    baggageType: ").append(toIndentedString(baggageType)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    baggageItem: ").append(toIndentedString(baggageItem)).append("\n");
    sb.append("    segmentSequenceList: ").append(toIndentedString(segmentSequenceList)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
