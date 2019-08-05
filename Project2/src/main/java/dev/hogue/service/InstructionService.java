package dev.hogue.service;

import dev.hogue.entities.Instruction;

public interface InstructionService {
	
	/*
	 * DBService for Instruction
	 */
	
	Instruction createInstruction(Instruction instruction);
	Instruction getInstructionById(int id);
	Instruction updateInstruction(Instruction instruction);

	boolean deleteInstruction(Instruction instruction);


}
