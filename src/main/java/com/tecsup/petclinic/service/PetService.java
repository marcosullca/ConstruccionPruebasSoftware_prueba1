package com.tecsup.petclinic.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Pet;
import com.tecsup.petclinic.domain.PetRepository;

/**
 * 
 * @author jgomezm
 *
 */
@Service
public class PetService {

	private static final Logger logger = LoggerFactory.getLogger(PetService.class);

	@Autowired
	PetRepository petRepository;

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pet findById(Long id) {

		Optional<Pet> pet = petRepository.findById(id);

		return pet.get();
	}

	/**
	 * 
	 * @param pet
	 * @return
	 */
	public Pet create(Pet pet) {

		return petRepository.save(pet);
	}

	/**
	 * 
	 * @param pet
	 * @return
	 */
	public Pet update(Pet pet) {

		return petRepository.save(pet);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pet delete(Long id) {

		Pet pet = findById(id);
		petRepository.delete(pet);

		return pet;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Pet> findByName(String name) {

		List<Pet> pets = petRepository.findByName(name);

		pets.stream().forEach(pet -> logger.debug("" + pet));

		return pets;
	}
	
	
	// Docker 
	
	
}