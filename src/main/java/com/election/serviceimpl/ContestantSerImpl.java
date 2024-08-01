package com.election.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.election.model.Contestants;
import com.election.repo.ContestantRepo;
import com.election.service.ContestantService;

@Service
public class ContestantSerImpl implements ContestantService{
	
	ContestantRepo repo;

	public ContestantSerImpl(ContestantRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addContestant(Contestants con) {
		return (repo.addContestant(con));
	}

	@Override
	public String deleteConById(int id) {
		return (repo.deleteConById(id));
	}

	@Override
	public List<Contestants> getAllContestants() {
		return repo.getAllContestants();
	}

	@Override
	public Contestants findConById(int id) {
		return repo.findConById(id);
	}

	@Override
	public String updateContestant(Contestants con) {
		return (repo.updateContestant(con));
	}

}
