package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Person {
	private String name="Shivam";
	private int age=22;
	private float height=1.99f;
	private boolean isprogrammer =true;
	private Address address;
	

}
