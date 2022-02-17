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
 * The GST Registration Number for this Organization
 */
@Schema(description = "The GST Registration Number for this Organization")
@Validated


public class GSTRegistrationNumber  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("email")
  private String email = null;

  public GSTRegistrationNumber value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=512)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GSTRegistrationNumber telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return telephone
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public GSTRegistrationNumber address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return address
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public GSTRegistrationNumber country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Assigned Type: c-1100:CountryCodeISO
   * @return country
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:CountryCodeISO")
      @NotNull

  @Pattern(regexp="[a-zA-Z]{2}")   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GSTRegistrationNumber companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Assigned Type: c-1100:String
   * @return companyName
   **/
  @Schema(description = "Assigned Type: c-1100:String")
  
  @Size(max=512)   public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public GSTRegistrationNumber email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringShort
   * @return email
   **/
  @Schema(description = "Assigned Type: c-1100:StringShort")
  
  @Size(max=128)   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GSTRegistrationNumber gsTRegistrationNumber = (GSTRegistrationNumber) o;
    return Objects.equals(this.value, gsTRegistrationNumber.value) &&
        Objects.equals(this.telephone, gsTRegistrationNumber.telephone) &&
        Objects.equals(this.address, gsTRegistrationNumber.address) &&
        Objects.equals(this.country, gsTRegistrationNumber.country) &&
        Objects.equals(this.companyName, gsTRegistrationNumber.companyName) &&
        Objects.equals(this.email, gsTRegistrationNumber.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, telephone, address, country, companyName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GSTRegistrationNumber {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
