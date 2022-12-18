package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserLocation;
import com.example.demo.service.LocationService;


@RestController
public class LocationController {

	
	
	@Autowired
	private LocationService locationService;
	
	
    @GetMapping("/getlocationdata")
	private List<UserLocation> getLocation()
	{
		return locationService.getLocation();
	}
    
   
    @GetMapping("/getlocation/{id}")
	private Optional<UserLocation> getLocationbyId(@PathVariable Integer id)
	{
		return locationService.getLocationById(id);
	}
   
    
   
    @GetMapping("/getlocation/{id}/user")
	private List<User> getLocationbyUser(@PathVariable Integer id)
	{
	   Optional<UserLocation> location= locationService.getLocationById(id);
	   
	   if(location.isPresent())
	   {
		   UserLocation location1=location.get();
		   
		   return location1.getUser();
		   
	   }  
	   
	   return null;
	}
    
    
	
	
	
}
