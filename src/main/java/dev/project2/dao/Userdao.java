package dev.project2.dao;

import dev.project2.entities.User;

public interface Userdao {

	User createUser (String username, String password);
	
	User getUserByUsername (String username);
	
	boolean deleteUser(User user);
}
