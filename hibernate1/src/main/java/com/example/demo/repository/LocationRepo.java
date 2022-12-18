package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserLocation;

@Repository
public interface LocationRepo extends JpaRepository<UserLocation, Integer>{

}
