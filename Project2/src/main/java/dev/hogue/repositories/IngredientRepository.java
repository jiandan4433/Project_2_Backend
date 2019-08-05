package dev.hogue.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Recipe;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient,Integer>{


	Ingredient findByName(String name);
	
}
