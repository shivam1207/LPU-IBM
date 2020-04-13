package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public Account updateAccount(Account account);
	public Account deleteAccount(Account account);
	public List<Account> getAllAccountDetails();
}
