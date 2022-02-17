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
 * Specifies the ID for the membership program.
 */
@Schema(description = "Specifies the ID for the membership program.")
@Validated


public class CustomerLoyalty  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("programId")
  private String programId = null;

  @JsonProperty("programName")
  private String programName = null;

  @JsonProperty("supplierType")
  private String supplierType = null;

  @JsonProperty("supplier")
  private String supplier = null;

  @JsonProperty("tier")
  private String tier = null;

  @JsonProperty("shareWithSupplier")
  @Valid
  private java.util.List<String> shareWithSupplier = null;

  @JsonProperty("cardHolderName")
  private String cardHolderName = null;

  @JsonProperty("validatedInd")
  private Boolean validatedInd = null;

  public CustomerLoyalty value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(min=1,max=1000)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CustomerLoyalty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Customer Loyality Id
   * @return id
   **/
  @Schema(description = "Customer Loyality Id")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerLoyalty priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Assigned Type: c-1100:Priority
   * minimum: 0
   * maximum: 300
   * @return priority
   **/
  @Schema(description = "Assigned Type: c-1100:Priority")
  
  @Min(0) @Max(300)   public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public CustomerLoyalty programId(String programId) {
    this.programId = programId;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return programId
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public CustomerLoyalty programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * Assigned Type: c-1100:LoyaltyProgramName
   * @return programName
   **/
  @Schema(description = "Assigned Type: c-1100:LoyaltyProgramName")
  
  @Size(max=128)   public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public CustomerLoyalty supplierType(String supplierType) {
    this.supplierType = supplierType;
    return this;
  }

  /**
   * Assigned Type: c-1100:LoyaltySupplierType
   * @return supplierType
   **/
  @Schema(description = "Assigned Type: c-1100:LoyaltySupplierType")
  
  @Size(max=32)   public String getSupplierType() {
    return supplierType;
  }

  public void setSupplierType(String supplierType) {
    this.supplierType = supplierType;
  }

  public CustomerLoyalty supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Assigned Type: c-1100:LoyaltySupplier
   * @return supplier
   **/
  @Schema(description = "Assigned Type: c-1100:LoyaltySupplier")
  
  @Size(max=128)   public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public CustomerLoyalty tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return tier
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public CustomerLoyalty shareWithSupplier(java.util.List<String> shareWithSupplier) {
    this.shareWithSupplier = shareWithSupplier;
    return this;
  }

  public CustomerLoyalty addShareWithSupplierItem(String shareWithSupplierItem) {
    if (this.shareWithSupplier == null) {
      this.shareWithSupplier = new java.util.ArrayList<>();
    }
    this.shareWithSupplier.add(shareWithSupplierItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:TinyStrings
   * @return shareWithSupplier
   **/
  @Schema(description = "Assigned Type: c-1100:TinyStrings")
  
    public java.util.List<String> getShareWithSupplier() {
    return shareWithSupplier;
  }

  public void setShareWithSupplier(java.util.List<String> shareWithSupplier) {
    this.shareWithSupplier = shareWithSupplier;
  }

  public CustomerLoyalty cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return cardHolderName
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public CustomerLoyalty validatedInd(Boolean validatedInd) {
    this.validatedInd = validatedInd;
    return this;
  }

  /**
   * Customer loyalty number has been validated by the supplier
   * @return validatedInd
   **/
  @Schema(description = "Customer loyalty number has been validated by the supplier")
  
    public Boolean isValidatedInd() {
    return validatedInd;
  }

  public void setValidatedInd(Boolean validatedInd) {
    this.validatedInd = validatedInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLoyalty customerLoyalty = (CustomerLoyalty) o;
    return Objects.equals(this.value, customerLoyalty.value) &&
        Objects.equals(this.id, customerLoyalty.id) &&
        Objects.equals(this.priority, customerLoyalty.priority) &&
        Objects.equals(this.programId, customerLoyalty.programId) &&
        Objects.equals(this.programName, customerLoyalty.programName) &&
        Objects.equals(this.supplierType, customerLoyalty.supplierType) &&
        Objects.equals(this.supplier, customerLoyalty.supplier) &&
        Objects.equals(this.tier, customerLoyalty.tier) &&
        Objects.equals(this.shareWithSupplier, customerLoyalty.shareWithSupplier) &&
        Objects.equals(this.cardHolderName, customerLoyalty.cardHolderName) &&
        Objects.equals(this.validatedInd, customerLoyalty.validatedInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, id, priority, programId, programName, supplierType, supplier, tier, shareWithSupplier, cardHolderName, validatedInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLoyalty {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    supplierType: ").append(toIndentedString(supplierType)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    shareWithSupplier: ").append(toIndentedString(shareWithSupplier)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    validatedInd: ").append(toIndentedString(validatedInd)).append("\n");
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
