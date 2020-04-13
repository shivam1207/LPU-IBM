package com.example.demo.dao;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Account;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{

	private JdbcTemplate jdbcTemplate;
	private Logger logger=Logger.getLogger("AccountDaoImpl");
	@Autowired
	public AccountDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		String query="insert into account(accountNumber,accountType,balance) values('"
				+account.getAccountNumber()+"','"
				+account.getAccountType()+"',"+account.getInitialBalance()+")";
		jdbcTemplate.update(query);
		return account;
	}
	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		String query = "update account set accountType='"+account.getAccountType()+"', balance="+account.getInitialBalance()+" where accountNumber='"+account.getAccountNumber()+"'";
		jdbcTemplate.update(query);
		return account;
		}
	@Override
	public Account deleteAccount(Account account) {
		String query = "delete from account where accountNumber='"+account.getAccountNumber()+"'";
		jdbcTemplate.update(query);
		return account;
	}

}
