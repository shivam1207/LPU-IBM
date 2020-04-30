package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class SchoolService {
	@Autowired
    RestTemplate restTemplate;

	public List<Object> getAllStudent() {
        return (List<Object>) restTemplate.getForObject("http://STUDENT-SERVICE/students",Object.class);
    }
	
	public List<Object> getStudentByName(String schoolName) {
		return (List<Object>) restTemplate.getForObject("http://STUDENT-SERVICE/students/{schoolName}", Object.class,schoolName);
		
		
		
	}
}
