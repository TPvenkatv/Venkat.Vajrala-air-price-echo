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
 * FareRuleInfo
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = FareRuleInfoStructured.class, name = "FareRuleInfoStructured"),
        @JsonSubTypes.Type(value = FareRuleInfoText.class, name = "FareRuleInfoText"),
})


public class FareRuleInfo  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("flightsRefs")
  @Valid
  private java.util.List<String> flightsRefs = null;

  @JsonProperty("ruleNumber")
  private String ruleNumber = null;

  @JsonProperty("tariffNumber")
  private String tariffNumber = null;

  public FareRuleInfo _atType(String _atType) {
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

  public FareRuleInfo flightsRefs(java.util.List<String> flightsRefs) {
    this.flightsRefs = flightsRefs;
    return this;
  }

  public FareRuleInfo addFlightsRefsItem(String flightsRefsItem) {
    if (this.flightsRefs == null) {
      this.flightsRefs = new java.util.ArrayList<>();
    }
    this.flightsRefs.add(flightsRefsItem);
    return this;
  }

  /**
   * The flight refs associated to this fare rule info
   * @return flightsRefs
   **/
  @Schema(description = "The flight refs associated to this fare rule info")
  
    public java.util.List<String> getFlightsRefs() {
    return flightsRefs;
  }

  public void setFlightsRefs(java.util.List<String> flightsRefs) {
    this.flightsRefs = flightsRefs;
  }

  public FareRuleInfo ruleNumber(String ruleNumber) {
    this.ruleNumber = ruleNumber;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return ruleNumber
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getRuleNumber() {
    return ruleNumber;
  }

  public void setRuleNumber(String ruleNumber) {
    this.ruleNumber = ruleNumber;
  }

  public FareRuleInfo tariffNumber(String tariffNumber) {
    this.tariffNumber = tariffNumber;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return tariffNumber
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getTariffNumber() {
    return tariffNumber;
  }

  public void setTariffNumber(String tariffNumber) {
    this.tariffNumber = tariffNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareRuleInfo fareRuleInfo = (FareRuleInfo) o;
    return Objects.equals(this._atType, fareRuleInfo._atType) &&
        Objects.equals(this.flightsRefs, fareRuleInfo.flightsRefs) &&
        Objects.equals(this.ruleNumber, fareRuleInfo.ruleNumber) &&
        Objects.equals(this.tariffNumber, fareRuleInfo.tariffNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, flightsRefs, ruleNumber, tariffNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareRuleInfo {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    flightsRefs: ").append(toIndentedString(flightsRefs)).append("\n");
    sb.append("    ruleNumber: ").append(toIndentedString(ruleNumber)).append("\n");
    sb.append("    tariffNumber: ").append(toIndentedString(tariffNumber)).append("\n");
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
