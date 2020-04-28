package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.Dao.ImageDAO;
import com.example.demo.model.Image;
import com.example.demo.service.ImageService;
@EnableDiscoveryClient
@SpringBootApplication
public class Application implements CommandLineRunner{

	private ImageDAO imageDAO;
	@Autowired
	public Application(ImageDAO imageDAO, ImageService imageService) {
		super();
		this.imageDAO = imageDAO;
		this.imageService = imageService;
	}

	private ImageService imageService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		imageDAO.save(new Image("imag1","www.ex.com/image1"));
		imageDAO.save(new Image("imag2","www.ex.com/image2"));
		imageDAO.save(new Image("imag3","www.ex.com/image3"));
		imageDAO.save(new Image("imag4","www.ex.com/image4"));
	}

}
