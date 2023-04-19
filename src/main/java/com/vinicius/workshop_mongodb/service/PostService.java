package com.vinicius.workshop_mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.workshop_mongodb.domain.Post;
import com.vinicius.workshop_mongodb.repositor.PostRepository;
import com.vinicius.workshop_mongodb.service.exception.ObjectNotFound;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	// @Autowired faz a função de procura da classe intanciando o objeto;
	
	public List <Post> findAll(){
		return repo.findAll();
		
	}
	
	public Post findById (String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFound("Objeto nao encontrado"));
	}
	
	public List <Post> findByTitle (String text){
		return repo.searchTitle(text);
	}
	
}