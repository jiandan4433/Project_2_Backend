package dev.hogue.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.hogue.entities.Ingredient;
import dev.hogue.entities.Instruction;
import dev.hogue.entities.Recipe;
import dev.hogue.repositories.InstructionRepository;


@Component
@Service("InstructionServiceSpring")
public class InstructionServiceSpring implements InstructionService{

	@Autowired
	InstructionRepository repo;
	
	@Override
	public Instruction createInstruction(Instruction instruction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instruction getInstructionByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instruction updateInstruction(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Instruction> getAllInstructionByRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteInstruction(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
