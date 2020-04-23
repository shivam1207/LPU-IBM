package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InstructorRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<InstructorResponseEntity> handleException(InstructorNotFoundException snfe)
{

		
	return new ResponseEntity<InstructorResponseEntity>(new InstructorResponseEntity(HttpStatus.NOT_FOUND.value(), snfe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
}
@ExceptionHandler
public ResponseEntity<InstructorResponseEntity> handleNumberFormatException(NumberFormatException ipme)
{
	return new ResponseEntity<InstructorResponseEntity>(new InstructorResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
}

// For all other exceptions-global exception
@ExceptionHandler
public ResponseEntity<InstructorResponseEntity> handleGlobalException(Exception exc){
	return new ResponseEntity<InstructorResponseEntity>(new InstructorResponseEntity(HttpStatus.BAD_REQUEST.value(),"something is not right, try again with correct values", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}

}
