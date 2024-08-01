package com.election.repoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.election.model.Users;
import com.election.repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo{
	
	String s = "Success";
	String f = "Failure";
	
	EntityManager emanager;

	public UserRepoImpl(EntityManager emanager) {
		super();
		this.emanager = emanager;
	}

	@Override
	public String addUser(Users users) {
		if(users != null) {
			emanager.persist(users);
			return s;
		}
		else {
			return f;
		}
	}

	@Override
	public String deletById(int id) {
		if(id!=0) {
			Users u = emanager.find(Users.class, id);
			emanager.remove(u);
			return s;
		}
		else {
			return f;
		}
	}

	@Override
	public String updateUser(Users u) {
		if(u != null) {
			emanager.merge(u);
			return s;
		}
		else {
			return f;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		String hql = "from Users";
		Query q = emanager.createQuery(hql);
		return q.getResultList();
	}

	@Override
	public Users findUserById(int id) {
		return emanager.find(Users.class, id);
	}
	
	
}
