package com.wf.sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wf.sports.model.Sport;
import com.wf.sports.service.SportsService;

@RestController
public class SportsController {
	
	@Autowired
	SportsService sportsService;
	
	@PostMapping("/addSports")
	public void saveSportDetails(@RequestBody Sport sport) {
		sportsService.saveSport(sport);
		System.out.println("Sport added successfully....");
	}
	
	@GetMapping("/getSportsById/{id}")
	public Sport getSportsById(@PathVariable Integer id) {
		return sportsService.getSportsById(id);
	}
	
	@GetMapping("/getSportsByName/{name}")
	public List<Sport> getSportsByName(@PathVariable String name) {
		return sportsService.getSportsByName(name);
	}
	
	@GetMapping("/getAllSports")
	public List<Sport> getAllSports() {
		return sportsService.getAllSports();
	}
	
	@GetMapping("/deleteSportsById/{id}")
	public void deleteSportsById(@PathVariable Integer id) {
		sportsService.deleteSportsById(id);
	}

}
