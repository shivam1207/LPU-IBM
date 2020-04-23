package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

public interface InstructorDetailDAO {
	public InstructorDetail createInstructorDetail(InstructorDetail instructorDetail);
	public List<InstructorDetail> getInstructorDetails();
	public InstructorDetail getInstructorDetailById(int id);
	public void deleteInstructorDetail(int id);
	public InstructorDetail updateInstructorDetail(InstructorDetail instructorDetail);
	

}
