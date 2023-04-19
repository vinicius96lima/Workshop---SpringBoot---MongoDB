package com.vinicius.workshop_mongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vinicius.workshop_mongodb.DTO.AutorDTO;
import com.vinicius.workshop_mongodb.domain.Post;
import com.vinicius.workshop_mongodb.domain.User;
import com.vinicius.workshop_mongodb.repositor.PostRepository;
import com.vinicius.workshop_mongodb.repositor.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,bob, alex));
		
		Post obj = new Post(null, sdf.parse("19/04/2023"), "Partiu viagem", "Vou viajar para SP abraços", new AutorDTO(maria));
		Post obj1 = new Post(null, sdf.parse("19/04/2023"), "Partiu viagem", "Vou viajar", new AutorDTO(maria));
	
		postRepository.saveAll(Arrays.asList(obj, obj1));
		
		maria.getPost().addAll(Arrays.asList(obj, obj1));
		userRepository.save(maria);
		

		
	}

}
