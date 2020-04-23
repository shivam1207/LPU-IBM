package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Instructor;
@Repository
@EnableTransactionManagement
public class InstructorDAOImpl implements InstructorDAO{
	private EntityManager entityManager;
	@Autowired
	public InstructorDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	@Override
	public List<Instructor> getInstructors() {
		// TODO Auto-generated method stub
Session session=entityManager.unwrap(Session.class);
		
		Query query=session.createQuery("from Instructor",Instructor.class);
		return query.getResultList();
	}

	@Override
	public Instructor createInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.save(instructor);
		return instructor;
	}

	

	

}
