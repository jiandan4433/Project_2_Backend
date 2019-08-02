package dev.hogue.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.hogue.entities.Instruction;

@Repository
public interface InstructionRepository extends CrudRepository<Instruction,Integer>{

}
