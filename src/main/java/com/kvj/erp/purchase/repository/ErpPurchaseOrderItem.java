package com.kvj.erp.purchase.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order_item")
public class ErpPurchaseOrderItem {

	
	private Date createdOn = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id = null;

	private String materialCode = null;

	private Integer poQuentity = null;

	private Integer purchesOrderId = null;

	private String remarks = null;

	private Float totalAmount = null;

	private Float unitRate = null;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public Integer getPoQuentity() {
		return poQuentity;
	}

	public void setPoQuentity(Integer poQuentity) {
		this.poQuentity = poQuentity;
	}

	public Integer getPurchesOrderId() {
		return purchesOrderId;
	}

	public void setPurchesOrderId(Integer purchesOrderId) {
		this.purchesOrderId = purchesOrderId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getUnitRate() {
		return unitRate;
	}

	public void setUnitRate(Float unitRate) {
		this.unitRate = unitRate;
	}
	
	
}