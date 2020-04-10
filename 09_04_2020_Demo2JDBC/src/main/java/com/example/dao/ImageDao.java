package com.example.dao;

import java.util.List;

import com.example.demo.model.Image;


public interface ImageDao {
	
	public void addImage(Image image);
	public List<Image> getAllImages();
	
	

}
