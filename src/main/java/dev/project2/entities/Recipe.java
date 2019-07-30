package dev.project2.entities;

import java.util.HashSet;
import java.util.Set;

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
public class Recipe {
	
	@Column(name = "title")
	private String title;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	private Set<Instruction> instructiosns = new HashSet<Instruction>();
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	public Recipe() {
		super();
	}
	public Recipe(String title, int id, String username, Set<Instruction> instructiosns, Set<Ingredient> ingredients) {
		super();
		this.title = title;
		this.id = id;
		this.username = username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "Recipe [title=" + title + ", id=" + id + ", username=" + username + ", instructiosns=" + instructiosns
				+ ", ingredients=" + ingredients + "]";
	}
	
	
	
	

	
}
