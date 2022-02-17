package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.RefundabilityEnumBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundabilityEnum
 */
@Validated


public class RefundabilityEnum  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private RefundabilityEnumBase value = null;

  @JsonProperty("extension")
  private String extension = null;

  public RefundabilityEnum value(RefundabilityEnumBase value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public RefundabilityEnumBase getValue() {
    return value;
  }

  public void setValue(RefundabilityEnumBase value) {
    this.value = value;
  }

  public RefundabilityEnum extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
   **/
  @Schema(description = "")
  
  @Size(min=1,max=128)   public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundabilityEnum refundabilityEnum = (RefundabilityEnum) o;
    return Objects.equals(this.value, refundabilityEnum.value) &&
        Objects.equals(this.extension, refundabilityEnum.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundabilityEnum {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
