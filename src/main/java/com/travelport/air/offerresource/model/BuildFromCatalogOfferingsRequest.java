package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.AncillaryOfferingIdentifier;
import com.travelport.air.offerresource.model.CatalogOfferingIdentifier;
import com.travelport.air.offerresource.model.CatalogOfferingsIdentifier;
import com.travelport.air.offerresource.model.ProductIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildFromCatalogOfferingsRequest
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = BuildFromCatalogOfferingsRequestAir.class, name = "BuildFromCatalogOfferingsRequestAir"),
})


public class BuildFromCatalogOfferingsRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("CatalogOfferingsIdentifier")
  private CatalogOfferingsIdentifier catalogOfferingsIdentifier = null;

  @JsonProperty("CatalogOfferingIdentifier")
  private CatalogOfferingIdentifier catalogOfferingIdentifier = null;

  @JsonProperty("ProductIdentifier")
  @Valid
  private java.util.List<ProductIdentifier> productIdentifier = new java.util.ArrayList<>();

  @JsonProperty("AncillaryOfferingIdentifier")
  @Valid
  private java.util.List<AncillaryOfferingIdentifier> ancillaryOfferingIdentifier = null;

  public BuildFromCatalogOfferingsRequest _atType(String _atType) {
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

  public BuildFromCatalogOfferingsRequest catalogOfferingsIdentifier(CatalogOfferingsIdentifier catalogOfferingsIdentifier) {
    this.catalogOfferingsIdentifier = catalogOfferingsIdentifier;
    return this;
  }

  /**
   * Get catalogOfferingsIdentifier
   * @return catalogOfferingsIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CatalogOfferingsIdentifier getCatalogOfferingsIdentifier() {
    return catalogOfferingsIdentifier;
  }

  public void setCatalogOfferingsIdentifier(CatalogOfferingsIdentifier catalogOfferingsIdentifier) {
    this.catalogOfferingsIdentifier = catalogOfferingsIdentifier;
  }

  public BuildFromCatalogOfferingsRequest catalogOfferingIdentifier(CatalogOfferingIdentifier catalogOfferingIdentifier) {
    this.catalogOfferingIdentifier = catalogOfferingIdentifier;
    return this;
  }

  /**
   * Get catalogOfferingIdentifier
   * @return catalogOfferingIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CatalogOfferingIdentifier getCatalogOfferingIdentifier() {
    return catalogOfferingIdentifier;
  }

  public void setCatalogOfferingIdentifier(CatalogOfferingIdentifier catalogOfferingIdentifier) {
    this.catalogOfferingIdentifier = catalogOfferingIdentifier;
  }

  public BuildFromCatalogOfferingsRequest productIdentifier(java.util.List<ProductIdentifier> productIdentifier) {
    this.productIdentifier = productIdentifier;
    return this;
  }

  public BuildFromCatalogOfferingsRequest addProductIdentifierItem(ProductIdentifier productIdentifierItem) {
    this.productIdentifier.add(productIdentifierItem);
    return this;
  }

  /**
   * Get productIdentifier
   * @return productIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<ProductIdentifier> getProductIdentifier() {
    return productIdentifier;
  }

  public void setProductIdentifier(java.util.List<ProductIdentifier> productIdentifier) {
    this.productIdentifier = productIdentifier;
  }

  public BuildFromCatalogOfferingsRequest ancillaryOfferingIdentifier(java.util.List<AncillaryOfferingIdentifier> ancillaryOfferingIdentifier) {
    this.ancillaryOfferingIdentifier = ancillaryOfferingIdentifier;
    return this;
  }

  public BuildFromCatalogOfferingsRequest addAncillaryOfferingIdentifierItem(AncillaryOfferingIdentifier ancillaryOfferingIdentifierItem) {
    if (this.ancillaryOfferingIdentifier == null) {
      this.ancillaryOfferingIdentifier = new java.util.ArrayList<>();
    }
    this.ancillaryOfferingIdentifier.add(ancillaryOfferingIdentifierItem);
    return this;
  }

  /**
   * Get ancillaryOfferingIdentifier
   * @return ancillaryOfferingIdentifier
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<AncillaryOfferingIdentifier> getAncillaryOfferingIdentifier() {
    return ancillaryOfferingIdentifier;
  }

  public void setAncillaryOfferingIdentifier(java.util.List<AncillaryOfferingIdentifier> ancillaryOfferingIdentifier) {
    this.ancillaryOfferingIdentifier = ancillaryOfferingIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildFromCatalogOfferingsRequest buildFromCatalogOfferingsRequest = (BuildFromCatalogOfferingsRequest) o;
    return Objects.equals(this._atType, buildFromCatalogOfferingsRequest._atType) &&
        Objects.equals(this.catalogOfferingsIdentifier, buildFromCatalogOfferingsRequest.catalogOfferingsIdentifier) &&
        Objects.equals(this.catalogOfferingIdentifier, buildFromCatalogOfferingsRequest.catalogOfferingIdentifier) &&
        Objects.equals(this.productIdentifier, buildFromCatalogOfferingsRequest.productIdentifier) &&
        Objects.equals(this.ancillaryOfferingIdentifier, buildFromCatalogOfferingsRequest.ancillaryOfferingIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, catalogOfferingsIdentifier, catalogOfferingIdentifier, productIdentifier, ancillaryOfferingIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildFromCatalogOfferingsRequest {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    catalogOfferingsIdentifier: ").append(toIndentedString(catalogOfferingsIdentifier)).append("\n");
    sb.append("    catalogOfferingIdentifier: ").append(toIndentedString(catalogOfferingIdentifier)).append("\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    ancillaryOfferingIdentifier: ").append(toIndentedString(ancillaryOfferingIdentifier)).append("\n");
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
