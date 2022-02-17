package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.AncillaryDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ancillary
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class Ancillary  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("Description")
  @Valid
  private java.util.List<AncillaryDescription> description = new java.util.ArrayList<>();

  public Ancillary _atType(String _atType) {
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

  public Ancillary quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Assigned Type: c-1100:NumberDoubleDigit
   * @return quantity
   **/
  @Schema(description = "Assigned Type: c-1100:NumberDoubleDigit")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Ancillary description(java.util.List<AncillaryDescription> description) {
    this.description = description;
    return this;
  }

  public Ancillary addDescriptionItem(AncillaryDescription descriptionItem) {
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=10)   public java.util.List<AncillaryDescription> getDescription() {
    return description;
  }

  public void setDescription(java.util.List<AncillaryDescription> description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ancillary ancillary = (Ancillary) o;
    return Objects.equals(this._atType, ancillary._atType) &&
        Objects.equals(this.quantity, ancillary.quantity) &&
        Objects.equals(this.description, ancillary.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, quantity, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ancillary {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
