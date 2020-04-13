package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
@Service
public class ToDoServiceImpl implements ToDoService{

	@Autowired
	private ToDoRepository toDoRepository;
	
	public ToDo createToDo(ToDo todo) {
		// TODO Auto-generated method stub
		return toDoRepository.createToDo(todo);
	}

	@Override
	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoRepository.getAllToDo();
	}

}
