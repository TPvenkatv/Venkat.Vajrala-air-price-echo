package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.BaggageAllowance;
import com.travelport.air.offerresource.model.BaggageItem;
import com.travelport.air.offerresource.model.BaggageTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaggageAllowanceDetail
 */
@Validated


public class BaggageAllowanceDetail extends BaggageAllowance implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("url")
  private String url = null;

  public BaggageAllowanceDetail url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url for the airline's baggage information web site
   * @return url
   **/
  @Schema(description = "Url for the airline's baggage information web site")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageAllowanceDetail baggageAllowanceDetail = (BaggageAllowanceDetail) o;
    return Objects.equals(this.url, baggageAllowanceDetail.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageAllowanceDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
