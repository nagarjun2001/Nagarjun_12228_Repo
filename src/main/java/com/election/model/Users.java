package com.election.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private int wardno;
	private String voterid;
	
	@ManyToOne(cascade = CascadeType.MERGE, targetEntity = Contestants.class)
	@JoinColumn
	private Contestants contestants;

	public Users() {
		super();
	}

	public Users(int uid, String uname, int wardno, String voterid, Contestants contestants) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.wardno = wardno;
		this.voterid = voterid;
		this.contestants = contestants;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", wardno=" + wardno + ", voterid=" + voterid
				+ ", contestants=" + contestants + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getWardno() {
		return wardno;
	}

	public void setWardno(int wardno) {
		this.wardno = wardno;
	}

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public Contestants getContestants() {
		return contestants;
	}

	public void setContestants(Contestants contestants) {
		this.contestants = contestants;
	}

}
