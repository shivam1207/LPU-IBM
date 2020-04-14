package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Image;

public interface ImageDao {
	public void createImage(Image image);

	public List<Image> listAll();

}
