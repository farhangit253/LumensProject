package com.lumens.stepdefinition;

import com.lumens.page.SignOutPage;

import cucumber.api.java.en.Then;

public class SignOutStepDefinition {
	
	SignOutPage signOut=new SignOutPage();
	
	@Then("^again mousehover on account click on signOut$")
	public void again_mousehover_on_account_click_on_signOut() throws Throwable {
	    signOut.signOut();
	}

}
