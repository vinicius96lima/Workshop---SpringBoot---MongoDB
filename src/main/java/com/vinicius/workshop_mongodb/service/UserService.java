package com.vinicius.workshop_mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.workshop_mongodb.domain.User;
import com.vinicius.workshop_mongodb.repositor.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	// @Autowired faz a função de procura da classe intanciando o objeto;
	
	public List <User> findAll(){
		return repo.findAll();
		
	}

}
