package dev.hogue.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Recipe;
import dev.hogue.repositories.IngredientRepository;


@Component
@Service("IngredientServiceSpring")
public class IngredientServiceSpring implements IngredientService{

	@Autowired
	IngredientRepository repo;
	
	@Override
	public Ingredient createIngredient(Ingredient ingredient) {
		
		return null;
	}

	@Override
	public Ingredient getIngredientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient updateIngredient(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Ingredient> getAllIngredientByRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIngredient(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
