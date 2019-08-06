package dev.hogue.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.hogue.entities.Ingredient;
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
	
//	@RequestMapping(value="/hello", method = RequestMethod.GET)
//	public String sayHello() {
//		return "Hello";
//	}
//	
//	@RequestMapping(value = "/testRecipe", method = RequestMethod.GET)
//	public Set<Recipe> getOneRecipe() {
//		return rs.getAllRecipes();
//	}
//	
//	@RequestMapping(value="/testingUser", method = RequestMethod.GET)
//	public List<User> getallUsers(){
//		return us.getAllUsers();
//	}
	
	@RequestMapping(value="/createRecipe", method = RequestMethod.POST)
	public boolean addRecipe(@RequestBody Recipe json) {
		System.out.println(json);
		rs.createRecipe(json);
		return false;
	}
	@RequestMapping(value="/updateRecipe", method = RequestMethod.PUT)
	public Recipe updateRecipe(@RequestBody Recipe recipe) {
		recipe = rs.updateRecipe(recipe);
		return recipe;
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public User userLogin(@RequestBody User user) {
		User userData = us.login(user);
		if(userData == null)
			return null;
		return userData;
	}
	@RequestMapping(value="/ingredients", method = RequestMethod.GET)
	public Set<Ingredient> getIngredients(){
		return ingred.getAllIngredient();
	}
	@RequestMapping(value="/recipes", method = RequestMethod.GET)
	public Set<Recipe> getRecipes(){
		return rs.getAllRecipes();
	}
	@RequestMapping(value="/createUser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		user = us.createUser(user);
		return user;
	}
	@RequestMapping(value= "/updateUser", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		user = us.update(user);
		return user;
	}

}
