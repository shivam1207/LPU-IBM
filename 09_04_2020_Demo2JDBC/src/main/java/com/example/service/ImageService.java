package com.example.service;

import java.util.List;

import com.example.demo.model.Image;

public interface ImageService {
	public void addImage(Image image);
	public List<Image> getAllImages();

}
