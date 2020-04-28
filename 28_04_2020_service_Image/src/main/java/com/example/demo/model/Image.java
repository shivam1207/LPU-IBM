package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "project_name")
public class Image {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	private String name;
	 private String url;
	public Image() {
		
	}
	 public Image(String name, String url) {
			super();
			this.name = name;
			this.url = url;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
