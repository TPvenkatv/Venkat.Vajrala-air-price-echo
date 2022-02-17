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
 * A description of the ancillary with two description codes
 */
@Schema(description = "A description of the ancillary with two description codes")
@Validated


public class AncillaryDescription  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("subCode")
  private String subCode = null;

  @JsonProperty("codeContext")
  private String codeContext = null;

  public AncillaryDescription value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=512)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AncillaryDescription code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringUpperCaseAlphaNumericMax10
   * @return code
   **/
  @Schema(description = "Assigned Type: c-1100:StringUpperCaseAlphaNumericMax10")
  
  @Pattern(regexp="([A-Z0-9]+)?") @Size(max=10)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AncillaryDescription subCode(String subCode) {
    this.subCode = subCode;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringUpperCaseAlphaNumericMax10
   * @return subCode
   **/
  @Schema(description = "Assigned Type: c-1100:StringUpperCaseAlphaNumericMax10")
  
  @Pattern(regexp="([A-Z0-9]+)?") @Size(max=10)   public String getSubCode() {
    return subCode;
  }

  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }

  public AncillaryDescription codeContext(String codeContext) {
    this.codeContext = codeContext;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return codeContext
   **/
  @Schema(description = "Assigned Type: c-1100:CodeContext")
  
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
    AncillaryDescription ancillaryDescription = (AncillaryDescription) o;
    return Objects.equals(this.value, ancillaryDescription.value) &&
        Objects.equals(this.code, ancillaryDescription.code) &&
        Objects.equals(this.subCode, ancillaryDescription.subCode) &&
        Objects.equals(this.codeContext, ancillaryDescription.codeContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, code, subCode, codeContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncillaryDescription {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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
