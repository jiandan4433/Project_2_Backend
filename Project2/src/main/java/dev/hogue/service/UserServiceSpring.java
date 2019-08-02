package dev.hogue.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;
import dev.hogue.repositories.RecipeRepository;
import dev.hogue.repositories.UserRepository;

@Component
@Service("UserServiceSpring")
public class UserServiceSpring implements UserService{

	@Autowired
	UserRepository repo;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		//Search for the user, if it doesn't exist return null
		// TODO
		return repo.save(user);
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		repo.delete(user);
		return true;
	}

	@Override
	public Set<Recipe> getRecipesByUser(User user) {
		Iterable<Recipe> recipesIterable = repo.findByUsername(user.getUsername());
		Set<Recipe> recipeSet = new HashSet<Recipe>((Collection<? extends Recipe>) recipesIterable);
		return recipeSet;

	}
}




