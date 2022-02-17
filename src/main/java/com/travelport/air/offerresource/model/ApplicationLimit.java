package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.ApplicableLevelEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationLimit
 */
@Validated


public class ApplicationLimit  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private ApplicableLevelEnum value = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  public ApplicationLimit value(ApplicableLevelEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public ApplicableLevelEnum getValue() {
    return value;
  }

  public void setValue(ApplicableLevelEnum value) {
    this.value = value;
  }

  public ApplicationLimit start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return start
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public ApplicationLimit end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return end
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLimit applicationLimit = (ApplicationLimit) o;
    return Objects.equals(this.value, applicationLimit.value) &&
        Objects.equals(this.start, applicationLimit.start) &&
        Objects.equals(this.end, applicationLimit.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLimit {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
