package com.election.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.election.model.Users;
import com.election.serviceimpl.UserSerImpl;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/users")
public class UserController {
	String s = "Success";
	String f = "Failure";
	
	UserSerImpl service;
	
	public UserController(UserSerImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String addUsers(@RequestBody Users user) {
		String msg = "";
		try {
			service.addUser(user);
			msg = s;
		}
		catch (Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@PutMapping
	public String updateUsers(@RequestBody Users user) {
		String msg = "";
		try {
			service.updateUser(user);
			msg = s;
		}
		catch (Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteUsers(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteById(id);
			msg = s;
		}
		catch (Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Users findUsers(@PathVariable("id") int id) {
			return service.findUserById(id);
	}
	
	@GetMapping("/all")
	public List<Users> findAllUsers() {
		return service.getAllUsers();
	}
	
}
