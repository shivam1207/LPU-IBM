package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ImageDAO;
import com.example.demo.model.Image;

@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	public ImageDAO imageDAO;

	@Override
	
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return (List<Image>) imageDAO.findAll();
		
	}

}
