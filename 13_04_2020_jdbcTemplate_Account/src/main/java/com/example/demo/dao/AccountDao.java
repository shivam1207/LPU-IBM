package com.example.demo.dao;

import java.util.List;


import com.example.demo.bean.Account;

public interface AccountDao {
	public Account createAccount(Account account);
	public void updateAccount(String accountNumber,String accountType,int initialBalance);
	public void deleteAccount(String accountNumber);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
}
