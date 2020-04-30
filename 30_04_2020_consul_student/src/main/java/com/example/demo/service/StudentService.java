package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;




public interface StudentService {
	public Iterable<Student> getAllStudents();
	 
	 public Student saveStudent(Student student);
	 public Iterable<Student> findBySchoolName(String schoolName);
	 

}
