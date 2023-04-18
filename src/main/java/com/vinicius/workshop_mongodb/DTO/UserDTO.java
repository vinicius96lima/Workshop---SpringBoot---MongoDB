/* DTO é como se fosse um filtro onde mostramos apenas o que se é necessário, 
 * para não ficar expondo as informações dos usuários.
 * para fazer isso precisamos usar um construtor recebendo um objeto
 * do qual queremos mostras as informações, e nesse construtor mostramos quais
 * informações são pertinentes.
 * 
 */

package com.vinicius.workshop_mongodb.DTO;

import java.io.Serializable;

import com.vinicius.workshop_mongodb.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
