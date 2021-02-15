package com.kvj.erp.purchase.serviceimpl;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kvj.erp.purchase.exception.PurchaseModuleException;
import com.kvj.erp.purchase.gen.model.PurchaseOrder;
import com.kvj.erp.purchase.repository.ErpPurchaseOrder;
import com.kvj.erp.purchase.repository.PurchaseOrderRepository;
import com.kvj.erp.purchase.service.PurchaseOrderService;
import com.kvj.erp.purchase.translator.PurchaseTranslator;

@Service
public class PurchaseOrderServiceImpln implements PurchaseOrderService {

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;

	@Override
	public PurchaseOrder add(PurchaseOrder s) throws PurchaseModuleException {

		ErpPurchaseOrder purchase = PurchaseTranslator.createEntity(s, new ErpPurchaseOrder());
		System.out.println("purchase");
		System.out.println(purchase);
		PurchaseOrder pp = PurchaseTranslator.createEntity(purchaseOrderRepository.saveAndFlush(purchase),
				new PurchaseOrder());
		return pp;

	}

	@Override
	public PurchaseOrder get(Integer id) throws PurchaseModuleException {
		return PurchaseTranslator.createEntity(purchaseOrderRepository.findById(id).orElse(null),
				new PurchaseOrder());
	}

	@Override
	public void deleteById(Integer id) throws PurchaseModuleException {
		purchaseOrderRepository.deleteById(id);
	}

	@Override
	public PurchaseOrder update(PurchaseOrder s) throws PurchaseModuleException {
		Optional<ErpPurchaseOrder> po = purchaseOrderRepository.findById(s.getId());
		String amd = po.get().getAmmendmentNumber().replace("R", "");
		int ii = 1;
		int i = Integer.parseInt(amd) + ii;
		String Rd = "R" + i;
		s.setAmmendmentNumber(Rd);
		ErpPurchaseOrder purchase = PurchaseTranslator.createEntity(s, new ErpPurchaseOrder());
		return PurchaseTranslator.createEntity(purchaseOrderRepository.saveAndFlush(purchase),
				new PurchaseOrder());

	}

	@Override
	public List<PurchaseOrder> getAll(Pageable pageable) throws PurchaseModuleException {
		return null;
	}

	@Override
	public <S extends PurchaseOrder> List<S> saveAll(Iterable<S> entities) throws PurchaseModuleException {
		return null;
	}

	@Override
	public List<PurchaseOrder> getAll(Integer fromSize, Integer limit) throws PurchaseModuleException {
		return purchaseOrderRepository.findAll(PageRequest.of(fromSize, limit)).get().map(item->PurchaseTranslator.createEntity(item, new PurchaseOrder())).collect(Collectors.toList());
	}

}