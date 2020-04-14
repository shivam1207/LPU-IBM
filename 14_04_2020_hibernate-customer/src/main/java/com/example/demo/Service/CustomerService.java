package com.example.demo.Service;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
