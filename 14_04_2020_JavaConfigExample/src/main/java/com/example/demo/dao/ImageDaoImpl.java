package com.example.demo.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Image;
import com.example.demo.dao.ImageDao;

@Repository("imageDao")
public class ImageDaoImpl implements ImageDao{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ImageDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	private Logger logger = Logger.getLogger("ImageDAOImpl");

	@Override
	public void createImage(Image image) {
		String sql = "INSERT INTO image values('" + image.getImageID() + "','" + image.getImageURL() + "')";
		int i = jdbcTemplate.update(sql);
		if (i == 0)
			logger.log(Level.INFO, "Record not saved");
		else
			logger.log(Level.INFO, "Record  saved");

	}
	@Override
	public List<Image> listAll() {
		String sql = "SELECT * from image";
		List<Image> images =jdbcTemplate.query(sql,new BeanPropertyRowMapper(Image.class)); 
		return images;
	}
	


}
