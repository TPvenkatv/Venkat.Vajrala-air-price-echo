package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CarrierPreferenceTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CarrierPreference
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CarrierPreference  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("preferenceType")
  private CarrierPreferenceTypeEnum preferenceType = null;

  @JsonProperty("carriers")
  @Valid
  private java.util.List<String> carriers = new java.util.ArrayList<>();

  @JsonProperty("legSequence")
  @Valid
  private java.util.List<Integer> legSequence = null;

  public CarrierPreference _atType(String _atType) {
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

  public CarrierPreference preferenceType(CarrierPreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
    return this;
  }

  /**
   * Get preferenceType
   * @return preferenceType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CarrierPreferenceTypeEnum getPreferenceType() {
    return preferenceType;
  }

  public void setPreferenceType(CarrierPreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
  }

  public CarrierPreference carriers(java.util.List<String> carriers) {
    this.carriers = carriers;
    return this;
  }

  public CarrierPreference addCarriersItem(String carriersItem) {
    this.carriers.add(carriersItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:AirlineCodes
   * @return carriers
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:AirlineCodes")
      @NotNull

    public java.util.List<String> getCarriers() {
    return carriers;
  }

  public void setCarriers(java.util.List<String> carriers) {
    this.carriers = carriers;
  }

  public CarrierPreference legSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
    return this;
  }

  public CarrierPreference addLegSequenceItem(Integer legSequenceItem) {
    if (this.legSequence == null) {
      this.legSequence = new java.util.ArrayList<>();
    }
    this.legSequence.add(legSequenceItem);
    return this;
  }

  /**
   * Assigned Type: c-1100:SegmentSequenceList
   * @return legSequence
   **/
  @Schema(description = "Assigned Type: c-1100:SegmentSequenceList")
  
    public java.util.List<Integer> getLegSequence() {
    return legSequence;
  }

  public void setLegSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierPreference carrierPreference = (CarrierPreference) o;
    return Objects.equals(this._atType, carrierPreference._atType) &&
        Objects.equals(this.preferenceType, carrierPreference.preferenceType) &&
        Objects.equals(this.carriers, carrierPreference.carriers) &&
        Objects.equals(this.legSequence, carrierPreference.legSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, preferenceType, carriers, legSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierPreference {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    preferenceType: ").append(toIndentedString(preferenceType)).append("\n");
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
    sb.append("    legSequence: ").append(toIndentedString(legSequence)).append("\n");
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
