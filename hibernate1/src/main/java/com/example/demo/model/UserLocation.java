package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UserLocation {

@Id	
private Integer id;


private String name;

@OneToMany(mappedBy = "location")
private List<User> user;


public UserLocation(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public UserLocation() {
	super();
	// TODO Auto-generated constructor stub
}



@JsonManagedReference
public List<User> getUser() {
	return user;
}


public void setUser(List<User> user) {
	this.user = user;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}



	
}
