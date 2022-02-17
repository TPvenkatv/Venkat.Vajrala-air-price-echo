package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.DocumentTypeEnumBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentNumber
 */
@Validated


public class DocumentNumber  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("documentIssuer")
  private String documentIssuer = null;

  @JsonProperty("documentType")
  private DocumentTypeEnumBase documentType = null;

  @JsonProperty("documentTypeExtension")
  private String documentTypeExtension = null;

  public DocumentNumber value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Pattern(regexp="([0-9]+)?") @Size(max=4096)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DocumentNumber documentIssuer(String documentIssuer) {
    this.documentIssuer = documentIssuer;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return documentIssuer
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getDocumentIssuer() {
    return documentIssuer;
  }

  public void setDocumentIssuer(String documentIssuer) {
    this.documentIssuer = documentIssuer;
  }

  public DocumentNumber documentType(DocumentTypeEnumBase documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   **/
  @Schema(description = "")
  
    @Valid
    public DocumentTypeEnumBase getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnumBase documentType) {
    this.documentType = documentType;
  }

  public DocumentNumber documentTypeExtension(String documentTypeExtension) {
    this.documentTypeExtension = documentTypeExtension;
    return this;
  }

  /**
   * Get documentTypeExtension
   * @return documentTypeExtension
   **/
  @Schema(description = "")
  
  @Size(min=1,max=128)   public String getDocumentTypeExtension() {
    return documentTypeExtension;
  }

  public void setDocumentTypeExtension(String documentTypeExtension) {
    this.documentTypeExtension = documentTypeExtension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentNumber documentNumber = (DocumentNumber) o;
    return Objects.equals(this.value, documentNumber.value) &&
        Objects.equals(this.documentIssuer, documentNumber.documentIssuer) &&
        Objects.equals(this.documentType, documentNumber.documentType) &&
        Objects.equals(this.documentTypeExtension, documentNumber.documentTypeExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, documentIssuer, documentType, documentTypeExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentNumber {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    documentIssuer: ").append(toIndentedString(documentIssuer)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentTypeExtension: ").append(toIndentedString(documentTypeExtension)).append("\n");
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
