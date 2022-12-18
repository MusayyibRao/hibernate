package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserPost;

@Repository
public interface PostRepo  extends JpaRepository<UserPost, Integer>{

}
