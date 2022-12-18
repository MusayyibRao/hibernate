package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLocation;
import com.example.demo.repository.LocationRepo;

@Service
public class LocationService {


	@Autowired
	private LocationRepo locationRepo;
	
	
	public List<UserLocation> getLocation() {
		// TODO Auto-generated method stub
		return locationRepo.findAll();
	}

	public Optional<UserLocation> getLocationById(Integer id) {
		// TODO Auto-generated method stub
		return locationRepo.findById(id);
	}

}


