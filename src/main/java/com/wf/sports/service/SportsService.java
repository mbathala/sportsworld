package com.wf.sports.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.wf.sports.dao.SportsRepo;
import com.wf.sports.model.Sport;

@Service
public class SportsService {
	
	@Autowired
	SportsRepo sportsRepo;
	
	public Sport saveSport(Sport sport) {
		return sportsRepo.save(sport);
	}
	
	public List<Sport> getSportsByName(String name) {
		List<Sport> sports = sportsRepo.getSportsByName(name);
		if(!CollectionUtils.isEmpty(sports)) {
			sports.forEach(System.out::print);
		}
		
		return sports;
	}
	
	public Sport getSportsById(Integer id) {
		Optional<Sport> sport = sportsRepo.findSportById(id);
		System.out.println(">>> Sport :: "+sport.get());
		return sport.get();
	}
	
	public List<Sport> getAllSports() {
		List<Sport> sports = sportsRepo.findAll();
		if(!CollectionUtils.isEmpty(sports)) {
			sports.forEach(System.out::print);
		}
		
		return sports;
	}
	
	public void deleteSportsById(Integer id) {
		sportsRepo.deleteById(id);
		System.out.println("Deleted Successfully...");
	}

}
