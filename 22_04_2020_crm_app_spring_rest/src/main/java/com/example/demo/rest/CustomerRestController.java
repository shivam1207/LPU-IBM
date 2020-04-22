package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.CustomerResponseEntity;

import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
		
	}
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id)throws CustomerNotFoundException
	{
		Customer cust=customerService.getCustomer(id);
		if((cust==null)) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
		
		return cust;
			
	}
		
	@ExceptionHandler
	public ResponseEntity<CustomerResponseEntity> handleException(CustomerNotFoundException snfe)
{

		
	return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.NOT_FOUND.value(), snfe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
}
@ExceptionHandler
public ResponseEntity<CustomerResponseEntity> handleNumberFormatException(NumberFormatException ipme)
{
	return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
}

// For all other exceptions-global exception
/*@ExceptionHandler
public ResponseEntity<CustomerResponseEntity> handleGlobalException(Exception exc){
	return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.BAD_REQUEST.value(),"something is not right, try again with correct values", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}
	*/

	
	
} 
		

