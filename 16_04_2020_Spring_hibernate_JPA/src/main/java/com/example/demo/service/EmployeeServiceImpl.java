package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.entity.Employee;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee createEmployee(Employee employee) {
		return dao.createEmployee(employee);
	}

	@Override
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub

		dao.removeEmployee(id);
	}

	@Override
	public Employee raiseEmployeeSalary(int id, long raise) {
		// TODO Auto-generated method stub
		return dao.raiseEmployeeSalary(id, raise);
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.findEmployee(id);
	}

	@Override
	public Collection<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

}
