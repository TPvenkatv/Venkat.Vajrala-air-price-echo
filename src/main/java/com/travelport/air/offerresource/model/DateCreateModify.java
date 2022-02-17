package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Time stamp of the creation.
 */
@Schema(description = "Time stamp of the creation.")
@Validated


public class DateCreateModify  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private OffsetDateTime value = null;

  @JsonProperty("creatorID")
  private String creatorID = null;

  @JsonProperty("lastModify")
  private OffsetDateTime lastModify = null;

  @JsonProperty("lastModifierID")
  private String lastModifierID = null;

  @JsonProperty("purge")
  private LocalDate purge = null;

  public DateCreateModify value(OffsetDateTime value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getValue() {
    return value;
  }

  public void setValue(OffsetDateTime value) {
    this.value = value;
  }

  public DateCreateModify creatorID(String creatorID) {
    this.creatorID = creatorID;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return creatorID
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getCreatorID() {
    return creatorID;
  }

  public void setCreatorID(String creatorID) {
    this.creatorID = creatorID;
  }

  public DateCreateModify lastModify(OffsetDateTime lastModify) {
    this.lastModify = lastModify;
    return this;
  }

  /**
   * Time stamp of last modification.
   * @return lastModify
   **/
  @Schema(description = "Time stamp of last modification.")
  
    @Valid
    public OffsetDateTime getLastModify() {
    return lastModify;
  }

  public void setLastModify(OffsetDateTime lastModify) {
    this.lastModify = lastModify;
  }

  public DateCreateModify lastModifierID(String lastModifierID) {
    this.lastModifierID = lastModifierID;
    return this;
  }

  /**
   * Assigned Type: c-1100:StringTiny
   * @return lastModifierID
   **/
  @Schema(description = "Assigned Type: c-1100:StringTiny")
  
  @Size(max=32)   public String getLastModifierID() {
    return lastModifierID;
  }

  public void setLastModifierID(String lastModifierID) {
    this.lastModifierID = lastModifierID;
  }

  public DateCreateModify purge(LocalDate purge) {
    this.purge = purge;
    return this;
  }

  /**
   * Date an item will be purged from a system of record
   * @return purge
   **/
  @Schema(description = "Date an item will be purged from a system of record")
  
    @Valid
    public LocalDate getPurge() {
    return purge;
  }

  public void setPurge(LocalDate purge) {
    this.purge = purge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateCreateModify dateCreateModify = (DateCreateModify) o;
    return Objects.equals(this.value, dateCreateModify.value) &&
        Objects.equals(this.creatorID, dateCreateModify.creatorID) &&
        Objects.equals(this.lastModify, dateCreateModify.lastModify) &&
        Objects.equals(this.lastModifierID, dateCreateModify.lastModifierID) &&
        Objects.equals(this.purge, dateCreateModify.purge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, creatorID, lastModify, lastModifierID, purge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateCreateModify {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    creatorID: ").append(toIndentedString(creatorID)).append("\n");
    sb.append("    lastModify: ").append(toIndentedString(lastModify)).append("\n");
    sb.append("    lastModifierID: ").append(toIndentedString(lastModifierID)).append("\n");
    sb.append("    purge: ").append(toIndentedString(purge)).append("\n");
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
