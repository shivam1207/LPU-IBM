package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public Customer getCustomer(int id);
	public Customer saveCustomer(Customer customer);
	public void deleteCustomer(int id);
}
