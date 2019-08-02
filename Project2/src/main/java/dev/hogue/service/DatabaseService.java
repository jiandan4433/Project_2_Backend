package dev.hogue.service;

import java.util.Set;

import dev.hogue.entities.Recipe;

public interface DatabaseService {
	
	public Set<Recipe> getAllRecipes();

}
