package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.ConnectionTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FlightType
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class FlightType  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("connectionType")
  private ConnectionTypeEnum connectionType = null;

  @JsonProperty("excludeInterlineConnectionsInd")
  private Boolean excludeInterlineConnectionsInd = null;

  public FlightType _atType(String _atType) {
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

  public FlightType connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Get connectionType
   * @return connectionType
   **/
  @Schema(description = "")
  
    @Valid
    public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public FlightType excludeInterlineConnectionsInd(Boolean excludeInterlineConnectionsInd) {
    this.excludeInterlineConnectionsInd = excludeInterlineConnectionsInd;
    return this;
  }

  /**
   * If present and true, exclude interline connections
   * @return excludeInterlineConnectionsInd
   **/
  @Schema(description = "If present and true, exclude interline connections")
  
    public Boolean isExcludeInterlineConnectionsInd() {
    return excludeInterlineConnectionsInd;
  }

  public void setExcludeInterlineConnectionsInd(Boolean excludeInterlineConnectionsInd) {
    this.excludeInterlineConnectionsInd = excludeInterlineConnectionsInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightType flightType = (FlightType) o;
    return Objects.equals(this._atType, flightType._atType) &&
        Objects.equals(this.connectionType, flightType.connectionType) &&
        Objects.equals(this.excludeInterlineConnectionsInd, flightType.excludeInterlineConnectionsInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, connectionType, excludeInterlineConnectionsInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightType {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    excludeInterlineConnectionsInd: ").append(toIndentedString(excludeInterlineConnectionsInd)).append("\n");
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
