package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.example.demo.bean.Person;
import com.example.demo.bean.PersonDao;
import com.example.demo.bean.PersonDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	PersonDao dao = context.getBean(PersonDaoImpl.class);
    	System.out.println(dao.getPersonInfo());
    }

	

}
