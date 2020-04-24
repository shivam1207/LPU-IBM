package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AccountDAO;
import com.example.demo.data.Account;
import com.example.demo.service.AccountService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	private AccountDAO accountDAO;
	public Application(AccountDAO accountDAO, AccountService accountService) {
		super();
		this.accountDAO = accountDAO;
		this.accountService = accountService;
	}

	private AccountService accountService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Savings", 5000));
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Credit Card", 4000));
		accountDAO.save(new Account(UUID.randomUUID().toString(), "Loan", 20000));
		System.out.println(accountService.getAccounts().toString());
	}

}
