package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private ProjectRepository projectRepository; 

	@Autowired
	public Application(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		projectRepository.save(new Project("demo project 1", "demo description-1", "demo agent-1"));
		projectRepository.save(new Project("demo project 2", "demo description-2", "demo agent-2"));
		projectRepository.save(new Project("demo project 3", "demo description-3", "demo agent-3"));
		projectRepository.save(new Project("demo project 4", "demo description-4", "demo agent-4"));
		
	}

}
