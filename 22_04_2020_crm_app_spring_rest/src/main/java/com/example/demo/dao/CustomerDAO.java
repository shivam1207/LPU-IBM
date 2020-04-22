package com.example.demo.dao;
import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);

}
