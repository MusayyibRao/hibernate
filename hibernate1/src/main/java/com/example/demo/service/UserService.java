package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserPost;
import com.example.demo.repository.UserRepo;



@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>)userRepo.findAll();
	}




	public Optional<User> getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}




	public List<User> getUserLocationById(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.findByLocationId(id);
	}

}
