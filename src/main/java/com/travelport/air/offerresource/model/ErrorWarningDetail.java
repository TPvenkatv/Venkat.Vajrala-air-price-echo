package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.ErrorWarning;
import com.travelport.air.offerresource.model.NameValuePair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorWarningDetail
 */
@Validated


public class ErrorWarningDetail extends ErrorWarning implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("SourceID")
  private String sourceID = null;

  @JsonProperty("SourceCode")
  private String sourceCode = null;

  @JsonProperty("SourceDescription")
  private String sourceDescription = null;

  public ErrorWarningDetail sourceID(String sourceID) {
    this.sourceID = sourceID;
    return this;
  }

  /**
   * The identifier of the source system sending the error or warning
   * @return sourceID
   **/
  @Schema(required = true, description = "The identifier of the source system sending the error or warning")
      @NotNull

  @Size(max=128)   public String getSourceID() {
    return sourceID;
  }

  public void setSourceID(String sourceID) {
    this.sourceID = sourceID;
  }

  public ErrorWarningDetail sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  /**
   * The error or warning code returned by the source airline or host system
   * @return sourceCode
   **/
  @Schema(description = "The error or warning code returned by the source airline or host system")
  
  @Size(max=32)   public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public ErrorWarningDetail sourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
    return this;
  }

  /**
   * The error or warning message as it is returned by the source airline or host system
   * @return sourceDescription
   **/
  @Schema(description = "The error or warning message as it is returned by the source airline or host system")
  
  @Size(max=4096)   public String getSourceDescription() {
    return sourceDescription;
  }

  public void setSourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWarningDetail errorWarningDetail = (ErrorWarningDetail) o;
    return Objects.equals(this.sourceID, errorWarningDetail.sourceID) &&
        Objects.equals(this.sourceCode, errorWarningDetail.sourceCode) &&
        Objects.equals(this.sourceDescription, errorWarningDetail.sourceDescription) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceID, sourceCode, sourceDescription, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWarningDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    sourceDescription: ").append(toIndentedString(sourceDescription)).append("\n");
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
