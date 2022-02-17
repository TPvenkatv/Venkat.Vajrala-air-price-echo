package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartureArrival
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepartureArrivalDetail.class, name = "DepartureArrivalDetail"),
})


public class DepartureArrival  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("time")
  private String time = null;

  public DepartureArrival _atType(String _atType) {
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

  public DepartureArrival location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Assigned Type: c-1100:LocationCodeIATA
   * @return location
   **/
  @Schema(required = true, description = "Assigned Type: c-1100:LocationCodeIATA")
      @NotNull

  @Pattern(regexp="([a-zA-Z]{3})") @Size(min=3,max=3)   public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DepartureArrival date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Local date of for arrival or departure
   * @return date
   **/
  @Schema(required = true, description = "Local date of for arrival or departure")
      @NotNull

    @Valid
    public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DepartureArrival time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Local time Date of for arrival or departure
   * @return time
   **/
  @Schema(required = true, description = "Local time Date of for arrival or departure")
      @NotNull

    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartureArrival departureArrival = (DepartureArrival) o;
    return Objects.equals(this._atType, departureArrival._atType) &&
        Objects.equals(this.location, departureArrival.location) &&
        Objects.equals(this.date, departureArrival.date) &&
        Objects.equals(this.time, departureArrival.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, location, date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureArrival {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
