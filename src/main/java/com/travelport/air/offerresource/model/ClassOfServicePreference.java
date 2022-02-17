package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.ClassOfServicePreferenceTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassOfServicePreference
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class ClassOfServicePreference  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("legSequence")
  @Valid
  private java.util.List<Integer> legSequence = null;

  @JsonProperty("ClassesOfService")
  @Valid
  private java.util.List<String> classesOfService = new java.util.ArrayList<>();

  @JsonProperty("PreferenceType")
  private ClassOfServicePreferenceTypeEnum preferenceType = null;

  public ClassOfServicePreference _atType(String _atType) {
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

  public ClassOfServicePreference legSequence(java.util.List<Integer> legSequence) {
    this.legSequence = legSequence;
    return this;
  }

  public ClassOfServicePreference addLegSequenceItem(Integer legSequenceItem) {
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

  public ClassOfServicePreference classesOfService(java.util.List<String> classesOfService) {
    this.classesOfService = classesOfService;
    return this;
  }

  public ClassOfServicePreference addClassesOfServiceItem(String classesOfServiceItem) {
    this.classesOfService.add(classesOfServiceItem);
    return this;
  }

  /**
   * Allows user to specify which class(s) of service they want returned in CatalogOfferings
   * @return classesOfService
   **/
  @Schema(required = true, description = "Allows user to specify which class(s) of service they want returned in CatalogOfferings")
      @NotNull

    public java.util.List<String> getClassesOfService() {
    return classesOfService;
  }

  public void setClassesOfService(java.util.List<String> classesOfService) {
    this.classesOfService = classesOfService;
  }

  public ClassOfServicePreference preferenceType(ClassOfServicePreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
    return this;
  }

  /**
   * Get preferenceType
   * @return preferenceType
   **/
  @Schema(description = "")
  
    @Valid
    public ClassOfServicePreferenceTypeEnum getPreferenceType() {
    return preferenceType;
  }

  public void setPreferenceType(ClassOfServicePreferenceTypeEnum preferenceType) {
    this.preferenceType = preferenceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassOfServicePreference classOfServicePreference = (ClassOfServicePreference) o;
    return Objects.equals(this._atType, classOfServicePreference._atType) &&
        Objects.equals(this.legSequence, classOfServicePreference.legSequence) &&
        Objects.equals(this.classesOfService, classOfServicePreference.classesOfService) &&
        Objects.equals(this.preferenceType, classOfServicePreference.preferenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, legSequence, classesOfService, preferenceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassOfServicePreference {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    legSequence: ").append(toIndentedString(legSequence)).append("\n");
    sb.append("    classesOfService: ").append(toIndentedString(classesOfService)).append("\n");
    sb.append("    preferenceType: ").append(toIndentedString(preferenceType)).append("\n");
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
