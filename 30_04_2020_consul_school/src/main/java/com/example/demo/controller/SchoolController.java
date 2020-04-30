package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SchoolService;

@RestController
public class SchoolController {
	@Autowired
	public SchoolService schoolService;
	@GetMapping("/schools")
	public List<Object> getAllStudents()
	{
		return schoolService.getAllStudent();
}
	@GetMapping("/schools/{schoolName}")
	public Iterable<Object> getStudentBySchoolName(@PathVariable String schoolName){
		return schoolService.getStudentByName(schoolName);
	}
}

