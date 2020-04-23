package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.InstructorDAO;
import com.example.demo.entity.Instructor;
import com.example.demo.exception.InstructorNotFoundException;


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
		@GetMapping("/instructors/{id}")
		public Instructor getInstructor(@PathVariable int id)
		{
			Instructor inst = dao.getInstructorById(id);
			if (inst == null) {
				throw new InstructorNotFoundException("Instructor id not found - " + id);
			}
			
			return inst;
		}
		@PostMapping("/instructors")
		public Instructor createInstructor(@RequestBody Instructor instructor)
		{
			return dao.createInstructor(instructor);
		}
		@PutMapping("/instructors")
		public Instructor updateInstructor(@RequestBody Instructor instructor)
		{
			dao.createInstructor(instructor);
			return instructor;
		}
		
			
		@DeleteMapping("/instructors/{id}")
		public void deleteInstructor(@PathVariable int id) {
			Instructor tempInst = dao.getInstructorById(id);
			
			// throw exception if null
			
			if (tempInst == null) {
				throw new InstructorNotFoundException("Instructor id not found - " + id);
			}
					
			dao.deleteInstructor(id);
			
			
		}
}
