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
 * URL of the image
 */
@Schema(description = "URL of the image")
@Validated


public class Image  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("dimensionCategory")
  private String dimensionCategory = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("pictureCategory")
  private Integer pictureCategory = null;

  public Image value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Image dimensionCategory(String dimensionCategory) {
    this.dimensionCategory = dimensionCategory;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringCharacterOne
   * @return dimensionCategory
   **/
  @Schema(description = "Assigned Type: c-1100:StringCharacterOne")
  
  @Size(max=1)   public String getDimensionCategory() {
    return dimensionCategory;
  }

  public void setDimensionCategory(String dimensionCategory) {
    this.dimensionCategory = dimensionCategory;
  }

  public Image width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width of image
   * @return width
   **/
  @Schema(description = "Width of image")
  
    public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Image height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height
   * @return height
   **/
  @Schema(description = "Height")
  
    public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Image caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return caption
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Image pictureCategory(Integer pictureCategory) {
    this.pictureCategory = pictureCategory;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberDoubleDigit
   * @return pictureCategory
   **/
  @Schema(description = "Assigned Type: c-1100:NumberDoubleDigit")
  
    public Integer getPictureCategory() {
    return pictureCategory;
  }

  public void setPictureCategory(Integer pictureCategory) {
    this.pictureCategory = pictureCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.value, image.value) &&
        Objects.equals(this.dimensionCategory, image.dimensionCategory) &&
        Objects.equals(this.width, image.width) &&
        Objects.equals(this.height, image.height) &&
        Objects.equals(this.caption, image.caption) &&
        Objects.equals(this.pictureCategory, image.pictureCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, dimensionCategory, width, height, caption, pictureCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dimensionCategory: ").append(toIndentedString(dimensionCategory)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    pictureCategory: ").append(toIndentedString(pictureCategory)).append("\n");
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
