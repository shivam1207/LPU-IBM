package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
@Repository
@EnableTransactionManagement
public class InstructorDetailDAOImpl implements InstructorDetailDAO{

	private EntityManager entityManager;
	public InstructorDetailDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	@Override
	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail) {
		// TODO Auto-generated method stub
    Session session=entityManager.unwrap(Session.class);
    
    Instructor tempI=instructorDetail.getInstructor();
    tempI.setInstructorDetail(instructorDetail);
    session.save(tempI);
	return instructorDetail;
    
		
	}

	public List<InstructorDetail> getInstructorDetails() {
		// TODO Auto-generated method stub
Session session=entityManager.unwrap(Session.class);
		
		Query query=session.createQuery("from InstructorDetail",InstructorDetail.class);
		return query.getResultList();
	}

}
