package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProjectQueryDTO;
import com.example.demo.entity.Project;
import com.example.demo.service.ProjectQueryService;

@RestController
@RequestMapping("/api")
public class ProjectQueryController {

 @Autowired
 private ProjectQueryService projectQueryService;

 @GetMapping("/projects")
 public ResponseEntity<Object> getAllProjects() {
  return new ResponseEntity<>(projectQueryService.getAllProjects(), HttpStatus.OK);
 }

	
	  @GetMapping("/projects/{id}") public ResponseEntity<Project>
	  getProjectById(@PathVariable("id") Integer id){ return new
	  ResponseEntity(projectQueryService.getProject(id),HttpStatus.OK); }
	 
 
 @PostMapping("/projects")
 public ProjectQueryDTO saveProject(@RequestBody ProjectQueryDTO projectQueryDTO) {
	 
	return projectQueryService.saveProject(projectQueryDTO);
	 
}
 @PutMapping("/projects")
 public Project updateProject(@RequestBody Project project){
	 
	return projectQueryService.updateProject(project);
	 
}
 @DeleteMapping("/projects/{id}")
 public void deleteProject(@PathVariable("id") int id) {
	 projectQueryService.deleteProject(id);
	 
 }
 @GetMapping("/projects/projectName/{name}")
 public ResponseEntity<Iterable<Project>> getProjectByName(@PathVariable("name") String name){
	return ResponseEntity.ok().body(projectQueryService.findByName(name));
	 
 }
 @DeleteMapping("/projects/projectName/{name}")
 public void removeByName(@PathVariable("name")String name) {
	 projectQueryService.removeByName(name);
	 
 }
 @GetMapping("/projects/{name}/{agentName}")
 public ResponseEntity<Iterable<Project>> findByNameAndAgentName(@PathVariable("name") String name,@PathVariable("agentName") String agentName)
 {
	return ResponseEntity.ok().body(projectQueryService.findByNameAndAgentName(name, agentName));
	 
 }

 
 
 
 
 
}