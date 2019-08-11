package dev.hogue.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "instructions")
public class Instruction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="i_id")
	private int id;
	
	@Column(name = "stepOrder")
	private int stepOrder;
	
	@Column(name = "prior")
	private int priorStepId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duration")
	private long duration;

	
	
	
	public int getPriorStepId() {
		return priorStepId;
	}
	public void setPriorStepId(int priorStepId) {
		this.priorStepId = priorStepId;
	}
	public Instruction() {
		super();
	}
	public void setStepId(int priorStepId) {
		this.priorStepId = priorStepId;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getStepOrder() {
		return stepOrder;
	}
	public void setStepOrder(int stepOrder) {
		this.stepOrder = stepOrder;
	}
	public int getId() {
		return id;
	}

	
}
