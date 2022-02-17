package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.NextStepMethodEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A URL that describes a step that can be applied to the resource containing the next step structure.
 */
@Schema(description = "A URL that describes a step that can be applied to the resource containing the next step structure.")
@Validated


public class NextStep  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("method")
  private NextStepMethodEnum method = null;

  @JsonProperty("description")
  private String description = null;

  public NextStep value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NextStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for the Next Step
   * @return id
   **/
  @Schema(description = "Identifier for the Next Step")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NextStep action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return action
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:StringTiny")
      @NotNull

  @Size(max=32)   public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public NextStep method(NextStepMethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public NextStepMethodEnum getMethod() {
    return method;
  }

  public void setMethod(NextStepMethodEnum method) {
    this.method = method;
  }

  public NextStep description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return description
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextStep nextStep = (NextStep) o;
    return Objects.equals(this.value, nextStep.value) &&
        Objects.equals(this.id, nextStep.id) &&
        Objects.equals(this.action, nextStep.action) &&
        Objects.equals(this.method, nextStep.method) &&
        Objects.equals(this.description, nextStep.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, id, action, method, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextStep {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
