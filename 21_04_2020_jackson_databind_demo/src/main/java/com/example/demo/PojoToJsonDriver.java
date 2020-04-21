package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoToJsonDriver {
	public static void main(String args[]) throws Exception {
	Customer cust =new Customer();
	Address address = new Address();
	cust.setId(1);
	cust.setFirstName("shivam");
	cust.setAddress(address);
	address.setCity("rudrapur");
	
	//Creating the ObjectMapper object
    ObjectMapper mapper = new ObjectMapper();
    //Converting the Object to JSONString
    String jsonString = mapper.writeValueAsString(cust);
    System.out.println(jsonString);
    
    //using json B
	/*
	 * Jsonb jsonb = JsonbBuilder.create(); String result=jsonb.toJson(new
	 * Customer(1,"John","Doe",true,new Address(),new String[3]));
	 * System.out.println(result);
	 */
	 
 }
	
	

}
