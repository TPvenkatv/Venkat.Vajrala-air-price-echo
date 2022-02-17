package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.DayOfWeekDuration;
import com.travelport.air.offerresource.model.DayOfWeekEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DayOfWeekDurationDayOfWeek
 */
@Validated


public class DayOfWeekDurationDayOfWeek extends DayOfWeekDuration implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("DayOfWeek")
  private DayOfWeekEnum dayOfWeek = null;

  public DayOfWeekDurationDayOfWeek dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayOfWeekDurationDayOfWeek dayOfWeekDurationDayOfWeek = (DayOfWeekDurationDayOfWeek) o;
    return Objects.equals(this.dayOfWeek, dayOfWeekDurationDayOfWeek.dayOfWeek) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekDurationDayOfWeek {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
