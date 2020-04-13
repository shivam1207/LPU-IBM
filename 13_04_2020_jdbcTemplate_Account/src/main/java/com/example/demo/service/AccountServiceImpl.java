package com.example.demo.service;

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

}
