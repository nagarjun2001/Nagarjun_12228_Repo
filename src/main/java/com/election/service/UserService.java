package com.election.service;

import java.util.List;

import com.election.model.Users;

public interface UserService {
	public String addUser(Users users);
	public String deleteById(int id);
	public List<Users> getAllUsers();
	public Users findUserById(int id);
	public String updateUser(Users user);
}
