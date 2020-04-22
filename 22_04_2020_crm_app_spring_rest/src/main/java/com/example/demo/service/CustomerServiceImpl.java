package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return dao.getCustomers();
	}
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return dao.getCustomer(id);
	}

}
