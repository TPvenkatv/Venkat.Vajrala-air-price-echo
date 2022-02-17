package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.SpecificFlightCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductCriteriaAir
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class ProductCriteriaAir  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("SpecificFlightCriteria")
  @Valid
  private java.util.List<SpecificFlightCriteria> specificFlightCriteria = new java.util.ArrayList<>();

  public ProductCriteriaAir _atType(String _atType) {
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

  public ProductCriteriaAir sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Assigned Type: c-1100:NonnegativeInteger
   * minimum: 0
   * @return sequence
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:NonnegativeInteger")
      @NotNull

  @Min(0)  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public ProductCriteriaAir specificFlightCriteria(java.util.List<SpecificFlightCriteria> specificFlightCriteria) {
    this.specificFlightCriteria = specificFlightCriteria;
    return this;
  }

  public ProductCriteriaAir addSpecificFlightCriteriaItem(SpecificFlightCriteria specificFlightCriteriaItem) {
    this.specificFlightCriteria.add(specificFlightCriteriaItem);
    return this;
  }

  /**
   * Get specificFlightCriteria
   * @return specificFlightCriteria
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=20)   public java.util.List<SpecificFlightCriteria> getSpecificFlightCriteria() {
    return specificFlightCriteria;
  }

  public void setSpecificFlightCriteria(java.util.List<SpecificFlightCriteria> specificFlightCriteria) {
    this.specificFlightCriteria = specificFlightCriteria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCriteriaAir productCriteriaAir = (ProductCriteriaAir) o;
    return Objects.equals(this._atType, productCriteriaAir._atType) &&
        Objects.equals(this.sequence, productCriteriaAir.sequence) &&
        Objects.equals(this.specificFlightCriteria, productCriteriaAir.specificFlightCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, sequence, specificFlightCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCriteriaAir {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    specificFlightCriteria: ").append(toIndentedString(specificFlightCriteria)).append("\n");
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
