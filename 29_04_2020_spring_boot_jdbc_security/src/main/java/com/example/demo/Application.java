package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@SpringBootApplication
public class Application{
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	

}
