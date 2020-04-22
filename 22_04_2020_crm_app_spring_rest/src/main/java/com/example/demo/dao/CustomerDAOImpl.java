package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.openSession();
						
				// create a query  ... sort by last name
				Query<Customer> theQuery = 
						currentSession.createQuery("from Customer order by lastName",
													Customer.class);
				
				// execute query and get result list
				List<Customer> customers = theQuery.getResultList();
						
				// return the results		
				return customers; 
	}

}
