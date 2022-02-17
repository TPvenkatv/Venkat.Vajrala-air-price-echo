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
 * ArrivalFlightID
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = ArrivalFlightDetail.class, name = "ArrivalFlightDetail"),
        @JsonSubTypes.Type(value = ArrivalFlightSummary.class, name = "ArrivalFlightSummary"),
        @JsonSubTypes.Type(value = ArrivalFlight.class, name = "ArrivalFlight"),
})


public class ArrivalFlightID  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("FlightRef")
  private String flightRef = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  public ArrivalFlightID _atType(String _atType) {
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

  public ArrivalFlightID id(String id) {
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

  public ArrivalFlightID flightRef(String flightRef) {
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

  public ArrivalFlightID identifier(Identifier identifier) {
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
    ArrivalFlightID arrivalFlightID = (ArrivalFlightID) o;
    return Objects.equals(this._atType, arrivalFlightID._atType) &&
        Objects.equals(this.id, arrivalFlightID.id) &&
        Objects.equals(this.flightRef, arrivalFlightID.flightRef) &&
        Objects.equals(this.identifier, arrivalFlightID.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, id, flightRef, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrivalFlightID {\n");
    
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
