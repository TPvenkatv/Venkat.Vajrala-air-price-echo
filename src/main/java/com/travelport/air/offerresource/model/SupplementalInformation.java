package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.NameValuePair;
import com.travelport.air.offerresource.model.Path;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SupplementalInformation
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class SupplementalInformation  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Path")
  @Valid
  private java.util.List<Path> path = new java.util.ArrayList<>();

  @JsonProperty("NameValuePair")
  @Valid
  private java.util.List<NameValuePair> nameValuePair = new java.util.ArrayList<>();

  public SupplementalInformation _atType(String _atType) {
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

  public SupplementalInformation path(java.util.List<Path> path) {
    this.path = path;
    return this;
  }

  public SupplementalInformation addPathItem(Path pathItem) {
    this.path.add(pathItem);
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<Path> getPath() {
    return path;
  }

  public void setPath(java.util.List<Path> path) {
    this.path = path;
  }

  public SupplementalInformation nameValuePair(java.util.List<NameValuePair> nameValuePair) {
    this.nameValuePair = nameValuePair;
    return this;
  }

  public SupplementalInformation addNameValuePairItem(NameValuePair nameValuePairItem) {
    this.nameValuePair.add(nameValuePairItem);
    return this;
  }

  /**
   * Get nameValuePair
   * @return nameValuePair
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<NameValuePair> getNameValuePair() {
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
    SupplementalInformation supplementalInformation = (SupplementalInformation) o;
    return Objects.equals(this._atType, supplementalInformation._atType) &&
        Objects.equals(this.path, supplementalInformation.path) &&
        Objects.equals(this.nameValuePair, supplementalInformation.nameValuePair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, path, nameValuePair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalInformation {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
