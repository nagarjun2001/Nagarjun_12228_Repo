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

import com.election.model.Contestants;
import com.election.serviceimpl.ContestantSerImpl;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/contestant")
public class ContestantController {
	String s = "Success";
	String f = "Failure";
	
	ContestantSerImpl service;
	
	public ContestantController(ContestantSerImpl service) {
		super();
		this.service = service;
	}


	@PostMapping
	public String addContestant(@RequestBody Contestants con) {
		String msg = "";
		try {
			service.addContestant(con);
			msg = s;
		}
		catch(Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@PutMapping
	public String updateContestants(@RequestBody Contestants con) {
		String msg = "";
		try {
			service.updateContestant(con);
			msg = s;
		}
		catch (Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteContestants(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteConById(id);
			msg = s;
		}
		catch (Exception e) {
			msg = f;
		}
		return msg;
	}
	
	@GetMapping("{id}")
	public Contestants getContestantById(@PathVariable("id") int id) {
			return service.findConById(id);
	}
	
	@GetMapping("/all")
	public List<Contestants> getAllContestants() {
			return service.getAllContestants();	
	}
}
