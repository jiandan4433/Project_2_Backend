package dev.hogue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.hogue.entities.Recipe;
import dev.hogue.entities.User;
import dev.hogue.service.IngredientService;
import dev.hogue.service.InstructionService;
import dev.hogue.service.RecipeService;
import dev.hogue.service.UserService;

@RestController
public class DatabaseController {
	
	@Autowired
    //@Qualifier("RecipeServiceSpring")
    RecipeService rs;
    
    @Autowired
    //@Qualifier("IngredientServiceSpring")
    IngredientService ingred;
    
    @Autowired
    //@Qualifier("InstructionServiceSpring")
    InstructionService instru;
    
    @Autowired
    //@Qualifier("UserServiceSpring")
    UserService us;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping(value = "/testRecipe", method = RequestMethod.GET)
	public List<Recipe> getOneRecipe() {
		return rs.getAllRecipes();
	}
	
	@RequestMapping(value="/testingUser", method = RequestMethod.GET)
	public List<User> getallUsers(){
		return us.getAllUsers();
	}

}
