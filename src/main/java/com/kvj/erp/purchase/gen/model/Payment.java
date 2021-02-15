package com.kvj.erp.purchase.gen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;




/**
 * Payment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

public class Payment   {
  private DateTime createdOn = null;

  private Integer id = null;

  private String payment1 = null;

  private String payment2 = null;

  private String payment3 = null;

  private String payment4 = null;

  private DateTime updatedOn = null;

  public Payment createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Payment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Payment payment1(String payment1) {
    this.payment1 = payment1;
    return this;
  }

   /**
   * Get payment1
   * @return payment1
  **/
  @ApiModelProperty(value = "")
  public String getPayment1() {
    return payment1;
  }

  public void setPayment1(String payment1) {
    this.payment1 = payment1;
  }

  public Payment payment2(String payment2) {
    this.payment2 = payment2;
    return this;
  }

   /**
   * Get payment2
   * @return payment2
  **/
  @ApiModelProperty(value = "")
  public String getPayment2() {
    return payment2;
  }

  public void setPayment2(String payment2) {
    this.payment2 = payment2;
  }

  public Payment payment3(String payment3) {
    this.payment3 = payment3;
    return this;
  }

   /**
   * Get payment3
   * @return payment3
  **/
  @ApiModelProperty(value = "")
  public String getPayment3() {
    return payment3;
  }

  public void setPayment3(String payment3) {
    this.payment3 = payment3;
  }

  public Payment payment4(String payment4) {
    this.payment4 = payment4;
    return this;
  }

   /**
   * Get payment4
   * @return payment4
  **/
  @ApiModelProperty(value = "")
  public String getPayment4() {
    return payment4;
  }

  public void setPayment4(String payment4) {
    this.payment4 = payment4;
  }

  public Payment updatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.createdOn, payment.createdOn) &&
        Objects.equals(this.id, payment.id) &&
        Objects.equals(this.payment1, payment.payment1) &&
        Objects.equals(this.payment2, payment.payment2) &&
        Objects.equals(this.payment3, payment.payment3) &&
        Objects.equals(this.payment4, payment.payment4) &&
        Objects.equals(this.updatedOn, payment.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, payment1, payment2, payment3, payment4, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payment1: ").append(toIndentedString(payment1)).append("\n");
    sb.append("    payment2: ").append(toIndentedString(payment2)).append("\n");
    sb.append("    payment3: ").append(toIndentedString(payment3)).append("\n");
    sb.append("    payment4: ").append(toIndentedString(payment4)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

