package com.kvj.erp.purchase.gen.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kvj.erp.purchase.gen.model.PurchaseOrder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

@Api(value = "purchase-order", description = "the purchase-order API")
public interface PurchaseOrderApi {

    @ApiOperation(value = "add", notes = "", response = PurchaseOrder.class, tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PurchaseOrder.class),
        @ApiResponse(code = 201, message = "Created", response = PurchaseOrder.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PurchaseOrder.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PurchaseOrder.class),
        @ApiResponse(code = 404, message = "Not Found", response = PurchaseOrder.class) })
    @RequestMapping(value = "/purchase-order",
         
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PurchaseOrder> addUsingPOST(

@ApiParam(value = "s" ,required=true ) @RequestBody PurchaseOrder s

);


    @ApiOperation(value = "deleteById", notes = "", response = Void.class, tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/purchase-order/{id}",
         
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteByIdUsingDELETE(
@ApiParam(value = "id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "getAll", notes = "", response = PurchaseOrder.class, responseContainer = "List", tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PurchaseOrder.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PurchaseOrder.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PurchaseOrder.class),
        @ApiResponse(code = 404, message = "Not Found", response = PurchaseOrder.class) })
    @RequestMapping(value = "/purchase-order",
         
        method = RequestMethod.GET)
    ResponseEntity<List<PurchaseOrder>> getAllUsingGET(@ApiParam(value = "fromSize", defaultValue = "0")  @RequestParam(value = "fromSize", required = false, defaultValue="0") Integer fromSize,@ApiParam(value = "limit", defaultValue = "100")  @RequestParam(value = "limit", required = false, defaultValue="100") Integer limit);


    @ApiOperation(value = "get", notes = "", response = PurchaseOrder.class, tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PurchaseOrder.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PurchaseOrder.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PurchaseOrder.class),
        @ApiResponse(code = 404, message = "Not Found", response = PurchaseOrder.class) })
    @RequestMapping(value = "/purchase-order/{id}",
         
        method = RequestMethod.GET) 
    ResponseEntity<PurchaseOrder> getUsingGET(
@ApiParam(value = "id",required=true ) @PathVariable("id") Integer id


);


    @ApiOperation(value = "saveAll", notes = "", response = PurchaseOrder.class, responseContainer = "List", tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PurchaseOrder.class),
        @ApiResponse(code = 201, message = "Created", response = PurchaseOrder.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = PurchaseOrder.class),
        @ApiResponse(code = 403, message = "Forbidden", response = PurchaseOrder.class),
        @ApiResponse(code = 404, message = "Not Found", response = PurchaseOrder.class) })
    @RequestMapping(value = "/purchase-order/addall",
         
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<PurchaseOrder>> saveAllUsingPOST(@ApiParam(value = "entities") @RequestParam(value = "entities", required = false) List<PurchaseOrder> entities);


    @ApiOperation(value = "update", nickname = "updateUsingPUT", notes = "", response = Object.class, tags={ "purchase-order-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @PutMapping(value = "/purchase-order")
    ResponseEntity<PurchaseOrder> updateUsingPUT(@ApiParam(value = "s" ,required=true )  	 @RequestBody PurchaseOrder s);

}