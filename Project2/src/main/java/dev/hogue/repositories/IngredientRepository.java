package dev.hogue.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.hogue.entities.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient,Integer>{


	Ingredient findByName(String name);
	
}
