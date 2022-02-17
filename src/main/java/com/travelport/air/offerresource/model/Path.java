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
 * Path
 */
@Validated


public class Path  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("objectRefs")
  @Valid
  private java.util.List<String> objectRefs = null;

  public Path value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Path objectRefs(java.util.List<String> objectRefs) {
    this.objectRefs = objectRefs;
    return this;
  }

  public Path addObjectRefsItem(String objectRefsItem) {
    if (this.objectRefs == null) {
      this.objectRefs = new java.util.ArrayList<>();
    }
    this.objectRefs.add(objectRefsItem);
    return this;
  }

  /**
   * IDREFS of objects to be supplemented
   * @return objectRefs
   **/
  @Schema(description = "IDREFS of objects to be supplemented")
  
    public java.util.List<String> getObjectRefs() {
    return objectRefs;
  }

  public void setObjectRefs(java.util.List<String> objectRefs) {
    this.objectRefs = objectRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Path path = (Path) o;
    return Objects.equals(this.value, path.value) &&
        Objects.equals(this.objectRefs, path.objectRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, objectRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Path {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    objectRefs: ").append(toIndentedString(objectRefs)).append("\n");
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
