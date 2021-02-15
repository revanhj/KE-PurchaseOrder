package com.kvj.erp.purchase.gen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kvj.erp.purchase.gen.model.Payment;
import com.kvj.erp.purchase.gen.model.PurchaseOrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;




/**
 * PurchaseOrder
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

public class PurchaseOrder   {
  private String abg;

  private String ammendmentNumber;

  private String authorizedSignitor;

  private String balanceQty;

  private String billTo;

  private Float cgst;

  private Integer code;

  private String codeWithProject;

  private DateTime createdOn;

  private String date;

  private String delivery;

  private String designation;

  private String endCustomer;

  private String enterRefNumberDate;

  private String freight;

  private Float grandTotalAmount;

  private Integer id;

  private Float igst;

  private String inWords;

  private String incomeTerms;

  private String inspection;

  private String insurence;

  private String manufacture;

  private List<PurchaseOrderItem> materialDescription = new ArrayList<PurchaseOrderItem>();

  private String name;

  private String packingAndForwarding;

  private Payment pay;

  private Integer paymentId;

  private String pbg;

  private String poNumber;

  private String project;

  private String remarks;

  private Float sgst;

  private String shopTo;

  private Float subTotal;

  private String supplyerName;

  private String technocalDiscount;

  private DateTime updatedOn;

  private String warrentry;

  public PurchaseOrder abg(String abg) {
    this.abg = abg;
    return this;
  }

   /**
   * Get abg
   * @return abg
  **/
  @ApiModelProperty(value = "")
  public String getAbg() {
    return abg;
  }

  public void setAbg(String abg) {
    this.abg = abg;
  }

  public PurchaseOrder ammendmentNumber(String ammendmentNumber) {
    this.ammendmentNumber = ammendmentNumber;
    return this;
  }

   /**
   * Get ammendmentNumber
   * @return ammendmentNumber
  **/
  @ApiModelProperty(value = "")
  public String getAmmendmentNumber() {
    return ammendmentNumber;
  }

  public void setAmmendmentNumber(String ammendmentNumber) {
    this.ammendmentNumber = ammendmentNumber;
  }

  public PurchaseOrder authorizedSignitor(String authorizedSignitor) {
    this.authorizedSignitor = authorizedSignitor;
    return this;
  }

   /**
   * Get authorizedSignitor
   * @return authorizedSignitor
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizedSignitor() {
    return authorizedSignitor;
  }

  public void setAuthorizedSignitor(String authorizedSignitor) {
    this.authorizedSignitor = authorizedSignitor;
  }

  public PurchaseOrder balanceQty(String balanceQty) {
    this.balanceQty = balanceQty;
    return this;
  }

   /**
   * Get balanceQty
   * @return balanceQty
  **/
  @ApiModelProperty(value = "")
  public String getBalanceQty() {
    return balanceQty;
  }

  public void setBalanceQty(String balanceQty) {
    this.balanceQty = balanceQty;
  }

  public PurchaseOrder billTo(String billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public String getBillTo() {
    return billTo;
  }

  public void setBillTo(String billTo) {
    this.billTo = billTo;
  }

  public PurchaseOrder cgst(Float cgst) {
    this.cgst = cgst;
    return this;
  }

   /**
   * Get cgst
   * @return cgst
  **/
  @ApiModelProperty(value = "")
  public Float getCgst() {
    return cgst;
  }

  public void setCgst(Float cgst) {
    this.cgst = cgst;
  }

  public PurchaseOrder code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public PurchaseOrder codeWithProject(String codeWithProject) {
    this.codeWithProject = codeWithProject;
    return this;
  }

   /**
   * Get codeWithProject
   * @return codeWithProject
  **/
  @ApiModelProperty(value = "")
  public String getCodeWithProject() {
    return codeWithProject;
  }

  public void setCodeWithProject(String codeWithProject) {
    this.codeWithProject = codeWithProject;
  }

  public PurchaseOrder createdOn(DateTime createdOn) {
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

  public PurchaseOrder date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PurchaseOrder delivery(String delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")
  public String getDelivery() {
    return delivery;
  }

  public void setDelivery(String delivery) {
    this.delivery = delivery;
  }

  public PurchaseOrder designation(String designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @ApiModelProperty(value = "")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public PurchaseOrder endCustomer(String endCustomer) {
    this.endCustomer = endCustomer;
    return this;
  }

   /**
   * Get endCustomer
   * @return endCustomer
  **/
  @ApiModelProperty(value = "")
  public String getEndCustomer() {
    return endCustomer;
  }

  public void setEndCustomer(String endCustomer) {
    this.endCustomer = endCustomer;
  }

  public PurchaseOrder enterRefNumberDate(String enterRefNumberDate) {
    this.enterRefNumberDate = enterRefNumberDate;
    return this;
  }

   /**
   * Get enterRefNumberDate
   * @return enterRefNumberDate
  **/
  @ApiModelProperty(value = "")
  public String getEnterRefNumberDate() {
    return enterRefNumberDate;
  }

  public void setEnterRefNumberDate(String enterRefNumberDate) {
    this.enterRefNumberDate = enterRefNumberDate;
  }

  public PurchaseOrder freight(String freight) {
    this.freight = freight;
    return this;
  }

   /**
   * Get freight
   * @return freight
  **/
  @ApiModelProperty(value = "")
  public String getFreight() {
    return freight;
  }

  public void setFreight(String freight) {
    this.freight = freight;
  }

  public PurchaseOrder grandTotalAmount(Float grandTotalAmount) {
    this.grandTotalAmount = grandTotalAmount;
    return this;
  }

   /**
   * Get grandTotalAmount
   * @return grandTotalAmount
  **/
  @ApiModelProperty(value = "")
  public Float getGrandTotalAmount() {
    return grandTotalAmount;
  }

  public void setGrandTotalAmount(Float grandTotalAmount) {
    this.grandTotalAmount = grandTotalAmount;
  }

  public PurchaseOrder id(Integer id) {
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

  public PurchaseOrder igst(Float igst) {
    this.igst = igst;
    return this;
  }

   /**
   * Get igst
   * @return igst
  **/
  @ApiModelProperty(value = "")
  public Float getIgst() {
    return igst;
  }

  public void setIgst(Float igst) {
    this.igst = igst;
  }

  public PurchaseOrder inWords(String inWords) {
    this.inWords = inWords;
    return this;
  }

   /**
   * Get inWords
   * @return inWords
  **/
  @ApiModelProperty(value = "")
  public String getInWords() {
    return inWords;
  }

  public void setInWords(String inWords) {
    this.inWords = inWords;
  }

  public PurchaseOrder incomeTerms(String incomeTerms) {
    this.incomeTerms = incomeTerms;
    return this;
  }

   /**
   * Get incomeTerms
   * @return incomeTerms
  **/
  @ApiModelProperty(value = "")
  public String getIncomeTerms() {
    return incomeTerms;
  }

  public void setIncomeTerms(String incomeTerms) {
    this.incomeTerms = incomeTerms;
  }

  public PurchaseOrder inspection(String inspection) {
    this.inspection = inspection;
    return this;
  }

   /**
   * Get inspection
   * @return inspection
  **/
  @ApiModelProperty(value = "")
  public String getInspection() {
    return inspection;
  }

  public void setInspection(String inspection) {
    this.inspection = inspection;
  }

  public PurchaseOrder insurence(String insurence) {
    this.insurence = insurence;
    return this;
  }

   /**
   * Get insurence
   * @return insurence
  **/
  @ApiModelProperty(value = "")
  public String getInsurence() {
    return insurence;
  }

  public void setInsurence(String insurence) {
    this.insurence = insurence;
  }

  public PurchaseOrder manufacture(String manufacture) {
    this.manufacture = manufacture;
    return this;
  }

   /**
   * Get manufacture
   * @return manufacture
  **/
  @ApiModelProperty(value = "")
  public String getManufacture() {
    return manufacture;
  }

  public void setManufacture(String manufacture) {
    this.manufacture = manufacture;
  }

  public PurchaseOrder materialDescription(List<PurchaseOrderItem> materialDescription) {
    this.materialDescription = materialDescription;
    return this;
  }

  public PurchaseOrder addMaterialDescriptionItem(PurchaseOrderItem materialDescriptionItem) {
    this.materialDescription.add(materialDescriptionItem);
    return this;
  }

   /**
   * Get materialDescription
   * @return materialDescription
  **/
  @ApiModelProperty(value = "")
  public List<PurchaseOrderItem> getMaterialDescription() {
    return materialDescription;
  }

  public void setMaterialDescription(List<PurchaseOrderItem> materialDescription) {
    this.materialDescription = materialDescription;
  }

  public PurchaseOrder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PurchaseOrder packingAndForwarding(String packingAndForwarding) {
    this.packingAndForwarding = packingAndForwarding;
    return this;
  }

   /**
   * Get packingAndForwarding
   * @return packingAndForwarding
  **/
  @ApiModelProperty(value = "")
  public String getPackingAndForwarding() {
    return packingAndForwarding;
  }

  public void setPackingAndForwarding(String packingAndForwarding) {
    this.packingAndForwarding = packingAndForwarding;
  }

  public PurchaseOrder pay(Payment pay) {
    this.pay = pay;
    return this;
  }

   /**
   * Get pay
   * @return pay
  **/
  @ApiModelProperty(value = "")
  public Payment getPay() {
    return pay;
  }

  public void setPay(Payment pay) {
    this.pay = pay;
  }

  public PurchaseOrder paymentId(Integer paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")
  public Integer getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Integer paymentId) {
    this.paymentId = paymentId;
  }

  public PurchaseOrder pbg(String pbg) {
    this.pbg = pbg;
    return this;
  }

   /**
   * Get pbg
   * @return pbg
  **/
  @ApiModelProperty(value = "")
  public String getPbg() {
    return pbg;
  }

  public void setPbg(String pbg) {
    this.pbg = pbg;
  }

  public PurchaseOrder poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Get poNumber
   * @return poNumber
  **/
  @ApiModelProperty(value = "")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public PurchaseOrder project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public PurchaseOrder remarks(String remarks) {
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

  public PurchaseOrder sgst(Float sgst) {
    this.sgst = sgst;
    return this;
  }

   /**
   * Get sgst
   * @return sgst
  **/
  @ApiModelProperty(value = "")
  public Float getSgst() {
    return sgst;
  }

  public void setSgst(Float sgst) {
    this.sgst = sgst;
  }

  public PurchaseOrder shopTo(String shopTo) {
    this.shopTo = shopTo;
    return this;
  }

   /**
   * Get shopTo
   * @return shopTo
  **/
  @ApiModelProperty(value = "")
  public String getShopTo() {
    return shopTo;
  }

  public void setShopTo(String shopTo) {
    this.shopTo = shopTo;
  }

  public PurchaseOrder subTotal(Float subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public Float getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }

  public PurchaseOrder supplyerName(String supplyerName) {
    this.supplyerName = supplyerName;
    return this;
  }

   /**
   * Get supplyerName
   * @return supplyerName
  **/
  @ApiModelProperty(value = "")
  public String getSupplyerName() {
    return supplyerName;
  }

  public void setSupplyerName(String supplyerName) {
    this.supplyerName = supplyerName;
  }

  public PurchaseOrder technocalDiscount(String technocalDiscount) {
    this.technocalDiscount = technocalDiscount;
    return this;
  }

   /**
   * Get technocalDiscount
   * @return technocalDiscount
  **/
  @ApiModelProperty(value = "")
  public String getTechnocalDiscount() {
    return technocalDiscount;
  }

  public void setTechnocalDiscount(String technocalDiscount) {
    this.technocalDiscount = technocalDiscount;
  }

  public PurchaseOrder updatedOn(DateTime updatedOn) {
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

  public PurchaseOrder warrentry(String warrentry) {
    this.warrentry = warrentry;
    return this;
  }

   /**
   * Get warrentry
   * @return warrentry
  **/
  @ApiModelProperty(value = "")
  public String getWarrentry() {
    return warrentry;
  }

  public void setWarrentry(String warrentry) {
    this.warrentry = warrentry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrder purchaseOrder = (PurchaseOrder) o;
    return Objects.equals(this.abg, purchaseOrder.abg) &&
        Objects.equals(this.ammendmentNumber, purchaseOrder.ammendmentNumber) &&
        Objects.equals(this.authorizedSignitor, purchaseOrder.authorizedSignitor) &&
        Objects.equals(this.balanceQty, purchaseOrder.balanceQty) &&
        Objects.equals(this.billTo, purchaseOrder.billTo) &&
        Objects.equals(this.cgst, purchaseOrder.cgst) &&
        Objects.equals(this.code, purchaseOrder.code) &&
        Objects.equals(this.codeWithProject, purchaseOrder.codeWithProject) &&
        Objects.equals(this.createdOn, purchaseOrder.createdOn) &&
        Objects.equals(this.date, purchaseOrder.date) &&
        Objects.equals(this.delivery, purchaseOrder.delivery) &&
        Objects.equals(this.designation, purchaseOrder.designation) &&
        Objects.equals(this.endCustomer, purchaseOrder.endCustomer) &&
        Objects.equals(this.enterRefNumberDate, purchaseOrder.enterRefNumberDate) &&
        Objects.equals(this.freight, purchaseOrder.freight) &&
        Objects.equals(this.grandTotalAmount, purchaseOrder.grandTotalAmount) &&
        Objects.equals(this.id, purchaseOrder.id) &&
        Objects.equals(this.igst, purchaseOrder.igst) &&
        Objects.equals(this.inWords, purchaseOrder.inWords) &&
        Objects.equals(this.incomeTerms, purchaseOrder.incomeTerms) &&
        Objects.equals(this.inspection, purchaseOrder.inspection) &&
        Objects.equals(this.insurence, purchaseOrder.insurence) &&
        Objects.equals(this.manufacture, purchaseOrder.manufacture) &&
        Objects.equals(this.materialDescription, purchaseOrder.materialDescription) &&
        Objects.equals(this.name, purchaseOrder.name) &&
        Objects.equals(this.packingAndForwarding, purchaseOrder.packingAndForwarding) &&
        Objects.equals(this.pay, purchaseOrder.pay) &&
        Objects.equals(this.paymentId, purchaseOrder.paymentId) &&
        Objects.equals(this.pbg, purchaseOrder.pbg) &&
        Objects.equals(this.poNumber, purchaseOrder.poNumber) &&
        Objects.equals(this.project, purchaseOrder.project) &&
        Objects.equals(this.remarks, purchaseOrder.remarks) &&
        Objects.equals(this.sgst, purchaseOrder.sgst) &&
        Objects.equals(this.shopTo, purchaseOrder.shopTo) &&
        Objects.equals(this.subTotal, purchaseOrder.subTotal) &&
        Objects.equals(this.supplyerName, purchaseOrder.supplyerName) &&
        Objects.equals(this.technocalDiscount, purchaseOrder.technocalDiscount) &&
        Objects.equals(this.updatedOn, purchaseOrder.updatedOn) &&
        Objects.equals(this.warrentry, purchaseOrder.warrentry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abg, ammendmentNumber, authorizedSignitor, balanceQty, billTo, cgst, code, codeWithProject, createdOn, date, delivery, designation, endCustomer, enterRefNumberDate, freight, grandTotalAmount, id, igst, inWords, incomeTerms, inspection, insurence, manufacture, materialDescription, name, packingAndForwarding, pay, paymentId, pbg, poNumber, project, remarks, sgst, shopTo, subTotal, supplyerName, technocalDiscount, updatedOn, warrentry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrder {\n");
    
    sb.append("    abg: ").append(toIndentedString(abg)).append("\n");
    sb.append("    ammendmentNumber: ").append(toIndentedString(ammendmentNumber)).append("\n");
    sb.append("    authorizedSignitor: ").append(toIndentedString(authorizedSignitor)).append("\n");
    sb.append("    balanceQty: ").append(toIndentedString(balanceQty)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    cgst: ").append(toIndentedString(cgst)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeWithProject: ").append(toIndentedString(codeWithProject)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    endCustomer: ").append(toIndentedString(endCustomer)).append("\n");
    sb.append("    enterRefNumberDate: ").append(toIndentedString(enterRefNumberDate)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    grandTotalAmount: ").append(toIndentedString(grandTotalAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    igst: ").append(toIndentedString(igst)).append("\n");
    sb.append("    inWords: ").append(toIndentedString(inWords)).append("\n");
    sb.append("    incomeTerms: ").append(toIndentedString(incomeTerms)).append("\n");
    sb.append("    inspection: ").append(toIndentedString(inspection)).append("\n");
    sb.append("    insurence: ").append(toIndentedString(insurence)).append("\n");
    sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
    sb.append("    materialDescription: ").append(toIndentedString(materialDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packingAndForwarding: ").append(toIndentedString(packingAndForwarding)).append("\n");
    sb.append("    pay: ").append(toIndentedString(pay)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    pbg: ").append(toIndentedString(pbg)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    sgst: ").append(toIndentedString(sgst)).append("\n");
    sb.append("    shopTo: ").append(toIndentedString(shopTo)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    supplyerName: ").append(toIndentedString(supplyerName)).append("\n");
    sb.append("    technocalDiscount: ").append(toIndentedString(technocalDiscount)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    warrentry: ").append(toIndentedString(warrentry)).append("\n");
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

