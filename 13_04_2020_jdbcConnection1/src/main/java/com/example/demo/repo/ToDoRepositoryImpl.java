package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.ToDo;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository{
	private DataSource dataSource;
	@Autowired
	public ToDoRepositoryImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	private Connection connection=null;;
	
	private static Logger logger=Logger.getLogger("ToDoRepositoryImpl");
	

	public ToDo createToDo(ToDo todo) {
		try {
			logger.log(Level.INFO, "connecting to database..............");
			connection=dataSource.getConnection();
			logger.log(Level.INFO, "GREAT!!...connected to database!!!!!!!!!");
			PreparedStatement pStatement=connection.prepareStatement("insert into todo value(?,?)");
			pStatement.setString(1, todo.getTodoID());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "todo created");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "unable to connect to database");
			e.printStackTrace();
			
		}
			return todo;
		
	}


	@Override
	public List<ToDo> getAllToDo() {
		
		try {
			logger.log(Level.INFO, "connecting to database..............");
			connection=dataSource.getConnection();
			logger.log(Level.INFO, "GREAT!!...connected to database!!!!!!!!!");
			PreparedStatement pStatement=connection.prepareStatement("select * from todo");
			ResultSet rs=pStatement.executeQuery();
			logger.log(Level.INFO, "Listing ToDOs");
			while(rs.next())
			{
				System.out.println(rs.getString("todoID"));
				System.out.println(rs.getString("todoName"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
