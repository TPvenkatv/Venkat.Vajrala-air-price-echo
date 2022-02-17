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
 * Corporate or Other discount
 */
@Schema(description = "Corporate or Other discount")
@Validated


public class Discount  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("codeAuthority")
  private String codeAuthority = null;

  @JsonProperty("decimalPlace")
  private Integer decimalPlace = null;

  @JsonProperty("decimalAuthority")
  private String decimalAuthority = null;

  public Discount value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Discount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return description
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Discount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyCode
   * @return currencyCode
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CurrencyCode")
      @NotNull

  @Pattern(regexp="[a-zA-Z]{3}")   public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Discount codeAuthority(String codeAuthority) {
    this.codeAuthority = codeAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return codeAuthority
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CodeContext")
      @NotNull

  @Size(max=32)   public String getCodeAuthority() {
    return codeAuthority;
  }

  public void setCodeAuthority(String codeAuthority) {
    this.codeAuthority = codeAuthority;
  }

  public Discount decimalPlace(Integer decimalPlace) {
    this.decimalPlace = decimalPlace;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyMinorUnit
   * minimum: 0
   * @return decimalPlace
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CurrencyMinorUnit")
      @NotNull

  @Min(0)  public Integer getDecimalPlace() {
    return decimalPlace;
  }

  public void setDecimalPlace(Integer decimalPlace) {
    this.decimalPlace = decimalPlace;
  }

  public Discount decimalAuthority(String decimalAuthority) {
    this.decimalAuthority = decimalAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return decimalAuthority
   **/
  @Schema(description = "Assigned Type: c-1100:CodeContext")
  
  @Size(max=32)   public String getDecimalAuthority() {
    return decimalAuthority;
  }

  public void setDecimalAuthority(String decimalAuthority) {
    this.decimalAuthority = decimalAuthority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return Objects.equals(this.value, discount.value) &&
        Objects.equals(this.description, discount.description) &&
        Objects.equals(this.currencyCode, discount.currencyCode) &&
        Objects.equals(this.codeAuthority, discount.codeAuthority) &&
        Objects.equals(this.decimalPlace, discount.decimalPlace) &&
        Objects.equals(this.decimalAuthority, discount.decimalAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, description, currencyCode, codeAuthority, decimalPlace, decimalAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    codeAuthority: ").append(toIndentedString(codeAuthority)).append("\n");
    sb.append("    decimalPlace: ").append(toIndentedString(decimalPlace)).append("\n");
    sb.append("    decimalAuthority: ").append(toIndentedString(decimalAuthority)).append("\n");
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
