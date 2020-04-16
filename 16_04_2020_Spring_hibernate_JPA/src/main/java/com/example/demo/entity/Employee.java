package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;
	@Version
	private int version;
	private String name;
	private long salary;
	
	public Employee() {
		super();
	}

	
	public Employee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ID: "+getEmployeeID()+" Employee Name: "+getName()+" Number Of Time employee Updated: "
				+getVersion()+" Salary: "+getSalary();
	}

}
