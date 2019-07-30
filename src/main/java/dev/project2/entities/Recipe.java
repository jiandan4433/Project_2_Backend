package dev.project2.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Recipe {
	
	private String title;
	private int id;
	private Set<Instruction> instructiosns = new HashSet<Instruction>();
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	public Recipe() {
		super();
	}
	public Recipe(String title, int id, Set<Instruction> instructiosns, Set<Ingredient> ingredients) {
		super();
		this.title = title;
		this.id = id;
		this.instructiosns = instructiosns;
		this.ingredients = ingredients;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Instruction> getInstructiosns() {
		return instructiosns;
	}
	public void setInstructiosns(Set<Instruction> instructiosns) {
		this.instructiosns = instructiosns;
	}
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	@Override
	public String toString() {
		return "Recipe [title=" + title + ", id=" + id + ", instructiosns=" + instructiosns + ", ingredients="
				+ ingredients + "]";
	}
	

	
}
