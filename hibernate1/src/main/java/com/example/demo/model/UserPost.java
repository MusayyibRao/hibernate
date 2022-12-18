package com.example.demo.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserPost {

	@Id
	private Integer id;
	
	private LocalDateTime postname;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private String details;
	
	
		
	public UserPost() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserPost(int id, LocalDateTime postname, User user, String details) {
		super();
		this.id = id;
		this.postname = postname;
		this.user = user;
		this.details = details;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDateTime getPostname() {
		return postname;
	}


	public void setPostname(LocalDateTime postname) {
		this.postname = postname;
	}

   @JsonBackReference
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}	
	
	
	
	
	
	
}
