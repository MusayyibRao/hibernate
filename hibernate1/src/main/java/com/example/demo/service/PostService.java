package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserPost;
import com.example.demo.repository.PostRepo;

@Service
public class PostService {

	
	@Autowired
	private PostRepo postRepo;
	
	
	public List<UserPost> getPosts() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	public Optional<UserPost> getPostById(Integer id) {
		// TODO Auto-generated method stub
		return postRepo.findById(id);
	}

}
