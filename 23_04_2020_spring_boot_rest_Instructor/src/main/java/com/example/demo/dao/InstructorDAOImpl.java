package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
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
		session.getTransaction().begin();
		session.save(instructor);
		session.getTransaction().commit();
		return instructor;
	}
	@Override
	public void deleteInstructor(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		// delete object with primary key
		session.getTransaction().begin();
		Instructor inst= session.get(Instructor.class,id);
		session.delete(inst);
		session.getTransaction().commit();
	}
	@Override
	public Instructor getInstructorById(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		return session.get(Instructor.class,id);
	}
	@Override
	public Instructor updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		// delete object with primary key
		session.getTransaction().begin();
		session.update(instructor);
		session.getTransaction().commit();
		return instructor;
		
		
		
		
	}

	

	

}
