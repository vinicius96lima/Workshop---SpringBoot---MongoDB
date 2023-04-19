package com.vinicius.workshop_mongodb.DTO;

import java.io.Serializable;

import com.vinicius.workshop_mongodb.domain.User;

public class AutorDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AutorDTO() {
		
	}
	
	public AutorDTO (User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
