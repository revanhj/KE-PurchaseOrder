package com.kvj.erp.purchase.gen.api;

import java.util.Map;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-02-15T12:18:46.515+05:30")

@Api(value = "error", description = "the error API")
public interface ErrorApi {

    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 204, message = "No Content", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Map<String, Object>> errorUsingDELETE();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Map<String, Object>> errorUsingGET();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 204, message = "No Content", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        consumes = { "application/json" },
        method = RequestMethod.HEAD)
    ResponseEntity<Map<String, Object>> errorUsingHEAD();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 204, message = "No Content", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        consumes = { "application/json" },
        method = RequestMethod.OPTIONS)
    ResponseEntity<Map<String, Object>> errorUsingOPTIONS();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 204, message = "No Content", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Map<String, Object>> errorUsingPATCH();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 201, message = "Created", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Map<String, Object>> errorUsingPOST();


    @ApiOperation(value = "error", notes = "", response = Object.class, responseContainer = "Map", tags={ "basic-error-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 201, message = "Created", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/error",
        produces = { "*_/_*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Map<String, Object>> errorUsingPUT();

}
