package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BrandID;
import com.travelport.air.offerresource.model.CabinAirEnum;
import com.travelport.air.offerresource.model.CustomerLoyaltyCredit;
import com.travelport.air.offerresource.model.FareTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightProduct
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class FlightProduct  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("segmentSequence")
  @Valid
  private java.util.List<Integer> segmentSequence = new java.util.ArrayList<>();

  @JsonProperty("classOfService")
  private String classOfService = null;

  @JsonProperty("cabin")
  private CabinAirEnum cabin = null;

  @JsonProperty("fareBasisCode")
  private String fareBasisCode = null;

  @JsonProperty("fareType")
  private FareTypeEnum fareType = null;

  @JsonProperty("carCode")
  private String carCode = null;

  @JsonProperty("valueCode")
  private String valueCode = null;

  @JsonProperty("Brand")
  private BrandID brand = null;

  @JsonProperty("CustomerLoyaltyCredit")
  @Valid
  private java.util.List<CustomerLoyaltyCredit> customerLoyaltyCredit = null;

  public FlightProduct _atType(String _atType) {
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

  public FlightProduct segmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
    return this;
  }

  public FlightProduct addSegmentSequenceItem(Integer segmentSequenceItem) {
    this.segmentSequence.add(segmentSequenceItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequenceList
   * @return segmentSequence
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:SegmentSequenceList")
      @NotNull

    public java.util.List<Integer> getSegmentSequence() {
    return segmentSequence;
  }

  public void setSegmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
  }

  public FlightProduct classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

  /**
   * Assigned Type: c-1100:ClassOfService
   * @return classOfService
   **/
  @Schema(description = "Assigned Type: c-1100:ClassOfService")
  
  @Pattern(regexp="([a-zA-Z0-9]{1,2})") @Size(min=1,max=2)   public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public FlightProduct cabin(CabinAirEnum cabin) {
    this.cabin = cabin;
    return this;
  }

  /**
   * Get cabin
   * @return cabin
   **/
  @Schema(description = "")
  
    @Valid
    public CabinAirEnum getCabin() {
    return cabin;
  }

  public void setCabin(CabinAirEnum cabin) {
    this.cabin = cabin;
  }

  public FlightProduct fareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return fareBasisCode
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getFareBasisCode() {
    return fareBasisCode;
  }

  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }

  public FlightProduct fareType(FareTypeEnum fareType) {
    this.fareType = fareType;
    return this;
  }

  /**
   * Get fareType
   * @return fareType
   **/
  @Schema(description = "")
  
    @Valid
    public FareTypeEnum getFareType() {
    return fareType;
  }

  public void setFareType(FareTypeEnum fareType) {
    this.fareType = fareType;
  }

  public FlightProduct carCode(String carCode) {
    this.carCode = carCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return carCode
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getCarCode() {
    return carCode;
  }

  public void setCarCode(String carCode) {
    this.carCode = carCode;
  }

  public FlightProduct valueCode(String valueCode) {
    this.valueCode = valueCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return valueCode
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getValueCode() {
    return valueCode;
  }

  public void setValueCode(String valueCode) {
    this.valueCode = valueCode;
  }

  public FlightProduct brand(BrandID brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   **/
  @Schema(description = "")
  
    @Valid
    public BrandID getBrand() {
    return brand;
  }

  public void setBrand(BrandID brand) {
    this.brand = brand;
  }

  public FlightProduct customerLoyaltyCredit(java.util.List<CustomerLoyaltyCredit> customerLoyaltyCredit) {
    this.customerLoyaltyCredit = customerLoyaltyCredit;
    return this;
  }

  public FlightProduct addCustomerLoyaltyCreditItem(CustomerLoyaltyCredit customerLoyaltyCreditItem) {
    if (this.customerLoyaltyCredit == null) {
      this.customerLoyaltyCredit = new java.util.ArrayList<>();
    }
    this.customerLoyaltyCredit.add(customerLoyaltyCreditItem);
    return this;
  }

  /**
   * Get customerLoyaltyCredit
   * @return customerLoyaltyCredit
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<CustomerLoyaltyCredit> getCustomerLoyaltyCredit() {
    return customerLoyaltyCredit;
  }

  public void setCustomerLoyaltyCredit(java.util.List<CustomerLoyaltyCredit> customerLoyaltyCredit) {
    this.customerLoyaltyCredit = customerLoyaltyCredit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightProduct flightProduct = (FlightProduct) o;
    return Objects.equals(this._atType, flightProduct._atType) &&
        Objects.equals(this.segmentSequence, flightProduct.segmentSequence) &&
        Objects.equals(this.classOfService, flightProduct.classOfService) &&
        Objects.equals(this.cabin, flightProduct.cabin) &&
        Objects.equals(this.fareBasisCode, flightProduct.fareBasisCode) &&
        Objects.equals(this.fareType, flightProduct.fareType) &&
        Objects.equals(this.carCode, flightProduct.carCode) &&
        Objects.equals(this.valueCode, flightProduct.valueCode) &&
        Objects.equals(this.brand, flightProduct.brand) &&
        Objects.equals(this.customerLoyaltyCredit, flightProduct.customerLoyaltyCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, segmentSequence, classOfService, cabin, fareBasisCode, fareType, carCode, valueCode, brand, customerLoyaltyCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightProduct {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    segmentSequence: ").append(toIndentedString(segmentSequence)).append("\n");
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
    sb.append("    fareType: ").append(toIndentedString(fareType)).append("\n");
    sb.append("    carCode: ").append(toIndentedString(carCode)).append("\n");
    sb.append("    valueCode: ").append(toIndentedString(valueCode)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    customerLoyaltyCredit: ").append(toIndentedString(customerLoyaltyCredit)).append("\n");
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
