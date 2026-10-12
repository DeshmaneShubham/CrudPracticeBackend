package com.TechnoSignia.CrudPractice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	// Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Constructor using fields ----->Q.what is mean by constructor: Constructor is
	// nothing but creating a method
	// by using same class name
	public User(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	// Constructor using non-fields
	public User() {
		super();

	}
	//ToString it is use to convert object to readable form
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
