package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Customer getCustomer(@PathVariable int id)
	{
		Customer cust=customerService.getCustomer(id);
		if((cust==null)) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
		
		return cust;
			
	}
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return customer;
		
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return customer;
		
	}
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id){
				
Customer tempCustomer = customerService.getCustomer(id);
		
		// throw exception if null
		
		if (tempCustomer == null) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
				
		customerService.deleteCustomer(id);
		
	

		
		
		

		
	}
		
	
	
	
} 
		

