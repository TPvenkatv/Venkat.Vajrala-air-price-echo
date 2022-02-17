package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.PaymentBeforeDeparture;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentBeforeDepartureDuration
 */
@Validated


public class PaymentBeforeDepartureDuration extends PaymentBeforeDeparture implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Duration")
  private String duration = null;

  public PaymentBeforeDepartureDuration duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The advance duration the Offer can be reserved. e.g: 40 days in advance of the first flight
   * @return duration
   **/
  @Schema(required = true, description = "The advance duration the Offer can be reserved. e.g: 40 days in advance of the first flight")
      @NotNull

    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBeforeDepartureDuration paymentBeforeDepartureDuration = (PaymentBeforeDepartureDuration) o;
    return Objects.equals(this.duration, paymentBeforeDepartureDuration.duration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBeforeDepartureDuration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
