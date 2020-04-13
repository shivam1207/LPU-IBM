package com.example.demo.service;

import java.util.List;

import com.example.demo.Exception.AccountNotFoundException;
import com.example.demo.bean.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public void updateAccount(String accountNumber,String accountType,int initialBalance) throws AccountNotFoundException;
	public void deleteAccount(String accountNumber)throws AccountNotFoundException;
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
}
