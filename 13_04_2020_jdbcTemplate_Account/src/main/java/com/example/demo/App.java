package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Exception.AccountNotFoundException;
import com.example.demo.bean.Account;
import com.example.demo.bean.AccountType;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    
    	int choice = 0;
		String accountNumber = null;
		int initialBalance;
		Scanner scanner = new Scanner(System.in);
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		
		
		do {
			System.out.println("*****Bank Account Application**********");
			System.out.println("1. Create Account");
			System.out.println("2. delete by id");
			System.out.println("3. Update by id");
			System.out.println("4. List All Account details");
			System.out.println("5. find account by Account Number :");
			System.out.println("0. To exit:");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:

				account.setAccountNumber(UUID.randomUUID().toString());
				account.setAccountType("LOAN");
				account.setInitialBalance(1000);
				account = service.createAccount(account);
				System.out.println(account);
				break;
			case 2:
				System.out.println("Enter the id : ");
				String id = scanner.nextLine();
				try {
					service.deleteAccount(id);
				} catch (AccountNotFoundException e) {
					
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter account number ");
				accountNumber = scanner.nextLine();
				account.setAccountNumber(accountNumber);
				System.out.println("Enter account type ");
				String accountType = scanner.nextLine();
				account.setAccountType(accountType);
				System.out.println("Enter account balance ");
				initialBalance = scanner.nextInt();
				account.setInitialBalance(initialBalance);
				try {
					service.updateAccount(accountNumber, accountType, initialBalance);
				} catch (AccountNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				List<Account> accounts = service.getAllAccountDetails();
				Iterator<Account> iter = accounts.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}

				break;
			case 5:
				System.out.println("Enter account number : ");
				accountNumber = scanner.nextLine();
				account = service.findByAccountNumber(accountNumber);
				System.out.println(account);
				break;
			case 0:
				System.out.println("bye.!!!!!");
				System.exit(0);
				break;
			default:
				break;
			}

		} while (choice != 0);

	}

			}
		
		/*
		 * String str[]=UUID.randomUUID().toString().split("-");
		 * account.setAccountNumber(str[0]);
		 * account.setAccountType(AccountType.SAVINGS);
		 * account.setInitialBalance(100000); account =service.createAccount(account);
		 */
		  
	
		/*
		 * account.setAccountNumber("761c7f3d");
		 * account.setAccountType(AccountType.CURRENT);
		 * account.setInitialBalance(600000);
		 * 
		 * //account=service.createAccount(account);
		 * 
		 * //account=service.deleteAccount(account);
		 */			
		//System.out.println(account);
		 
		/*
		 * List<Account> list=service.getAllAccountDetails(); Iterator<Account>
		 * i=list.iterator(); while(i.hasNext()) { Account account2=i.next();
		 * System.out.println(account2);
		 * 
		 * }
		 */
		//account=service.findByAccountNumber("761c7f3d");
		//service.deleteAccount("761c7f3d");
		//System.out.println(account);
		//service.updateAccount("761c16ggdhh", "CURRENT",100000);
		/*try {
			service.deleteAccount("761c7dhjedtrd");
		} catch (AccountNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
    	
    }
		}}*/
