package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ImageRepo;

@SpringBootApplication
public class Application {
	private ImageRepo imageRepo;

	@Autowired
	public Application(ImageRepo imageRepo) {
		super();
		this.imageRepo = imageRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
