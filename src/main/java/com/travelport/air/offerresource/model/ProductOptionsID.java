package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Identifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductOptionsID
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = ProductOptionsSummary.class, name = "ProductOptionsSummary"),
        @JsonSubTypes.Type(value = ProductOptions.class, name = "ProductOptions"),
})


public class ProductOptionsID  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  @JsonProperty("ProductOptionsRef")
  private String productOptionsRef = null;

  public ProductOptionsID _atType(String _atType) {
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

  public ProductOptionsID id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Local indentifier within a given message for this object.
   * @return id
   **/
  @Schema(description = "Local indentifier within a given message for this object.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOptionsID identifier(Identifier identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   **/
  @Schema(description = "")
  
    @Valid
    public Identifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public ProductOptionsID productOptionsRef(String productOptionsRef) {
    this.productOptionsRef = productOptionsRef;
    return this;
  }

  /**
   * Used to reference another instance of this object in the same message
   * @return productOptionsRef
   **/
  @Schema(description = "Used to reference another instance of this object in the same message")
  
    public String getProductOptionsRef() {
    return productOptionsRef;
  }

  public void setProductOptionsRef(String productOptionsRef) {
    this.productOptionsRef = productOptionsRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOptionsID productOptionsID = (ProductOptionsID) o;
    return Objects.equals(this._atType, productOptionsID._atType) &&
        Objects.equals(this.id, productOptionsID.id) &&
        Objects.equals(this.identifier, productOptionsID.identifier) &&
        Objects.equals(this.productOptionsRef, productOptionsID.productOptionsRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, identifier, productOptionsRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionsID {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    productOptionsRef: ").append(toIndentedString(productOptionsRef)).append("\n");
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
