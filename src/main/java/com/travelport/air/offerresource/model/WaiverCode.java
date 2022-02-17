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
 * WaiverCode
 */
@Validated


public class WaiverCode  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("reasonCode")
  private Integer reasonCode = null;

  public WaiverCode value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=128)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public WaiverCode reasonCode(Integer reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * A code assigned to identify the reason for disruption
   * @return reasonCode
   **/
  @Schema(description = "A code assigned to identify the reason for disruption")
  
    public Integer getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(Integer reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaiverCode waiverCode = (WaiverCode) o;
    return Objects.equals(this.value, waiverCode.value) &&
        Objects.equals(this.reasonCode, waiverCode.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, reasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaiverCode {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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
