package com.sf.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sf.employee.service.*;
import com.sf.employee.bean.Country;
import com.sf.employee.bean.Location;
import com.sf.employee.bean.State;
import com.sf.employee.bean.BranchBean;
import com.sf.employee.bean.City;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/admin")
public class PlaceController {
	
	@Autowired
	private PlaceService plserv;
	@GetMapping("/viewcountry")
	public List<Country>  getCountry()
	{
		
		return plserv. getCountry();
	}
	
	@GetMapping("/statebyid/{id}")
	public List<State> getStateBycountryid(@PathVariable(value = "id") String countryid)
	{
		
		return plserv.getStateBycountryid(countryid);
	}
	
	@GetMapping("/citybyid/{id}")
	public List<City>  getCityBystateid(@PathVariable(value = "id") String stateid)
	{
		
		return plserv.getCityBystateid(stateid);
	}
	@GetMapping("/locationbyid/{id}")
	public List<Location>  getLocationBycityid(@PathVariable(value = "id") String cityid)
	{
		
		return plserv.getLocationBycityid(cityid);
	}

	@PostMapping("/addCountry")
	public String addCountry(@RequestBody Country country) {
		System.out.println( country);
		return plserv.addCountry( country);
	}
	
	@PostMapping("/addState")
	public String addState(@RequestBody State state) {
		System.out.println( state);
		return plserv.addState( state);
	}
	
	@PostMapping("/addCity")
	public String addCity(@RequestBody City city) {
		System.out.println( city);
		return plserv.addCity( city);
	}
	
	
	@PostMapping("/addLocation")
	public String addLocation(@RequestBody Location location) {
		System.out.println( location);
		return plserv.addLocation( location);
	}
	@GetMapping("/locationbylocationid/{code}")
	public Location viewlocationbyId(@PathVariable(value = "code") String locationid)
	{
		
		return plserv.viewlocationbyId(locationid);
	}
	
}
