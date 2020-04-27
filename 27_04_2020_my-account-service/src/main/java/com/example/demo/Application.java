package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@SpringBootApplication
@EnableDiscoveryClient
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
		// TODO Auto-generated method stub
		accountDAO.save(new Account(UUID.randomUUID().toString(),"1257378428"));
		accountDAO.save(new Account(UUID.randomUUID().toString(),"1253456788"));
		accountDAO.save(new Account(UUID.randomUUID().toString(),"12575659469"));
		accountDAO.save(new Account(UUID.randomUUID().toString(),"12785122356"));
		
	}

}
