package dev.project2.entities;

import java.util.Timer;

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
public class Instruction {
	
	@Column(name = "recipedID")
	private int recipeId;
	
	@Column(name = "step")
	private String step;
	// Change this!!!!
	@Column(name = "time")
	private Timer time;
	// Change this maybe?
	@Column(name = "until")
	private Timer until;
	public Instruction() {
		super();
	}
	public Instruction(int recipeId, String step, Timer time, Timer until) {
		super();
		this.recipeId = recipeId;
		this.step = step;
		this.time = time;
		this.until = until;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public Timer getTime() {
		return time;
	}
	public void setTime(Timer time) {
		this.time = time;
	}
	public Timer getUntil() {
		return until;
	}
	public void setUntil(Timer until) {
		this.until = until;
	}
	@Override
	public String toString() {
		return "Instruction [RecipeId=" + recipeId + ", step=" + step + ", time=" + time + ", until=" + until + "]";
	}
	
	
	

}
