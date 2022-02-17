package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.Maximum;
import com.travelport.air.offerresource.model.Minimum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundPenaltyRange
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class RefundPenaltyRange  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Minimum")
  private Minimum minimum = null;

  @JsonProperty("Maximum")
  private Maximum maximum = null;

  public RefundPenaltyRange _atType(String _atType) {
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

  public RefundPenaltyRange minimum(Minimum minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
   **/
  @Schema(description = "")
  
    @Valid
    public Minimum getMinimum() {
    return minimum;
  }

  public void setMinimum(Minimum minimum) {
    this.minimum = minimum;
  }

  public RefundPenaltyRange maximum(Maximum maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
   **/
  @Schema(description = "")
  
    @Valid
    public Maximum getMaximum() {
    return maximum;
  }

  public void setMaximum(Maximum maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundPenaltyRange refundPenaltyRange = (RefundPenaltyRange) o;
    return Objects.equals(this._atType, refundPenaltyRange._atType) &&
        Objects.equals(this.minimum, refundPenaltyRange.minimum) &&
        Objects.equals(this.maximum, refundPenaltyRange.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundPenaltyRange {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
