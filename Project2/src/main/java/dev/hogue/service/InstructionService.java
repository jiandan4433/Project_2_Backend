package dev.hogue.service;

import java.util.Set;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Instruction;
import dev.hogue.entities.Recipe;

public interface InstructionService {
	
	/*
	 * DBService for Instruction
	 */
	
	Instruction createInstruction(Instruction instruction);
	Instruction getInstructionByName(String name);
	Instruction updateInstruction(Ingredient ingredient);
	Set<Instruction> getAllInstructionByRecipe(Recipe recipe);
	boolean deleteInstruction(int id);


}
