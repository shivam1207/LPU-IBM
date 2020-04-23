package com.example.demo.exception;

public class InstructorNotFoundException  extends RuntimeException{

	private String message;

	public InstructorNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InstructorNotFoundException [message=" + message + "]";
	}

}
