package com.wf.sports.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wf.sports.model.Sport;

public interface SportsRepo extends MongoRepository<Sport, Integer> {
	
	@Query("{id :?0}")                        //SQL Equivalent : SELECT * FROM Sport WHERE id=?
    Optional<Sport> findSportById(Integer id);
	
	@Query("{name : ?0}")                     // SQL Equivalent : SELECT * FROM Sport where name = ?
    List<Sport> getSportsByName(String name);

}
