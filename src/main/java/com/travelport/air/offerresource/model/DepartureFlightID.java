package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Identifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepartureFlightID
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepartureFlightDetail.class, name = "DepartureFlightDetail"),
        @JsonSubTypes.Type(value = DepartureFlightSummary.class, name = "DepartureFlightSummary"),
        @JsonSubTypes.Type(value = DepartureFlight.class, name = "DepartureFlight"),
})


public class DepartureFlightID  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("FlightRef")
  private String flightRef = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  public DepartureFlightID _atType(String _atType) {
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

  public DepartureFlightID id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Internal ID
   * @return id
   **/
  @Schema(description = "Internal ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepartureFlightID flightRef(String flightRef) {
    this.flightRef = flightRef;
    return this;
  }

  /**
   * Reference to a Flight object eslewhere in the message
   * @return flightRef
   **/
  @Schema(description = "Reference to a Flight object eslewhere in the message")
  
    public String getFlightRef() {
    return flightRef;
  }

  public void setFlightRef(String flightRef) {
    this.flightRef = flightRef;
  }

  public DepartureFlightID identifier(Identifier identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   **/
  @Schema(description = "")
  
    @Valid
    public Identifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartureFlightID departureFlightID = (DepartureFlightID) o;
    return Objects.equals(this._atType, departureFlightID._atType) &&
        Objects.equals(this.id, departureFlightID.id) &&
        Objects.equals(this.flightRef, departureFlightID.flightRef) &&
        Objects.equals(this.identifier, departureFlightID.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, flightRef, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureFlightID {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flightRef: ").append(toIndentedString(flightRef)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
