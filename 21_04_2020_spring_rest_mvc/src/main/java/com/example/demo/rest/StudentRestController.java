package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.exception.StudentResponseEntity;

	
	@RestController
	@RequestMapping("/api")
	public class StudentRestController {

		// define endpoint for "/students" - return list of students
		List<Student> theStudents=null;
		@PostConstruct
		public void init()
		{
			theStudents = new ArrayList<Student>();
			
			theStudents.add(new Student(0,"Poornima", "Patel"));
			theStudents.add(new Student(1,"Mario", "Rossi"));
			theStudents.add(new Student(2,"Mary", "Smith"));		
			
		}
		//fetching all students details
		
		@GetMapping("/students")
		public List<Student> getStudents() {

			
			return theStudents;
		}
		//fetching details by id
		@GetMapping("/students/{studentID}")
		public Student getStudentByID(@PathVariable int studentID) throws StudentNotFoundException
		{
			if ( (studentID >= theStudents.size()) || (studentID < 0) ) {			
				throw new StudentNotFoundException("Student id not found - " + studentID);
			}
			
			return theStudents.get(studentID);
		
		}
		
		//creating student
		@PostMapping("/students")
		public Student createStudent(@RequestBody Student theStudent)
		{
			theStudents.add(theStudent);
			return theStudent;
		}
		@ExceptionHandler
			public ResponseEntity<StudentResponseEntity> handleException(StudentNotFoundException snfe)
		{
		
				/*
				 * StringBuffer br=new StringBuffer(); br.append(HttpStatus.NOT_FOUND);
				 * br.append(snfe.getMessage()); br.append(System.currentTimeMillis()); return
				 * new ResponseEntity<Object>(br,HttpStatus.NOT_FOUND);
				 */
			return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.NOT_FOUND.value(), snfe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
		}
		@ExceptionHandler
		public ResponseEntity<StudentResponseEntity> handleNumberFormatException(NumberFormatException ipme)
		{
			return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
		}
		
		// For all other exceptions-global exception
		@ExceptionHandler
		public ResponseEntity<StudentResponseEntity> handleGlobalException(Exception exc){
			return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.BAD_REQUEST.value(),"something is not right, try again with correct values", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
			
			
		
			
			
		}

	
	}
	









