package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.NameValuePair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = ErrorDetail.class, name = "ErrorDetail"),
})


public class Error  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("StatusCode")
  private Integer statusCode = null;

  @JsonProperty("Message")
  private String message = null;

  @JsonProperty("NameValuePair")
  @Valid
  private java.util.List<NameValuePair> nameValuePair = null;

  public Error _atType(String _atType) {
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

  public Error statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Http standard response code
   * @return statusCode
   **/
  @Schema(description = "Http standard response code")
  
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The Travelport standardized error or warning message
   * @return message
   **/
  @Schema(description = "The Travelport standardized error or warning message")
  
  @Size(max=4096)   public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error nameValuePair(java.util.List<NameValuePair> nameValuePair) {
    this.nameValuePair = nameValuePair;
    return this;
  }

  public Error addNameValuePairItem(NameValuePair nameValuePairItem) {
    if (this.nameValuePair == null) {
      this.nameValuePair = new java.util.ArrayList<>();
    }
    this.nameValuePair.add(nameValuePairItem);
    return this;
  }

  /**
   * Get nameValuePair
   * @return nameValuePair
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<NameValuePair> getNameValuePair() {
    return nameValuePair;
  }

  public void setNameValuePair(java.util.List<NameValuePair> nameValuePair) {
    this.nameValuePair = nameValuePair;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this._atType, error._atType) &&
        Objects.equals(this.statusCode, error.statusCode) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.nameValuePair, error.nameValuePair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, statusCode, message, nameValuePair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nameValuePair: ").append(toIndentedString(nameValuePair)).append("\n");
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
