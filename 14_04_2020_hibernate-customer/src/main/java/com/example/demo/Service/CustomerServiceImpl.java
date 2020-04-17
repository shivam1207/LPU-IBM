package com.example.demo.Service;

import java.util.List;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dao.CustomerDaoImpl;
import com.example.demo.domain.Customer;

public class CustomerServiceImpl implements CustomerService{

private CustomerDao dao=new CustomerDaoImpl();
	
	
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	public Customer getCustomerById(int customerID) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(customerID);
	}

	public void deleteCustomerById(int customerID) {
		// TODO Auto-generated method stub
		 dao.deleteCustomerById(customerID);
	}

	public Customer updateCustomerById(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomerById(customer);
		
	}

}
