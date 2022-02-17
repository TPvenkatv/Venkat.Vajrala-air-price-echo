package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CatalogProductOfferingIdentifier;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.ProductIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CatalogProductOfferingSelection
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CatalogProductOfferingSelection  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("CatalogProductOfferingIdentifier")
  private CatalogProductOfferingIdentifier catalogProductOfferingIdentifier = null;

  @JsonProperty("ProductBrandOfferingIdentifier")
  private Identifier productBrandOfferingIdentifier = null;

  @JsonProperty("ProductIdentifier")
  @Valid
  private java.util.List<ProductIdentifier> productIdentifier = null;

  @JsonProperty("SegmentSequence")
  @Valid
  private java.util.List<Integer> segmentSequence = null;

  public CatalogProductOfferingSelection _atType(String _atType) {
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

  public CatalogProductOfferingSelection catalogProductOfferingIdentifier(CatalogProductOfferingIdentifier catalogProductOfferingIdentifier) {
    this.catalogProductOfferingIdentifier = catalogProductOfferingIdentifier;
    return this;
  }

  /**
   * Get catalogProductOfferingIdentifier
   * @return catalogProductOfferingIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CatalogProductOfferingIdentifier getCatalogProductOfferingIdentifier() {
    return catalogProductOfferingIdentifier;
  }

  public void setCatalogProductOfferingIdentifier(CatalogProductOfferingIdentifier catalogProductOfferingIdentifier) {
    this.catalogProductOfferingIdentifier = catalogProductOfferingIdentifier;
  }

  public CatalogProductOfferingSelection productBrandOfferingIdentifier(Identifier productBrandOfferingIdentifier) {
    this.productBrandOfferingIdentifier = productBrandOfferingIdentifier;
    return this;
  }

  /**
   * Get productBrandOfferingIdentifier
   * @return productBrandOfferingIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Identifier getProductBrandOfferingIdentifier() {
    return productBrandOfferingIdentifier;
  }

  public void setProductBrandOfferingIdentifier(Identifier productBrandOfferingIdentifier) {
    this.productBrandOfferingIdentifier = productBrandOfferingIdentifier;
  }

  public CatalogProductOfferingSelection productIdentifier(java.util.List<ProductIdentifier> productIdentifier) {
    this.productIdentifier = productIdentifier;
    return this;
  }

  public CatalogProductOfferingSelection addProductIdentifierItem(ProductIdentifier productIdentifierItem) {
    if (this.productIdentifier == null) {
      this.productIdentifier = new java.util.ArrayList<>();
    }
    this.productIdentifier.add(productIdentifierItem);
    return this;
  }

  /**
   * Get productIdentifier
   * @return productIdentifier
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<ProductIdentifier> getProductIdentifier() {
    return productIdentifier;
  }

  public void setProductIdentifier(java.util.List<ProductIdentifier> productIdentifier) {
    this.productIdentifier = productIdentifier;
  }

  public CatalogProductOfferingSelection segmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
    return this;
  }

  public CatalogProductOfferingSelection addSegmentSequenceItem(Integer segmentSequenceItem) {
    if (this.segmentSequence == null) {
      this.segmentSequence = new java.util.ArrayList<>();
    }
    this.segmentSequence.add(segmentSequenceItem);
    return this;
  }

  /**
   * Get segmentSequence
   * @return segmentSequence
   **/
  @Schema(description = "")
  
    public java.util.List<Integer> getSegmentSequence() {
    return segmentSequence;
  }

  public void setSegmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogProductOfferingSelection catalogProductOfferingSelection = (CatalogProductOfferingSelection) o;
    return Objects.equals(this._atType, catalogProductOfferingSelection._atType) &&
        Objects.equals(this.catalogProductOfferingIdentifier, catalogProductOfferingSelection.catalogProductOfferingIdentifier) &&
        Objects.equals(this.productBrandOfferingIdentifier, catalogProductOfferingSelection.productBrandOfferingIdentifier) &&
        Objects.equals(this.productIdentifier, catalogProductOfferingSelection.productIdentifier) &&
        Objects.equals(this.segmentSequence, catalogProductOfferingSelection.segmentSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, catalogProductOfferingIdentifier, productBrandOfferingIdentifier, productIdentifier, segmentSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogProductOfferingSelection {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    catalogProductOfferingIdentifier: ").append(toIndentedString(catalogProductOfferingIdentifier)).append("\n");
    sb.append("    productBrandOfferingIdentifier: ").append(toIndentedString(productBrandOfferingIdentifier)).append("\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    segmentSequence: ").append(toIndentedString(segmentSequence)).append("\n");
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
