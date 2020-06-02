package com.tecsup.petclinic.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.domain.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class OwnerServiceTest {
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);

	@Autowired
	private OwnerService ownerService;

	/**
	 * 
	 */
//	@Test
//	public void testFindOwnerById() {
//
//		long ID = 1;
//		String NAME = "George";
//		Owner owner = null;
//		
//		try {
//			owner = ownerService.findById(ID);
//		} catch (PetNotFoundException e) {
//			fail(e.getMessage());
//		}
//		logger.info("" + owner);
//
//		assertEquals(NAME, owner.getFirstname());
//
//	}
//
//	/**
//	 * 
//	 */
//	@Test
//	public void testFindOwnerByName() {
//
//		String FIND_NAME = "George";
//		int SIZE_EXPECTED = 1;
//
//		List<Owner> owners = ownerService.findByFirstname(FIND_NAME);
//
//		assertEquals(SIZE_EXPECTED, owners.size());
//	}

	/**
	 * 
	 */
//	@Test
//	public void testFindOwnerByLastName() {
//
//		String FIND_LASTNAME = "Franklin";
//		int SIZE_EXPECTED = 1;
//
//		List<Owner> owners = ownerService.findByLastname(FIND_LASTNAME);
//
//		assertEquals(SIZE_EXPECTED, owners.size());
//	}

	/**
	 * 
	 */

	/**
	 *  To get ID generate , you need 
	 *  setup in id primary key in your
	 *  entity this annotation :
	 *  	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 */
	@Test
	public void testCreateOwner() {

		String NAME = "Marco";
		String LASTNAME="Sullca";
		String ADDRESS="Av.Santa Anita";
		String CITY="Lima";
		String TELEPHONE="9184243321";

		Owner owner = new Owner(NAME, LASTNAME, ADDRESS,CITY,TELEPHONE);
		owner = ownerService.create(owner);
		logger.info("" + owner);

		assertThat(owner.getId()).isNotNull();
		assertEquals(NAME, owner.getFirstname());
		assertEquals(LASTNAME, owner.getLastname());
		assertEquals(ADDRESS, owner.getAddress());
		assertEquals(CITY, owner.getCity());
		assertEquals(TELEPHONE, owner.getTelephone());

	}

	/**
	 * 
	 */
//	@Test
//	public void testUpdateOwner() {
//		
//		String NAME = "Marco";
//		String LASTNAME="Sullca";
//		String ADDRESS="Av.Santa Anita";
//		String CITY="Lima";
//		String TELEPHONE="9184243321";
//		long create_id = -1;
//		
//		String UP_NAME = "Piere";
//		String UP_LASTNAME="Custodio";
//		String UP_ADDRESS="Av.Las Violetas";
//		String UP_CITY="Lima";
//		String UP_TELEPHONE="9184243365";
//		
//
//
//
//		Owner owner = new Owner(NAME, LASTNAME, ADDRESS,CITY,TELEPHONE);
//
//		// Create record
//		logger.info(">" + owner);
//		Owner readOwner = ownerService.create(owner);
//		logger.info(">>" + readOwner);
//
//		create_id = readOwner.getId();
//
//		// Prepare data for update
//		readOwner.setFirstname(UP_NAME);
//		readOwner.setLastname(UP_LASTNAME);
//		readOwner.setAddress(UP_ADDRESS);
//		readOwner.setCity(UP_CITY);
//		readOwner.setTelephone(UP_TELEPHONE);
//
//		// Execute update
//		Owner upgradeOwner = ownerService.update(readOwner);
//		logger.info(">>>>" + upgradeOwner);
//
//		assertThat(create_id).isNotNull();
//		assertEquals(create_id, upgradeOwner.getId());
//		assertEquals(UP_NAME, upgradeOwner.getFirstname());
//		assertEquals(UP_LASTNAME, upgradeOwner.getLastname());
//		assertEquals(UP_ADDRESS, upgradeOwner.getAddress());
//		assertEquals(UP_CITY, upgradeOwner.getCity());
//		assertEquals(UP_TELEPHONE, upgradeOwner.getTelephone());
//	}

	/**
	 * 
	 */
//	@Test
//	public void testDeletePet() {
//
//		String PET_NAME = "Bird";
//		int OWNER_ID = 1;
//		int TYPE_ID = 1;
//
//		Pet pet = new Pet(PET_NAME, OWNER_ID, TYPE_ID);
//		pet = petService.create(pet);
//		logger.info("" + pet);
//
//		try {
//			petService.delete(pet.getId());
//		} catch (PetNotFoundException e) {
//			fail(e.getMessage());
//		}
//			
//		try {
//			petService.findById(pet.getId());
//			assertTrue(false);
//		} catch (PetNotFoundException e) {
//			assertTrue(true);
//		} 
//				
//
//	}
}
