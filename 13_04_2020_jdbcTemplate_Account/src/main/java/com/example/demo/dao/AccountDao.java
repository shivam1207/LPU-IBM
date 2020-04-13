package com.example.demo.dao;

import java.util.List;

import com.example.demo.Exception.AccountNotFoundException;
import com.example.demo.bean.Account;

public interface AccountDao {
	public Account createAccount(Account account);
	public void updateAccount(String accountNumber,String accountType,int initialBalance) throws AccountNotFoundException;
	public void deleteAccount(String accountNumber) throws AccountNotFoundException;
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
}
