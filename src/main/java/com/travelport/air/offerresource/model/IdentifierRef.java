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
 * IdentifierRef
 */
@Validated


public class IdentifierRef  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("uris")
  @Valid
  private java.util.List<String> uris = null;

  public IdentifierRef value(String value) {
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

  public IdentifierRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A locally referenced ID
   * @return id
   **/
  @Schema(description = "A locally referenced ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdentifierRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descriptive text used to identify the contents of a target object
   * @return description
   **/
  @Schema(description = "Descriptive text used to identify the contents of a target object")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IdentifierRef uris(java.util.List<String> uris) {
    this.uris = uris;
    return this;
  }

  public IdentifierRef addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new java.util.ArrayList<>();
    }
    this.uris.add(urisItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:URIs
   * @return uris
   **/
  @Schema(description = "Assigned Type: c-1100:URIs")
  
    public java.util.List<String> getUris() {
    return uris;
  }

  public void setUris(java.util.List<String> uris) {
    this.uris = uris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierRef identifierRef = (IdentifierRef) o;
    return Objects.equals(this.value, identifierRef.value) &&
        Objects.equals(this.id, identifierRef.id) &&
        Objects.equals(this.description, identifierRef.description) &&
        Objects.equals(this.uris, identifierRef.uris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, id, description, uris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierRef {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
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
