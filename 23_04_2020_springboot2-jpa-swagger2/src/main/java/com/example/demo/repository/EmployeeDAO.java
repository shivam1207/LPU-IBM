package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository(value = "")
public interface EmployeeDAO extends CrudRepository<Employee, Long>{

}
