package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProjectQueryDTO;
import com.example.demo.entity.Project;
import com.example.demo.repo.ProjectRepository;

@Service
public class ProjectQueryServiceImpl implements ProjectQueryService {


 private ProjectRepository projectRepo;

 public ProjectQueryServiceImpl(ProjectRepository projectRepo) {
	super();
	this.projectRepo = projectRepo;
}

@Override
 public ProjectQueryDTO getProject(Integer id) {
  if (projectRepo.findById(id).isPresent()) {
   Project fetchProject = projectRepo.findById(id).get();
   ProjectQueryDTO dto=new ProjectQueryDTO(fetchProject.getName(), fetchProject.getDescription(),
		     fetchProject.getAgentName());
   return  dto;
  } else {
   return null;
  }
 }

 @Override
 public List<ProjectQueryDTO> getAllProjects() {
  List<ProjectQueryDTO> projectList = new ArrayList<>();
  projectRepo.findAll().forEach(project -> {
   projectList.add(new ProjectQueryDTO( project.getName(), project.getDescription(),
     project.getAgentName()));
  });

  return projectList;
 }

@Override
public ProjectQueryDTO saveProject(ProjectQueryDTO projectQueryDTO) {
	// TODO Auto-generated method stub
	Project project= new Project(projectQueryDTO.getName(),projectQueryDTO.getDescription(),projectQueryDTO.getAgentName());
	projectRepo.save(project);
	return projectQueryDTO;
	
	
	
	
}
@Override
public Project updateProject(Project project) {
	 if (projectRepo.findById(project.getId()).isPresent()) {
		 projectRepo.save(project);
		 return project;
	 }
	 else {
		 return null;
	 }
}


@Override
public void deleteProject(int id) {
	// TODO Auto-generated method stub
	 if (projectRepo.findById(id).isPresent()) {
		projectRepo.deleteById(id); 
	 }
}

@Override
public Iterable<Project> findByName(String name) {
	// TODO Auto-generated method stub
	return projectRepo.findByName(name);
}

@Override
@Transactional
public void removeByName(String name) {
	// TODO Auto-generated method stub
	projectRepo.removeByName(name);
}

@Override
public Iterable<Project> findByNameAndAgentName(String name, String agentName) {
	// TODO Auto-generated method stub
	return projectRepo.findByNameAndAgentName(name, agentName);
}

}