package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer>{
	@Query
	public Iterable<Project> findByName(String name);
	public void removeByName(String name);
	public Iterable<Project> findByNameAndAgentName(String name, String agentName);
}