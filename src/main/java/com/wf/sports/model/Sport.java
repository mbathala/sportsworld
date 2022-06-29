package com.wf.sports.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "sports")
public class Sport {
	
	@Id
	private Integer id;
	private String name;
	private List<Rule> gameRules;
	private Integer numberOfPlayers;
	private String gameType;
	private String _class;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Rule> getGameRules() {
		return gameRules;
	}
	public void setGameRules(List<Rule> gameRules) {
		this.gameRules = gameRules;
	}
	
	public Integer getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(Integer numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", gameRules=" + gameRules + ", numberOfPlayers="
				+ numberOfPlayers + ", gameType=" + gameType + ", _class=" + _class + "]";
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}

}
