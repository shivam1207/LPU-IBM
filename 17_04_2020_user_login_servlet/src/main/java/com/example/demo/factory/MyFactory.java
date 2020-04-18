package com.example.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFactory {
	
	private static MyFactory myFactory;
	private Connection connection;
	
	
	private MyFactory() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu_java","root","admin");
	}
	
	
	public static MyFactory getMyFactory() throws SQLException
	{
		if(myFactory==null)
		{
			myFactory=new MyFactory();
		}
		return myFactory;
	}
	
	public Connection getMyConnection()
	{
		return connection;
	}

}
