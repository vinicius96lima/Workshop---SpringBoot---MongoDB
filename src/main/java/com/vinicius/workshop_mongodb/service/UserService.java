package com.vinicius.workshop_mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.workshop_mongodb.DTO.UserDTO;
import com.vinicius.workshop_mongodb.domain.User;
import com.vinicius.workshop_mongodb.repositor.UserRepository;
import com.vinicius.workshop_mongodb.service.exception.ObjectNotFound;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	// @Autowired faz a função de procura da classe intanciando o objeto;
	
	public List <User> findAll(){
		return repo.findAll();
		
	}
	
	public User findById (String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFound("Objeto nao encontrado"));
	}
	
	public User insert (User obj) {
		return repo.insert(obj);		
	}
	
	public void delete (String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO (UserDTO objDTO) {
		return new User (objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
	
	
	
	

}
