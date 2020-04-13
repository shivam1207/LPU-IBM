package com.example.demo;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
import com.example.demo.repo.ToDoRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDoRepository toDoRepository=context.getBean("toDoRepositoryImpl",ToDoRepositoryImpl.class); 
		ToDo todo=toDoRepository.createToDo(new ToDo(UUID.randomUUID().toString(),"compile"));
		System.out.println(todo);
    }
}
