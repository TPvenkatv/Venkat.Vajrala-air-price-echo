package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.DayOfWeekEnum;
import com.travelport.air.offerresource.model.MinimumStay;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinimumStayApplies
 */
@Validated


public class MinimumStayApplies extends MinimumStay implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("mustIncludeDayOfWeek")
  private DayOfWeekEnum mustIncludeDayOfWeek = null;

  @JsonProperty("originDayOfWeek")
  private DayOfWeekEnum originDayOfWeek = null;

  @JsonProperty("returnTime")
  private String returnTime = null;

  @JsonProperty("Duration")
  private String duration = null;

  public MinimumStayApplies mustIncludeDayOfWeek(DayOfWeekEnum mustIncludeDayOfWeek) {
    this.mustIncludeDayOfWeek = mustIncludeDayOfWeek;
    return this;
  }

  /**
   * Get mustIncludeDayOfWeek
   * @return mustIncludeDayOfWeek
   **/
  @Schema(description = "")
  
    @Valid
    public DayOfWeekEnum getMustIncludeDayOfWeek() {
    return mustIncludeDayOfWeek;
  }

  public void setMustIncludeDayOfWeek(DayOfWeekEnum mustIncludeDayOfWeek) {
    this.mustIncludeDayOfWeek = mustIncludeDayOfWeek;
  }

  public MinimumStayApplies originDayOfWeek(DayOfWeekEnum originDayOfWeek) {
    this.originDayOfWeek = originDayOfWeek;
    return this;
  }

  /**
   * Get originDayOfWeek
   * @return originDayOfWeek
   **/
  @Schema(description = "")
  
    @Valid
    public DayOfWeekEnum getOriginDayOfWeek() {
    return originDayOfWeek;
  }

  public void setOriginDayOfWeek(DayOfWeekEnum originDayOfWeek) {
    this.originDayOfWeek = originDayOfWeek;
  }

  public MinimumStayApplies returnTime(String returnTime) {
    this.returnTime = returnTime;
    return this;
  }

  /**
   * Assigned Type: ota2:LocalTime
   * @return returnTime
   **/
  @Schema(description = "Assigned Type: ota2:LocalTime")
  
  @Pattern(regexp="(([01]\\d|2[0-3])((:?)[0-5]\\d)?|24\\:?00)((:?)[0-5]\\d)?([\\.,]\\d+(?!:))?")   public String getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(String returnTime) {
    this.returnTime = returnTime;
  }

  public MinimumStayApplies duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Minimum duration
   * @return duration
   **/
  @Schema(required = true, description = "Minimum duration")
      @NotNull

    public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimumStayApplies minimumStayApplies = (MinimumStayApplies) o;
    return Objects.equals(this.mustIncludeDayOfWeek, minimumStayApplies.mustIncludeDayOfWeek) &&
        Objects.equals(this.originDayOfWeek, minimumStayApplies.originDayOfWeek) &&
        Objects.equals(this.returnTime, minimumStayApplies.returnTime) &&
        Objects.equals(this.duration, minimumStayApplies.duration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mustIncludeDayOfWeek, originDayOfWeek, returnTime, duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimumStayApplies {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mustIncludeDayOfWeek: ").append(toIndentedString(mustIncludeDayOfWeek)).append("\n");
    sb.append("    originDayOfWeek: ").append(toIndentedString(originDayOfWeek)).append("\n");
    sb.append("    returnTime: ").append(toIndentedString(returnTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
