package com.kvj.erp.purchase.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "purchase_order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErpPurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id = null;

	private String abg = null;

	private String ammendmentNumber = null;

	private String authorizedSignitor = null;

	private String balanceQty = null;

	private String billTo = null;

	private Float cgst = null;

	private Integer code = null;

	private String codeWithProject = null;

	private Date createdOn = null;

	private String date = null;

	private String delivery = null;

	private String designation = null;

	private String endCustomer = null;

	private String enterRefNumberDate = null;

	private String freight = null;

	private Float grandTotalAmount = null;

	private Float igst = null;

	private String inWords = null;

	private String incomeTerms = null;

	private String inspection = null;

	private String insurence = null;

	private String manufacture = null;
	@OneToMany
	private List<ErpPurchaseOrderItem> purchaseOrderItem = new ArrayList<ErpPurchaseOrderItem>();

	private String name = null;

	private String packingAndForwarding = null;
	@OneToOne
	private ErpPaymentTerms pay = null;

	private Integer paymentId = null;

	private String pbg = null;

	private String poNumber = null;

	private String project = null;

	private String remarks = null;

	private Float sgst = null;

	private String shopTo = null;

	private Float subTotal = null;

	private String supplyerName = null;

	private String technocalDiscount = null;

	private Date updatedOn = null;

	private String warrentry = null;


}