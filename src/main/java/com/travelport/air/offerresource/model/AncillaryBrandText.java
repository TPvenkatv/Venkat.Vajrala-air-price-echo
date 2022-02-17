package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.BrandTargetEnum;
import com.travelport.air.offerresource.model.TextFormatted;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AncillaryBrandText
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = AncillaryBrandTextDetail.class, name = "AncillaryBrandTextDetail"),
})


public class AncillaryBrandText  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("target")
  private BrandTargetEnum target = null;

  @JsonProperty("TextFormatted")
  @Valid
  private java.util.List<TextFormatted> textFormatted = new java.util.ArrayList<>();

  public AncillaryBrandText _atType(String _atType) {
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

  public AncillaryBrandText id(String id) {
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

  public AncillaryBrandText target(BrandTargetEnum target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   **/
  @Schema(description = "")
  
    @Valid
    public BrandTargetEnum getTarget() {
    return target;
  }

  public void setTarget(BrandTargetEnum target) {
    this.target = target;
  }

  public AncillaryBrandText textFormatted(java.util.List<TextFormatted> textFormatted) {
    this.textFormatted = textFormatted;
    return this;
  }

  public AncillaryBrandText addTextFormattedItem(TextFormatted textFormattedItem) {
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
    AncillaryBrandText ancillaryBrandText = (AncillaryBrandText) o;
    return Objects.equals(this._atType, ancillaryBrandText._atType) &&
        Objects.equals(this.id, ancillaryBrandText.id) &&
        Objects.equals(this.target, ancillaryBrandText.target) &&
        Objects.equals(this.textFormatted, ancillaryBrandText.textFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, target, textFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AncillaryBrandText {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
