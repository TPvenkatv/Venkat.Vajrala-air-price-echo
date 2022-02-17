package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.Offer;
import com.travelport.air.offerresource.model.PriceDetail;
import com.travelport.air.offerresource.model.Product;
import com.travelport.air.offerresource.model.TermsAndConditionsFullID;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferUpsell
 */
@Validated


public class OfferUpsell extends Offer implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("OfferUpsellInd")
  private Boolean offerUpsellInd = null;

  public OfferUpsell offerUpsellInd(Boolean offerUpsellInd) {
    this.offerUpsellInd = offerUpsellInd;
    return this;
  }

  /**
   * If true, the OfferUpsell contains ancillary offerings offered in connection with the ParentOffer
   * @return offerUpsellInd
   **/
  @Schema(description = "If true, the OfferUpsell contains ancillary offerings offered in connection with the ParentOffer")
  
    public Boolean isOfferUpsellInd() {
    return offerUpsellInd;
  }

  public void setOfferUpsellInd(Boolean offerUpsellInd) {
    this.offerUpsellInd = offerUpsellInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferUpsell offerUpsell = (OfferUpsell) o;
    return Objects.equals(this.offerUpsellInd, offerUpsell.offerUpsellInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerUpsellInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferUpsell {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    offerUpsellInd: ").append(toIndentedString(offerUpsellInd)).append("\n");
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
