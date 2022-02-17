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
 * PenaltySourceCode
 */
@Validated


public class PenaltySourceCode  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("codeContext")
  private String codeContext = null;

  public PenaltySourceCode value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=32)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PenaltySourceCode codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return codeContext
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getCodeContext() {
    return codeContext;
  }

  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PenaltySourceCode penaltySourceCode = (PenaltySourceCode) o;
    return Objects.equals(this.value, penaltySourceCode.value) &&
        Objects.equals(this.codeContext, penaltySourceCode.codeContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, codeContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PenaltySourceCode {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
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
