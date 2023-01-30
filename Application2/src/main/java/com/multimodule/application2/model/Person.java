package com.multimodule.application2.model;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	
	
	
	
	public Person() {
	}
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
}
