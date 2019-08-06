package dev.hogue.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
	
	Set<Recipe> findByUsername(String username);
	User findUserByUsername(String username);
	

}
