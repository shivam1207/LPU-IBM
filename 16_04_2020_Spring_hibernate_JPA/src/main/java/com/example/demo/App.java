package com.example.demo;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;
import com.example.demo.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    
    {
    	
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	EmployeeService service = context.getBean("service",EmployeeServiceImpl.class);
    	
    	
    	String eName;
    	long eSalary;
    	int eId;
    	long eRaise;
    	
		int choice=-1;
		do {
			System.out.println("1. To Add Employee");
			System.out.println("2. To Remove Employee");
			System.out.println("3. To Raise Employee Salary");
			System.out.println("4. To Find an Employee Details");
			System.out.println("5. To List All Employee Details");
			System.out.println("0. To Exit");
			System.out.print("enter your choice:  ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Employee Name: ");
				eName=scanner.next();
				System.out.print("Enter Employee Salary: ");
				eSalary=scanner.nextLong();
				Employee e=service.createEmployee(new Employee(eName, eSalary));
				
				
				break;
			case 2:
				System.out.println("Enter Employee id");
				eId=scanner.nextInt();
				service.removeEmployee(eId);
				
				break;
			case 3:
				System.out.println("Enter Employee id");
				eId=scanner.nextInt();
				System.out.println("Enter Salary Raise");
				eRaise =scanner.nextLong();
				Employee employee = service.raiseEmployeeSalary(eId, eRaise);
				if (employee == null) {
					System.out.println("raise salary aborted.");
				} else {
					System.out.println("Updated Employee: " + employee);
				}
				
				break;
			case 4:
				System.out.println("Enter Employee id");
				eId=scanner.nextInt();
				Employee empl= service.findEmployee(eId);
				if(empl== null)
				{
					System.out.println("failed to find employee");
				}else {
					System.out.println(empl);
				}
				
				break;
			
			  case 5: 
				  Collection<Employee> collection = service.findAllEmployees();
					for(Employee em: collection)
					{
						System.out.println(em);
					}
			  
			   break;
			 
			case 0:
				System.out.println("Bye!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
				break;
			}
			
			
		} while (choice !=0);
        
    }
    }


