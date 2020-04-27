package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;
@Service
public class AccountServiceImpl implements AccountService {

	private AccountDAO dao;
	
	@Autowired
	public AccountServiceImpl(AccountDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public ResponseEntity<Iterable<Account>> getAccounts() {
		// TODO Auto-generated method stub
		Iterable<Account> accounts=dao.findAll();
		return ResponseEntity.ok().body(accounts);
	}

	@Override
	public Account getAccountById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public Account getAccountByCustomerId(String customerId) {
		// TODO Auto-generated method stub;
		return dao.getAccountByCustomerId(customerId);
	}

}
