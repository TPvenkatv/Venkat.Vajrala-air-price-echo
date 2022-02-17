package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Error;
import com.travelport.air.offerresource.model.ResultStatusEnum;
import com.travelport.air.offerresource.model.Warning;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Result
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class Result  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("status")
  private ResultStatusEnum status = null;

  @JsonProperty("Error")
  @Valid
  private java.util.List<Error> error = null;

  @JsonProperty("Warning")
  @Valid
  private java.util.List<Warning> warning = null;

  public Result _atType(String _atType) {
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

  public Result status(ResultStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
    public ResultStatusEnum getStatus() {
    return status;
  }

  public void setStatus(ResultStatusEnum status) {
    this.status = status;
  }

  public Result error(java.util.List<Error> error) {
    this.error = error;
    return this;
  }

  public Result addErrorItem(Error errorItem) {
    if (this.error == null) {
      this.error = new java.util.ArrayList<>();
    }
    this.error.add(errorItem);
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema(description = "")
      @Valid
  @Size(max=50)   public java.util.List<Error> getError() {
    return error;
  }

  public void setError(java.util.List<Error> error) {
    this.error = error;
  }

  public Result warning(java.util.List<Warning> warning) {
    this.warning = warning;
    return this;
  }

  public Result addWarningItem(Warning warningItem) {
    if (this.warning == null) {
      this.warning = new java.util.ArrayList<>();
    }
    this.warning.add(warningItem);
    return this;
  }

  /**
   * Get warning
   * @return warning
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<Warning> getWarning() {
    return warning;
  }

  public void setWarning(java.util.List<Warning> warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this._atType, result._atType) &&
        Objects.equals(this.status, result.status) &&
        Objects.equals(this.error, result.error) &&
        Objects.equals(this.warning, result.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, status, error, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
