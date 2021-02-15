package com.kvj.erp.purchase.gen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;




/**
 * PurchaseOrderItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

public class PurchaseOrderItem   {
  private DateTime createdOn = null;

  private Integer id = null;

  private String materialCode = null;

  private Integer poQuentity = null;

  private Integer purchesOrderId = null;

  private String remarks = null;

  private Float totalAmount = null;

  private Float unitRate = null;

  private DateTime updatedOn = null;

  public PurchaseOrderItem createdOn(DateTime createdOn) {
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

  public PurchaseOrderItem id(Integer id) {
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

  public PurchaseOrderItem materialCode(String materialCode) {
    this.materialCode = materialCode;
    return this;
  }

   /**
   * Get materialCode
   * @return materialCode
  **/
  @ApiModelProperty(value = "")
  public String getMaterialCode() {
    return materialCode;
  }

  public void setMaterialCode(String materialCode) {
    this.materialCode = materialCode;
  }

  public PurchaseOrderItem poQuentity(Integer poQuentity) {
    this.poQuentity = poQuentity;
    return this;
  }

   /**
   * Get poQuentity
   * @return poQuentity
  **/
  @ApiModelProperty(value = "")
  public Integer getPoQuentity() {
    return poQuentity;
  }

  public void setPoQuentity(Integer poQuentity) {
    this.poQuentity = poQuentity;
  }

  public PurchaseOrderItem purchesOrderId(Integer purchesOrderId) {
    this.purchesOrderId = purchesOrderId;
    return this;
  }

   /**
   * Get purchesOrderId
   * @return purchesOrderId
  **/
  @ApiModelProperty(value = "")
  public Integer getPurchesOrderId() {
    return purchesOrderId;
  }

  public void setPurchesOrderId(Integer purchesOrderId) {
    this.purchesOrderId = purchesOrderId;
  }

  public PurchaseOrderItem remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @ApiModelProperty(value = "")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public PurchaseOrderItem totalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public Float getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PurchaseOrderItem unitRate(Float unitRate) {
    this.unitRate = unitRate;
    return this;
  }

   /**
   * Get unitRate
   * @return unitRate
  **/
  @ApiModelProperty(value = "")
  public Float getUnitRate() {
    return unitRate;
  }

  public void setUnitRate(Float unitRate) {
    this.unitRate = unitRate;
  }

  public PurchaseOrderItem updatedOn(DateTime updatedOn) {
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
    PurchaseOrderItem purchaseOrderItem = (PurchaseOrderItem) o;
    return Objects.equals(this.createdOn, purchaseOrderItem.createdOn) &&
        Objects.equals(this.id, purchaseOrderItem.id) &&
        Objects.equals(this.materialCode, purchaseOrderItem.materialCode) &&
        Objects.equals(this.poQuentity, purchaseOrderItem.poQuentity) &&
        Objects.equals(this.purchesOrderId, purchaseOrderItem.purchesOrderId) &&
        Objects.equals(this.remarks, purchaseOrderItem.remarks) &&
        Objects.equals(this.totalAmount, purchaseOrderItem.totalAmount) &&
        Objects.equals(this.unitRate, purchaseOrderItem.unitRate) &&
        Objects.equals(this.updatedOn, purchaseOrderItem.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, materialCode, poQuentity, purchesOrderId, remarks, totalAmount, unitRate, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderItem {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    materialCode: ").append(toIndentedString(materialCode)).append("\n");
    sb.append("    poQuentity: ").append(toIndentedString(poQuentity)).append("\n");
    sb.append("    purchesOrderId: ").append(toIndentedString(purchesOrderId)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitRate: ").append(toIndentedString(unitRate)).append("\n");
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

