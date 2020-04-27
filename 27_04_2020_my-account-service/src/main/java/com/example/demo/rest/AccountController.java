package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {

	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}



	@GetMapping("/accounts")
	public ResponseEntity<Iterable<Account>> getAllAccounts()
	{
		return accountService.getAccounts();
	}
	@GetMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable int id)
	{
		return accountService.getAccountById(id);
	}
	@GetMapping("/accounts/byCustomer/{customerId}")
	public Account getAccountByCustomerId(String customerId)
	{
		return accountService.getAccountByCustomerId(customerId);
		
	}

}
