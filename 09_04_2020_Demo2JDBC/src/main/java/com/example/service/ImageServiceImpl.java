package com.example.service;

import java.util.List;

import com.example.dao.ImageDao;
import com.example.dao.ImageDaoImpl;
import com.example.demo.model.Image;

public class ImageServiceImpl implements ImageService{

	ImageDao imagedao = new ImageDaoImpl();

	public void addImage(Image image) {
		imagedao.addImage(image);
		
	}

	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return imagedao.getAllImages();
	}

	
	
}
