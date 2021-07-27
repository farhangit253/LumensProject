package com.lumens.stepdefinition;

import com.lumens.page.TabPage;

import cucumber.api.java.en.Then;

public class TabPageStepDefinition {
	TabPage tab=new TabPage();
	
	@Then("^user able to navigate to ligthings and navigate Large Chandelier$")
	public void user_able_to_navigate_to_ligthings_and_navigate_Large_Chandelier() throws Throwable {
	   tab.navigatingToLargeChandelier();
	}

}
