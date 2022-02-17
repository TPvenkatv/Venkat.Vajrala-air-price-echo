package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CabinAirEnum;
import com.travelport.air.offerresource.model.CabinPreferenceTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CabinPreference
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class CabinPreference  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("preferenceType")
  private CabinPreferenceTypeEnum preferenceType = null;

  @JsonProperty("cabins")
  @Valid
  private java.util.List<CabinAirEnum> cabins = null;

  @JsonProperty("legSequence")
  @Valid
  private java.util.List<Integer> legSequence = null;

  public CabinPreference _atType(String _atType) {
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

  public CabinPreference preferenceType(CabinPreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
    return this;
  }

  /**
   * Get preferenceType
   * @return preferenceType
   **/
  @Schema(description = "")
  
    @Valid
    public CabinPreferenceTypeEnum getPreferenceType() {
    return preferenceType;
  }

  public void setPreferenceType(CabinPreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
  }

  public CabinPreference cabins(java.util.List<CabinAirEnum> cabins) {
    this.cabins = cabins;
    return this;
  }

  public CabinPreference addCabinsItem(CabinAirEnum cabinsItem) {
    if (this.cabins == null) {
      this.cabins = new java.util.ArrayList<>();
    }
    this.cabins.add(cabinsItem);
    return this;
  }

  /**
   * Get cabins
   * @return cabins
   **/
  @Schema(description = "")
      @Valid
    public java.util.List<CabinAirEnum> getCabins() {
    return cabins;
  }

  public void setCabins(java.util.List<CabinAirEnum> cabins) {
    this.cabins = cabins;
  }

  public CabinPreference legSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
    return this;
  }

  public CabinPreference addLegSequenceItem(Integer legSequenceItem) {
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
    CabinPreference cabinPreference = (CabinPreference) o;
    return Objects.equals(this._atType, cabinPreference._atType) &&
        Objects.equals(this.preferenceType, cabinPreference.preferenceType) &&
        Objects.equals(this.cabins, cabinPreference.cabins) &&
        Objects.equals(this.legSequence, cabinPreference.legSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, preferenceType, cabins, legSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinPreference {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    preferenceType: ").append(toIndentedString(preferenceType)).append("\n");
    sb.append("    cabins: ").append(toIndentedString(cabins)).append("\n");
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
