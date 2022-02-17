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
 * CatalogProductOfferingID
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CatalogProductOfferingID  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  @JsonProperty("CatalogProductOfferingRef")
  private String catalogProductOfferingRef = null;

  public CatalogProductOfferingID _atType(String _atType) {
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

  public CatalogProductOfferingID id(String id) {
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

  public CatalogProductOfferingID identifier(Identifier identifier) {
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

  public CatalogProductOfferingID catalogProductOfferingRef(String catalogProductOfferingRef) {
    this.catalogProductOfferingRef = catalogProductOfferingRef;
    return this;
  }

  /**
   * Used to reference another instance of this object in the same message
   * @return catalogProductOfferingRef
   **/
  @Schema(description = "Used to reference another instance of this object in the same message")
  
    public String getCatalogProductOfferingRef() {
    return catalogProductOfferingRef;
  }

  public void setCatalogProductOfferingRef(String catalogProductOfferingRef) {
    this.catalogProductOfferingRef = catalogProductOfferingRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogProductOfferingID catalogProductOfferingID = (CatalogProductOfferingID) o;
    return Objects.equals(this._atType, catalogProductOfferingID._atType) &&
        Objects.equals(this.id, catalogProductOfferingID.id) &&
        Objects.equals(this.identifier, catalogProductOfferingID.identifier) &&
        Objects.equals(this.catalogProductOfferingRef, catalogProductOfferingID.catalogProductOfferingRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, identifier, catalogProductOfferingRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogProductOfferingID {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    catalogProductOfferingRef: ").append(toIndentedString(catalogProductOfferingRef)).append("\n");
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
