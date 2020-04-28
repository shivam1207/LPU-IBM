package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class AlbumService {
	

	    @Autowired
	    RestTemplate restTemplate;

	    public List<Object> getImages() {
	        return (List<Object>) restTemplate.getForObject("http://SERVICE-IMAGE/images",Object.class);
	    }

}
