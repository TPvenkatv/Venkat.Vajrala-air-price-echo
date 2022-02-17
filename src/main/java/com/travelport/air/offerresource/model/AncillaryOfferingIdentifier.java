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
 * AncillaryOfferingIdentifier
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class AncillaryOfferingIdentifier  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("CatalogOfferingRef")
  private String catalogOfferingRef = null;

  @JsonProperty("AncillaryOfferingRef")
  private String ancillaryOfferingRef = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  public AncillaryOfferingIdentifier _atType(String _atType) {
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

  public AncillaryOfferingIdentifier id(String id) {
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

  public AncillaryOfferingIdentifier catalogOfferingRef(String catalogOfferingRef) {
    this.catalogOfferingRef = catalogOfferingRef;
    return this;
  }

  /**
   * Used to reference another instance of this object in the same message
   * @return catalogOfferingRef
   **/
  @Schema(description = "Used to reference another instance of this object in the same message")
  
    public String getCatalogOfferingRef() {
    return catalogOfferingRef;
  }

  public void setCatalogOfferingRef(String catalogOfferingRef) {
    this.catalogOfferingRef = catalogOfferingRef;
  }

  public AncillaryOfferingIdentifier ancillaryOfferingRef(String ancillaryOfferingRef) {
    this.ancillaryOfferingRef = ancillaryOfferingRef;
    return this;
  }

  /**
   * Get ancillaryOfferingRef
   * @return ancillaryOfferingRef
   **/
  @Schema(description = "")
  
    public String getAncillaryOfferingRef() {
    return ancillaryOfferingRef;
  }

  public void setAncillaryOfferingRef(String ancillaryOfferingRef) {
    this.ancillaryOfferingRef = ancillaryOfferingRef;
  }

  public AncillaryOfferingIdentifier identifier(Identifier identifier) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AncillaryOfferingIdentifier ancillaryOfferingIdentifier = (AncillaryOfferingIdentifier) o;
    return Objects.equals(this._atType, ancillaryOfferingIdentifier._atType) &&
        Objects.equals(this.id, ancillaryOfferingIdentifier.id) &&
        Objects.equals(this.catalogOfferingRef, ancillaryOfferingIdentifier.catalogOfferingRef) &&
        Objects.equals(this.ancillaryOfferingRef, ancillaryOfferingIdentifier.ancillaryOfferingRef) &&
        Objects.equals(this.identifier, ancillaryOfferingIdentifier.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, catalogOfferingRef, ancillaryOfferingRef, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncillaryOfferingIdentifier {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogOfferingRef: ").append(toIndentedString(catalogOfferingRef)).append("\n");
    sb.append("    ancillaryOfferingRef: ").append(toIndentedString(ancillaryOfferingRef)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
