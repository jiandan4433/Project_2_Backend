package dev.hogue.service;

import java.util.Set;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Recipe;

public interface IngredientService {
	
	/*
	 * DBService for ingredient
	 */
	
	Ingredient createIngredient(Ingredient ingredient);
	Ingredient getIngredientByName(String name);
	Ingredient updateIngredient(Ingredient ingredient);
	Set<Ingredient> getAllIngredientByRecipe(Recipe recipe);
	boolean deleteIngredient(String name);
	

}
