package com.vinicius.workshop_mongodb.repositor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.workshop_mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	// MongoRepository pede de onde ele pede o tipo da classe de dominio que ele
	//vai gerenciar, no nosso caso a classe é User, e o tipo do id, que foi String;
	

}
