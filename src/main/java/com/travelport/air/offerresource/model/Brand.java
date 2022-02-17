package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AdditionalBrandAttribute;
import com.travelport.air.offerresource.model.BrandAttribute;
import com.travelport.air.offerresource.model.BrandID;
import com.travelport.air.offerresource.model.Identifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand
 */
@Validated


public class Brand extends BrandID implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tier")
  private Integer tier = null;

  @JsonProperty("shelfNumbers")
  @Valid
  private java.util.List<Integer> shelfNumbers = null;

  @JsonProperty("BrandAttribute")
  @Valid
  private java.util.List<BrandAttribute> brandAttribute = null;

  @JsonProperty("AdditionalBrandAttribute")
  @Valid
  private java.util.List<AdditionalBrandAttribute> additionalBrandAttribute = null;

  @JsonProperty("ImageURL")
  @Valid
  private java.util.List<String> imageURL = null;

  public Brand name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Assigned Type: ctbr-1100:BrandName
   * @return name
   **/
  @Schema(required = true, description = "Assigned Type: ctbr-1100:BrandName")
      @NotNull

  @Size(max=128)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Brand tier(Integer tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberSingleDigit
   * @return tier
   **/
  @Schema(description = "Assigned Type: c-1100:NumberSingleDigit")
  
    public Integer getTier() {
    return tier;
  }

  public void setTier(Integer tier) {
    this.tier = tier;
  }

  public Brand shelfNumbers(java.util.List<Integer> shelfNumbers) {
    this.shelfNumbers = shelfNumbers;
    return this;
  }

  public Brand addShelfNumbersItem(Integer shelfNumbersItem) {
    if (this.shelfNumbers == null) {
      this.shelfNumbers = new java.util.ArrayList<>();
    }
    this.shelfNumbers.add(shelfNumbersItem);
    return this;
  }

  /**
   * Assigned Type: ctbr-1100:ShelfNumbers
   * @return shelfNumbers
   **/
  @Schema(description = "Assigned Type: ctbr-1100:ShelfNumbers")
  
    public java.util.List<Integer> getShelfNumbers() {
    return shelfNumbers;
  }

  public void setShelfNumbers(java.util.List<Integer> shelfNumbers) {
    this.shelfNumbers = shelfNumbers;
  }

  public Brand brandAttribute(java.util.List<BrandAttribute> brandAttribute) {
    this.brandAttribute = brandAttribute;
    return this;
  }

  public Brand addBrandAttributeItem(BrandAttribute brandAttributeItem) {
    if (this.brandAttribute == null) {
      this.brandAttribute = new java.util.ArrayList<>();
    }
    this.brandAttribute.add(brandAttributeItem);
    return this;
  }

  /**
   * Get brandAttribute
   * @return brandAttribute
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<BrandAttribute> getBrandAttribute() {
    return brandAttribute;
  }

  public void setBrandAttribute(java.util.List<BrandAttribute> brandAttribute) {
    this.brandAttribute = brandAttribute;
  }

  public Brand additionalBrandAttribute(java.util.List<AdditionalBrandAttribute> additionalBrandAttribute) {
    this.additionalBrandAttribute = additionalBrandAttribute;
    return this;
  }

  public Brand addAdditionalBrandAttributeItem(AdditionalBrandAttribute additionalBrandAttributeItem) {
    if (this.additionalBrandAttribute == null) {
      this.additionalBrandAttribute = new java.util.ArrayList<>();
    }
    this.additionalBrandAttribute.add(additionalBrandAttributeItem);
    return this;
  }

  /**
   * Get additionalBrandAttribute
   * @return additionalBrandAttribute
   **/
  @Schema(description = "")
      @Valid
  @Size(max=15)   public java.util.List<AdditionalBrandAttribute> getAdditionalBrandAttribute() {
    return additionalBrandAttribute;
  }

  public void setAdditionalBrandAttribute(java.util.List<AdditionalBrandAttribute> additionalBrandAttribute) {
    this.additionalBrandAttribute = additionalBrandAttribute;
  }

  public Brand imageURL(java.util.List<String> imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  public Brand addImageURLItem(String imageURLItem) {
    if (this.imageURL == null) {
      this.imageURL = new java.util.ArrayList<>();
    }
    this.imageURL.add(imageURLItem);
    return this;
  }

  /**
   * Get imageURL
   * @return imageURL
   **/
  @Schema(description = "")
  
  @Size(max=10)   public java.util.List<String> getImageURL() {
    return imageURL;
  }

  public void setImageURL(java.util.List<String> imageURL) {
    this.imageURL = imageURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.name, brand.name) &&
        Objects.equals(this.tier, brand.tier) &&
        Objects.equals(this.shelfNumbers, brand.shelfNumbers) &&
        Objects.equals(this.brandAttribute, brand.brandAttribute) &&
        Objects.equals(this.additionalBrandAttribute, brand.additionalBrandAttribute) &&
        Objects.equals(this.imageURL, brand.imageURL) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tier, shelfNumbers, brandAttribute, additionalBrandAttribute, imageURL, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    shelfNumbers: ").append(toIndentedString(shelfNumbers)).append("\n");
    sb.append("    brandAttribute: ").append(toIndentedString(brandAttribute)).append("\n");
    sb.append("    additionalBrandAttribute: ").append(toIndentedString(additionalBrandAttribute)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
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
