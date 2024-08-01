package com.election.repo;

import java.util.List;

import com.election.model.Users;

public interface UserRepo {
	public String addUser(Users users);
	public String deletById(int id);
	public List<Users> getAllUsers();
	public Users findUserById(int id);
	public String updateUser(Users user);
}
