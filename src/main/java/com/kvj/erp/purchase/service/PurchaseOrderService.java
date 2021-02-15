package com.kvj.erp.purchase.service;

 
 
import java.awt.print.Pageable;
import java.util.List;

import com.kvj.erp.purchase.exception.PurchaseModuleException;
import com.kvj.erp.purchase.gen.model.PurchaseOrder;

 

public interface PurchaseOrderService {

	public PurchaseOrder add(PurchaseOrder s) throws PurchaseModuleException;
	public PurchaseOrder get(Integer id)throws PurchaseModuleException;
	public void deleteById(Integer id)throws PurchaseModuleException;
	public PurchaseOrder update(PurchaseOrder s)throws PurchaseModuleException;
	public List<PurchaseOrder> getAll(Pageable pageable)throws PurchaseModuleException;
 	public  <S extends PurchaseOrder> List<S> saveAll(Iterable<S> entities)throws PurchaseModuleException;
	public List<PurchaseOrder> getAll(Integer fromSize, Integer limit) throws PurchaseModuleException;

	
	
	/*
	 * @PostMapping("/add") public ResponseEntity<ErpPurchaseOrder>
	 * addPurchesOrderUsingPOST(@ApiParam(value = "purchesO", required =
	 * true) @RequestBody ErpPurchaseOrder purchesO) { try {
	 * System.out.println(purchesO); return new
	 * ResponseEntity<ErpPurchaseOrder>(purchesOrderService.add(purchesO),
	 * HttpStatus.NOT_IMPLEMENTED); } catch (Exception e) { return new
	 * ResponseEntity<ErpPurchaseOrder>(HttpStatus.INTERNAL_SERVER_ERROR); }
	 * 
	 * }
	 */
     
}
