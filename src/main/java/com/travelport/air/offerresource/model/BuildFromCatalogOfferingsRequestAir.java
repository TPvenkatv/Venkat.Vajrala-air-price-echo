package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AncillaryOfferingIdentifier;
import com.travelport.air.offerresource.model.BuildFromCatalogOfferingsRequest;
import com.travelport.air.offerresource.model.CatalogOfferingIdentifier;
import com.travelport.air.offerresource.model.CatalogOfferingsIdentifier;
import com.travelport.air.offerresource.model.CustomResponseModifiersAir;
import com.travelport.air.offerresource.model.PricingModifiersAir;
import com.travelport.air.offerresource.model.ProductIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildFromCatalogOfferingsRequestAir
 */
@Validated


public class BuildFromCatalogOfferingsRequestAir extends BuildFromCatalogOfferingsRequest implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PricingModifiersAir")
  private PricingModifiersAir pricingModifiersAir = null;

  @JsonProperty("SegmentSequence")
  @Valid
  private java.util.List<Integer> segmentSequence = null;

  @JsonProperty("CustomResponseModifiersAir")
  private CustomResponseModifiersAir customResponseModifiersAir = null;

  public BuildFromCatalogOfferingsRequestAir pricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
    return this;
  }

  /**
   * Get pricingModifiersAir
   * @return pricingModifiersAir
   **/
  @Schema(description = "")
  
    @Valid
    public PricingModifiersAir getPricingModifiersAir() {
    return pricingModifiersAir;
  }

  public void setPricingModifiersAir(PricingModifiersAir pricingModifiersAir) {
    this.pricingModifiersAir = pricingModifiersAir;
  }

  public BuildFromCatalogOfferingsRequestAir segmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
    return this;
  }

  public BuildFromCatalogOfferingsRequestAir addSegmentSequenceItem(Integer segmentSequenceItem) {
    if (this.segmentSequence == null) {
      this.segmentSequence = new java.util.ArrayList<>();
    }
    this.segmentSequence.add(segmentSequenceItem);
    return this;
  }

  /**
   * The segmentSequence within the product the action is being requested for. Used when multiple flights exist within a product. Only one product may be selected with this option.
   * @return segmentSequence
   **/
  @Schema(description = "The segmentSequence within the product the action is being requested for. Used when multiple flights exist within a product. Only one product may be selected with this option.")
  
    public java.util.List<Integer> getSegmentSequence() {
    return segmentSequence;
  }

  public void setSegmentSequence(java.util.List<Integer> segmentSequence) {
    this.segmentSequence = segmentSequence;
  }

  public BuildFromCatalogOfferingsRequestAir customResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
    return this;
  }

  /**
   * Get customResponseModifiersAir
   * @return customResponseModifiersAir
   **/
  @Schema(description = "")
  
    @Valid
    public CustomResponseModifiersAir getCustomResponseModifiersAir() {
    return customResponseModifiersAir;
  }

  public void setCustomResponseModifiersAir(CustomResponseModifiersAir customResponseModifiersAir) {
    this.customResponseModifiersAir = customResponseModifiersAir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildFromCatalogOfferingsRequestAir buildFromCatalogOfferingsRequestAir = (BuildFromCatalogOfferingsRequestAir) o;
    return Objects.equals(this.pricingModifiersAir, buildFromCatalogOfferingsRequestAir.pricingModifiersAir) &&
        Objects.equals(this.segmentSequence, buildFromCatalogOfferingsRequestAir.segmentSequence) &&
        Objects.equals(this.customResponseModifiersAir, buildFromCatalogOfferingsRequestAir.customResponseModifiersAir) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingModifiersAir, segmentSequence, customResponseModifiersAir, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildFromCatalogOfferingsRequestAir {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pricingModifiersAir: ").append(toIndentedString(pricingModifiersAir)).append("\n");
    sb.append("    segmentSequence: ").append(toIndentedString(segmentSequence)).append("\n");
    sb.append("    customResponseModifiersAir: ").append(toIndentedString(customResponseModifiersAir)).append("\n");
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
