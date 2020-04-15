package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.enitity.Project;
import com.example.demo.enitity.Student;



public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Project.class)
				.buildSessionFactory();

// create session
Session session = factory.openSession();
try {			

	Student student = new Student("Shivam","shivam@g.com");
	Project project = new Project("Student Management System","java");
	student.setProject(project);
	session.beginTransaction();
	System.out.println("Saving Student: " + student);
	
	session.save(student);					
	
	// commit transaction
	session.getTransaction().commit();
	
	System.out.println("Done!");
	
}
finally {
	factory.close();

}
}
}