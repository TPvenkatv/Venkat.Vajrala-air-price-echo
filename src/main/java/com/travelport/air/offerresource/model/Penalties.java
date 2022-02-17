package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Cancel;
import com.travelport.air.offerresource.model.Change;
import com.travelport.air.offerresource.model.PenaltySourceCode;
import com.travelport.air.offerresource.model.WaiverEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Penalties
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class Penalties  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Change")
  @Valid
  private java.util.List<Change> change = null;

  @JsonProperty("Cancel")
  @Valid
  private java.util.List<Cancel> cancel = null;

  @JsonProperty("Waiver")
  @Valid
  private java.util.List<WaiverEnum> waiver = null;

  @JsonProperty("PenaltySourceCode")
  private PenaltySourceCode penaltySourceCode = null;

  @JsonProperty("PassengerTypeCodes")
  @Valid
  private java.util.List<String> passengerTypeCodes = null;

  @JsonProperty("involuntaryInd")
  private Boolean involuntaryInd = null;

  public Penalties _atType(String _atType) {
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

  public Penalties change(java.util.List<Change> change) {
    this.change = change;
    return this;
  }

  public Penalties addChangeItem(Change changeItem) {
    if (this.change == null) {
      this.change = new java.util.ArrayList<>();
    }
    this.change.add(changeItem);
    return this;
  }

  /**
   * Get change
   * @return change
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<Change> getChange() {
    return change;
  }

  public void setChange(java.util.List<Change> change) {
    this.change = change;
  }

  public Penalties cancel(java.util.List<Cancel> cancel) {
    this.cancel = cancel;
    return this;
  }

  public Penalties addCancelItem(Cancel cancelItem) {
    if (this.cancel == null) {
      this.cancel = new java.util.ArrayList<>();
    }
    this.cancel.add(cancelItem);
    return this;
  }

  /**
   * Get cancel
   * @return cancel
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<Cancel> getCancel() {
    return cancel;
  }

  public void setCancel(java.util.List<Cancel> cancel) {
    this.cancel = cancel;
  }

  public Penalties waiver(java.util.List<WaiverEnum> waiver) {
    this.waiver = waiver;
    return this;
  }

  public Penalties addWaiverItem(WaiverEnum waiverItem) {
    if (this.waiver == null) {
      this.waiver = new java.util.ArrayList<>();
    }
    this.waiver.add(waiverItem);
    return this;
  }

  /**
   * Get waiver
   * @return waiver
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public java.util.List<WaiverEnum> getWaiver() {
    return waiver;
  }

  public void setWaiver(java.util.List<WaiverEnum> waiver) {
    this.waiver = waiver;
  }

  public Penalties penaltySourceCode(PenaltySourceCode penaltySourceCode) {
    this.penaltySourceCode = penaltySourceCode;
    return this;
  }

  /**
   * Get penaltySourceCode
   * @return penaltySourceCode
   **/
  @Schema(description = "")
  
    @Valid
    public PenaltySourceCode getPenaltySourceCode() {
    return penaltySourceCode;
  }

  public void setPenaltySourceCode(PenaltySourceCode penaltySourceCode) {
    this.penaltySourceCode = penaltySourceCode;
  }

  public Penalties passengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
    return this;
  }

  public Penalties addPassengerTypeCodesItem(String passengerTypeCodesItem) {
    if (this.passengerTypeCodes == null) {
      this.passengerTypeCodes = new java.util.ArrayList<>();
    }
    this.passengerTypeCodes.add(passengerTypeCodesItem);
    return this;
  }

  /**
   * The passenger type codes that this penalty applies to
   * @return passengerTypeCodes
   **/
  @Schema(description = "The passenger type codes that this penalty applies to")
  
    public java.util.List<String> getPassengerTypeCodes() {
    return passengerTypeCodes;
  }

  public void setPassengerTypeCodes(java.util.List<String> passengerTypeCodes) {
    this.passengerTypeCodes = passengerTypeCodes;
  }

  public Penalties involuntaryInd(Boolean involuntaryInd) {
    this.involuntaryInd = involuntaryInd;
    return this;
  }

  /**
   * Penalties apply for involuntary changes initiated by the airline
   * @return involuntaryInd
   **/
  @Schema(description = "Penalties apply for involuntary changes initiated by the airline")
  
    public Boolean isInvoluntaryInd() {
    return involuntaryInd;
  }

  public void setInvoluntaryInd(Boolean involuntaryInd) {
    this.involuntaryInd = involuntaryInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Penalties penalties = (Penalties) o;
    return Objects.equals(this._atType, penalties._atType) &&
        Objects.equals(this.change, penalties.change) &&
        Objects.equals(this.cancel, penalties.cancel) &&
        Objects.equals(this.waiver, penalties.waiver) &&
        Objects.equals(this.penaltySourceCode, penalties.penaltySourceCode) &&
        Objects.equals(this.passengerTypeCodes, penalties.passengerTypeCodes) &&
        Objects.equals(this.involuntaryInd, penalties.involuntaryInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, change, cancel, waiver, penaltySourceCode, passengerTypeCodes, involuntaryInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Penalties {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    waiver: ").append(toIndentedString(waiver)).append("\n");
    sb.append("    penaltySourceCode: ").append(toIndentedString(penaltySourceCode)).append("\n");
    sb.append("    passengerTypeCodes: ").append(toIndentedString(passengerTypeCodes)).append("\n");
    sb.append("    involuntaryInd: ").append(toIndentedString(involuntaryInd)).append("\n");
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
