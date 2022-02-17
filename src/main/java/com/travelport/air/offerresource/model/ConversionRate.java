package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A conversion metric from standard to another with the contextual authority such as IATA, OAG, ISO, etc.
 */
@Schema(description = "A conversion metric from standard to another with the contextual authority such as IATA, OAG, ISO, etc.")
@Validated


public class ConversionRate  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("rateAuthority")
  private String rateAuthority = null;

  @JsonProperty("rateAsOf")
  private OffsetDateTime rateAsOf = null;

  public ConversionRate value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public ConversionRate rateAuthority(String rateAuthority) {
    this.rateAuthority = rateAuthority;
    return this;
  }

  /**
   * Assigned Type: c-1100:CodeContext
   * @return rateAuthority
   **/
  @Schema(description = "Assigned Type: c-1100:CodeContext")
  
  @Size(max=32)   public String getRateAuthority() {
    return rateAuthority;
  }

  public void setRateAuthority(String rateAuthority) {
    this.rateAuthority = rateAuthority;
  }

  public ConversionRate rateAsOf(OffsetDateTime rateAsOf) {
    this.rateAsOf = rateAsOf;
    return this;
  }

  /**
   * Assigned Type: c-1100:DateTime
   * @return rateAsOf
   **/
  @Schema(description = "Assigned Type: c-1100:DateTime")
  
    @Valid
    public OffsetDateTime getRateAsOf() {
    return rateAsOf;
  }

  public void setRateAsOf(OffsetDateTime rateAsOf) {
    this.rateAsOf = rateAsOf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionRate conversionRate = (ConversionRate) o;
    return Objects.equals(this.value, conversionRate.value) &&
        Objects.equals(this.rateAuthority, conversionRate.rateAuthority) &&
        Objects.equals(this.rateAsOf, conversionRate.rateAsOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, rateAuthority, rateAsOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionRate {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rateAuthority: ").append(toIndentedString(rateAuthority)).append("\n");
    sb.append("    rateAsOf: ").append(toIndentedString(rateAsOf)).append("\n");
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
