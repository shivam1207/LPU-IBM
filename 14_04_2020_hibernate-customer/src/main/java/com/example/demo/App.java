package com.example.demo;

/**
 * Hello world!
 *
 */
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.Service.CustomerService;
import com.example.demo.Service.CustomerServiceImpl;
import com.example.demo.domain.Customer;
public class App 
{
	private static CustomerService service=null;
	private static Scanner scanner=new Scanner(System.in);
	static
	{
		service=new CustomerServiceImpl();
	}
    public static void main( String[] args )
    {
    	String cName,eMail;
    	int cId;
    	Boolean isAct;
		int choice=-1;
		do {
			System.out.println("1. Create Customer");
			System.out.println("2. Display All Available Customers");
			System.out.println("3. Get Customer Details by Customer ID");
			System.out.println("0. To Exit");
			System.out.print("enter your choice:  ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Customer Name: ");
				cName=scanner.next();
				System.out.print("Enter Customer Email: ");
				eMail=scanner.next();
				System.out.print("Is customer active???: ");
				isAct=scanner.nextBoolean();
				
				
				Customer customer= new Customer();
				
				//customer.setCustomerID(UUID.randomUUID().toString());
				customer.setCustomerName(cName);
				customer.setCustomerEmail(eMail);
				customer.setIsActive(isAct);
				customer=service.createCustomer(customer);
				System.out.println(customer);
				break;
			case 2:
				List<Customer> list=service.getAllCustomer();
				
				for(Customer c:list)
				{
					System.out.println(c);
				}
				break;
			case 3:
				System.out.print("Enter Customer Id: ");
				cId=scanner.nextInt();
				customer= service.getCustomerById(cId);
				if(customer==null)
				{
					System.out.println("No Customer Found With ID: "+cId);
				}
				else
				{
					System.out.println(customer);
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
