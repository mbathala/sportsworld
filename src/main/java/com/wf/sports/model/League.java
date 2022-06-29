package com.wf.sports.model;

import java.util.List;

import lombok.Data;

@Data
public class League {
	
	private int leagueId;
	private String leagueName;
	private List<Rule> leagueRules;
	
}
