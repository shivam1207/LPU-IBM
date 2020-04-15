package com.example.demo.Service;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(int customerID);
	public void deleteCustomerById(int customerID);
	public Customer updateCustomerById(Customer customer);
}
