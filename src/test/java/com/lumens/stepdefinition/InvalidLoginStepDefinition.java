package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.InvalidLoginPage;

import cucumber.api.java.en.Then;

public class InvalidLoginStepDefinition {
	InvalidLoginPage invalid=new InvalidLoginPage();
	LumensData exceldata=new LumensData();
	
	
	@Then("^Enter the invalid credentials$")
	public void enter_the_invalid_credentials() throws Throwable {
		  ArrayList<String> testdata=exceldata.getData("InvalidLogin");
		  invalid.login(testdata.get(1), testdata.get(2));
	   
	}

	@Then("^user should get an error and takes screenshot$")
	public void user_should_get_an_error_and_takes_screenshot() throws Throwable {
	    invalid.verifyInvalidloginPage();
	}

}
