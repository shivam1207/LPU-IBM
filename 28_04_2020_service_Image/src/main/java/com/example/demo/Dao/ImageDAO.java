package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Image;
@Repository
public interface ImageDAO extends CrudRepository<Image, Integer>{

}
