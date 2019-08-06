package dev.hogue.service;

import java.util.List;
import java.util.Set;

import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;

public interface UserService {
	
	/*
	 * DBService
	 */
	User createUser(User user);
	User update(User user);
	boolean deleteUser(User user);
	Set<Recipe> getRecipesByUser(User user);
	List<User> getAllUsers();
	User addRecipeToUser(User user, Recipe recipe);
	User login(User user);
	

}
