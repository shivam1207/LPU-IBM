package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.model.Product;


@Service
public class ProductServiceImpl implements ProductService {

   private ProductDAO productDAO;
   
   @Autowired
   public ProductServiceImpl(ProductDAO productDAO) {
	super();
	this.productDAO = productDAO;
	}
   
   @Override
	public Iterable<Product> getProducts() {
		
		return productDAO.findAll();
	}

   @Override
   public Product findById(int id) {
   	// TODO Auto-generated method stub
   	return productDAO.findById(id).orElse(null);
   }

   @Override
   public Product saveProduct(Product product) {
   	// TODO Auto-generated method stub
   	return productDAO.save(product);
   }

@Override
public void deleteProduct(int id) {
	// TODO Auto-generated method stub
	productDAO.deleteById(id);
	
}



   
}
