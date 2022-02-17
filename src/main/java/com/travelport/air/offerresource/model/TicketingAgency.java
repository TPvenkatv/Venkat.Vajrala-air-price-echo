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
 * TicketingAgency
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class TicketingAgency  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("ProductRef")
  @Valid
  private java.util.List<String> productRef = null;

  @JsonProperty("SegmentSequenceList")
  @Valid
  private java.util.List<Integer> segmentSequenceList = null;

  public TicketingAgency _atType(String _atType) {
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

  public TicketingAgency code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code of the ticketing agency
   * @return code
   **/
  @Schema(required = true, description = "The code of the ticketing agency")
      @NotNull

  @Pattern(regexp="([a-zA-Z0-9]{2,10})") @Size(min=2,max=10)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TicketingAgency productRef(java.util.List<String> productRef) {
    this.productRef = productRef;
    return this;
  }

  public TicketingAgency addProductRefItem(String productRefItem) {
    if (this.productRef == null) {
      this.productRef = new java.util.ArrayList<>();
    }
    this.productRef.add(productRefItem);
    return this;
  }

  /**
   * The Product Ref the TicketingAgency applies to
   * @return productRef
   **/
  @Schema(description = "The Product Ref the TicketingAgency applies to")
  
    public java.util.List<String> getProductRef() {
    return productRef;
  }

  public void setProductRef(java.util.List<String> productRef) {
    this.productRef = productRef;
  }

  public TicketingAgency segmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
    return this;
  }

  public TicketingAgency addSegmentSequenceListItem(Integer segmentSequenceListItem) {
    if (this.segmentSequenceList == null) {
      this.segmentSequenceList = new java.util.ArrayList<>();
    }
    this.segmentSequenceList.add(segmentSequenceListItem);
    return this;
  }

  /**
   * The segmentSequenceList the TicketingAgency applies to
   * @return segmentSequenceList
   **/
  @Schema(description = "The segmentSequenceList the TicketingAgency applies to")
  
    public java.util.List<Integer> getSegmentSequenceList() {
    return segmentSequenceList;
  }

  public void setSegmentSequenceList(java.util.List<Integer> segmentSequenceList) {
    this.segmentSequenceList = segmentSequenceList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketingAgency ticketingAgency = (TicketingAgency) o;
    return Objects.equals(this._atType, ticketingAgency._atType) &&
        Objects.equals(this.code, ticketingAgency.code) &&
        Objects.equals(this.productRef, ticketingAgency.productRef) &&
        Objects.equals(this.segmentSequenceList, ticketingAgency.segmentSequenceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, code, productRef, segmentSequenceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingAgency {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    segmentSequenceList: ").append(toIndentedString(segmentSequenceList)).append("\n");
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
