package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BrandFeatureText;
import com.travelport.air.offerresource.model.DateCreateModify;
import com.travelport.air.offerresource.model.Image;
import com.travelport.air.offerresource.model.TextFormatted;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrandFeatureTextDetail
 */
@Validated


public class BrandFeatureTextDetail extends BrandFeatureText implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("Image")
  private Image image = null;

  @JsonProperty("URL")
  private String URL = null;

  @JsonProperty("DateCreateModify")
  private DateCreateModify dateCreateModify = null;

  public BrandFeatureTextDetail sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * The order of the text block, if there are more than one block.
   * @return sequence
   **/
  @Schema(description = "The order of the text block, if there are more than one block.")
  
    public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public BrandFeatureTextDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Assigned Type: c-1100:Description
   * @return description
   **/
  @Schema(description = "Assigned Type: c-1100:Description")
  
  @Size(max=1024)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrandFeatureTextDetail image(Image image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   **/
  @Schema(description = "")
  
    @Valid
    public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public BrandFeatureTextDetail URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * A URL for this block
   * @return URL
   **/
  @Schema(description = "A URL for this block")
  
    public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public BrandFeatureTextDetail dateCreateModify(DateCreateModify dateCreateModify) {
    this.dateCreateModify = dateCreateModify;
    return this;
  }

  /**
   * Get dateCreateModify
   * @return dateCreateModify
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DateCreateModify getDateCreateModify() {
    return dateCreateModify;
  }

  public void setDateCreateModify(DateCreateModify dateCreateModify) {
    this.dateCreateModify = dateCreateModify;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFeatureTextDetail brandFeatureTextDetail = (BrandFeatureTextDetail) o;
    return Objects.equals(this.sequence, brandFeatureTextDetail.sequence) &&
        Objects.equals(this.description, brandFeatureTextDetail.description) &&
        Objects.equals(this.image, brandFeatureTextDetail.image) &&
        Objects.equals(this.URL, brandFeatureTextDetail.URL) &&
        Objects.equals(this.dateCreateModify, brandFeatureTextDetail.dateCreateModify) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, description, image, URL, dateCreateModify, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFeatureTextDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    dateCreateModify: ").append(toIndentedString(dateCreateModify)).append("\n");
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
