package com.election.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.election.model.Contestants;

@SpringBootTest
class ContestantSerImplTest {
	
	@Autowired
	ContestantSerImpl service;
	
	@Test
	void testAddContestant() {
		Contestants obj = new Contestants(0,"Arjun","NSN"); 
		assertEquals("Success", service.addContestant(obj));
	}

	@Test
	void testAddContestantFail() {
		Contestants obj = null; 
		assertEquals("Failure", service.addContestant(obj));
	}
		

	@Test
	void testDeleteConByIdFailed() {
		assertEquals("Not Deleted", service.deleteConById(0));
	}
	
	@Test
	void testGetAllContestants() {
		assertNotNull(service.getAllContestants());
	}

	@Test
	void testFindConById() {
		assertNotNull(service.findConById(2));
	}
	
	@Test
	void testFindConByIdFailed() {
		assertNull(service.findConById(0));
	}

	@Test
	void testUpdateContestant() {
		Contestants obj = new Contestants(1,"Nagarjun N S","UFO"); 
		assertEquals("Success", service.updateContestant(obj));
	}

	@Test
	void testUpdateContestantFailed() {
		Contestants obj = null; 
		assertEquals("Failure", service.updateContestant(obj));
	}

}
