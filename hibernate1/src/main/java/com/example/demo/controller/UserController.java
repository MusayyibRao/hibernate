package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserPost;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
    @GetMapping("/getuserdata")
	private List<User> getUsers()
	{
		return userService.getUsers();
	}
    
   
    @GetMapping("/getuser/{id}")
	private Optional<User> getUserbyId(@PathVariable Integer id)
	{
		return userService.getUserById(id);
	}
    
    
    
    @GetMapping("/getuser/{id}/posts")
	private List<UserPost> getUserbyPost(@PathVariable Integer id)
	{
    	
    Optional<User>	user= userService.getUserById(id);
    	
     if(user.isPresent())
     {
    	 
    	 return user.get().getPost();
     }
     
     return null;
    
	}
    
    
    @GetMapping("/getuser/location/{id}/user")
	private List<User> getUserLocationById(@PathVariable Integer id)
	{
    	
       return userService.getUserLocationById(id);
    
	}
    
    
   
	
}
