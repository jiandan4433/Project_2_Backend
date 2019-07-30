package dev.project2.entities;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Ingredient {
	
	@Column(name = "recipedID")
	private int recipeId;
	@Column(name = "name")
	private String name;
	@Column(name = "amount")
	private String amount;
	public Ingredient() {
		super();
	}
	public Ingredient(int recipeId, String name, String amount) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.amount = amount;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Ingredient [recipeId=" + recipeId + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	
	

}
