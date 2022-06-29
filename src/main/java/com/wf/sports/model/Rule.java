package com.wf.sports.model;

public class Rule {
	
	private Integer ruleId;
	private String ruleName;
	private String ruleDescription;
	
	public Integer getRuleId() {
		return ruleId;
	}
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRuleDescription() {
		return ruleDescription;
	}
	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}
	@Override
	public String toString() {
		return "Rule [ruleId=" + ruleId + ", ruleName=" + ruleName + ", ruleDescription=" + ruleDescription + "]";
	}

}
