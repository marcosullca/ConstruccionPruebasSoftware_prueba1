package com.tecsup.petclinic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="owners")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column(name="first_name") solo si el nombre de la table es diferente al de la variable de instancia.
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	private String address;
	private String city;
	private String telephone;
	public Owner() {
		
	}

	public Owner(int id, String firstname, String lastname, String address, String city, String telephone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}
	public Owner(String firstname, String lastname, String address, String city, String telephone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "Pet [id=" + id + ", first_name=" + firstname + ", last_name=" + lastname + ", address=" + address + ", city="
				+ city + ", telephone=" +telephone+ "]";
	}
	
	

}
