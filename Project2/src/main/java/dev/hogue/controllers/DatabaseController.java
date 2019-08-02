package dev.hogue.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.hogue.entities.Recipe;
import dev.hogue.service.RecipeService;

@RestController
public class DatabaseController {
	
	@Autowired
	RecipeService dbs;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping(value = "/testRecipe", method = RequestMethod.GET)
	public Set<Recipe> getOneRecipe() {
		return dbs.getAllRecipes();
	}

}
