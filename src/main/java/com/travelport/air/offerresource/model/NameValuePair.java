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
 * Used for data stored in Name/Value pairs
 */
@Schema(description = "Used for data stored in Name/Value pairs")
@Validated


public class NameValuePair  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public NameValuePair value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=512)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NameValuePair id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional internally referenced id
   * @return id
   **/
  @Schema(description = "Optional internally referenced id")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NameValuePair name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return name
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:String")
      @NotNull

  @Size(max=512)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameValuePair nameValuePair = (NameValuePair) o;
    return Objects.equals(this.value, nameValuePair.value) &&
        Objects.equals(this.id, nameValuePair.id) &&
        Objects.equals(this.name, nameValuePair.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameValuePair {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
