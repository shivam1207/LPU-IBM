package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	 @GetMapping("/employeesView")
	 public ResponseEntity<Object> getAllEmployees() {
	  return new ResponseEntity<>(employeeDAO.findAll(), HttpStatus.OK);
	 }

		
		  @GetMapping("/employees/{id}")
		  public ResponseEntity<Employee>getEmployeeById(@PathVariable("id") Integer id)
		  { return new ResponseEntity(employeeDAO.findById(id),HttpStatus.OK);
		  }
		 
	 
	 @PostMapping("/employees")
	 public Employee saveEmployee(@RequestBody Employee employee) {
		 
		 return employeeDAO.save(employee);
		 
	}

}
