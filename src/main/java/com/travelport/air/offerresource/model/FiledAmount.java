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
 * The base amount of a ticketPrice that is filed in local currency
 */
@Schema(description = "The base amount of a ticketPrice that is filed in local currency")
@Validated


public class FiledAmount  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("codeAuthority")
  private String codeAuthority = null;

  @JsonProperty("decimalPlace")
  private Integer decimalPlace = null;

  @JsonProperty("decimalAuthority")
  private String decimalAuthority = null;

  public FiledAmount value(Float value) {
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

  public FiledAmount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:CurrencyCode
   * @return currencyCode
   **/
  @Schema(description = "Assigned Type: c-1100:CurrencyCode")
  
  @Pattern(regexp="[a-zA-Z]{3}")   public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FiledAmount codeAuthority(String codeAuthority) {
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

  public FiledAmount decimalPlace(Integer decimalPlace) {
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

  public FiledAmount decimalAuthority(String decimalAuthority) {
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
    FiledAmount filedAmount = (FiledAmount) o;
    return Objects.equals(this.value, filedAmount.value) &&
        Objects.equals(this.currencyCode, filedAmount.currencyCode) &&
        Objects.equals(this.codeAuthority, filedAmount.codeAuthority) &&
        Objects.equals(this.decimalPlace, filedAmount.decimalPlace) &&
        Objects.equals(this.decimalAuthority, filedAmount.decimalAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyCode, codeAuthority, decimalPlace, decimalAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiledAmount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
