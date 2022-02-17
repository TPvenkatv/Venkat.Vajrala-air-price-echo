package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentBeforeDeparture
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = PaymentBeforeDepartureDayOfWeek.class, name = "PaymentBeforeDepartureDayOfWeek"),
        @JsonSubTypes.Type(value = PaymentBeforeDepartureDuration.class, name = "PaymentBeforeDepartureDuration"),
})


public class PaymentBeforeDeparture  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("TimeOfDay")
  private String timeOfDay = null;

  public PaymentBeforeDeparture _atType(String _atType) {
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

  public PaymentBeforeDeparture timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * The time of day indicates the earliest time the Offer can be reserved. Used in conjunction with DayOfWeek or Duration
   * @return timeOfDay
   **/
  @Schema(description = "The time of day indicates the earliest time the Offer can be reserved. Used in conjunction with DayOfWeek or Duration")
  
    public String getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBeforeDeparture paymentBeforeDeparture = (PaymentBeforeDeparture) o;
    return Objects.equals(this._atType, paymentBeforeDeparture._atType) &&
        Objects.equals(this.timeOfDay, paymentBeforeDeparture.timeOfDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, timeOfDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBeforeDeparture {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
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
