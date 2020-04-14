package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(String customerID);
	

}
