package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Ancillary;
import com.travelport.air.offerresource.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductAncillary
 */
@Validated


public class ProductAncillary extends Product implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Ancillary")
  private Ancillary ancillary = null;

  @JsonProperty("selectedByDefaultInd")
  private Boolean selectedByDefaultInd = null;

  public ProductAncillary ancillary(Ancillary ancillary) {
    this.ancillary = ancillary;
    return this;
  }

  /**
   * Get ancillary
   * @return ancillary
   **/
  @Schema(description = "")
  
    @Valid
    public Ancillary getAncillary() {
    return ancillary;
  }

  public void setAncillary(Ancillary ancillary) {
    this.ancillary = ancillary;
  }

  public ProductAncillary selectedByDefaultInd(Boolean selectedByDefaultInd) {
    this.selectedByDefaultInd = selectedByDefaultInd;
    return this;
  }

  /**
   * Get selectedByDefaultInd
   * @return selectedByDefaultInd
   **/
  @Schema(description = "")
  
    public Boolean isSelectedByDefaultInd() {
    return selectedByDefaultInd;
  }

  public void setSelectedByDefaultInd(Boolean selectedByDefaultInd) {
    this.selectedByDefaultInd = selectedByDefaultInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAncillary productAncillary = (ProductAncillary) o;
    return Objects.equals(this.ancillary, productAncillary.ancillary) &&
        Objects.equals(this.selectedByDefaultInd, productAncillary.selectedByDefaultInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancillary, selectedByDefaultInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAncillary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ancillary: ").append(toIndentedString(ancillary)).append("\n");
    sb.append("    selectedByDefaultInd: ").append(toIndentedString(selectedByDefaultInd)).append("\n");
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
