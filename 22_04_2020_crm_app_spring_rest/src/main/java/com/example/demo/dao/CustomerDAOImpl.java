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
	@Override
	public Customer getCustomer(int id) {
		Session currentSession = sessionFactory.openSession();
		// TODO Auto-generated method stub
		return currentSession.get(Customer.class,id);
	}
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		currentSession.saveOrUpdate(customer);
		currentSession.getTransaction().commit();
		return customer;
	}
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		//get the current hibernate session
		Session currentSession = sessionFactory.openSession();
		// delete object with primary key
		currentSession.getTransaction().begin();
		Query theQuery = 
				currentSession.createQuery("delete from Customer where id=:id");
		theQuery.setParameter("id", id);
		
		theQuery.executeUpdate();
		currentSession.getTransaction().commit();
	}

		
		
	}


