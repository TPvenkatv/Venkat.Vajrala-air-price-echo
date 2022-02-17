package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.CurrencyRateConversion;
import com.travelport.air.offerresource.model.Identifier;
import com.travelport.air.offerresource.model.NameValuePair;
import com.travelport.air.offerresource.model.NextSteps;
import com.travelport.air.offerresource.model.Offer;
import com.travelport.air.offerresource.model.ReferenceList;
import com.travelport.air.offerresource.model.Result;
import com.travelport.air.offerresource.model.SupplementalInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferListResponse
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class OfferListResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("Offer")
  @Valid
  private java.util.List<Offer> offer = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("traceId")
  private String traceId = null;

  @JsonProperty("Result")
  private Result result = null;

  @JsonProperty("Identifier")
  private Identifier identifier = null;

  @JsonProperty("NextSteps")
  private NextSteps nextSteps = null;

  @JsonProperty("ReferenceList")
  @Valid
  private java.util.List<ReferenceList> referenceList = null;

  @JsonProperty("CurrencyRateConversion")
  @Valid
  private java.util.List<CurrencyRateConversion> currencyRateConversion = null;

  @JsonProperty("SupplementalInformation")
  @Valid
  private java.util.List<SupplementalInformation> supplementalInformation = null;

  @JsonProperty("DiagnosticResponse")
  @Valid
  private java.util.List<NameValuePair> diagnosticResponse = null;

  public OfferListResponse _atType(String _atType) {
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

  public OfferListResponse offer(java.util.List<Offer> offer) {
    this.offer = offer;
    return this;
  }

  public OfferListResponse addOfferItem(Offer offerItem) {
    if (this.offer == null) {
      this.offer = new java.util.ArrayList<>();
    }
    this.offer.add(offerItem);
    return this;
  }

  /**
   * Get offer
   * @return offer
   **/
  @Schema(description = "")
      @Valid
  @Size(max=1000)   public java.util.List<Offer> getOffer() {
    return offer;
  }

  public void setOffer(java.util.List<Offer> offer) {
    this.offer = offer;
  }

  public OfferListResponse transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique transaction, correlation or tracking id for a single request and reply i.e. for a single transaction. Should be a 128 bit GUID format. Also know as E2ETrackingId.
   * @return transactionId
   **/
  @Schema(description = "Unique transaction, correlation or tracking id for a single request and reply i.e. for a single transaction. Should be a 128 bit GUID format. Also know as E2ETrackingId.")
  
    public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OfferListResponse traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Optional ID for internal child transactions created for processing a single request (single transaction). Should be a 128 bit GUID format. Also known as ChildTrackingId.
   * @return traceId
   **/
  @Schema(description = "Optional ID for internal child transactions created for processing a single request (single transaction). Should be a 128 bit GUID format. Also known as ChildTrackingId.")
  
    public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public OfferListResponse result(Result result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(description = "")
  
    @Valid
    public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public OfferListResponse identifier(Identifier identifier) {
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

  public OfferListResponse nextSteps(NextSteps nextSteps) {
    this.nextSteps = nextSteps;
    return this;
  }

  /**
   * Get nextSteps
   * @return nextSteps
   **/
  @Schema(description = "")
  
    @Valid
    public NextSteps getNextSteps() {
    return nextSteps;
  }

  public void setNextSteps(NextSteps nextSteps) {
    this.nextSteps = nextSteps;
  }

  public OfferListResponse referenceList(java.util.List<ReferenceList> referenceList) {
    this.referenceList = referenceList;
    return this;
  }

  public OfferListResponse addReferenceListItem(ReferenceList referenceListItem) {
    if (this.referenceList == null) {
      this.referenceList = new java.util.ArrayList<>();
    }
    this.referenceList.add(referenceListItem);
    return this;
  }

  /**
   * Get referenceList
   * @return referenceList
   **/
  @Schema(description = "")
      @Valid
  @Size(max=5)   public java.util.List<ReferenceList> getReferenceList() {
    return referenceList;
  }

  public void setReferenceList(java.util.List<ReferenceList> referenceList) {
    this.referenceList = referenceList;
  }

  public OfferListResponse currencyRateConversion(java.util.List<CurrencyRateConversion> currencyRateConversion) {
    this.currencyRateConversion = currencyRateConversion;
    return this;
  }

  public OfferListResponse addCurrencyRateConversionItem(CurrencyRateConversion currencyRateConversionItem) {
    if (this.currencyRateConversion == null) {
      this.currencyRateConversion = new java.util.ArrayList<>();
    }
    this.currencyRateConversion.add(currencyRateConversionItem);
    return this;
  }

  /**
   * Get currencyRateConversion
   * @return currencyRateConversion
   **/
  @Schema(description = "")
      @Valid
  @Size(max=5)   public java.util.List<CurrencyRateConversion> getCurrencyRateConversion() {
    return currencyRateConversion;
  }

  public void setCurrencyRateConversion(java.util.List<CurrencyRateConversion> currencyRateConversion) {
    this.currencyRateConversion = currencyRateConversion;
  }

  public OfferListResponse supplementalInformation(java.util.List<SupplementalInformation> supplementalInformation) {
    this.supplementalInformation = supplementalInformation;
    return this;
  }

  public OfferListResponse addSupplementalInformationItem(SupplementalInformation supplementalInformationItem) {
    if (this.supplementalInformation == null) {
      this.supplementalInformation = new java.util.ArrayList<>();
    }
    this.supplementalInformation.add(supplementalInformationItem);
    return this;
  }

  /**
   * Get supplementalInformation
   * @return supplementalInformation
   **/
  @Schema(description = "")
      @Valid
    public java.util.List<SupplementalInformation> getSupplementalInformation() {
    return supplementalInformation;
  }

  public void setSupplementalInformation(java.util.List<SupplementalInformation> supplementalInformation) {
    this.supplementalInformation = supplementalInformation;
  }

  public OfferListResponse diagnosticResponse(java.util.List<NameValuePair> diagnosticResponse) {
    this.diagnosticResponse = diagnosticResponse;
    return this;
  }

  public OfferListResponse addDiagnosticResponseItem(NameValuePair diagnosticResponseItem) {
    if (this.diagnosticResponse == null) {
      this.diagnosticResponse = new java.util.ArrayList<>();
    }
    this.diagnosticResponse.add(diagnosticResponseItem);
    return this;
  }

  /**
   * Get diagnosticResponse
   * @return diagnosticResponse
   **/
  @Schema(description = "")
      @Valid
  @Size(max=20)   public java.util.List<NameValuePair> getDiagnosticResponse() {
    return diagnosticResponse;
  }

  public void setDiagnosticResponse(java.util.List<NameValuePair> diagnosticResponse) {
    this.diagnosticResponse = diagnosticResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListResponse offerListResponse = (OfferListResponse) o;
    return Objects.equals(this._atType, offerListResponse._atType) &&
        Objects.equals(this.offer, offerListResponse.offer) &&
        Objects.equals(this.transactionId, offerListResponse.transactionId) &&
        Objects.equals(this.traceId, offerListResponse.traceId) &&
        Objects.equals(this.result, offerListResponse.result) &&
        Objects.equals(this.identifier, offerListResponse.identifier) &&
        Objects.equals(this.nextSteps, offerListResponse.nextSteps) &&
        Objects.equals(this.referenceList, offerListResponse.referenceList) &&
        Objects.equals(this.currencyRateConversion, offerListResponse.currencyRateConversion) &&
        Objects.equals(this.supplementalInformation, offerListResponse.supplementalInformation) &&
        Objects.equals(this.diagnosticResponse, offerListResponse.diagnosticResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, offer, transactionId, traceId, result, identifier, nextSteps, referenceList, currencyRateConversion, supplementalInformation, diagnosticResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListResponse {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    nextSteps: ").append(toIndentedString(nextSteps)).append("\n");
    sb.append("    referenceList: ").append(toIndentedString(referenceList)).append("\n");
    sb.append("    currencyRateConversion: ").append(toIndentedString(currencyRateConversion)).append("\n");
    sb.append("    supplementalInformation: ").append(toIndentedString(supplementalInformation)).append("\n");
    sb.append("    diagnosticResponse: ").append(toIndentedString(diagnosticResponse)).append("\n");
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
