package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.NextStep;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NextSteps
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class NextSteps  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("baseURI")
  private String baseURI = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("NextStep")
  @Valid
  private java.util.List<NextStep> nextStep = new java.util.ArrayList<>();

  public NextSteps _atType(String _atType) {
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

  public NextSteps baseURI(String baseURI) {
    this.baseURI = baseURI;
    return this;
  }

  /**
   * The base portion of the uri in order to shorten the uri's in the individual steps
   * @return baseURI
   **/
  @Schema(required = true, description = "The base portion of the uri in order to shorten the uri's in the individual steps")
      @NotNull

    public String getBaseURI() {
    return baseURI;
  }

  public void setBaseURI(String baseURI) {
    this.baseURI = baseURI;
  }

  public NextSteps id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional internally referenced id
   * @return id
   **/
  @Schema(description = "Optional internally referenced id")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NextSteps nextStep(java.util.List<NextStep> nextStep) {
    this.nextStep = nextStep;
    return this;
  }

  public NextSteps addNextStepItem(NextStep nextStepItem) {
    this.nextStep.add(nextStepItem);
    return this;
  }

  /**
   * Get nextStep
   * @return nextStep
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=20)   public java.util.List<NextStep> getNextStep() {
    return nextStep;
  }

  public void setNextStep(java.util.List<NextStep> nextStep) {
    this.nextStep = nextStep;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextSteps nextSteps = (NextSteps) o;
    return Objects.equals(this._atType, nextSteps._atType) &&
        Objects.equals(this.baseURI, nextSteps.baseURI) &&
        Objects.equals(this.id, nextSteps.id) &&
        Objects.equals(this.nextStep, nextSteps.nextStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, baseURI, id, nextStep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextSteps {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    baseURI: ").append(toIndentedString(baseURI)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextStep: ").append(toIndentedString(nextStep)).append("\n");
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
