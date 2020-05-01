package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.RabbitMQConsumerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Account Management System", description="Operations pertaining to account in Account Management System")
public class AccountController {
	@Autowired
	private RabbitMQConsumerService service;
	
	@ApiOperation(value = "View a list of available accounts", response = List.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
			})
	@GetMapping("/accounts")
	public ResponseEntity<Iterable<Account>> findAllAccounts(){
		return new ResponseEntity(service.findAllAccounts(),HttpStatus.OK);
	}
	@ApiOperation(value = "Get an account by Id")
	@GetMapping("/Accounts/{id}")
	public ResponseEntity<Account> findById(@PathVariable int id){
		return new ResponseEntity(service.findById(id),HttpStatus.OK);
	}

}
