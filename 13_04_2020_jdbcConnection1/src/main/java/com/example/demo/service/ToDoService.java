package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.ToDo;

public interface ToDoService {
	public ToDo createToDo(ToDo todo);
	public List<ToDo> getAllToDo();
}
