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

import com.example.demo.dao.InstructorDetailDAO;

import com.example.demo.entity.InstructorDetail;
import com.example.demo.exception.InstructorNotFoundException;
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
	@GetMapping("/instructorDetails")
	public List<InstructorDetail> listInstructorDetail()
	{
		return dao.getInstructorDetails();
	}
	

	@DeleteMapping("/instructorDetails/{id}")
	public void deleteInstructorDetail(@PathVariable int id)
	{
		InstructorDetail tempInst = dao.getInstructorDetailById(id);
		
		// throw exception if null
		
		if (tempInst == null) {
			throw new InstructorNotFoundException("Instructor Detail id not found - " + id);
		}
				
		dao.deleteInstructorDetail(id);
	}
	@GetMapping("/instructorDetails/{id}")
	public InstructorDetail getInstructorDetailById(@PathVariable int id) {
		return dao.getInstructorDetailById(id);
	}
	
	@PutMapping("/instructorDetails")
	public InstructorDetail updateInstructorDetail(InstructorDetail instructorDetail) {
		
		return dao.updateInstructorDetail(instructorDetail);
	}
	
}
