package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class User {

@Id	
private Integer id;

private String firstname;

private String lastname;

@ManyToOne
@JoinColumn(name="location_id")
private UserLocation location;

@OneToMany(mappedBy = "user")
private List<UserPost> post;





public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String firstname, String lastname, UserLocation location) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.location = location;
}




@JsonManagedReference
public List<UserPost> getPost() {
	return post;
}
public void setPost(List<UserPost> post) {
	this.post = post;
}
public int getId() {
	return id;
}
public void setId(int id) {
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

@JsonBackReference
public UserLocation getLocation() {
	return location;
}
public void setLocation(UserLocation location) {
	this.location = location;
}






 
}
