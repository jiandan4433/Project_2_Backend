package dev.hogue.service;

import java.util.Set;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Instruction;
import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;

public interface RecipeService {
	

	/*
	 * DBService for Recipe
	 */
	Recipe createRecipe(Recipe recipe);
	Recipe getRecipeById(int id);
	Recipe getRecipeByName(String name);
	Set<Recipe> getAllRecipeByUsername(User user);
	Recipe updateRecipe(Recipe recipe);
	Set<Recipe> getAllRecipes();
	boolean deleteRecipe(int id);
	


}
