package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.CustomerLoyalty;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.TermsAndConditionsFullID;
import com.travelport.air.offerresource.model.TextBlock;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TermsAndConditionsFull
 */
@Validated


public class TermsAndConditionsFull extends TermsAndConditionsFullID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ExpiryDate")
  private OffsetDateTime expiryDate = null;

  @JsonProperty("CustomerLoyalty")
  @Valid
  private java.util.List<CustomerLoyalty> customerLoyalty = null;

  @JsonProperty("TextBlock")
  @Valid
  private java.util.List<TextBlock> textBlock = null;

  public TermsAndConditionsFull expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * The data and time range that the Offer is valid.
   * @return expiryDate
   **/
  @Schema(description = "The data and time range that the Offer is valid.")
  
    @Valid
    public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public TermsAndConditionsFull customerLoyalty(java.util.List<CustomerLoyalty> customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
    return this;
  }

  public TermsAndConditionsFull addCustomerLoyaltyItem(CustomerLoyalty customerLoyaltyItem) {
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
  @Size(max=5)   public java.util.List<CustomerLoyalty> getCustomerLoyalty() {
    return customerLoyalty;
  }

  public void setCustomerLoyalty(java.util.List<CustomerLoyalty> customerLoyalty) {
    this.customerLoyalty = customerLoyalty;
  }

  public TermsAndConditionsFull textBlock(java.util.List<TextBlock> textBlock) {
    this.textBlock = textBlock;
    return this;
  }

  public TermsAndConditionsFull addTextBlockItem(TextBlock textBlockItem) {
    if (this.textBlock == null) {
      this.textBlock = new java.util.ArrayList<>();
    }
    this.textBlock.add(textBlockItem);
    return this;
  }

  /**
   * Get textBlock
   * @return textBlock
   **/
  @Schema(description = "")
      @Valid
  @Size(max=50)   public java.util.List<TextBlock> getTextBlock() {
    return textBlock;
  }

  public void setTextBlock(java.util.List<TextBlock> textBlock) {
    this.textBlock = textBlock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditionsFull termsAndConditionsFull = (TermsAndConditionsFull) o;
    return Objects.equals(this.expiryDate, termsAndConditionsFull.expiryDate) &&
        Objects.equals(this.customerLoyalty, termsAndConditionsFull.customerLoyalty) &&
        Objects.equals(this.textBlock, termsAndConditionsFull.textBlock) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, customerLoyalty, textBlock, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditionsFull {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    customerLoyalty: ").append(toIndentedString(customerLoyalty)).append("\n");
    sb.append("    textBlock: ").append(toIndentedString(textBlock)).append("\n");
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
