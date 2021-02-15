package com.kvj.erp.purchase.gen.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kvj.erp.purchase.gen.model.PurchaseOrder;
import com.kvj.erp.purchase.service.PurchaseOrderService;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

@Controller
public class PurchaseOrderApiController implements PurchaseOrderApi {

	
	
    private static final Logger log = LoggerFactory.getLogger(PurchaseOrderApiController.class);
 
    
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
   

    @org.springframework.beans.factory.annotation.Autowired
    public PurchaseOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
	@Autowired
	private PurchaseOrderService purchaseOrderService;

	public ResponseEntity<PurchaseOrder> addUsingPOST(@ApiParam(value = "s" ,required=true ) @RequestBody PurchaseOrder s) {
    	 try {
             return new ResponseEntity<PurchaseOrder>(purchaseOrderService.add(s), HttpStatus.OK);
         } catch (Exception e) {
             log.error("Couldn't serialize response for content type ", e);
             return new ResponseEntity<PurchaseOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
         } 
}


	public ResponseEntity<Void> deleteByIdUsingDELETE(@ApiParam(value = "id", required = true) @PathVariable("id") Integer id) {
		try {
			purchaseOrderService.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
 		}
	}

	public ResponseEntity<List<PurchaseOrder>> getAllUsingGET(@ApiParam(value = "fromSize", defaultValue = "0") @Valid @RequestParam(value = "fromSize", required = false, defaultValue="0") Integer fromSize,@ApiParam(value = "limit", defaultValue = "100") @Valid @RequestParam(value = "limit", required = false, defaultValue="100") Integer limit) {
		String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
            	System.out.println("strated........");
                return new ResponseEntity<List<PurchaseOrder>>(purchaseOrderService.getAll(fromSize, limit), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<List<PurchaseOrder>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }		return new ResponseEntity<List<PurchaseOrder>>(HttpStatus.OK);
	}

	public ResponseEntity<PurchaseOrder> getUsingGET(@ApiParam(value = "id", required = true) @PathVariable("id") Integer id) {
		String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<PurchaseOrder>(purchaseOrderService.get(id), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<PurchaseOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } 

		return new ResponseEntity<PurchaseOrder>(HttpStatus.OK);
	}

	public ResponseEntity<List<PurchaseOrder>> saveAllUsingPOST(@ApiParam(value = "entities") @RequestParam(value = "entities", required = false) List<PurchaseOrder> entities) {
		// do some magic!
		return new ResponseEntity<List<PurchaseOrder>>(HttpStatus.OK);
	}

	 public ResponseEntity<PurchaseOrder> updateUsingPUT(@ApiParam(value = "s" ,required=true )  @Valid @RequestBody PurchaseOrder s) {
	        String accept = request.getHeader("Accept");
	        if (accept != null && accept.contains("")) {
	            try {
	                return new ResponseEntity<PurchaseOrder>(purchaseOrderService.update(s), HttpStatus.OK);
	            } catch (Exception e) {
	                log.error("Couldn't serialize response for content type ", e);
	                return new ResponseEntity<PurchaseOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }

	        return new ResponseEntity<PurchaseOrder>(HttpStatus.NOT_IMPLEMENTED);
	    }

}

	 