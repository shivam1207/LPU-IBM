package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Image;
import com.example.demo.service.ImageService;
@RestController
public class ImageController {
	@Autowired
	public ImageService service;
	@GetMapping("/images")
	public List<Image> getAllImages(){
		return service.getAllImages();
		
		
	}

}
