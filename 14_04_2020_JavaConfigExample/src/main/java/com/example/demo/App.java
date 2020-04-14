package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Image;

import com.example.demo.config.MyAppConfig;
import com.example.demo.dao.ImageDao;
import com.example.demo.service.ImageService;
import com.example.demo.service.ImageServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	ImageDao dao;
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
        Image image=context.getBean("image",Image.class);
        ImageService service = context.getBean("imageServiceImpl",ImageServiceImpl.class);
        image.setImageID(UUID.randomUUID().toString());
        image.setImageURL("demo url");
        service.createImage(image);
        //System.out.println(image);
        
        List<Image> image1 =service.listAll();
        for(Image i:image1)
			System.out.println(i);
    
    
}
}
