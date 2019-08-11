package dev.hogue.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table; // Ask if we needed to import the Hibernate version of table

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
	private int id;
	
	@Column(name="title")
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
	@Cascade({CascadeType.PERSIST})
	private Set<Instruction> instructions;
	
	//@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	@JoinTable(
			name="recipe_ingredient",
			joinColumns = {@JoinColumn(name = "recipe", referencedColumnName="r_id")},
			inverseJoinColumns = {@JoinColumn(name = "ingredient", referencedColumnName="name")}
			)
	private Set<Ingredient> ingredients;
	
	public Recipe() {
		super();
		ingredients = new HashSet<Ingredient>();
		instructions = new HashSet<Instruction>();
	}
	
	public Recipe(int id, String name, Set<Instruction> steps, Set<Ingredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.instructions = steps;
		this.ingredients = ingredients;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Instruction> getInstructions() {
		return instructions;
	}
	public void setInstructions(Set<Instruction> steps) {
		this.instructions = steps;
	}
	public void addStep(Instruction step) {
		instructions.add(step);
	}
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}


}
