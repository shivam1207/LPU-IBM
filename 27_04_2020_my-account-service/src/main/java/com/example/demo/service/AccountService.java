package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Account;

public interface AccountService {
	
	public ResponseEntity<Iterable<Account>> getAccounts();
	public Account getAccountById(int id);
	public Iterable<Account> findByCustomerId(String customerId);

}