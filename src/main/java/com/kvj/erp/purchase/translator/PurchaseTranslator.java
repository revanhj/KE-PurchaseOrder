package com.kvj.erp.purchase.translator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PurchaseTranslator {

static ObjectMapper mapper=new ObjectMapper();

public static  <T>T  createEntity(Object src,T dest){

	
	try {
		return (T) mapper.readValue(mapper.writeValueAsString(src), dest.getClass());
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return dest;
	
	
}



}
