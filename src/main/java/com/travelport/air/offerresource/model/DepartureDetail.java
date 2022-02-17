package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Departure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartureDetail
 */
@Validated


public class DepartureDetail extends Departure implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("terminal")
  private String terminal = null;

  @JsonProperty("country")
  private String country = null;

  public DepartureDetail terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringAlphaNumeric
   * @return terminal
   **/
  @Schema(description = "Assigned Type: c-1100:StringAlphaNumeric")
  
  @Pattern(regexp="([0-9a-zA-Z]+)?") @Size(max=4096)   public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  public DepartureDetail country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Assigned Type: c-1100:CountryCodeISO
   * @return country
   **/
  @Schema(description = "Assigned Type: c-1100:CountryCodeISO")
  
  @Pattern(regexp="[a-zA-Z]{2}")   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartureDetail departureDetail = (DepartureDetail) o;
    return Objects.equals(this.terminal, departureDetail.terminal) &&
        Objects.equals(this.country, departureDetail.country) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminal, country, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
