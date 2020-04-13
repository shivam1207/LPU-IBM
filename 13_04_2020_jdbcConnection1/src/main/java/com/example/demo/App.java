package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
import com.example.demo.repo.ToDoRepositoryImpl;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	ToDoService toDoService = context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		//ToDoRepository toDoRepository=context.getBean("toDoRepositoryImpl",ToDoRepositoryImpl.class); 
    	ToDo todo =toDoService.createToDo(new ToDo(UUID.randomUUID().toString(),"testing"));
		//ToDo todo=toDoRepository.createToDo(new ToDo(UUID.randomUUID().toString(),"compile"));
		
    	System.out.println(todo);
    	List<ToDo> todo1 =toDoService.getAllToDo();
    	
		
    }
}
