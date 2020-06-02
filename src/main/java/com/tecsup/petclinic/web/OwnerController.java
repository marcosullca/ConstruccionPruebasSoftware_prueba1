package com.tecsup.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.exception.PetNotFoundException;
import com.tecsup.petclinic.service.OwnerService;

@RestController
public class OwnerController {
	@Autowired
	private OwnerService service;
	
	@GetMapping("/owners")
	public Iterable<Owner> getOwners(){
		return service.findAll();
	}
	@PostMapping("/owners")
	@ResponseStatus(HttpStatus.CREATED)
	Owner create(@RequestBody Owner newOwner) {
		return service.create(newOwner);
	}
	@GetMapping("/owners/{id}")
	ResponseEntity<Owner> findOne(@PathVariable Long id){
		try {
			return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
		}catch(PetNotFoundException e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/owners/{id}")
	Owner saveOrUpdate(@RequestBody Owner newOwner,@PathVariable Long id) {
		Owner owner=null;
		try {
			owner=service.findById(id);
			owner.setFirstname(newOwner.getFirstname());
			owner.setLastname(newOwner.getLastname());
			owner.setAddress(newOwner.getAddress());
			owner.setCity(newOwner.getCity());
			owner.setTelephone(newOwner.getTelephone());
		}catch(PetNotFoundException e) {
			owner =service.create(newOwner);
		}
		return owner;
	}
	@DeleteMapping("/owners/{id}")
	ResponseEntity<String> delete(@PathVariable Long id) {

		try {
			service.delete(id);
			return new ResponseEntity<>("" + id, HttpStatus.OK);
		} catch (PetNotFoundException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}

