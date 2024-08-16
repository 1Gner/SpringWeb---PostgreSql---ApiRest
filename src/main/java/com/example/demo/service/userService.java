package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.UserNullException;
import com.example.demo.model.user;
import com.example.demo.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository repository;
	
	public user salvarUser(user User) {
		if(User.getName() == null) {
			throw new UserNullException();
		}
		return repository.save(User);
	}
	
	public user findById(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<user> findAll(){
		return repository.findAll();
	}
}
