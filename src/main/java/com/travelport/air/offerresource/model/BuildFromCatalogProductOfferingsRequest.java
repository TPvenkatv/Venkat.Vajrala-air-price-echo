package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CatalogProductOfferingSelection;
import com.travelport.air.offerresource.model.CatalogProductOfferingsIdentifier;
import com.travelport.air.offerresource.model.UpsellOfferingIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildFromCatalogProductOfferingsRequest
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = BuildFromCatalogProductOfferingsRequestAir.class, name = "BuildFromCatalogProductOfferingsRequestAir"),
})


public class BuildFromCatalogProductOfferingsRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("CatalogProductOfferingsIdentifier")
  private CatalogProductOfferingsIdentifier catalogProductOfferingsIdentifier = null;

  @JsonProperty("CatalogProductOfferingSelection")
  @Valid
  private java.util.List<CatalogProductOfferingSelection> catalogProductOfferingSelection = new java.util.ArrayList<>();

  @JsonProperty("UpsellOfferingIdentifier")
  private UpsellOfferingIdentifier upsellOfferingIdentifier = null;

  public BuildFromCatalogProductOfferingsRequest _atType(String _atType) {
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

  public BuildFromCatalogProductOfferingsRequest catalogProductOfferingsIdentifier(CatalogProductOfferingsIdentifier catalogProductOfferingsIdentifier) {
    this.catalogProductOfferingsIdentifier = catalogProductOfferingsIdentifier;
    return this;
  }

  /**
   * Get catalogProductOfferingsIdentifier
   * @return catalogProductOfferingsIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CatalogProductOfferingsIdentifier getCatalogProductOfferingsIdentifier() {
    return catalogProductOfferingsIdentifier;
  }

  public void setCatalogProductOfferingsIdentifier(CatalogProductOfferingsIdentifier catalogProductOfferingsIdentifier) {
    this.catalogProductOfferingsIdentifier = catalogProductOfferingsIdentifier;
  }

  public BuildFromCatalogProductOfferingsRequest catalogProductOfferingSelection(java.util.List<CatalogProductOfferingSelection> catalogProductOfferingSelection) {
    this.catalogProductOfferingSelection = catalogProductOfferingSelection;
    return this;
  }

  public BuildFromCatalogProductOfferingsRequest addCatalogProductOfferingSelectionItem(CatalogProductOfferingSelection catalogProductOfferingSelectionItem) {
    this.catalogProductOfferingSelection.add(catalogProductOfferingSelectionItem);
    return this;
  }

  /**
   * Get catalogProductOfferingSelection
   * @return catalogProductOfferingSelection
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=16)   public java.util.List<CatalogProductOfferingSelection> getCatalogProductOfferingSelection() {
    return catalogProductOfferingSelection;
  }

  public void setCatalogProductOfferingSelection(java.util.List<CatalogProductOfferingSelection> catalogProductOfferingSelection) {
    this.catalogProductOfferingSelection = catalogProductOfferingSelection;
  }

  public BuildFromCatalogProductOfferingsRequest upsellOfferingIdentifier(UpsellOfferingIdentifier upsellOfferingIdentifier) {
    this.upsellOfferingIdentifier = upsellOfferingIdentifier;
    return this;
  }

  /**
   * Get upsellOfferingIdentifier
   * @return upsellOfferingIdentifier
   **/
  @Schema(description = "")
  
    @Valid
    public UpsellOfferingIdentifier getUpsellOfferingIdentifier() {
    return upsellOfferingIdentifier;
  }

  public void setUpsellOfferingIdentifier(UpsellOfferingIdentifier upsellOfferingIdentifier) {
    this.upsellOfferingIdentifier = upsellOfferingIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildFromCatalogProductOfferingsRequest buildFromCatalogProductOfferingsRequest = (BuildFromCatalogProductOfferingsRequest) o;
    return Objects.equals(this._atType, buildFromCatalogProductOfferingsRequest._atType) &&
        Objects.equals(this.catalogProductOfferingsIdentifier, buildFromCatalogProductOfferingsRequest.catalogProductOfferingsIdentifier) &&
        Objects.equals(this.catalogProductOfferingSelection, buildFromCatalogProductOfferingsRequest.catalogProductOfferingSelection) &&
        Objects.equals(this.upsellOfferingIdentifier, buildFromCatalogProductOfferingsRequest.upsellOfferingIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, catalogProductOfferingsIdentifier, catalogProductOfferingSelection, upsellOfferingIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildFromCatalogProductOfferingsRequest {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    catalogProductOfferingsIdentifier: ").append(toIndentedString(catalogProductOfferingsIdentifier)).append("\n");
    sb.append("    catalogProductOfferingSelection: ").append(toIndentedString(catalogProductOfferingSelection)).append("\n");
    sb.append("    upsellOfferingIdentifier: ").append(toIndentedString(upsellOfferingIdentifier)).append("\n");
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
