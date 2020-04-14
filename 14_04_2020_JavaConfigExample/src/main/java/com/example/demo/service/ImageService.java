package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bean.Image;
import com.example.demo.dao.ImageDao;

public interface ImageService {
	
	public void createImage(Image image);
	public List<Image> listAll();
}
