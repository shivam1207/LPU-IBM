package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

	public Iterable<Student> findBySchoolName(String schoolName);
}
