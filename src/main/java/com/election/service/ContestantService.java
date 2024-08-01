package com.election.service;

import java.util.List;

import com.election.model.Contestants;

public interface ContestantService {
	public String addContestant(Contestants con);
	public String deleteConById(int id);
	public List<Contestants> getAllContestants();
	public Contestants findConById(int id);
	public String updateContestant(Contestants con);
}
