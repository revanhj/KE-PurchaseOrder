package com.kvj.erp.purchase.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class ErpPaymentTerms {

	private Date createdOn = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id = null;

	private String payment1 = null;

	private String payment2 = null;

	private String payment3 = null;

	private String payment4 = null;

	private String paymentId = null;

	private Date updatedOn = null;

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

	public String getPayment1() {
		return payment1;
	}

	public void setPayment1(String payment1) {
		this.payment1 = payment1;
	}

	public String getPayment2() {
		return payment2;
	}

	public void setPayment2(String payment2) {
		this.payment2 = payment2;
	}

	public String getPayment3() {
		return payment3;
	}

	public void setPayment3(String payment3) {
		this.payment3 = payment3;
	}

	public String getPayment4() {
		return payment4;
	}

	public void setPayment4(String payment4) {
		this.payment4 = payment4;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}