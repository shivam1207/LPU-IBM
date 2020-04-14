package com.example.demo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.example.demo.domain.Customer;
import com.example.demo.factory.MyHibernateFactory;

public class CustomerDaoImpl implements CustomerDao{
	private  MyHibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	{
		factory=MyHibernateFactory.getMyHibernateFactory();
		sessionFactory=factory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Customer createCustomer(Customer customer) {
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		return customer;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> list=session.createQuery("from Customer",Customer.class).list();
		return list;
	}

}
