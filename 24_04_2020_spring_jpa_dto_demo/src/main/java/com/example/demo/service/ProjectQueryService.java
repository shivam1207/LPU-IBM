package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.ProjectQueryDTO;
import com.example.demo.entity.Project;

public interface ProjectQueryService {

 public ProjectQueryDTO getProject(Integer id);

 public List getAllProjects();
 
 public ProjectQueryDTO saveProject(ProjectQueryDTO projectQueryDTO);
 
 public void deleteProject(int id);
 public Project updateProject(Project project);

 public Iterable<Project> findByName(String name);
 public void removeByName(String name);
 public Iterable<Project> findByNameAndAgentName(String name, String agentName);
}