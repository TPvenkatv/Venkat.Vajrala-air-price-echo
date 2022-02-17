package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CustomerLoyalty;
import com.travelport.air.offerresource.model.TravelerGeographicLocation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerCriteria
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class PassengerCriteria  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("passengerTypeCode")
  private String passengerTypeCode = null;

  @JsonProperty("CustomerLoyalty")
  @Valid
  private java.util.List<CustomerLoyalty> customerLoyalty = null;

  @JsonProperty("TravelerGeographicLocation")
  private TravelerGeographicLocation travelerGeographicLocation = null;

  @JsonProperty("specifiedPassengerTypeCodeOnlyInd")
  private Boolean specifiedPassengerTypeCodeOnlyInd = null;

  public PassengerCriteria _atType(String _atType) {
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

  public PassengerCriteria number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return number
   **/
  @Schema(description = "Assigned Type: c-1100:NonnegativeInteger")
  
  @Min(0)  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PassengerCriteria age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberDoubleDigit
   * @return age
   **/
  @Schema(description = "Assigned Type: c-1100:NumberDoubleDigit")
  
    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public PassengerCriteria passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:PassengerTypeCode
   * @return passengerTypeCode
   **/
  @Schema(description = "Assigned Type: c-1100:PassengerTypeCode")
  
  @Pattern(regexp="([a-zA-Z0-9]{3,5})") @Size(min=3,max=5)   public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public PassengerCriteria customerLoyalty(java.util.List<CustomerLoyalty> customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
    return this;
  }

  public PassengerCriteria addCustomerLoyaltyItem(CustomerLoyalty customerLoyaltyItem) {
    if (this.customerLoyalty == null) {
      this.customerLoyalty = new java.util.ArrayList<>();
    }
    this.customerLoyalty.add(customerLoyaltyItem);
    return this;
  }

  /**
   * Get customerLoyalty
   * @return customerLoyalty
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<CustomerLoyalty> getCustomerLoyalty() {
    return customerLoyalty;
  }

  public void setCustomerLoyalty(java.util.List<CustomerLoyalty> customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
  }

  public PassengerCriteria travelerGeographicLocation(TravelerGeographicLocation travelerGeographicLocation) {
    this.travelerGeographicLocation = travelerGeographicLocation;
    return this;
  }

  /**
   * Get travelerGeographicLocation
   * @return travelerGeographicLocation
   **/
  @Schema(description = "")
  
    @Valid
    public TravelerGeographicLocation getTravelerGeographicLocation() {
    return travelerGeographicLocation;
  }

  public void setTravelerGeographicLocation(TravelerGeographicLocation travelerGeographicLocation) {
    this.travelerGeographicLocation = travelerGeographicLocation;
  }

  public PassengerCriteria specifiedPassengerTypeCodeOnlyInd(Boolean specifiedPassengerTypeCodeOnlyInd) {
    this.specifiedPassengerTypeCodeOnlyInd = specifiedPassengerTypeCodeOnlyInd;
    return this;
  }

  /**
   * If true then the Offering/Offer will only be returned for the specific passengerTypeCode
   * @return specifiedPassengerTypeCodeOnlyInd
   **/
  @Schema(description = "If true then the Offering/Offer will only be returned for the specific passengerTypeCode")
  
    public Boolean isSpecifiedPassengerTypeCodeOnlyInd() {
    return specifiedPassengerTypeCodeOnlyInd;
  }

  public void setSpecifiedPassengerTypeCodeOnlyInd(Boolean specifiedPassengerTypeCodeOnlyInd) {
    this.specifiedPassengerTypeCodeOnlyInd = specifiedPassengerTypeCodeOnlyInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerCriteria passengerCriteria = (PassengerCriteria) o;
    return Objects.equals(this._atType, passengerCriteria._atType) &&
        Objects.equals(this.number, passengerCriteria.number) &&
        Objects.equals(this.age, passengerCriteria.age) &&
        Objects.equals(this.passengerTypeCode, passengerCriteria.passengerTypeCode) &&
        Objects.equals(this.customerLoyalty, passengerCriteria.customerLoyalty) &&
        Objects.equals(this.travelerGeographicLocation, passengerCriteria.travelerGeographicLocation) &&
        Objects.equals(this.specifiedPassengerTypeCodeOnlyInd, passengerCriteria.specifiedPassengerTypeCodeOnlyInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, number, age, passengerTypeCode, customerLoyalty, travelerGeographicLocation, specifiedPassengerTypeCodeOnlyInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerCriteria {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
    sb.append("    customerLoyalty: ").append(toIndentedString(customerLoyalty)).append("\n");
    sb.append("    travelerGeographicLocation: ").append(toIndentedString(travelerGeographicLocation)).append("\n");
    sb.append("    specifiedPassengerTypeCodeOnlyInd: ").append(toIndentedString(specifiedPassengerTypeCodeOnlyInd)).append("\n");
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
