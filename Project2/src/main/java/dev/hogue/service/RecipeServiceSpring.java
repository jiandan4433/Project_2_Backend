package dev.hogue.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;
import dev.hogue.repositories.RecipeRepository;



@Component
@Service("RecipeServiceSpring")
public class RecipeServiceSpring implements RecipeService{

	@Autowired
	RecipeRepository repo;

	@Override
	public Recipe createRecipe(Recipe recipe) {
		repo.save(recipe);
		return recipe;
	}

	@Override
	public Recipe getRecipeById(int id) {
		Recipe recipe = repo.findById(id);
		return recipe;
	}

	@Override
	public Recipe getRecipeByName(String name) {
		Recipe recipe = repo.findByName(name);
		return recipe;
	}



	@Override
	public Recipe updateRecipe(Recipe recipe) {
		repo.save(recipe);
		return null;
	}

	@Override
	public List<Recipe> getAllRecipes() {
		Iterable<Recipe> recipes = repo.findAll();
		List<Recipe> recipeList = new ArrayList<Recipe>((Collection<? extends Recipe>) recipes);
		return recipeList;
	}

	@Override
	public boolean deleteRecipe(Recipe recipe) {
		repo.delete(recipe);
		return true;
	}



	


}
