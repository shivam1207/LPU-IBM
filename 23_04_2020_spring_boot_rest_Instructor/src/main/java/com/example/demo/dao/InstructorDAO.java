package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorDAO {
public List<Instructor> getInstructors();
	
	public Instructor createInstructor(Instructor instructor);
	public Instructor deleteInstructor(int id);

}
