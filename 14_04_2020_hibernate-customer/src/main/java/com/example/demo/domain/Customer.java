package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 992136183001389147L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="email")
	private String customerEmail;
	private Boolean isActive;
	
	

}
