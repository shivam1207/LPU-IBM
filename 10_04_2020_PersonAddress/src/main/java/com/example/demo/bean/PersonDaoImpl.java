package com.example.demo.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoImpl implements PersonDao{

	@Override
	public Person getPersonInfo() {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person P = context.getBean("person",Person.class);
		return P;
	}
	

}
