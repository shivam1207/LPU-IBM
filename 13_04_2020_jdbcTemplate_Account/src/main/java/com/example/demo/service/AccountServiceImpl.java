package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Account;
import com.example.demo.dao.AccountDao;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.createAccount(account);
	}

	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	
	}

	@Override
	public Account deleteAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.deleteAccount(account);
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccountDetails();
	}

	@Override
	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return accountDao.findByAccountNumber(accountNumber);
	}

}
