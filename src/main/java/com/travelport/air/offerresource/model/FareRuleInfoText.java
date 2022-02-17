package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.FareRuleInfo;
import com.travelport.air.offerresource.model.TextFareRule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareRuleInfoText
 */
@Validated


public class FareRuleInfoText extends FareRuleInfo implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("TextFareRule")
  @Valid
  private java.util.List<TextFareRule> textFareRule = new java.util.ArrayList<>();

  public FareRuleInfoText textFareRule(java.util.List<TextFareRule> textFareRule) {
    this.textFareRule = textFareRule;
    return this;
  }

  public FareRuleInfoText addTextFareRuleItem(TextFareRule textFareRuleItem) {
    this.textFareRule.add(textFareRuleItem);
    return this;
  }

  /**
   * Get textFareRule
   * @return textFareRule
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=100)   public java.util.List<TextFareRule> getTextFareRule() {
    return textFareRule;
  }

  public void setTextFareRule(java.util.List<TextFareRule> textFareRule) {
    this.textFareRule = textFareRule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareRuleInfoText fareRuleInfoText = (FareRuleInfoText) o;
    return Objects.equals(this.textFareRule, fareRuleInfoText.textFareRule) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFareRule, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareRuleInfoText {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    textFareRule: ").append(toIndentedString(textFareRule)).append("\n");
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
