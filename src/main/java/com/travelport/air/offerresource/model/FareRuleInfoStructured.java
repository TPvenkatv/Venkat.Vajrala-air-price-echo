package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.FareRuleInfo;
import com.travelport.air.offerresource.model.StructuredFareRules;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareRuleInfoStructured
 */
@Validated


public class FareRuleInfoStructured extends FareRuleInfo implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("StructuredFareRules")
  @Valid
  private java.util.List<StructuredFareRules> structuredFareRules = new java.util.ArrayList<>();

  public FareRuleInfoStructured structuredFareRules(java.util.List<StructuredFareRules> structuredFareRules) {
    this.structuredFareRules = structuredFareRules;
    return this;
  }

  public FareRuleInfoStructured addStructuredFareRulesItem(StructuredFareRules structuredFareRulesItem) {
    this.structuredFareRules.add(structuredFareRulesItem);
    return this;
  }

  /**
   * Get structuredFareRules
   * @return structuredFareRules
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<StructuredFareRules> getStructuredFareRules() {
    return structuredFareRules;
  }

  public void setStructuredFareRules(java.util.List<StructuredFareRules> structuredFareRules) {
    this.structuredFareRules = structuredFareRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareRuleInfoStructured fareRuleInfoStructured = (FareRuleInfoStructured) o;
    return Objects.equals(this.structuredFareRules, fareRuleInfoStructured.structuredFareRules) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structuredFareRules, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareRuleInfoStructured {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    structuredFareRules: ").append(toIndentedString(structuredFareRules)).append("\n");
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
