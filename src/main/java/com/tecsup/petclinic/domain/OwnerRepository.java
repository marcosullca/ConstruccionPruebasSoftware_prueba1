package com.tecsup.petclinic.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
	
	// Fetch owner by first_name
	List<Owner> findByFirstname(String firstname);
	
	// Fetch owner by last_name
	List<Owner> findByLastname(String lastname);

	// Fetch owner by address
	List<Owner> findByAddress(String address);
	List<Owner> findByCity(String city);
	List<Owner> findByTelephone(String telephone);
}