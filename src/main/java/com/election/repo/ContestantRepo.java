package com.election.repo;

import java.util.List;

import com.election.model.Contestants;

public interface ContestantRepo {
	public String addContestant(Contestants con);
	public String deleteConById(int id);
	public List<Contestants> getAllContestants();
	public Contestants findConById(int id);
	public String updateContestant(Contestants con);
}
