package dev.hogue.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Instruction;
import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;
import dev.hogue.repositories.RecipeRepository;


@Component
@Service("DatabaseServiceSpring")
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe getRecipeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Recipe> getAllRecipeByUsername(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Recipe> getAllRecipes() {
		Iterable<Recipe> recipes = repo.findAll();
		Set<Recipe> recipeSet = new HashSet<Recipe>((Collection<? extends Recipe>) recipes);

		System.out.println(recipeSet);
		return recipeSet;
	}

	@Override
	public boolean deleteRecipe(int id) {
		// TODO Auto-generated method stub
		return false;
	}



	


}
