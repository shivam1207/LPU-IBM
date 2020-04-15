package com.example.demo.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="project_domain")
	private String projectDomain;

	public Project(String projectName, String projectDomain) {
		super();
		this.projectName = projectName;
		this.projectDomain = projectDomain;
	}
	

}
