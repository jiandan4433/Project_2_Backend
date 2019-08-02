package dev.hogue.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.hogue.entities.Recipe;
import dev.hogue.repositories.RecipeRepository;


@Component
public class DatabaseServiceSpring implements DatabaseService{

	@Autowired
	RecipeRepository repo;
	
	@Override
	public Set<Recipe> getAllRecipes() {
		Iterable<Recipe> recipes = repo.findAll();
		Set<Recipe> recipeSet = new HashSet<Recipe>((Collection<? extends Recipe>) recipes);

		System.out.println(recipeSet);
		return recipeSet;
	}

}
