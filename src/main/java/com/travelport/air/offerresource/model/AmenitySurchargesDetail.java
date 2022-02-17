package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.AmenitySurcharges;
import com.travelport.air.offerresource.model.Surcharge;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AmenitySurchargesDetail
 */
@Validated


public class AmenitySurchargesDetail extends AmenitySurcharges implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Surcharge")
  @Valid
  private java.util.List<Surcharge> surcharge = new java.util.ArrayList<>();

  public AmenitySurchargesDetail surcharge(java.util.List<Surcharge> surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  public AmenitySurchargesDetail addSurchargeItem(Surcharge surchargeItem) {
    this.surcharge.add(surchargeItem);
    return this;
  }

  /**
   * Get surcharge
   * @return surcharge
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1,max=100)   public java.util.List<Surcharge> getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(java.util.List<Surcharge> surcharge) {
    this.surcharge = surcharge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmenitySurchargesDetail amenitySurchargesDetail = (AmenitySurchargesDetail) o;
    return Objects.equals(this.surcharge, amenitySurchargesDetail.surcharge) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surcharge, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmenitySurchargesDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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
