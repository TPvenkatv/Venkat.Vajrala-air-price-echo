package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.FareQualifierEnumBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareQualifierEnum
 */
@Validated


public class FareQualifierEnum  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private FareQualifierEnumBase value = null;

  @JsonProperty("extension")
  private String extension = null;

  public FareQualifierEnum value(FareQualifierEnumBase value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public FareQualifierEnumBase getValue() {
    return value;
  }

  public void setValue(FareQualifierEnumBase value) {
    this.value = value;
  }

  public FareQualifierEnum extension(String extension) {
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
    FareQualifierEnum fareQualifierEnum = (FareQualifierEnum) o;
    return Objects.equals(this.value, fareQualifierEnum.value) &&
        Objects.equals(this.extension, fareQualifierEnum.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareQualifierEnum {\n");
    
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
