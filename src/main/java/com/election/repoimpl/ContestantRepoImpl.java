package com.election.repoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.election.model.Contestants;
import com.election.repo.ContestantRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ContestantRepoImpl implements ContestantRepo{
	EntityManager emanager;
	
	String s = "Success";
	String f = "Failure";

	public ContestantRepoImpl(EntityManager emanager) {
		super();
		this.emanager = emanager;
	}

	@Override
	public String addContestant(Contestants con) {
		if(con != null) {
		emanager.persist(con);
		return s;
		}
		else {
			return f;
		}
	}

	@Override
	public String deleteConById(int id) {
		if(id != 0) {
		Contestants con = emanager.find(Contestants.class, id);
		emanager.remove(con);
		return "Deleted";
		}
		else {
			return "Not Deleted";
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contestants> getAllContestants() {
		String hql = "from Contestants";
		Query q = emanager.createQuery(hql);
		return q.getResultList();
	}

	@Override
	public Contestants findConById(int id) {
		return emanager.find(Contestants.class, id);
	}

	@Override
	public String updateContestant(Contestants con) {
		if(con!=null) {
		emanager.merge(con);
		return s;
		}
		else {
			return f;

		}
	}
	
	
}
