package com.election.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.election.model.Contestants;
import com.election.model.Users;

@SpringBootTest
class UserSerImplTest {
	@Autowired
	UserSerImpl userservice;

	@Test
	void testAddUser() {
		Contestants c = new Contestants(2, "Moti", "PJP");
		Users user = new Users(0, "Suresh", 34, "KJHGV897", c);
		assertEquals("Success", userservice.addUser(user));
	}

	@Test
	void testFailureAddUser() {
		Users fu = null;
		assertEquals("Failure", userservice.addUser(fu));
	}

	@Test
	void testUpdateUser() {
		Contestants c = new Contestants(1, "Nagarjun", "IOF");
		Users user = new Users(6, "Suresh Babu", 98, "KJHGV899", c);
		assertEquals("Success", userservice.updateUser(user));
	}

	@Test
	void testUpdateUserFailure() {
		Users user = null;
		assertEquals("Failure", userservice.updateUser(user));
	}

	@Test
	void testDeleteByIdFail() {
		assertEquals("Failure", userservice.deleteById(0));
	}

	@Test
	void testGetAllUsers() {
		assertNotNull(userservice.getAllUsers());
	}

	@Test
	void testFindUserById() {
		assertNotNull(userservice.findUserById(1));
	}

	@Test
	void testFindUserByIdFailed() {
		assertNull(userservice.findUserById(0));
	}

}
