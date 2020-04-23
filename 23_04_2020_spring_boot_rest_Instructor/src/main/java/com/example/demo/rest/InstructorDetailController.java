package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.InstructorDetailDAO;

import com.example.demo.entity.InstructorDetail;
@RestController
@RequestMapping("/api")
public class InstructorDetailController {
	private InstructorDetailDAO dao;
	@Autowired
	public InstructorDetailController(InstructorDetailDAO dao) {
		super();
		this.dao = dao;
	}
	@PostMapping("/instructorDetails")
	public InstructorDetail createInstructor(@RequestBody InstructorDetail instructorDetail)
	{
		return dao.createInstructorDetail(instructorDetail);
	}
	
	

}
