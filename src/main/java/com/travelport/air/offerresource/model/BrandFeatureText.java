package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.TextFormatted;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrandFeatureText
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = BrandFeatureTextDetail.class, name = "BrandFeatureTextDetail"),
})


public class BrandFeatureText  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("TextFormatted")
  @Valid
  private java.util.List<TextFormatted> textFormatted = new java.util.ArrayList<>();

  public BrandFeatureText _atType(String _atType) {
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

  public BrandFeatureText title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return title
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BrandFeatureText id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Internally referenced id
   * @return id
   **/
  @Schema(description = "Internally referenced id")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BrandFeatureText textFormatted(java.util.List<TextFormatted> textFormatted) {
    this.textFormatted = textFormatted;
    return this;
  }

  public BrandFeatureText addTextFormattedItem(TextFormatted textFormattedItem) {
    this.textFormatted.add(textFormattedItem);
    return this;
  }

  /**
   * Get textFormatted
   * @return textFormatted
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=50)   public java.util.List<TextFormatted> getTextFormatted() {
    return textFormatted;
  }

  public void setTextFormatted(java.util.List<TextFormatted> textFormatted) {
    this.textFormatted = textFormatted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFeatureText brandFeatureText = (BrandFeatureText) o;
    return Objects.equals(this._atType, brandFeatureText._atType) &&
        Objects.equals(this.title, brandFeatureText.title) &&
        Objects.equals(this.id, brandFeatureText.id) &&
        Objects.equals(this.textFormatted, brandFeatureText.textFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, title, id, textFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFeatureText {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    textFormatted: ").append(toIndentedString(textFormatted)).append("\n");
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
