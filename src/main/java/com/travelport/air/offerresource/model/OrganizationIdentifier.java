package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.OrganizationCodeTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The organization identifier
 */
@Schema(description = "The organization identifier")
@Validated


public class OrganizationIdentifier  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("supplier")
  private String supplier = null;

  @JsonProperty("organizationCodeType")
  private OrganizationCodeTypeEnum organizationCodeType = null;

  @JsonProperty("segmentSequenceList")
  @Valid
  private java.util.List<Integer> segmentSequenceList = null;

  @JsonProperty("productRef")
  @Valid
  private java.util.List<String> productRef = null;

  public OrganizationIdentifier value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=32)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OrganizationIdentifier supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCode
   * @return supplier
   **/
  @Schema(description = "Assigned Type: c-1100:AirlineCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{2,3})")   public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public OrganizationIdentifier organizationCodeType(OrganizationCodeTypeEnum organizationCodeType) {
    this.organizationCodeType = organizationCodeType;
    return this;
  }

  /**
   * Get organizationCodeType
   * @return organizationCodeType
   **/
  @Schema(description = "")
  
    @Valid
    public OrganizationCodeTypeEnum getOrganizationCodeType() {
    return organizationCodeType;
  }

  public void setOrganizationCodeType(OrganizationCodeTypeEnum organizationCodeType) {
    this.organizationCodeType = organizationCodeType;
  }

  public OrganizationIdentifier segmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
    return this;
  }

  public OrganizationIdentifier addSegmentSequenceListItem(Integer segmentSequenceListItem) {
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

  public OrganizationIdentifier productRef(java.util.List<String> productRef) {
    this.productRef = productRef;
    return this;
  }

  public OrganizationIdentifier addProductRefItem(String productRefItem) {
    if (this.productRef == null) {
      this.productRef = new java.util.ArrayList<>();
    }
    this.productRef.add(productRefItem);
    return this;
  }

  /**
   * The productRef which the OrganizationIdentifier applies to
   * @return productRef
   **/
  @Schema(description = "The productRef which the OrganizationIdentifier applies to")
  
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
    OrganizationIdentifier organizationIdentifier = (OrganizationIdentifier) o;
    return Objects.equals(this.value, organizationIdentifier.value) &&
        Objects.equals(this.supplier, organizationIdentifier.supplier) &&
        Objects.equals(this.organizationCodeType, organizationIdentifier.organizationCodeType) &&
        Objects.equals(this.segmentSequenceList, organizationIdentifier.segmentSequenceList) &&
        Objects.equals(this.productRef, organizationIdentifier.productRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, supplier, organizationCodeType, segmentSequenceList, productRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationIdentifier {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    organizationCodeType: ").append(toIndentedString(organizationCodeType)).append("\n");
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
