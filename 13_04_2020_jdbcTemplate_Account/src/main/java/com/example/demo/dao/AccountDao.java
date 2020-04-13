package com.example.demo.dao;

import com.example.demo.bean.Account;

public interface AccountDao {
	public Account createAccount(Account account);
	public Account updateAccount(Account account);
	public Account deleteAccount(Account account);

}
