package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.InstructorDAO;
import com.example.demo.entity.Instructor;


@RestController
@RequestMapping("/api")
public class InstructorController {
	
	

		private InstructorDAO dao;
		@Autowired
		public InstructorController(InstructorDAO dao) {
			super();
			this.dao = dao;
		}
		
		
		
		@GetMapping("/instructors")
		public List<Instructor> listInstructor()
		{
			return dao.getInstructors();
		}
		
		@PostMapping("/instructors")
		public Instructor createInstructor(Instructor instructor)
		{
			return dao.createInstructor(instructor);
		}
			
}
