package dev.hogue.service;

import dev.hogue.entities.User;

public interface UserService {
	
	/*
	 * DBService
	 */
	User createUser(User user);
	User update(User user);
	boolean deleteUser(String username);
	

}
