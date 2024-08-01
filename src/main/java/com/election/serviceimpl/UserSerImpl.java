package com.election.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.election.model.Users;
import com.election.repo.UserRepo;
import com.election.service.UserService;

@Service
public class UserSerImpl implements UserService{
	
	UserRepo repo;

	public UserSerImpl(UserRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addUser(Users users) {
		return (repo.addUser(users));
	}

	@Override
	public String updateUser(Users user) {
		return (repo.updateUser(user));
	}

	@Override
	public String deleteById(int id) {
		return (repo.deletById(id));
	}

	@Override
	public List<Users> getAllUsers() {
		return repo.getAllUsers();
	}

	@Override
	public Users findUserById(int id) {
		return repo.findUserById(id);
	}

}
