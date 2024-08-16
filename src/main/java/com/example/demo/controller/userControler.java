package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.user;
import com.example.demo.service.userService;

@Controller
@RequestMapping(value = "/user")
public class userControler {
	
	@Autowired
	private userService service;
	
	@PostMapping(value = "/save")
	public ResponseEntity<user> salvaUser(@RequestBody user User){
		User = service.salvarUser(User);
		return ResponseEntity.ok().body(User);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<user> procuraUser(@PathVariable Integer id){
		user User = service.findById(id);
		return ResponseEntity.ok().body(User);
	}
	
	@GetMapping(value = "/buscalall")
	public ResponseEntity<List<user>> procuraTodos(){
		List<user> User = service.findAll();
		return ResponseEntity.ok().body(User);
	}
}
