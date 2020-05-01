package com.example.demo.service;



import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.model.Account;


@Service
public class RabbitMQConsumerService {
	

	private AccountDAO accountDao;
	@Autowired
	public RabbitMQConsumerService(AccountDAO accountDao) {
		super();
		this.accountDao = accountDao;
	}

	private static final String QUEUE = "accounts-queue";

	@RabbitListener(queues = QUEUE)
	public void receiveMessage(Account account) {

		System.out.println("Received Message from Items Queue >>" + account);
		accountDao.save(account);
		
}
	
	
	public Iterable<Account> findAllAccounts(){
		return accountDao.findAll();		
	}
	
	public Account findById(int id){
		return accountDao.findById(id).orElse(null);
	}
}