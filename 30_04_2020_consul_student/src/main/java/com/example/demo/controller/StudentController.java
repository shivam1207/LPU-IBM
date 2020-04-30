package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	 @PostMapping("/students")
	 public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	
	@GetMapping("/students/{schoolName}")
	public Iterable<Student> findBySchoolName(@PathVariable String schoolName){
		return studentService.findBySchoolName(schoolName);
		
	}

}
