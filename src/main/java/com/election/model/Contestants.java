package com.election.model;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@CrossOrigin("http://localhost:3000")
@RequestMapping("/contestants")
public class Contestants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String partyname;
	
	public Contestants() {
		super();
	}

	public Contestants(int cid, String cname, String partyname) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.partyname = partyname;
	}

	@Override
	public String toString() {
		return "Contestants [cid=" + cid + ", cname=" + cname + ", partyname=" + partyname + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	
	
}
