package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CustomerLoyalty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerLoyaltyCredit
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CustomerLoyaltyCredit  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("CustomerLoyalty")
  private CustomerLoyalty customerLoyalty = null;

  @JsonProperty("Earned")
  private String earned = null;

  @JsonProperty("Status")
  private String status = null;

  public CustomerLoyaltyCredit _atType(String _atType) {
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

  public CustomerLoyaltyCredit customerLoyalty(CustomerLoyalty customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
    return this;
  }

  /**
   * Get customerLoyalty
   * @return customerLoyalty
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CustomerLoyalty getCustomerLoyalty() {
    return customerLoyalty;
  }

  public void setCustomerLoyalty(CustomerLoyalty customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
  }

  public CustomerLoyaltyCredit earned(String earned) {
    this.earned = earned;
    return this;
  }

  /**
   * Represents the amount of award credit awarded for this offer/offering. Award credit can be used for purchasing goods and services through a customer loyalty program
   * @return earned
   **/
  @Schema(required = true, description = "Represents the amount of award credit awarded for this offer/offering. Award credit can be used for purchasing goods and services through a customer loyalty program")
      @NotNull

  @Size(max=32)   public String getEarned() {
    return earned;
  }

  public void setEarned(String earned) {
    this.earned = earned;
  }

  public CustomerLoyaltyCredit status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Represents the amount of status credit awarded for this offer/offering. Status credit allow a customer to move up the ladder of a customer loyalty program
   * @return status
   **/
  @Schema(required = true, description = "Represents the amount of status credit awarded for this offer/offering. Status credit allow a customer to move up the ladder of a customer loyalty program")
      @NotNull

  @Size(max=32)   public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLoyaltyCredit customerLoyaltyCredit = (CustomerLoyaltyCredit) o;
    return Objects.equals(this._atType, customerLoyaltyCredit._atType) &&
        Objects.equals(this.customerLoyalty, customerLoyaltyCredit.customerLoyalty) &&
        Objects.equals(this.earned, customerLoyaltyCredit.earned) &&
        Objects.equals(this.status, customerLoyaltyCredit.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, customerLoyalty, earned, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLoyaltyCredit {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    customerLoyalty: ").append(toIndentedString(customerLoyalty)).append("\n");
    sb.append("    earned: ").append(toIndentedString(earned)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
