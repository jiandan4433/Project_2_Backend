package dev.hogue.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Ingredient;
import dev.hogue.repositories.IngredientRepository;


@Component
@Service("IngredientServiceSpring")
public class IngredientServiceSpring implements IngredientService{

	@Autowired
	IngredientRepository repoIngr;
	
	@Override
	public Ingredient createIngredient(Ingredient ingredient) {
		return repoIngr.save(ingredient);
	}

	@Override
	public Ingredient getIngredientByName(String name) {
		Ingredient ingredient = repoIngr.findByName(name);
		return ingredient;
	}

	@Override
	public Ingredient updateIngredient(Ingredient ingredient) {
		return repoIngr.save(ingredient);
	}


	@Override
	public Set<Ingredient> getAllIngredient() {
		Iterable<Ingredient> ingredients = repoIngr.findAll();
		Set<Ingredient> ingredientSet = new HashSet<Ingredient>((Collection<? extends Ingredient>) ingredients);
		return ingredientSet;
	}
	
	@Override
	public boolean deleteIngredient(Ingredient ingredient) {
		repoIngr.delete(ingredient);
		return true;
	}



}
