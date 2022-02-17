package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.GSTRegistrationNumber;
import com.travelport.air.offerresource.model.OrganizationIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrganizationInformation
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class OrganizationInformation  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("OrganizationIdentifier")
  @Valid
  private java.util.List<OrganizationIdentifier> organizationIdentifier = null;

  @JsonProperty("GSTRegistrationNumber")
  @Valid
  private java.util.List<GSTRegistrationNumber> gsTRegistrationNumber = null;

  public OrganizationInformation _atType(String _atType) {
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

  public OrganizationInformation organizationIdentifier(java.util.List<OrganizationIdentifier> organizationIdentifier) {
    this.organizationIdentifier = organizationIdentifier;
    return this;
  }

  public OrganizationInformation addOrganizationIdentifierItem(OrganizationIdentifier organizationIdentifierItem) {
    if (this.organizationIdentifier == null) {
      this.organizationIdentifier = new java.util.ArrayList<>();
    }
    this.organizationIdentifier.add(organizationIdentifierItem);
    return this;
  }

  /**
   * Get organizationIdentifier
   * @return organizationIdentifier
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<OrganizationIdentifier> getOrganizationIdentifier() {
    return organizationIdentifier;
  }

  public void setOrganizationIdentifier(java.util.List<OrganizationIdentifier> organizationIdentifier) {
    this.organizationIdentifier = organizationIdentifier;
  }

  public OrganizationInformation gsTRegistrationNumber(java.util.List<GSTRegistrationNumber> gsTRegistrationNumber) {
    this.gsTRegistrationNumber = gsTRegistrationNumber;
    return this;
  }

  public OrganizationInformation addGsTRegistrationNumberItem(GSTRegistrationNumber gsTRegistrationNumberItem) {
    if (this.gsTRegistrationNumber == null) {
      this.gsTRegistrationNumber = new java.util.ArrayList<>();
    }
    this.gsTRegistrationNumber.add(gsTRegistrationNumberItem);
    return this;
  }

  /**
   * Get gsTRegistrationNumber
   * @return gsTRegistrationNumber
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<GSTRegistrationNumber> getGsTRegistrationNumber() {
    return gsTRegistrationNumber;
  }

  public void setGsTRegistrationNumber(java.util.List<GSTRegistrationNumber> gsTRegistrationNumber) {
    this.gsTRegistrationNumber = gsTRegistrationNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationInformation organizationInformation = (OrganizationInformation) o;
    return Objects.equals(this._atType, organizationInformation._atType) &&
        Objects.equals(this.organizationIdentifier, organizationInformation.organizationIdentifier) &&
        Objects.equals(this.gsTRegistrationNumber, organizationInformation.gsTRegistrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, organizationIdentifier, gsTRegistrationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationInformation {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    organizationIdentifier: ").append(toIndentedString(organizationIdentifier)).append("\n");
    sb.append("    gsTRegistrationNumber: ").append(toIndentedString(gsTRegistrationNumber)).append("\n");
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
