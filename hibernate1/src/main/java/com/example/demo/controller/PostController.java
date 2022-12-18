package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserPost;
import com.example.demo.service.PostService;
import com.example.demo.service.UserService;

@RestController
public class PostController {
	
	
	
	@Autowired
	private PostService postService;
	
	
    @GetMapping("/getpostdata")
	private List<UserPost> getPosts()
	{
		return postService.getPosts();
	}
    
   
    @GetMapping("/getpost/{id}")
	private Optional<UserPost> getPostById(@PathVariable Integer id)
	{
		return postService.getPostById(id);
	}
    
    
    
    
   
	

}
