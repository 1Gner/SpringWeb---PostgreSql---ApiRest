package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.user;
import com.example.demo.repository.userRepository;


@Component
public class start implements CommandLineRunner {
	
	@Autowired
	private userRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		user User = new user();
		User.setName("joao");
		User.setUsername("igner");
		User.setPassword("123");
		repository.save(User);
		
		for(user u :repository.findAll()) {
			System.out.println(u);
		}
	}

}
