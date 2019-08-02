package dev.hogue.repositories;


import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.hogue.entities.Recipe;


@Repository
public interface RecipeRepository extends CrudRepository<Recipe,Integer>{
	
	Set<Recipe> findByUsername(String username);
	Recipe findByName(String name);
	Recipe findById(int id);
}
