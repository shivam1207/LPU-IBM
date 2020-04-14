package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Image;
import com.example.demo.dao.ImageDao;
@Service
public class ImageServiceImpl implements ImageService{

	@Autowired
	private ImageDao imageDao;
	@Override
	public void createImage(Image image) {
		// TODO Auto-generated method stub
		imageDao.createImage(image);
	}
	@Override
	public List<Image> listAll() {
		// TODO Auto-generated method stub
		return imageDao.listAll();
	}

}
