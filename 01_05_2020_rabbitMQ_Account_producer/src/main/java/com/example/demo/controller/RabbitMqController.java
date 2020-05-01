package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.RabbitMqService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@Api(value="Account Management System", description="Operations pertaining to account in Account Management System")
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfull"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
			})
    @ApiOperation(value = "Add an account")
    @PostMapping("/accounts")
    public ResponseEntity<String> postMessage(@RequestBody Account account){
        rabbitMqService.sendMessage(account);
        return new ResponseEntity<String>("Item pushed to RabbitMQ",HttpStatus.CREATED);
    }
}