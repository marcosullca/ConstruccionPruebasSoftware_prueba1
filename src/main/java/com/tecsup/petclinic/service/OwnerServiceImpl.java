package com.tecsup.petclinic.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.domain.OwnerRepository;
import com.tecsup.petclinic.exception.PetNotFoundException;
@Service
public class OwnerServiceImpl implements OwnerService {
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);
	@Autowired
	OwnerRepository ownerRepository;
	@Override
	public Owner create(Owner owner) {
		return ownerRepository.save(owner);
	}
	@Override
	public Owner update(Owner owner) {
		return ownerRepository.save(owner);
	}
	@Override
	public void delete(Long id) throws PetNotFoundException{

		Owner owner = findById(id);
		ownerRepository.delete(owner);
	}
	@Override
	public Owner findById(long id) throws PetNotFoundException {

		Optional<Owner> owner = ownerRepository.findById(id);

		if ( !owner.isPresent())
			throw new PetNotFoundException("Record not found...!");
			
		return owner.get();
	}
	@Override
	public List<Owner> findByFirstname(String firstname) {

		List<Owner> owners = ownerRepository.findByFirstname(firstname);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
	@Override
	public List<Owner> findByAddress(String address) {

		List<Owner> owners = ownerRepository.findByAddress(address);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
	@Override
	public List<Owner> findByLastname(String lastname) {

		List<Owner> owners = ownerRepository.findByLastname(lastname);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
	@Override
	public Iterable<Owner> findAll() {
		return ownerRepository.findAll();
	
	}
	@Override
	public List<Owner> findByCity(String city) {
		List<Owner> owners = ownerRepository.findByCity(city);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
	@Override
	public List<Owner> findByTelephone(String telephone) {
		List<Owner> owners = ownerRepository.findByTelephone(telephone);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
}