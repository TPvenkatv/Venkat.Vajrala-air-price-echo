package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.travelport.air.offerresource.model.DocumentNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentCriteria
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
})


public class PaymentCriteria  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonTypeId
  private String _atType = null;

  @JsonProperty("IssuerIdentificationNumber")
  private String issuerIdentificationNumber = null;

  @JsonProperty("PaymentCardCode")
  private String paymentCardCode = null;

  @JsonProperty("DocumentNumber")
  @Valid
  private java.util.List<DocumentNumber> documentNumber = null;

  @JsonProperty("agencyAccountInd")
  private Boolean agencyAccountInd = null;

  @JsonProperty("bspInd")
  private Boolean bspInd = null;

  @JsonProperty("cashInd")
  private Boolean cashInd = null;

  @JsonProperty("invoiceInd")
  private Boolean invoiceInd = null;

  public PaymentCriteria _atType(String _atType) {
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

  public PaymentCriteria issuerIdentificationNumber(String issuerIdentificationNumber) {
    this.issuerIdentificationNumber = issuerIdentificationNumber;
    return this;
  }

  /**
   * This the BIN/IIN
   * @return issuerIdentificationNumber
   **/
  @Schema(description = "This the BIN/IIN")
  
  @Pattern(regexp="[0-9]{6,11}") @Size(max=32)   public String getIssuerIdentificationNumber() {
    return issuerIdentificationNumber;
  }

  public void setIssuerIdentificationNumber(String issuerIdentificationNumber) {
    this.issuerIdentificationNumber = issuerIdentificationNumber;
  }

  public PaymentCriteria paymentCardCode(String paymentCardCode) {
    this.paymentCardCode = paymentCardCode;
    return this;
  }

  /**
   * A two character code for a credit card, like MC, AX
   * @return paymentCardCode
   **/
  @Schema(description = "A two character code for a credit card, like MC, AX")
  
  @Pattern(regexp="([A-Z0-9]+)?") @Size(max=2)   public String getPaymentCardCode() {
    return paymentCardCode;
  }

  public void setPaymentCardCode(String paymentCardCode) {
    this.paymentCardCode = paymentCardCode;
  }

  public PaymentCriteria documentNumber(java.util.List<DocumentNumber> documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  public PaymentCriteria addDocumentNumberItem(DocumentNumber documentNumberItem) {
    if (this.documentNumber == null) {
      this.documentNumber = new java.util.ArrayList<>();
    }
    this.documentNumber.add(documentNumberItem);
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
   **/
  @Schema(description = "")
      @Valid
  @Size(max=100)   public java.util.List<DocumentNumber> getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(java.util.List<DocumentNumber> documentNumber) {
    this.documentNumber = documentNumber;
  }

  public PaymentCriteria agencyAccountInd(Boolean agencyAccountInd) {
    this.agencyAccountInd = agencyAccountInd;
    return this;
  }

  /**
   * If true, payment will be made by agency account
   * @return agencyAccountInd
   **/
  @Schema(description = "If true, payment will be made by agency account")
  
    public Boolean isAgencyAccountInd() {
    return agencyAccountInd;
  }

  public void setAgencyAccountInd(Boolean agencyAccountInd) {
    this.agencyAccountInd = agencyAccountInd;
  }

  public PaymentCriteria bspInd(Boolean bspInd) {
    this.bspInd = bspInd;
    return this;
  }

  /**
   * If true, payment will be made by BSP
   * @return bspInd
   **/
  @Schema(description = "If true, payment will be made by BSP")
  
    public Boolean isBspInd() {
    return bspInd;
  }

  public void setBspInd(Boolean bspInd) {
    this.bspInd = bspInd;
  }

  public PaymentCriteria cashInd(Boolean cashInd) {
    this.cashInd = cashInd;
    return this;
  }

  /**
   * If true, payment will be made by cash
   * @return cashInd
   **/
  @Schema(description = "If true, payment will be made by cash")
  
    public Boolean isCashInd() {
    return cashInd;
  }

  public void setCashInd(Boolean cashInd) {
    this.cashInd = cashInd;
  }

  public PaymentCriteria invoiceInd(Boolean invoiceInd) {
    this.invoiceInd = invoiceInd;
    return this;
  }

  /**
   * If true, payment will be made by invoice
   * @return invoiceInd
   **/
  @Schema(description = "If true, payment will be made by invoice")
  
    public Boolean isInvoiceInd() {
    return invoiceInd;
  }

  public void setInvoiceInd(Boolean invoiceInd) {
    this.invoiceInd = invoiceInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCriteria paymentCriteria = (PaymentCriteria) o;
    return Objects.equals(this._atType, paymentCriteria._atType) &&
        Objects.equals(this.issuerIdentificationNumber, paymentCriteria.issuerIdentificationNumber) &&
        Objects.equals(this.paymentCardCode, paymentCriteria.paymentCardCode) &&
        Objects.equals(this.documentNumber, paymentCriteria.documentNumber) &&
        Objects.equals(this.agencyAccountInd, paymentCriteria.agencyAccountInd) &&
        Objects.equals(this.bspInd, paymentCriteria.bspInd) &&
        Objects.equals(this.cashInd, paymentCriteria.cashInd) &&
        Objects.equals(this.invoiceInd, paymentCriteria.invoiceInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atType, issuerIdentificationNumber, paymentCardCode, documentNumber, agencyAccountInd, bspInd, cashInd, invoiceInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCriteria {\n");
    
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    issuerIdentificationNumber: ").append(toIndentedString(issuerIdentificationNumber)).append("\n");
    sb.append("    paymentCardCode: ").append(toIndentedString(paymentCardCode)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    agencyAccountInd: ").append(toIndentedString(agencyAccountInd)).append("\n");
    sb.append("    bspInd: ").append(toIndentedString(bspInd)).append("\n");
    sb.append("    cashInd: ").append(toIndentedString(cashInd)).append("\n");
    sb.append("    invoiceInd: ").append(toIndentedString(invoiceInd)).append("\n");
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
