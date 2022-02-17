package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.TextFormatEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides text and indicates whether it is formatted or not.
 */
@Schema(description = "Provides text and indicates whether it is formatted or not.")
@Validated


public class TextFormatted  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("textFormat")
  private TextFormatEnum textFormat = null;

  public TextFormatted value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
  @Size(max=4096)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TextFormatted language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language in which the text is provided.
   * @return language
   **/
  @Schema(description = "The language in which the text is provided.")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public TextFormatted textFormat(TextFormatEnum textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  /**
   * Get textFormat
   * @return textFormat
   **/
  @Schema(description = "")
  
    @Valid
    public TextFormatEnum getTextFormat() {
    return textFormat;
  }

  public void setTextFormat(TextFormatEnum textFormat) {
    this.textFormat = textFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormatted textFormatted = (TextFormatted) o;
    return Objects.equals(this.value, textFormatted.value) &&
        Objects.equals(this.language, textFormatted.language) &&
        Objects.equals(this.textFormat, textFormatted.textFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, language, textFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormatted {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
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
