package dev.hogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Instruction;
import dev.hogue.repositories.InstructionRepository;


@Component
@Service("InstructionServiceSpring")
public class InstructionServiceSpring implements InstructionService{

	@Autowired
	InstructionRepository repoInstru;
	
	@Override
	public Instruction createInstruction(Instruction instruction) {
		return repoInstru.save(instruction);
	}

	@Override
	public Instruction getInstructionById(int id) {
		Instruction instruction = repoInstru.findById(id);
		return instruction;
	}

	@Override
	public Instruction updateInstruction(Instruction instruction) {
		return repoInstru.save(instruction);
	}



	@Override
	public boolean deleteInstruction(Instruction instructiont) {
		repoInstru.delete(instructiont);
		return true;
	}

}
