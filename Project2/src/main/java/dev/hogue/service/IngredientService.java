package dev.hogue.service;

import java.util.Set;

import dev.hogue.entities.Ingredient;
public interface IngredientService {
	
	/*
	 * DBService for ingredient
	 */
	
	Ingredient createIngredient(Ingredient ingredient);
	Ingredient getIngredientByName(String name);
	Ingredient updateIngredient(Ingredient ingredient);
	Set<Ingredient> getAllIngredient();
	boolean deleteIngredient(Ingredient ingredient);
	

}
