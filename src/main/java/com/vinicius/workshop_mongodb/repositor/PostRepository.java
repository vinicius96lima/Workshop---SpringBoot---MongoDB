package com.vinicius.workshop_mongodb.repositor;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vinicius.workshop_mongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	// MongoRepository pede de onde ele pede o tipo da classe de dominio que ele
	//vai gerenciar, no nosso caso a classe é User, e o tipo do id, que foi String;
	
	@Query("{ 'title': {$regex: ?0, $options: 'i'}}")
	List <Post> searchTitle (String text);
	
	List <Post> findByTitleContainingIgnoreCase(String text);

}
