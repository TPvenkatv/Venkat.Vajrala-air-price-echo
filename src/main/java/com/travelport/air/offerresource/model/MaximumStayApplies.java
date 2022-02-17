package com.travelport.air.offerresource.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.travelport.air.offerresource.model.MaximumStay;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MaximumStayApplies
 */
@Validated


public class MaximumStayApplies extends MaximumStay implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("maximumStayDuration")
  private String maximumStayDuration = null;

  @JsonProperty("maximumStayDate")
  private LocalDate maximumStayDate = null;

  @JsonProperty("returnTime")
  private String returnTime = null;

  @JsonProperty("mustCommenceByInd")
  private Boolean mustCommenceByInd = null;

  @JsonProperty("mustCompleteByInd")
  private Boolean mustCompleteByInd = null;

  @JsonProperty("fromDateOfIssueInd")
  private Boolean fromDateOfIssueInd = null;

  @JsonProperty("earliestAppliesInd")
  private Boolean earliestAppliesInd = null;

  @JsonProperty("latestAppliesInd")
  private Boolean latestAppliesInd = null;

  public MaximumStayApplies maximumStayDuration(String maximumStayDuration) {
    this.maximumStayDuration = maximumStayDuration;
    return this;
  }

  /**
   * Get maximumStayDuration
   * @return maximumStayDuration
   **/
  @Schema(description = "")
  
    public String getMaximumStayDuration() {
    return maximumStayDuration;
  }

  public void setMaximumStayDuration(String maximumStayDuration) {
    this.maximumStayDuration = maximumStayDuration;
  }

  public MaximumStayApplies maximumStayDate(LocalDate maximumStayDate) {
    this.maximumStayDate = maximumStayDate;
    return this;
  }

  /**
   * Get maximumStayDate
   * @return maximumStayDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getMaximumStayDate() {
    return maximumStayDate;
  }

  public void setMaximumStayDate(LocalDate maximumStayDate) {
    this.maximumStayDate = maximumStayDate;
  }

  public MaximumStayApplies returnTime(String returnTime) {
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

  public MaximumStayApplies mustCommenceByInd(Boolean mustCommenceByInd) {
    this.mustCommenceByInd = mustCommenceByInd;
    return this;
  }

  /**
   * Indicates if travel must commence by this date/duration
   * @return mustCommenceByInd
   **/
  @Schema(description = "Indicates if travel must commence by this date/duration")
  
    public Boolean isMustCommenceByInd() {
    return mustCommenceByInd;
  }

  public void setMustCommenceByInd(Boolean mustCommenceByInd) {
    this.mustCommenceByInd = mustCommenceByInd;
  }

  public MaximumStayApplies mustCompleteByInd(Boolean mustCompleteByInd) {
    this.mustCompleteByInd = mustCompleteByInd;
    return this;
  }

  /**
   * Indicates if travel must complete by this date/duration
   * @return mustCompleteByInd
   **/
  @Schema(description = "Indicates if travel must complete by this date/duration")
  
    public Boolean isMustCompleteByInd() {
    return mustCompleteByInd;
  }

  public void setMustCompleteByInd(Boolean mustCompleteByInd) {
    this.mustCompleteByInd = mustCompleteByInd;
  }

  public MaximumStayApplies fromDateOfIssueInd(Boolean fromDateOfIssueInd) {
    this.fromDateOfIssueInd = fromDateOfIssueInd;
    return this;
  }

  /**
   * If true the Maximum stay is calculated from the date of ticket issuance
   * @return fromDateOfIssueInd
   **/
  @Schema(description = "If true the Maximum stay is calculated from the date of ticket issuance")
  
    public Boolean isFromDateOfIssueInd() {
    return fromDateOfIssueInd;
  }

  public void setFromDateOfIssueInd(Boolean fromDateOfIssueInd) {
    this.fromDateOfIssueInd = fromDateOfIssueInd;
  }

  public MaximumStayApplies earliestAppliesInd(Boolean earliestAppliesInd) {
    this.earliestAppliesInd = earliestAppliesInd;
    return this;
  }

  /**
   * If true, the earlier of the Maximum stay conditions apply
   * @return earliestAppliesInd
   **/
  @Schema(description = "If true, the earlier of the Maximum stay conditions apply")
  
    public Boolean isEarliestAppliesInd() {
    return earliestAppliesInd;
  }

  public void setEarliestAppliesInd(Boolean earliestAppliesInd) {
    this.earliestAppliesInd = earliestAppliesInd;
  }

  public MaximumStayApplies latestAppliesInd(Boolean latestAppliesInd) {
    this.latestAppliesInd = latestAppliesInd;
    return this;
  }

  /**
   * If true, the later of the Maximum stay conditions apply
   * @return latestAppliesInd
   **/
  @Schema(description = "If true, the later of the Maximum stay conditions apply")
  
    public Boolean isLatestAppliesInd() {
    return latestAppliesInd;
  }

  public void setLatestAppliesInd(Boolean latestAppliesInd) {
    this.latestAppliesInd = latestAppliesInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaximumStayApplies maximumStayApplies = (MaximumStayApplies) o;
    return Objects.equals(this.maximumStayDuration, maximumStayApplies.maximumStayDuration) &&
        Objects.equals(this.maximumStayDate, maximumStayApplies.maximumStayDate) &&
        Objects.equals(this.returnTime, maximumStayApplies.returnTime) &&
        Objects.equals(this.mustCommenceByInd, maximumStayApplies.mustCommenceByInd) &&
        Objects.equals(this.mustCompleteByInd, maximumStayApplies.mustCompleteByInd) &&
        Objects.equals(this.fromDateOfIssueInd, maximumStayApplies.fromDateOfIssueInd) &&
        Objects.equals(this.earliestAppliesInd, maximumStayApplies.earliestAppliesInd) &&
        Objects.equals(this.latestAppliesInd, maximumStayApplies.latestAppliesInd) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumStayDuration, maximumStayDate, returnTime, mustCommenceByInd, mustCompleteByInd, fromDateOfIssueInd, earliestAppliesInd, latestAppliesInd, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaximumStayApplies {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maximumStayDuration: ").append(toIndentedString(maximumStayDuration)).append("\n");
    sb.append("    maximumStayDate: ").append(toIndentedString(maximumStayDate)).append("\n");
    sb.append("    returnTime: ").append(toIndentedString(returnTime)).append("\n");
    sb.append("    mustCommenceByInd: ").append(toIndentedString(mustCommenceByInd)).append("\n");
    sb.append("    mustCompleteByInd: ").append(toIndentedString(mustCompleteByInd)).append("\n");
    sb.append("    fromDateOfIssueInd: ").append(toIndentedString(fromDateOfIssueInd)).append("\n");
    sb.append("    earliestAppliesInd: ").append(toIndentedString(earliestAppliesInd)).append("\n");
    sb.append("    latestAppliesInd: ").append(toIndentedString(latestAppliesInd)).append("\n");
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
