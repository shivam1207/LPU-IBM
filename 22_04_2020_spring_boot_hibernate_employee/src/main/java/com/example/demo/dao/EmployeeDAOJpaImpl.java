package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.data.Employee;
@Repository
@EnableTransactionManagement
public class EmployeeDAOJpaImpl implements EmployeeDAO{
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		// create a query
				Query theQuery = 
						entityManager.createQuery("from Employee");
				
			
				List<Employee> employees = theQuery.getResultList();
				
				// return the results		
				return employees;
		
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// save or update the employee
			entityManager.persist(employee);
				
				
			//employee.setEmployeeID(dbEmployee.getEmployeeID());
			return employee;

	}
	

}
