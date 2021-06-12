package com.rcoelloq.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rcoelloq.backend.dao.UserRepository;
import com.rcoelloq.backend.model.User;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepo.save(new User("Ricardo", "Coello", "rr@gmail.com"));
		userRepo.save(new User("Alejandro", "Cordero", "alejo@gmail.com"));
		userRepo.save(new User("Ivon", "Quezada", "ivon@gmail.com"));
		userRepo.save(new User("Norma", "Chiriboga", "norma@gmail.com"));
		
		
	}

}
